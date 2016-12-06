package utils;

import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.apache.commons.mail.EmailException;

import com.google.inject.Singleton;

import akka.actor.Cancellable;
import play.Configuration;
import play.Logger;
import play.Play;
import play.i18n.Messages;
import play.libs.Akka;
import play.libs.Time.CronExpression;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import scala.concurrent.duration.Duration;
import scala.concurrent.duration.FiniteDuration;

/**
 * @author rhelton
 *
 */
@Singleton
public final class ScheduleEmail {

	@Inject
	static MailerClient mailerClient;

	private static Cancellable scheduler;

	public static void schedule() {
		try {

			// Set the Time
			String humanTime = AppGlobals.getAssigmentTimer();

			if (humanTime == null)
				return;

			// humanTime = "10:45 AM";
			// 12:08 PM h:mm a
			DateFormat format = new SimpleDateFormat("h:mm a");
			Date date = format.parse(humanTime);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			int seconds = calendar.get(Calendar.SECOND);
			int minutes = calendar.get(Calendar.MINUTE);
			int hours = calendar.get(Calendar.HOUR_OF_DAY);

			String exp = String.format("%1$s %2$s %3$s ? * *", seconds, minutes, hours);

			// CronExpression e = new CronExpression("0 40 17 ? * *");
			CronExpression e = new CronExpression(exp);
			Date nextValidTimeAfter = e.getNextValidTimeAfter(new Date());
			FiniteDuration d = Duration.create(nextValidTimeAfter.getTime() - System.currentTimeMillis(),
					TimeUnit.MILLISECONDS);

			Logger.debug("Scheduling to run at " + nextValidTimeAfter);

			setScheduler(Akka.system().scheduler().scheduleOnce(d, new Runnable() {

				@Override
				public void run() {
					Logger.debug("Ruuning scheduler");
					// Do your tasks here

					long startTime = System.currentTimeMillis();
					long endTime = 0;
					
					// Get today's date, add 6 months...
					// Search users (and profiles????) based on that date...
					// Get list of users, grab email...
					// Create email per user (or one email with BCC???)...
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.MONTH, 6);
					Date result = cal.getTime();
					
					
					
					
					
					
					
					
					
					

					String cid = "1234";
					Email email = new Email();
					email.setSubject("Simple email");
					email.setFrom("Mister FROM <from@email.com>");
					email.addTo("Miss TO <to@email.com>");
					email.setBodyText("A text message");
					email.setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid
							+ "\"></p></body></html>");
					Play.application().injector().instanceOf(MailerClient.class).send(email);

					// Mail.Envelop envelop = new Mail.Envelop("test", "Test",
					// "test@google.com");
					// Mail mailer = new Mail(mailerClient);
					// mailer.sendMail(envelop);

					// try {
					// sendMailAdminConfirm();
					// } catch (MalformedURLException | EmailException e) {
					// e.printStackTrace();
					// }

					endTime = System.currentTimeMillis();
					long timeneeded = ((startTime - endTime) / 1000);
					System.out.println("Time===>" + timeneeded);
					schedule(); // Schedule for next time
				}

			}, Akka.system().dispatcher()));
		} catch (Exception e) {
			Logger.error("", e);
		}
	}

	public static Cancellable getScheduler() {
		return scheduler;
	}

	public static void setScheduler(Cancellable scheduler) {
		ScheduleEmail.scheduler = scheduler;
	}

	public static void stop() {
		if (scheduler != null) {
			scheduler.cancel();
		}
	}

	private static void sendMailAdminConfirm() throws EmailException, MalformedURLException {
		String subject = Messages.get("mail.admin.subject");

		String urlString = "http://" + Configuration.root().getString("server.hostname");
		// urlString += "/finduserurl?email=" + email;
		// URL url = new URL(urlString); // validate the URL, will throw an
		// exception if bad.
		// String message = Messages.get("mail.admin.message", url.toString());

		// Mail.Envelop envelop = new Mail.Envelop(subject, message, admin);
		// Mail mailer = new Mail(mailerClient);
		Email email2 = new Email();

		// final Configuration root = Configuration.root();
		// final String mailFrom = "test@google.com";
		// final String mailSign = "TestSign";
		// final String port = root.getString("mail.port");

		email2.setFrom("test@google.com");
		email2.setSubject("test");
		email2.setBodyText("\n\n ");
		email2.setBodyHtml("<br><br>--<br>");
		email2.addTo("test@google.com");

		mailerClient.send(email2);

		// mailer.sendMail(envelop);
	}

}
package utils;

import akka.actor.Cancellable;
import play.Logger;
import play.libs.Akka;
import scala.concurrent.duration.Duration;
import java.util.concurrent.TimeUnit;

public class Scheduler {

    private static Cancellable cancellable  = null;

    /**
     * Set task to scheduler
     * @param task
     * @param emailNotificationId
     * @param timeInterval
     * @return
     */
    /*
    public static boolean setTask(final IScheduleTask task, final int emailNotificationId, long timeInterval){
        if (task == null)
            return false;

        resetTask();

        scala.concurrent.duration.FiniteDuration duration = Duration.create(timeInterval, TimeUnit.SECONDS);
        java.lang.Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    task.execute(emailNotificationId);
                    cancellable = null;
                } catch (Exception e){
                    e.printStackTrace();
                    Logger.error(e.getMessage());
                }
            }
        };

        cancellable = Akka.system().scheduler().scheduleOnce(duration, runnable, Akka.system().dispatcher());

        return true;
    }
    */

    public static boolean isSchedulerBusy(){
        return cancellable != null;
    }

    public static void resetTask(){
        if (cancellable != null)
            cancellable.cancel();
    }

}
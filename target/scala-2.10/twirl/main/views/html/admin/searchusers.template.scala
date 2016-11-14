
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchusers_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class searchusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Login],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login], userList: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

		"""),format.raw/*5.3*/("""<p><strong>&nbsp;&nbsp;&nbsp;Emergency Managers needing approval:</strong></p>

		<section id="search">
		<div class="table-responsive">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>User Name</th>
					<th>Email</th>
					<th>Role</th>
					<th>Approved?</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*19.6*/for(user <- userList
				if user.approved == "N") yield /*20.29*/{_display_(Seq[Any](format.raw/*20.30*/("""
				"""),format.raw/*21.5*/("""<tr>
				<td><a href="/finduserurl?email="""),_display_(/*22.38*/user/*22.42*/.getEmail()),format.raw/*22.53*/("""">"""),_display_(/*22.56*/user/*22.60*/.fullname),format.raw/*22.69*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*23.38*/user/*23.42*/.getEmail()),format.raw/*23.53*/("""">"""),_display_(/*23.56*/user/*23.60*/.getEmail()),format.raw/*23.71*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*24.38*/user/*24.42*/.getEmail()),format.raw/*24.53*/("""">"""),_display_(/*24.56*/user/*24.60*/.role),format.raw/*24.65*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*25.38*/user/*25.42*/.getEmail()),format.raw/*25.53*/("""">"""),_display_(/*25.56*/user/*25.60*/.approved),format.raw/*25.69*/("""</a></td>
				""")))}),format.raw/*26.6*/("""
			"""),format.raw/*27.4*/("""</tbody>
		</table>
		</div		
	</section>

	<p><strong>&nbsp;&nbsp;&nbsp;All users:</strong></p>

	<section id="search">
		<div class="table-responsive">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>User Name</th>
					<th>Email</th>
					<th>Role</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*45.6*/for(user <- userList) yield /*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
					"""),format.raw/*46.6*/("""<tr>
						<td><a href="/finduserurl?email="""),_display_(/*47.40*/user/*47.44*/.getEmail()),format.raw/*47.55*/("""">"""),_display_(/*47.58*/user/*47.62*/.fullname),format.raw/*47.71*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*48.40*/user/*48.44*/.getEmail()),format.raw/*48.55*/("""">"""),_display_(/*48.58*/user/*48.62*/.getEmail()),format.raw/*48.73*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*49.40*/user/*49.44*/.getEmail()),format.raw/*49.55*/("""">"""),_display_(/*49.58*/user/*49.62*/.role),format.raw/*49.67*/("""</a></td>
					</tr>
				""")))}),format.raw/*51.6*/(""" 
			"""),format.raw/*52.4*/("""</tbody>
		</table>
		</div		
	</section>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Application.Login],userList:java.util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,userList)

  def f:((Form[Application.Login],java.util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,userList) => apply(loginForm,userList)

  def ref: this.type = this

}


}

/**/
object searchusers extends searchusers_Scope0.searchusers
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 11:47:26 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchusers.scala.html
                  HASH: e2c7c9fa26c8aa60c419df488f7751a79af0d2d3
                  MATRIX: 801->1|964->69|994->74|1012->84|1051->86|1083->92|1441->424|1507->474|1546->475|1579->481|1649->524|1662->528|1694->539|1724->542|1737->546|1767->555|1842->603|1855->607|1887->618|1917->621|1930->625|1962->636|2037->684|2050->688|2082->699|2112->702|2125->706|2151->711|2226->759|2239->763|2271->774|2301->777|2314->781|2344->790|2390->806|2422->811|2777->1140|2814->1161|2854->1163|2888->1170|2960->1215|2973->1219|3005->1230|3035->1233|3048->1237|3078->1246|3155->1296|3168->1300|3200->1311|3230->1314|3243->1318|3275->1329|3352->1379|3365->1383|3397->1394|3427->1397|3440->1401|3466->1406|3524->1434|3557->1440
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|50->19|51->20|51->20|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|57->26|58->27|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|82->51|83->52
                  -- GENERATED --
              */
          
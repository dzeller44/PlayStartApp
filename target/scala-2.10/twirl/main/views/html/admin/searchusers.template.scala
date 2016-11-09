
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
				<td><a href="/finduserurl?email="""),_display_(/*22.38*/user/*22.42*/.email),format.raw/*22.48*/("""">"""),_display_(/*22.51*/user/*22.55*/.fullname),format.raw/*22.64*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*23.38*/user/*23.42*/.email),format.raw/*23.48*/("""">"""),_display_(/*23.51*/user/*23.55*/.email),format.raw/*23.61*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*24.38*/user/*24.42*/.email),format.raw/*24.48*/("""">"""),_display_(/*24.51*/user/*24.55*/.role),format.raw/*24.60*/("""</a></td>
				<td><a href="/finduserurl?email="""),_display_(/*25.38*/user/*25.42*/.email),format.raw/*25.48*/("""">"""),_display_(/*25.51*/user/*25.55*/.approved),format.raw/*25.64*/("""</a></td>
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
						<td><a href="/finduserurl?email="""),_display_(/*47.40*/user/*47.44*/.email),format.raw/*47.50*/("""">"""),_display_(/*47.53*/user/*47.57*/.fullname),format.raw/*47.66*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*48.40*/user/*48.44*/.email),format.raw/*48.50*/("""">"""),_display_(/*48.53*/user/*48.57*/.email),format.raw/*48.63*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*49.40*/user/*49.44*/.email),format.raw/*49.50*/("""">"""),_display_(/*49.53*/user/*49.57*/.role),format.raw/*49.62*/("""</a></td>
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
                  DATE: Wed Nov 09 15:09:06 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchusers.scala.html
                  HASH: 1bd64b02ed3ea2ad4b7d27729e4626bc2ea8e35a
                  MATRIX: 801->1|964->69|994->74|1012->84|1051->86|1083->92|1441->424|1507->474|1546->475|1579->481|1649->524|1662->528|1689->534|1719->537|1732->541|1762->550|1837->598|1850->602|1877->608|1907->611|1920->615|1947->621|2022->669|2035->673|2062->679|2092->682|2105->686|2131->691|2206->739|2219->743|2246->749|2276->752|2289->756|2319->765|2365->781|2397->786|2752->1115|2789->1136|2829->1138|2863->1145|2935->1190|2948->1194|2975->1200|3005->1203|3018->1207|3048->1216|3125->1266|3138->1270|3165->1276|3195->1279|3208->1283|3235->1289|3312->1339|3325->1343|3352->1349|3382->1352|3395->1356|3421->1361|3479->1389|3512->1395
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|50->19|51->20|51->20|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|57->26|58->27|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|82->51|83->52
                  -- GENERATED --
              */
          
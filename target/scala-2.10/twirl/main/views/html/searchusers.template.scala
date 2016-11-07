
package views.html

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

	"""),format.raw/*5.2*/("""<section id="search">
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
				"""),_display_(/*16.6*/for(user <- userList) yield /*16.27*/ {_display_(Seq[Any](format.raw/*16.29*/("""
					"""),format.raw/*17.6*/("""<tr>
						<td><a href="/openuser">"""),_display_(/*18.32*/user/*18.36*/.fullname),format.raw/*18.45*/("""</a></td>
						<td><a href="/openuser">"""),_display_(/*19.32*/user/*19.36*/.email),format.raw/*19.42*/("""</a></td>
						<td><a href="/openuser">"""),_display_(/*20.32*/user/*20.36*/.role),format.raw/*20.41*/("""</a></td>
					</tr>
				""")))}),format.raw/*22.6*/(""" 
			"""),format.raw/*23.4*/("""</tbody>
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
                  DATE: Mon Nov 07 11:00:36 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/searchusers.scala.html
                  HASH: 85ba1b38267092eab08f2dac06ffa4d718dd8dcf
                  MATRIX: 795->1|958->69|986->72|1004->82|1043->84|1072->87|1310->299|1347->320|1387->322|1420->328|1483->364|1496->368|1526->377|1594->418|1607->422|1634->428|1702->469|1715->473|1741->478|1797->504|1829->509
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23
                  -- GENERATED --
              */
          

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


"""),_display_(/*4.2*/main(null)/*4.12*/ {_display_(Seq[Any](format.raw/*4.14*/("""


"""),format.raw/*7.1*/("""<!-- ABOUT -->
<section id="search">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200"
		data-animated="fadeInUp">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-3 margbot30">
					Search Records...
					#"""),format.raw/*22.7*/("""{"""),format.raw/*22.8*/("""table users /"""),format.raw/*22.21*/("""}"""),format.raw/*22.22*/("""

"""),format.raw/*24.1*/("""<ul>
"""),_display_(/*25.2*/for(user <- userList) yield /*25.23*/ {_display_(Seq[Any](format.raw/*25.25*/("""
  """),format.raw/*26.3*/("""<a href="/openuser"><li>"""),_display_(/*26.28*/user/*26.32*/.fullname),format.raw/*26.41*/("""</li></a>
""")))}),format.raw/*27.2*/(""" 
"""),format.raw/*28.1*/("""</ul>


				</div>

			</div>
		</div>
		<!-- //ROW -->
	</div>
	<!-- //CONTAINER -->
	</div>
	<!-- //SERVICES -->


</section>
<!-- //ABOUT -->

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
                  DATE: Fri Nov 04 09:52:40 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/searchusers.scala.html
                  HASH: bd0ffacf3c0f81a82e0568b36a41b66d762ab76e
                  MATRIX: 795->1|958->69|987->73|1005->83|1044->85|1073->88|1448->436|1476->437|1517->450|1546->451|1575->453|1607->459|1644->480|1684->482|1714->485|1766->510|1779->514|1809->523|1850->534|1879->536
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|53->22|53->22|53->22|53->22|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|59->28
                  -- GENERATED --
              */
          
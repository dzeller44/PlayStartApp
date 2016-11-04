
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

<ul>
"""),_display_(/*23.2*/for(user <- userList) yield /*23.23*/ {_display_(Seq[Any](format.raw/*23.25*/("""
  """),format.raw/*24.3*/("""<a href="/openuser"><li>"""),_display_(/*24.28*/user/*24.32*/.fullname),format.raw/*24.41*/("""</li></a>
""")))}),format.raw/*25.2*/(""" 
"""),format.raw/*26.1*/("""</ul>


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
                  DATE: Fri Nov 04 13:38:16 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/searchusers.scala.html
                  HASH: 4ca37556dd112a104c828f6f0ed6ddcbb6f35d17
                  MATRIX: 795->1|958->69|987->73|1005->83|1044->85|1073->88|1425->414|1462->435|1502->437|1532->440|1584->465|1597->469|1627->478|1668->489|1697->491
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|57->26
                  -- GENERATED --
              */
          
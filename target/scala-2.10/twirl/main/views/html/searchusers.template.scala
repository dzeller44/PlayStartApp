
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

class searchusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Login],List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login], userList: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""


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

</ul>


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

  def render(loginForm:Form[Application.Login],userList:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,userList)

  def f:((Form[Application.Login],List[User]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,userList) => apply(loginForm,userList)

  def ref: this.type = this

}


}

/**/
object searchusers extends searchusers_Scope0.searchusers
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 12:32:06 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/searchusers.scala.html
                  HASH: d9c01bf924298a931a5b41f306d4c844770ea1b4
                  MATRIX: 785->1|938->59|967->63|985->73|1024->75|1053->78|1428->426|1456->427|1497->440|1526->441|1555->443
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|53->22|53->22|53->22|53->22|55->24
                  -- GENERATED --
              */
          
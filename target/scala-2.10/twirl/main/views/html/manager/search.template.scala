
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


"""),format.raw/*6.1*/("""<!-- ABOUT -->
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

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 10:33:58 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/manager/search.scala.html
                  HASH: 275bdbeaa4dd7fbdaad880d7f4ed5cce771d22fd
                  MATRIX: 772->1|903->37|931->40|949->50|988->52|1017->55
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6
                  -- GENERATED --
              */
          
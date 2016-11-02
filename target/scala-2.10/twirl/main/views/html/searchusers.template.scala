
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

class searchusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""


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

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object searchusers extends searchusers_Scope0.searchusers
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 12:04:14 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/searchusers.scala.html
                  HASH: 9950f8856213432dc937e3d970260229c193f93c
                  MATRIX: 774->1|905->37|934->41|952->51|991->53|1020->56|1395->404|1423->405|1464->418|1493->419|1522->421
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|53->22|53->22|53->22|53->22|55->24
                  -- GENERATED --
              */
          
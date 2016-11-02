
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


"""),format.raw/*6.1*/("""<!-- ABOUT -->
<section id="about">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200"
		data-animated="fadeInUp">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/auth">
						<p>
							<img src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("/img/icon_provider.png")),format.raw/*22.61*/(""""> <b>Business User</b>
						</p> <span>If you are a provider of services...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/auth">
						<p>
							<img src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.at("/img/icon_emergency_mgr2.png")),format.raw/*29.67*/(""""> <b>Emergency
								Manager</b>
						</p> <span>If you are looking for services...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/auth">
						<p>
							<img src=""""),_display_(/*37.19*/routes/*37.25*/.Assets.at("/img/icon_admin.png")),format.raw/*37.58*/(""""> <b>Administrator</b>
						</p> <span>Admin Only...</span>
					</a>
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

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 12:00:35 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/index.scala.html
                  HASH: 77f6e569c1c19cd317b47844e8436788e76ddf4d
                  MATRIX: 789->1|960->77|988->80|1006->90|1045->92|1074->95|1491->485|1506->491|1563->527|1805->742|1820->748|1883->790|2135->1015|2150->1021|2204->1054
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|53->22|53->22|53->22|60->29|60->29|60->29|68->37|68->37|68->37
                  -- GENERATED --
              */
          
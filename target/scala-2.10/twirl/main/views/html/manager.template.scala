
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manager_Scope0 {
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

class manager extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


"""),format.raw/*6.1*/("""<!-- ABOUT -->
<section id="managerMain">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200"
		data-animated="fadeInUp">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-1 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/emuser">
						<p>
							<img src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.at("/img/icon_User_Maint.png")),format.raw/*23.63*/(""""> <b>User Maintenance</b>
						</p> <span>Add/Edit/Update User Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/emsearch">
						<p>
							<img src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*30.67*/(""""> <b>Search Records</b>
						</p> <span>Search Business Profiles...</span>
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

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object manager extends manager_Scope0.manager
              /*
                  -- GENERATED --
                  DATE: Mon Oct 31 10:00:01 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/manager.scala.html
                  HASH: 5dae986b0d452e526f7ea4863b5b3adfc3bb87b6
                  MATRIX: 766->1|897->37|925->40|943->50|982->52|1011->55|1479->496|1494->502|1553->540|1797->757|1812->763|1875->805
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|54->23|54->23|54->23|61->30|61->30|61->30
                  -- GENERATED --
              */
          
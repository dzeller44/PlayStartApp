
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usermaint_Scope0 {
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

class usermaint extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


"""),format.raw/*6.1*/("""<!-- ABOUT -->
<section id="userMaintenance">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200"
		data-animated="fadeInUp">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/emuser">
						<p>
							<img src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("/img/icon_Add_User2.png")),format.raw/*22.62*/(""""> <b>Add User</b>
						</p> <span>Add new user...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/emuser">
						<p>
							<img src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.at("/img/icon_Edit_User.png")),format.raw/*29.62*/(""""> <b>Edit User</b>
						</p> <span>Locate and edit a user...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/emuser">
						<p>
							<img src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.at("/img/icon_Delete_User.png")),format.raw/*36.64*/(""""> <b>Delete User</b>
						</p> <span>Locate and delete a user...</span>
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
object usermaint extends usermaint_Scope0.usermaint
              /*
                  -- GENERATED --
                  DATE: Mon Oct 31 14:02:58 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/manager/usermaint.scala.html
                  HASH: 9314b05cb4b223b3b841e267737b8d2661f14d31
                  MATRIX: 778->1|909->37|937->40|955->50|994->52|1023->55|1452->457|1467->463|1525->500|1743->691|1758->697|1816->734|2045->936|2060->942|2120->981
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|53->22|53->22|53->22|60->29|60->29|60->29|67->36|67->36|67->36
                  -- GENERATED --
              */
          
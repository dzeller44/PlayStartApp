
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

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
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/adminuser">
						<p>
							<img src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("/img/icon_User_Maint.png")),format.raw/*21.63*/(""""> <b>User Maintenance</b>
						</p> <span>Add/Edit/Update User Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/addadmin">
						<p>
							<img src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.at("/img/icon_Add_User2.png")),format.raw/*28.62*/(""""> <b>Add Admin</b>
						</p> <span>Add new Admin...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/export">
						<p>
							<img src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*35.64*/(""""> <b>Export Data</b>
						</p> <span>Export Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/search">
						<p>
							<img src=""""),_display_(/*42.19*/routes/*42.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*42.67*/(""""> <b>Search Records</b>
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
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:24:52 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/admin.scala.html
                  HASH: c248382dcd6f4983d191c264460bf16ac92db5a6
                  MATRIX: 768->1|899->37|927->40|945->50|984->52|1013->55|1398->413|1413->419|1472->457|1716->674|1731->680|1789->717|2009->910|2024->916|2084->955|2307->1151|2322->1157|2385->1199
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|52->21|52->21|52->21|59->28|59->28|59->28|66->35|66->35|66->35|73->42|73->42|73->42
                  -- GENERATED --
              */
          
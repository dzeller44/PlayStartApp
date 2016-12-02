
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
<section id="adminMain">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/adminuser">
						<p>
							<img src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.at("/img/icon_User_Maint.png")),format.raw/*20.63*/(""""> <b>User Maintenance</b>
						</p> <span>Add/Edit/Update User Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/addadmin">
						<p>
							<img src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.at("/img/icon_Add_User2.png")),format.raw/*27.62*/(""""> <b>Add Admin</b>
						</p> <span>Add new Admin...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/searchprofiles">
						<p>
							<img src=""""),_display_(/*34.19*/routes/*34.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*34.64*/(""""> <b>Export Data</b>
						</p> <span>Export Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/searchprofiles">
						<p>
							<img src=""""),_display_(/*41.19*/routes/*41.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*41.67*/(""""> <b>Search Profiles</b>
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
                  DATE: Fri Dec 02 15:33:11 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/admin.scala.html
                  HASH: 3bc3c38d91be7790dd8360587150db7423ff98ba
                  MATRIX: 768->1|899->37|927->40|945->50|984->52|1013->55|1369->384|1384->390|1443->428|1687->645|1702->651|1760->688|1988->889|2003->895|2063->934|2294->1138|2309->1144|2372->1186
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|51->20|51->20|51->20|58->27|58->27|58->27|65->34|65->34|65->34|72->41|72->41|72->41
                  -- GENERATED --
              */
          
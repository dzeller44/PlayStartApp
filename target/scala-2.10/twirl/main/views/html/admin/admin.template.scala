
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
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/adminuser">
						<p>
							<img src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("/img/icon_User_Maint.png")),format.raw/*22.63*/(""""> <b>User Maintenance</b>
						</p> <span>Add/Edit/Update User Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/export">
						<p>
							<img src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*29.64*/(""""> <b>Export Data</b>
						</p> <span>Export Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/search">
						<p>
							<img src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*36.67*/(""""> <b>Search Records</b>
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
                  DATE: Fri Nov 04 11:20:28 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/admin.scala.html
                  HASH: 483f9288615be043bd7f56a00e2befb6cd6dd77b
                  MATRIX: 768->1|899->37|927->40|945->50|984->52|1013->55|1441->456|1456->462|1515->500|1757->715|1772->721|1832->760|2055->956|2070->962|2133->1004
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|53->22|53->22|53->22|60->29|60->29|60->29|67->36|67->36|67->36
                  -- GENERATED --
              */
          
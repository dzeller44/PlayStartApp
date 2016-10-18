
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(null)/*1.12*/ {_display_(Seq[Any](format.raw/*1.14*/("""


"""),format.raw/*4.1*/("""<!-- ABOUT -->
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
					<a class="services_item" href="#/login">
						<p>
							<img src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.at("/img/icon_provider.png")),format.raw/*20.61*/(""""> <b>Business User</b>
						</p> <span>If you are a provider of services...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="#/login">
						<p>
							<img src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.at("/img/icon_emergency_mgr2.png")),format.raw/*27.67*/(""""> <b>Emergency
								Manager</b>
						</p> <span>If you are looking for services...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="#/login">
						<p>
							<img src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.at("/img/icon_admin.png")),format.raw/*35.58*/(""""> <b>Administrator</b>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Oct 18 10:12:33 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/index.scala.html
                  HASH: ba7a17e1a768ecee2b2d4cbccde5f3902142a4cc
                  MATRIX: 827->1|845->11|884->13|913->16|1332->408|1347->414|1404->450|1648->667|1663->673|1726->715|1980->942|1995->948|2049->981
                  LINES: 32->1|32->1|32->1|35->4|51->20|51->20|51->20|58->27|58->27|58->27|66->35|66->35|66->35
                  -- GENERATED --
              */
          
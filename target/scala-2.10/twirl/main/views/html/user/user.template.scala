
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

"""),format.raw/*3.1*/("""<section id="userMain">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-1 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/export">
						<p>
							<img src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*18.64*/(""""> <b>Add Business Profile</b>
						</p> <span>Export Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/search">
						<p>
							<img src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*25.67*/(""""> <b>Edit Business Profile</b>
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
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Mon Nov 07 12:13:58 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/user/user.scala.html
                  HASH: 41fdffbb968fa649edc0fec7c35a61b2d314d14d
                  MATRIX: 830->1|843->7|882->9|910->11|1333->407|1348->413|1408->452|1640->657|1655->663|1718->705
                  LINES: 32->1|32->1|32->1|34->3|49->18|49->18|49->18|56->25|56->25|56->25
                  -- GENERATED --
              */
          
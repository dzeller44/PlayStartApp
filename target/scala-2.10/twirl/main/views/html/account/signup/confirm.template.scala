
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirm_Scope0 {
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

class confirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

"""),format.raw/*3.1*/("""<section id="confirmEmail">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post">
		<div class="title">
			<h2>Account Activated</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*12.56*/Messages("signup.signup")),format.raw/*12.81*/("""
				"""),format.raw/*13.5*/("""- """),_display_(/*13.8*/Messages("signup.email.confirmed")),format.raw/*13.42*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" a href=""""),_display_(/*16.34*/routes/*16.40*/.Application.index),format.raw/*16.58*/(""""
				value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object confirm extends confirm_Scope0.confirm
              /*
                  -- GENERATED --
                  DATE: Tue Oct 18 10:12:33 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/confirm.scala.html
                  HASH: 2729a9371b23f14aa6c25763f324e3617a864d65
                  MATRIX: 846->1|859->7|898->9|926->11|1380->438|1426->463|1458->468|1487->471|1542->505|1643->579|1658->585|1697->603|1856->732
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|44->13|44->13|47->16|47->16|47->16|56->25
                  -- GENERATED --
              */
          
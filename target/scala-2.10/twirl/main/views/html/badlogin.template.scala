
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object badlogin_Scope0 {
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

class badlogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
			<h2>Invalid Login</h2>
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
object badlogin extends badlogin_Scope0.badlogin
              /*
                  -- GENERATED --
                  DATE: Wed Oct 19 12:32:07 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/badlogin.scala.html
                  HASH: f781923efb8a58d0b78ca72e59e197566d5aa148
                  MATRIX: 833->1|846->7|885->9|913->11|1363->434|1409->459|1441->464|1470->467|1525->501|1626->575|1641->581|1680->599|1839->728
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|44->13|44->13|47->16|47->16|47->16|56->25
                  -- GENERATED --
              */
          
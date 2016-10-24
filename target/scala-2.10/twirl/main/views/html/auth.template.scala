
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object auth_Scope0 {
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

class auth extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.80*/("""

"""),_display_(/*6.2*/main(null)/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""

"""),format.raw/*8.1*/("""<section id="authentication">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<!--  
		if(loginForm.hasGlobalErrors) """),format.raw/*14.33*/("""{"""),format.raw/*14.34*/("""
			"""),format.raw/*15.4*/("""<p class="error">
				<span class="label label-danger">"""),_display_(/*16.39*/loginForm/*16.48*/.globalError.message),format.raw/*16.68*/("""</span>
			</p>
		"""),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""
		"""),format.raw/*19.3*/("""-->
		<div class="title">
			<h2>Login</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="text" name="email" required="required"
					placeholder="Enter your email..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-password">
			<label class="title"><span class="required">*</span>Password:</label>
			<div class="item-cont">
				<input class="large" type="password" name="password" value=""
					required="required" placeholder="Enter your password..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="submit">
			<input type="submit" value="Submit" />
			<a href="/" class="buttonCancel">"""),_display_(/*40.38*/Messages("goback")),format.raw/*40.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/signup"><div class="loginText">"""),_display_(/*47.45*/Messages("account.need")),format.raw/*47.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*48.48*/Messages("forgot.password")),format.raw/*48.75*/("""</div></a>
	</div>

</section>

""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object auth extends auth_Scope0.auth
              /*
                  -- GENERATED --
                  DATE: Mon Oct 24 13:20:37 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/auth.scala.html
                  HASH: 244479483d640f5e15c8be64380b49cf45d82dd7
                  MATRIX: 760->1|898->60|930->84|1014->37|1045->138|1075->143|1093->153|1132->155|1162->159|1530->499|1559->500|1591->505|1675->562|1693->571|1734->591|1781->611|1809->612|1840->616|2653->1402|2692->1420|2891->1592|2936->1616|3022->1675|3070->1702|3138->1740
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|38->8|44->14|44->14|45->15|46->16|46->16|46->16|48->18|48->18|49->19|70->40|70->40|77->47|77->47|78->48|78->48|83->53
                  -- GENERATED --
              */
          
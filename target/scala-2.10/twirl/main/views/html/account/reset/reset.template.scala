
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.account.Reset.ResetForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.account.Reset.ResetForm], token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

"""),_display_(/*8.2*/main(null)/*8.12*/ {_display_(Seq[Any](format.raw/*8.14*/("""

	"""),format.raw/*10.2*/("""<section id="resetPasswordChange">
		<!-- Start Formoid form-->
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>"""),_display_(/*16.10*/Messages("resetpassword.new.password")),format.raw/*16.48*/("""</h2>
			</div>
		<div class="element-password">
			<label class="title"><span class="required">*</span>Password:</label>
			<div class="item-cont">
				<input class="large" type="password" name="password" value=""
					required="required" placeholder="Enter your password..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
		    """),_display_(/*27.8*/if(resetForm.hasGlobalErrors)/*27.37*/ {_display_(Seq[Any](format.raw/*27.39*/("""
        		"""),format.raw/*28.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*29.16*/resetForm/*29.25*/.globalError.message),format.raw/*29.45*/("""
        		"""),format.raw/*30.11*/("""</span>
   			""")))}),format.raw/*31.8*/("""
		"""),format.raw/*32.3*/("""</div>
			<div class="submit">
				<input type="submit" value=""""),_display_(/*34.34*/Messages("validate")),format.raw/*34.54*/("""" />
				<a href="/" class="buttonCancel">"""),_display_(/*35.39*/Messages("goback")),format.raw/*35.57*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>

	</section>

""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(resetForm:Form[controllers.account.Reset.ResetForm],token:String): play.twirl.api.HtmlFormat.Appendable = apply(resetForm,token)

  def f:((Form[controllers.account.Reset.ResetForm],String) => play.twirl.api.HtmlFormat.Appendable) = (resetForm,token) => apply(resetForm,token)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Mon Nov 21 15:06:12 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/reset/reset.scala.html
                  HASH: dc4ed68409161f7ec403c352bf8d78bb5969fe77
                  MATRIX: 801->1|972->94|1004->118|1100->70|1128->89|1158->184|1186->187|1204->197|1243->199|1273->202|1634->536|1693->574|2092->947|2130->976|2170->978|2209->989|2310->1063|2328->1072|2369->1092|2408->1103|2453->1118|2483->1121|2574->1185|2615->1205|2685->1248|2724->1266|2867->1379
                  LINES: 27->1|31->4|31->4|34->1|36->4|36->6|38->8|38->8|38->8|40->10|46->16|46->16|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|61->31|62->32|64->34|64->34|65->35|65->35|73->43
                  -- GENERATED --
              */
          
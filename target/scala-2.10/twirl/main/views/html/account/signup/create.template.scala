
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(null)/*1.12*/ {_display_(Seq[Any](format.raw/*1.14*/("""
   
"""),format.raw/*3.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>New User Registration</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required"
					placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" required="required"
					placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-password">
			<label class="title"><span class="required">*</span>Password:</label>
			<div class="item-cont">
				<input class="large" type="password" name="inputPassword" value=""
					required="required" placeholder="Create a password..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-checkbox">
			<div class="column column1">
				<label><input type="checkbox" name="checkbox[]"
					value="option 1" / required="required"><span>I agree
						with the terms and conditions *</span></label>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="submit">
		<!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
			<input type="submit" value="Submit" />
			<a href="/" class="buttonCancel">"""),_display_(/*44.38*/Messages("goback")),format.raw/*44.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/auth"><div class="loginText">"""),_display_(/*51.43*/Messages("account.exists")),format.raw/*51.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*52.48*/Messages("forgot.password")),format.raw/*52.75*/("""</div></a>
	</div>

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
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Mon Oct 24 13:26:43 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/create.scala.html
                  HASH: 1fd23176ce09633e6f25eed90e72032e653ea655
                  MATRIX: 844->1|862->11|901->13|932->18|2708->1767|2747->1785|2937->1948|2984->1974|3069->2032|3117->2059
                  LINES: 32->1|32->1|32->1|34->3|75->44|75->44|82->51|82->51|83->52|83->52
                  -- GENERATED --
              */
          
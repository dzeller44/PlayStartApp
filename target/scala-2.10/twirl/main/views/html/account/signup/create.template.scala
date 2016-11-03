
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>New User Registration</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required"
					placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" required="required"
					placeholder="Enter your email..." /><span class="icon-place"></span>
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
		<div class="element-radio">
			<label class="title"><span class="required">*</span>Account
				Role:</label>
			<div class="column column1">
				<label>
					<input type="radio" name="role" value="user"
					required="required" /><span>Business User</span>
				</label>
				<label>
					<input
					type="radio" name="role" value="manager" required="required" /><span>Emergency
						Manager</span>
				</label>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="element-checkbox">
			<div class="column column1">
				<label><input type="checkbox" name="checkbox[]"
					value="option 1" / required="required"><span>I agree
						with the terms and conditions *</span></label>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="element-input">
		    """),_display_(/*61.8*/if(signupForm.hasGlobalErrors)/*61.38*/ {_display_(Seq[Any](format.raw/*61.40*/("""
        		"""),format.raw/*62.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*63.16*/signupForm/*63.26*/.globalError.message),format.raw/*63.46*/("""
        		"""),format.raw/*64.11*/("""</span>
   			""")))}),format.raw/*65.8*/("""
		"""),format.raw/*66.3*/("""</div>
		<div class="submit">
			<!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
			<input type="submit" value="Submit" /> <a href="/"
				class="buttonCancel">"""),_display_(/*70.27*/Messages("goback")),format.raw/*70.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/auth"><div class="loginText">"""),_display_(/*77.43*/Messages("account.exists")),format.raw/*77.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*78.48*/Messages("forgot.password")),format.raw/*78.75*/("""</div></a>
	</div>

</section>

""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 09:49:57 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/create.scala.html
                  HASH: f4d4537a82189ce24ef66283d566ca1430169511
                  MATRIX: 782->1|917->41|945->44|963->54|1002->56|1030->58|3108->2110|3147->2140|3187->2142|3226->2153|3327->2227|3346->2237|3387->2257|3426->2268|3471->2283|3501->2286|3740->2498|3779->2516|3969->2679|4016->2705|4101->2763|4149->2790|4212->2823
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|96->65|97->66|101->70|101->70|108->77|108->77|109->78|109->78|114->83
                  -- GENERATED --
              */
          
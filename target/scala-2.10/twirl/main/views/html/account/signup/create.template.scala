
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
		method="post">
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
			<input type="submit"  value="Submit" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/login"><div class="loginText">Already have an account? Click here...</div></a>
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
                  DATE: Tue Oct 18 11:13:41 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/create.scala.html
                  HASH: fbbfb7a5b7824ba91e64d97171147b94b6a50ced
                  MATRIX: 844->1|862->11|901->13|932->18
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          
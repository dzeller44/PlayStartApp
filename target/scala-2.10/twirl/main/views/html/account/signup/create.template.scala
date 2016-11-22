
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


"""),format.raw/*6.1*/("""<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*6.61*/("""" type="text/javascript"></script>
<script>
$(document).ready(function() """),format.raw/*8.30*/("""{"""),format.raw/*8.31*/("""
    """),format.raw/*9.5*/("""$("input[name$='role']").click(function() """),format.raw/*9.47*/("""{"""),format.raw/*9.48*/("""
        """),format.raw/*10.9*/("""var test = $(this).val();

        $("div.desc").hide();
        $("#" + test).show();
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/(""");
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/(""");
</script>

<section id="signup">
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
			
				<div id="user" class="desc" style="display: none;">
				</div>	
		
				<div id="manager" class="desc" style="display: none;">
					<div class="element-input">
							<label class="title">Agency:</label>
						<div class="item-cont">
							<input class="large" type="text" name="agency" value="" placeholder="Which agency..." /><span class="icon-place"></span>
						</div>
					</div>
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
		<div class="element-input">
		    """),_display_(/*89.8*/if(signupForm.hasGlobalErrors)/*89.38*/ {_display_(Seq[Any](format.raw/*89.40*/("""
        		"""),format.raw/*90.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*91.16*/signupForm/*91.26*/.globalError.message),format.raw/*91.46*/("""
        		"""),format.raw/*92.11*/("""</span>
   			""")))}),format.raw/*93.8*/("""
		"""),format.raw/*94.3*/("""</div>
		<div class="submit">
			<!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
			<input type="submit" value="Submit" /> <a href="/"
				class="buttonCancel">"""),_display_(/*98.27*/Messages("goback")),format.raw/*98.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/auth"><div class="loginText">"""),_display_(/*105.43*/Messages("account.exists")),format.raw/*105.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*106.48*/Messages("forgot.password")),format.raw/*106.75*/("""</div></a>
	</div>

</section>

""")))}),format.raw/*111.2*/("""
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
                  DATE: Tue Nov 22 12:42:51 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/create.scala.html
                  HASH: 5280a726c0e85fac7de2ead17ba4880f82c66160
                  MATRIX: 782->1|917->41|947->46|965->56|1004->58|1036->64|1076->78|1090->84|1150->124|1252->199|1280->200|1312->206|1381->248|1409->249|1446->259|1568->354|1596->355|1627->359|1655->360|4232->2911|4271->2941|4311->2943|4351->2955|4453->3030|4472->3040|4513->3060|4553->3072|4599->3088|4630->3092|4873->3308|4912->3326|5110->3496|5158->3522|5245->3581|5294->3608|5363->3646
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|37->6|37->6|37->6|39->8|39->8|40->9|40->9|40->9|41->10|45->14|45->14|46->15|46->15|120->89|120->89|120->89|121->90|122->91|122->91|122->91|123->92|124->93|125->94|129->98|129->98|136->105|136->105|137->106|137->106|142->111
                  -- GENERATED --
              */
          
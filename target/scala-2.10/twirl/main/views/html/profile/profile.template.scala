
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.ProfileRegister],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<section id="profileMain">
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Business Profile</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Business
			Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="name" required="required"
					placeholder="Business Name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-address">
			<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required"/><span class="icon-place"></span></span><div class="country">
				<select name="country" required="required">
					<option selected="selected" value="" disabled="disabled">--- Select a country ---</option>
					<option value="United States">United States</option>
					<option value="Canada">Canada</option>
				</select>
				<i></i><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-name">
			<label class="title"><span class="required">*</span>Primary Contact
			Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
				required="required" /><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="primaryNameLast" required="required" /><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Primary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*43.38*/("""{"""),format.raw/*43.39*/("""3,"""),format.raw/*43.41*/("""}"""),format.raw/*43.42*/("""" maxlength="24" name="primaryPhone"
					required="required" placeholder="Phone Number..." value="" /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Primary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="primaryEmail" value=""
					required="required" placeholder="Email..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-name">
			<label class="title"><span class="required">*</span>Secondary Contact
			Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
				required="required" /><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="secondaryNameLast" required="required" /><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Secondary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*71.38*/("""{"""),format.raw/*71.39*/("""3,"""),format.raw/*71.41*/("""}"""),format.raw/*71.42*/("""" maxlength="24" name="secondaryPhone"
					required="required" placeholder="Phone Number..." value="" /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Secondary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="secondaryEmail" value=""
					required="required" placeholder="Email..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-checkbox">
			<label class="title">Services Provided:<span class="required">*</span></label>
			<div class="column column1">
				<label><input type="checkbox"
					onclick="profileServicesOtherShowHide(this);" name="services"
					value="waterbottled" ><span>Water
				Bottled</span></label> <label><input type="checkbox" name="services"
					value="waterbulk" ><span>Water
				Bulk</span></label> <label><input type="checkbox" name="services"
					value="sanitation" ><span>Sanitation/Toilet/Sink</span></label>
				<label><input type="checkbox" name="services"
					value="dumpster"><span>Dumpsters</span></label>
				<label><input type="checkbox" name="services"
					value="shower" ><span>Showers</span></label> <label><input
					type="checkbox" name="services" value="generator" ><span>Generators</span></label> <label><input
					type="checkbox" name="services" value="pump"
					><span>Pumps</span></label> <label><input
					type="checkbox" name="services" value="heavyequip"
					><span>Heavy Equipment</span></label> <label><input
					type="checkbox" name="services" value="fuel"
					><span>Fuel</span></label> <label><input
					type="checkbox" name="services" value="sandbags"
					><span>Sandbags</span></label> <label><input
					type="checkbox" name="services" value="tempfacility"
					><span>Temporary Facilities</span></label> <label><input
					type="checkbox" name="services" value="profserv"
					><span>Professional Services</span></label> <label><input
					type="checkbox" name="services" value="other"
					><span>Other (Please List)</span></label>
			</div>
			<div id="otherService" class="element-input">
				<label class="title"><span class="required">*</span>Other:</label>
				<div class="item-cont">
					<input class="large" type="text" name="serviceOther" 
						placeholder="Other..." /><span class="icon-place"></span>
				</div>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="element-input">
			"""),_display_(/*125.5*/if(profileForm.hasGlobalErrors)/*125.36*/ {_display_(Seq[Any](format.raw/*125.38*/("""
			"""),format.raw/*126.4*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
			"""),_display_(/*127.5*/profileForm/*127.16*/.globalError.message),format.raw/*127.36*/("""
			"""),format.raw/*128.4*/("""</span>
			""")))}),format.raw/*129.5*/("""
		"""),format.raw/*130.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/user"
				class="buttonCancel">"""),_display_(/*133.27*/Messages("goback")),format.raw/*133.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm)

  def f:((Form[Application.ProfileRegister]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm) => apply(profileForm)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:24:53 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/profile.scala.html
                  HASH: b03652590f23310d8ac248b805efbfa0e4a229ed
                  MATRIX: 784->1|927->49|957->54|975->64|1014->66|1042->68|3569->2567|3598->2568|3628->2570|3657->2571|4901->3787|4930->3788|4960->3790|4989->3791|7534->6309|7575->6340|7616->6342|7649->6347|7740->6411|7761->6422|7803->6442|7836->6447|7880->6460|7912->6464|8057->6581|8097->6599
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|74->43|74->43|74->43|74->43|102->71|102->71|102->71|102->71|156->125|156->125|156->125|157->126|158->127|158->127|158->127|159->128|160->129|161->130|164->133|164->133
                  -- GENERATED --
              */
          

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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.ProfileRegister],java.util.List[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

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
				"""),_display_(/*88.6*/for(service <- servicesList) yield /*88.34*/ {_display_(Seq[Any](format.raw/*88.36*/("""
				    """),format.raw/*89.9*/("""<label><input type="checkbox" onclick="profileServicesOtherShowHide(this);" name="selectServices" value="""),_display_(/*89.114*/service/*89.121*/.name),format.raw/*89.126*/("""><span>"""),_display_(/*89.134*/service/*89.141*/.name),format.raw/*89.146*/("""</span></label>
				""")))}),format.raw/*90.6*/("""
			"""),format.raw/*91.4*/("""</div>
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
			"""),_display_(/*102.5*/if(profileForm.hasGlobalErrors)/*102.36*/ {_display_(Seq[Any](format.raw/*102.38*/("""
			"""),format.raw/*103.4*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
			"""),_display_(/*104.5*/profileForm/*104.16*/.globalError.message),format.raw/*104.36*/("""
			"""),format.raw/*105.4*/("""</span>
			""")))}),format.raw/*106.5*/("""
		"""),format.raw/*107.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/user"
				class="buttonCancel">"""),_display_(/*110.27*/Messages("goback")),format.raw/*110.45*/("""</a>
		</div>
		<div class="submit">
			<a href="javascript:joinServices()" class="buttonDelete" style="color: #FFFFFF;">TRY This</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList)

  def f:((Form[Application.ProfileRegister],java.util.List[Service]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList) => apply(profileForm,servicesList)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 15:30:24 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/profile.scala.html
                  HASH: d0f47c2450bf18299631325167b276461ac8ca43
                  MATRIX: 808->1|990->88|1020->93|1038->103|1077->105|1105->107|3632->2606|3661->2607|3691->2609|3720->2610|4964->3826|4993->3827|5023->3829|5052->3830|5733->4485|5777->4513|5817->4515|5854->4525|5987->4630|6004->4637|6031->4642|6067->4650|6084->4657|6111->4662|6163->4684|6195->4689|6609->5076|6650->5107|6691->5109|6724->5114|6815->5178|6836->5189|6878->5209|6911->5214|6955->5227|6987->5231|7132->5348|7172->5366
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|74->43|74->43|74->43|74->43|102->71|102->71|102->71|102->71|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|120->89|121->90|122->91|133->102|133->102|133->102|134->103|135->104|135->104|135->104|136->105|137->106|138->107|141->110|141->110
                  -- GENERATED --
              */
          
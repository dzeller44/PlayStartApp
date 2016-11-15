
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editprofile_Scope0 {
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

class editprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Application.ProfileRegister],java.util.List[Service],Profile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service], profile: Profile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.107*/("""

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
					placeholder="Business Name..." value="""),_display_(/*16.44*/profile/*16.51*/.name),format.raw/*16.56*/(""" """),format.raw/*16.57*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-address">
			<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value="""),_display_(/*20.191*/profile/*20.198*/.address),format.raw/*20.206*/(""" """),format.raw/*20.207*/("""/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" value="""),_display_(/*20.339*/profile/*20.346*/.address1),format.raw/*20.355*/(""" """),format.raw/*20.356*/("""/><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value="""),_display_(/*20.473*/profile/*20.480*/.city),format.raw/*20.485*/(""" """),format.raw/*20.486*/("""/><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value="""),_display_(/*20.646*/profile/*20.653*/.state),format.raw/*20.659*/(""" """),format.raw/*20.660*/("""/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value="""),_display_(/*20.823*/profile/*20.830*/.zip),format.raw/*20.834*/(""" """),format.raw/*20.835*/("""/><span class="icon-place"></span></span><div class="country">
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
				required="required" value="""),_display_(/*33.32*/profile/*33.39*/.primaryNameFirst),format.raw/*33.56*/(""" """),format.raw/*33.57*/("""/><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="primaryNameLast" required="required" value="""),_display_(/*35.77*/profile/*35.84*/.primaryNameLast),format.raw/*35.100*/(""" """),format.raw/*35.101*/("""/><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Primary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*43.38*/("""{"""),format.raw/*43.39*/("""3,"""),format.raw/*43.41*/("""}"""),format.raw/*43.42*/("""" maxlength="24" name="primaryPhone"
					required="required" placeholder="Phone Number..." value="""),_display_(/*44.63*/profile/*44.70*/.primaryPhone),format.raw/*44.83*/(""" """),format.raw/*44.84*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Primary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="primaryEmail" 
					required="required" placeholder="Email..." value="""),_display_(/*53.56*/profile/*53.63*/.primaryEmail),format.raw/*53.76*/(""" """),format.raw/*53.77*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-name">
			<label class="title"><span class="required">*</span>Secondary Contact
			Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
				required="required" value="""),_display_(/*61.32*/profile/*61.39*/.secondaryNameFirst),format.raw/*61.58*/(""" """),format.raw/*61.59*/("""/><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="secondaryNameLast" required="required" value="""),_display_(/*63.79*/profile/*63.86*/.secondaryNameLast),format.raw/*63.104*/(""" """),format.raw/*63.105*/("""/><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Secondary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*71.38*/("""{"""),format.raw/*71.39*/("""3,"""),format.raw/*71.41*/("""}"""),format.raw/*71.42*/("""" maxlength="24" name="secondaryPhone"
					required="required" placeholder="Phone Number..." value="""),_display_(/*72.63*/profile/*72.70*/.secondaryPhone),format.raw/*72.85*/(""" """),format.raw/*72.86*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Secondary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="secondaryEmail" 
					required="required" placeholder="Email..." value="""),_display_(/*81.56*/profile/*81.63*/.secondaryEmail),format.raw/*81.78*/(""" """),format.raw/*81.79*/("""/><span
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

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service],profile:Profile): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList,profile)

  def f:((Form[Application.ProfileRegister],java.util.List[Service],Profile) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList,profile) => apply(profileForm,servicesList,profile)

  def ref: this.type = this

}


}

/**/
object editprofile extends editprofile_Scope0.editprofile
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 13:53:53 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: 3153b2a4d4d409017db51110e211412b11849bf0
                  MATRIX: 824->1|1025->106|1055->111|1073->121|1112->123|1140->125|1750->708|1766->715|1792->720|1821->721|2129->1001|2146->1008|2176->1016|2206->1017|2366->1149|2383->1156|2414->1165|2444->1166|2589->1283|2606->1290|2633->1295|2663->1296|2851->1456|2868->1463|2896->1469|2926->1470|3117->1633|3134->1640|3160->1644|3190->1645|3871->2299|3887->2306|3925->2323|3954->2324|4161->2504|4177->2511|4215->2527|4245->2528|4562->2817|4591->2818|4621->2820|4650->2821|4777->2921|4793->2928|4827->2941|4856->2942|5211->3270|5227->3277|5261->3290|5290->3291|5643->3617|5659->3624|5699->3643|5728->3644|5937->3826|5953->3833|5993->3851|6023->3852|6342->4143|6371->4144|6401->4146|6430->4147|6559->4249|6575->4256|6611->4271|6640->4272|6999->4604|7015->4611|7051->4626|7080->4627|9188->6708|9229->6739|9270->6741|9303->6746|9394->6810|9415->6821|9457->6841|9490->6846|9534->6859|9566->6863|9711->6980|9751->6998
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|47->16|47->16|47->16|47->16|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|64->33|64->33|64->33|64->33|66->35|66->35|66->35|66->35|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|84->53|84->53|84->53|84->53|92->61|92->61|92->61|92->61|94->63|94->63|94->63|94->63|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|112->81|112->81|112->81|112->81|156->125|156->125|156->125|157->126|158->127|158->127|158->127|159->128|160->129|161->130|164->133|164->133
                  -- GENERATED --
              */
          
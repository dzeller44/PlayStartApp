
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showprofile_Scope0 {
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

class showprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service], profile: Profile, servicesSelected: java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.149*/("""

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
				"""),format.raw/*126.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*126.64*/profileForm/*126.75*/.globalError.message),format.raw/*126.95*/("""</span>
			""")))}),format.raw/*127.5*/("""
		"""),format.raw/*128.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" />
			<a href="/admin" class="buttonCancel">"""),_display_(/*131.43*/Messages("goback")),format.raw/*131.61*/("""</a>
		</div>
		<div class="submit">
			<a href="javascript:deleteProfile('"""),_display_(/*134.40*/profile/*134.47*/.name),format.raw/*134.52*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service],profile:Profile,servicesSelected:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList,profile,servicesSelected)

  def f:((Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList,profile,servicesSelected) => apply(profileForm,servicesList,profile,servicesSelected)

  def ref: this.type = this

}


}

/**/
object showprofile extends showprofile_Scope0.showprofile
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 14:50:55 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showprofile.scala.html
                  HASH: e6acf8a452b944164f9c9adfd63a0c36b01b70a5
                  MATRIX: 845->1|1088->148|1118->153|1136->163|1175->165|1203->167|1813->750|1829->757|1855->762|1884->763|2192->1043|2209->1050|2239->1058|2269->1059|2429->1191|2446->1198|2477->1207|2507->1208|2652->1325|2669->1332|2696->1337|2726->1338|2914->1498|2931->1505|2959->1511|2989->1512|3180->1675|3197->1682|3223->1686|3253->1687|3934->2341|3950->2348|3988->2365|4017->2366|4224->2546|4240->2553|4278->2569|4308->2570|4625->2859|4654->2860|4684->2862|4713->2863|4840->2963|4856->2970|4890->2983|4919->2984|5274->3312|5290->3319|5324->3332|5353->3333|5706->3659|5722->3666|5762->3685|5791->3686|6000->3868|6016->3875|6056->3893|6086->3894|6405->4185|6434->4186|6464->4188|6493->4189|6622->4291|6638->4298|6674->4313|6703->4314|7062->4646|7078->4653|7114->4668|7143->4669|9251->6750|9292->6781|9333->6783|9367->6789|9454->6848|9475->6859|9517->6879|9561->6892|9593->6896|9738->7013|9778->7031|9885->7110|9902->7117|9929->7122
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|47->16|47->16|47->16|47->16|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|64->33|64->33|64->33|64->33|66->35|66->35|66->35|66->35|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|84->53|84->53|84->53|84->53|92->61|92->61|92->61|92->61|94->63|94->63|94->63|94->63|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|112->81|112->81|112->81|112->81|156->125|156->125|156->125|157->126|157->126|157->126|157->126|158->127|159->128|162->131|162->131|165->134|165->134|165->134
                  -- GENERATED --
              */
          
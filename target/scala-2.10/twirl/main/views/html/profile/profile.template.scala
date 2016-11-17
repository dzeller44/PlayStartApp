
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
	"""),format.raw/*4.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""		 
			"""),format.raw/*6.4*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*6.60*/("""{"""),format.raw/*6.61*/("""
				"""),format.raw/*7.5*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*7.79*/("""{"""),format.raw/*7.80*/("""
					"""),format.raw/*8.6*/("""return this.value;
				"""),format.raw/*9.5*/("""}"""),format.raw/*9.6*/(""").get());
			"""),format.raw/*10.4*/("""}"""),format.raw/*10.5*/(""");
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
	</script>
<section id="profileMain">
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
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""3,"""),format.raw/*52.41*/("""}"""),format.raw/*52.42*/("""" maxlength="24" name="primaryPhone"
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
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*80.38*/("""{"""),format.raw/*80.39*/("""3,"""),format.raw/*80.41*/("""}"""),format.raw/*80.42*/("""" maxlength="24" name="secondaryPhone"
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
			<label class="title"><span class="required">*</span>Services Provided:</label>
			<div class="column column1">
				"""),_display_(/*97.6*/for(service <- servicesList) yield /*97.34*/ {_display_(Seq[Any](format.raw/*97.36*/("""
				    """),format.raw/*98.9*/("""<label><input type="checkbox" class="selectServices" name="selectServices" id="selectServices" value="""),_display_(/*98.111*/service/*98.118*/.name),format.raw/*98.123*/("""><span>"""),_display_(/*98.131*/service/*98.138*/.name),format.raw/*98.143*/("""</span></label>
				""")))}),format.raw/*99.6*/("""
			"""),format.raw/*100.4*/("""</div>
			
			<input type="hidden" name="services" id="services">

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
			"""),_display_(/*114.5*/if(profileForm.hasGlobalErrors)/*114.36*/ {_display_(Seq[Any](format.raw/*114.38*/("""
				"""),format.raw/*115.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*115.64*/profileForm/*115.75*/.globalError.message),format.raw/*115.95*/("""</span>
			""")))}),format.raw/*116.5*/("""
		"""),format.raw/*117.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/user"
				class="buttonCancel">"""),_display_(/*120.27*/Messages("goback")),format.raw/*120.45*/("""</a>
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
                  DATE: Thu Nov 17 15:11:30 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/profile.scala.html
                  HASH: 2343389a912122e0a229937dfb83e0abaca86932
                  MATRIX: 808->1|990->88|1020->93|1038->103|1077->105|1106->108|1196->171|1224->172|1258->180|1341->236|1369->237|1401->243|1502->317|1530->318|1563->325|1613->349|1640->350|1681->364|1709->365|1742->371|1770->372|4313->2887|4342->2888|4372->2890|4401->2891|5645->4107|5674->4108|5704->4110|5733->4111|6414->4766|6458->4794|6498->4796|6535->4806|6665->4908|6682->4915|6709->4920|6745->4928|6762->4935|6789->4940|6841->4962|6874->4967|7351->5417|7392->5448|7433->5450|7467->5456|7554->5515|7575->5526|7617->5546|7661->5559|7693->5563|7838->5680|7878->5698
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|83->52|83->52|83->52|83->52|111->80|111->80|111->80|111->80|128->97|128->97|128->97|129->98|129->98|129->98|129->98|129->98|129->98|129->98|130->99|131->100|145->114|145->114|145->114|146->115|146->115|146->115|146->115|147->116|148->117|151->120|151->120
                  -- GENERATED --
              */
          
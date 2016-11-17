
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
		"""),format.raw/*4.3*/("""<script type="text/javascript">
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
					placeholder="Business Name..." value="""),_display_(/*25.44*/profile/*25.51*/.name),format.raw/*25.56*/(""" """),format.raw/*25.57*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-address">
			<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value="""),_display_(/*29.191*/profile/*29.198*/.address),format.raw/*29.206*/(""" """),format.raw/*29.207*/("""/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" value="""),_display_(/*29.339*/profile/*29.346*/.address1),format.raw/*29.355*/(""" """),format.raw/*29.356*/("""/><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value="""),_display_(/*29.473*/profile/*29.480*/.city),format.raw/*29.485*/(""" """),format.raw/*29.486*/("""/><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value="""),_display_(/*29.646*/profile/*29.653*/.state),format.raw/*29.659*/(""" """),format.raw/*29.660*/("""/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value="""),_display_(/*29.823*/profile/*29.830*/.zip),format.raw/*29.834*/(""" """),format.raw/*29.835*/("""/><span class="icon-place"></span></span><div class="country">
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
				required="required" value="""),_display_(/*42.32*/profile/*42.39*/.primaryNameFirst),format.raw/*42.56*/(""" """),format.raw/*42.57*/("""/><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="primaryNameLast" required="required" value="""),_display_(/*44.77*/profile/*44.84*/.primaryNameLast),format.raw/*44.100*/(""" """),format.raw/*44.101*/("""/><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Primary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""3,"""),format.raw/*52.41*/("""}"""),format.raw/*52.42*/("""" maxlength="24" name="primaryPhone"
					required="required" placeholder="Phone Number..." value="""),_display_(/*53.63*/profile/*53.70*/.primaryPhone),format.raw/*53.83*/(""" """),format.raw/*53.84*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Primary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="primaryEmail" 
					required="required" placeholder="Email..." value="""),_display_(/*62.56*/profile/*62.63*/.primaryEmail),format.raw/*62.76*/(""" """),format.raw/*62.77*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-name">
			<label class="title"><span class="required">*</span>Secondary Contact
			Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
				required="required" value="""),_display_(/*70.32*/profile/*70.39*/.secondaryNameFirst),format.raw/*70.58*/(""" """),format.raw/*70.59*/("""/><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="secondaryNameLast" required="required" value="""),_display_(/*72.79*/profile/*72.86*/.secondaryNameLast),format.raw/*72.104*/(""" """),format.raw/*72.105*/("""/><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Secondary Contact
			Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*80.38*/("""{"""),format.raw/*80.39*/("""3,"""),format.raw/*80.41*/("""}"""),format.raw/*80.42*/("""" maxlength="24" name="secondaryPhone"
					required="required" placeholder="Phone Number..." value="""),_display_(/*81.63*/profile/*81.70*/.secondaryPhone),format.raw/*81.85*/(""" """),format.raw/*81.86*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Secondary Contact
			Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="secondaryEmail" 
					required="required" placeholder="Email..." value="""),_display_(/*90.56*/profile/*90.63*/.secondaryEmail),format.raw/*90.78*/(""" """),format.raw/*90.79*/("""/><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-checkbox">
			<label class="title">Services Provided:<span class="required">*</span></label>
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
			"""),format.raw/*115.4*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
			"""),_display_(/*116.5*/profileForm/*116.16*/.globalError.message),format.raw/*116.36*/("""
			"""),format.raw/*117.4*/("""</span>
			""")))}),format.raw/*118.5*/("""
		"""),format.raw/*119.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/user"
				class="buttonCancel">"""),_display_(/*122.27*/Messages("goback")),format.raw/*122.45*/("""</a>
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
                  DATE: Thu Nov 17 14:47:39 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: e5911da07d8d3f11b45a01420fab294614551375
                  MATRIX: 824->1|1025->106|1055->111|1073->121|1112->123|1142->127|1232->190|1260->191|1294->199|1377->255|1405->256|1437->262|1538->336|1566->337|1599->344|1649->368|1676->369|1717->383|1745->384|1778->390|1806->391|2432->990|2448->997|2474->1002|2503->1003|2811->1283|2828->1290|2858->1298|2888->1299|3048->1431|3065->1438|3096->1447|3126->1448|3271->1565|3288->1572|3315->1577|3345->1578|3533->1738|3550->1745|3578->1751|3608->1752|3799->1915|3816->1922|3842->1926|3872->1927|4553->2581|4569->2588|4607->2605|4636->2606|4843->2786|4859->2793|4897->2809|4927->2810|5244->3099|5273->3100|5303->3102|5332->3103|5459->3203|5475->3210|5509->3223|5538->3224|5893->3552|5909->3559|5943->3572|5972->3573|6325->3899|6341->3906|6381->3925|6410->3926|6619->4108|6635->4115|6675->4133|6705->4134|7024->4425|7053->4426|7083->4428|7112->4429|7241->4531|7257->4538|7293->4553|7322->4554|7681->4886|7697->4893|7733->4908|7762->4909|8006->5127|8050->5155|8090->5157|8127->5167|8257->5269|8274->5276|8301->5281|8337->5289|8354->5296|8381->5301|8433->5323|8466->5328|8943->5778|8984->5809|9025->5811|9058->5816|9149->5880|9170->5891|9212->5911|9245->5916|9289->5929|9321->5933|9466->6050|9506->6068
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|73->42|73->42|73->42|73->42|75->44|75->44|75->44|75->44|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|93->62|93->62|93->62|93->62|101->70|101->70|101->70|101->70|103->72|103->72|103->72|103->72|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|121->90|121->90|121->90|121->90|128->97|128->97|128->97|129->98|129->98|129->98|129->98|129->98|129->98|129->98|130->99|131->100|145->114|145->114|145->114|146->115|147->116|147->116|147->116|148->117|149->118|150->119|153->122|153->122
                  -- GENERATED --
              */
          
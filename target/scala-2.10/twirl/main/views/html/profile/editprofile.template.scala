
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

class editprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service], profile: Profile, servicesSelected: java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.149*/("""

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
						placeholder="Business Name..." value="""),_display_(/*25.45*/profile/*25.52*/.name),format.raw/*25.57*/(""" """),format.raw/*25.58*/("""/><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value="""),_display_(/*29.192*/profile/*29.199*/.address),format.raw/*29.207*/(""" """),format.raw/*29.208*/("""/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" value="""),_display_(/*29.340*/profile/*29.347*/.address1),format.raw/*29.356*/(""" """),format.raw/*29.357*/("""/><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value="""),_display_(/*29.474*/profile/*29.481*/.city),format.raw/*29.486*/(""" """),format.raw/*29.487*/("""/><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value="""),_display_(/*29.647*/profile/*29.654*/.state),format.raw/*29.660*/(""" """),format.raw/*29.661*/("""/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value="""),_display_(/*29.824*/profile/*29.831*/.zip),format.raw/*29.835*/(""" """),format.raw/*29.836*/("""/><span class="icon-place"></span></span><div class="country">
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
					required="required" value="""),_display_(/*42.33*/profile/*42.40*/.primaryNameFirst),format.raw/*42.57*/(""" """),format.raw/*42.58*/("""/><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value="""),_display_(/*44.78*/profile/*44.85*/.primaryNameLast),format.raw/*44.101*/(""" """),format.raw/*44.102*/("""/><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Primary Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*52.39*/("""{"""),format.raw/*52.40*/("""3,"""),format.raw/*52.42*/("""}"""),format.raw/*52.43*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value="""),_display_(/*53.64*/profile/*53.71*/.primaryPhone),format.raw/*53.84*/(""" """),format.raw/*53.85*/("""/><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Primary Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value="""),_display_(/*62.57*/profile/*62.64*/.primaryEmail),format.raw/*62.77*/(""" """),format.raw/*62.78*/("""/><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>Secondary Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value="""),_display_(/*70.33*/profile/*70.40*/.secondaryNameFirst),format.raw/*70.59*/(""" """),format.raw/*70.60*/("""/><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value="""),_display_(/*72.80*/profile/*72.87*/.secondaryNameLast),format.raw/*72.105*/(""" """),format.raw/*72.106*/("""/><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Secondary Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*80.39*/("""{"""),format.raw/*80.40*/("""3,"""),format.raw/*80.42*/("""}"""),format.raw/*80.43*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value="""),_display_(/*81.64*/profile/*81.71*/.secondaryPhone),format.raw/*81.86*/(""" """),format.raw/*81.87*/("""/><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Secondary Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value="""),_display_(/*90.57*/profile/*90.64*/.secondaryEmail),format.raw/*90.79*/(""" """),format.raw/*90.80*/("""/><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-checkbox">
				<label class="title">Services Provided:<span class="required">*</span></label>
				<div class="column column1">
					"""),_display_(/*97.7*/for(service <- servicesList) yield /*97.35*/ {_display_(Seq[Any](format.raw/*97.37*/("""
						"""),format.raw/*98.7*/("""<label>
							<input type="checkbox" """),_display_(/*99.32*/if(servicesSelected contains service.name)/*99.74*/ {_display_(Seq[Any](format.raw/*99.76*/("""checked""")))}),format.raw/*99.84*/(""" """),format.raw/*99.85*/("""class="selectServices" name="selectServices" id="selectServices" value="""),_display_(/*99.157*/service/*99.164*/.name),format.raw/*99.169*/(""">
							<span>"""),_display_(/*100.15*/service/*100.22*/.name),format.raw/*100.27*/("""</span>
						</label>                    
					""")))}),format.raw/*102.7*/("""
				"""),format.raw/*103.5*/("""</div>
				
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
				"""),_display_(/*117.6*/if(profileForm.hasGlobalErrors)/*117.37*/ {_display_(Seq[Any](format.raw/*117.39*/("""
					"""),format.raw/*118.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*118.65*/profileForm/*118.76*/.globalError.message),format.raw/*118.96*/("""</span>
				""")))}),format.raw/*119.6*/("""
			"""),format.raw/*120.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/user" class="buttonCancel">"""),_display_(/*123.43*/Messages("goback")),format.raw/*123.61*/("""</a>
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
object editprofile extends editprofile_Scope0.editprofile
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 15:09:23 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: 21c5b3c81b5c63e3186490f41337966080b5f347
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1296->231|1324->232|1358->240|1441->296|1469->297|1501->303|1602->377|1630->378|1663->385|1713->409|1740->410|1781->424|1809->425|1842->431|1870->432|2509->1044|2525->1051|2551->1056|2580->1057|2892->1341|2909->1348|2939->1356|2969->1357|3129->1489|3146->1496|3177->1505|3207->1506|3352->1623|3369->1630|3396->1635|3426->1636|3614->1796|3631->1803|3659->1809|3689->1810|3880->1973|3897->1980|3923->1984|3953->1985|4647->2652|4663->2659|4701->2676|4730->2677|4939->2859|4955->2866|4993->2882|5023->2883|5348->3180|5377->3181|5407->3183|5436->3184|5564->3285|5580->3292|5614->3305|5643->3306|6007->3643|6023->3650|6057->3663|6086->3664|6447->3998|6463->4005|6503->4024|6532->4025|6743->4209|6759->4216|6799->4234|6829->4235|7156->4534|7185->4535|7215->4537|7244->4538|7374->4641|7390->4648|7426->4663|7455->4664|7823->5005|7839->5012|7875->5027|7904->5028|8155->5253|8199->5281|8239->5283|8274->5291|8341->5331|8392->5373|8432->5375|8471->5383|8500->5384|8600->5456|8617->5463|8644->5468|8689->5485|8706->5492|8733->5497|8815->5548|8849->5554|9340->6018|9381->6049|9422->6051|9457->6058|9544->6117|9565->6128|9607->6148|9652->6162|9685->6167|9832->6286|9872->6304
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|73->42|73->42|73->42|73->42|75->44|75->44|75->44|75->44|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|93->62|93->62|93->62|93->62|101->70|101->70|101->70|101->70|103->72|103->72|103->72|103->72|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|121->90|121->90|121->90|121->90|128->97|128->97|128->97|129->98|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|131->100|133->102|134->103|148->117|148->117|148->117|149->118|149->118|149->118|149->118|150->119|151->120|154->123|154->123
                  -- GENERATED --
              */
          

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
						placeholder="Business Name..." value=""""),_display_(/*25.46*/profile/*25.53*/.name),format.raw/*25.58*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value=""""),_display_(/*29.193*/profile/*29.200*/.address),format.raw/*29.208*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" value=""""),_display_(/*29.343*/profile/*29.350*/.address1),format.raw/*29.359*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value=""""),_display_(/*29.479*/profile/*29.486*/.city),format.raw/*29.491*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value=""""),_display_(/*29.654*/profile/*29.661*/.state),format.raw/*29.667*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value=""""),_display_(/*29.833*/profile/*29.840*/.zip),format.raw/*29.844*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="country" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
						"""),_display_(/*32.8*/if(profile.country != "United States")/*32.46*/ {_display_(Seq[Any](format.raw/*32.48*/("""
							"""),format.raw/*33.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*35.8*/("""
						"""),format.raw/*36.7*/("""else """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
							"""),format.raw/*37.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*39.7*/("""}"""),format.raw/*39.8*/("""
					"""),format.raw/*40.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>Primary Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" value=""""),_display_(/*48.34*/profile/*48.41*/.primaryNameFirst),format.raw/*48.58*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value=""""),_display_(/*50.79*/profile/*50.86*/.primaryNameLast),format.raw/*50.102*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Primary Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*58.39*/("""{"""),format.raw/*58.40*/("""3,"""),format.raw/*58.42*/("""}"""),format.raw/*58.43*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value=""""),_display_(/*59.65*/profile/*59.72*/.primaryPhone),format.raw/*59.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Primary Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*68.58*/profile/*68.65*/.primaryEmail),format.raw/*68.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>Secondary Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*76.34*/profile/*76.41*/.secondaryNameFirst),format.raw/*76.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*78.81*/profile/*78.88*/.secondaryNameLast),format.raw/*78.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Secondary Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*86.39*/("""{"""),format.raw/*86.40*/("""3,"""),format.raw/*86.42*/("""}"""),format.raw/*86.43*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value=""""),_display_(/*87.65*/profile/*87.72*/.secondaryPhone),format.raw/*87.87*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Secondary Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*96.58*/profile/*96.65*/.secondaryEmail),format.raw/*96.80*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-checkbox">
				<label class="title">Services Provided:<span class="required">*</span></label>
				<div class="column column1">
					"""),_display_(/*103.7*/for(service <- servicesList) yield /*103.35*/ {_display_(Seq[Any](format.raw/*103.37*/("""
						"""),format.raw/*104.7*/("""<label>
							<input type="checkbox" """),_display_(/*105.32*/if(servicesSelected contains service.name)/*105.74*/ {_display_(Seq[Any](format.raw/*105.76*/("""checked""")))}),format.raw/*105.84*/(""" """),format.raw/*105.85*/("""class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*105.158*/service/*105.165*/.name),format.raw/*105.170*/("""">
							<span>"""),_display_(/*106.15*/service/*106.22*/.name),format.raw/*106.27*/("""</span>
						</label>                    
					""")))}),format.raw/*108.7*/("""
				"""),format.raw/*109.5*/("""</div>
				
				<input type="hidden" name="services" id="services">
	
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="serviceOther" 
							placeholder="Other..."value=""""),_display_(/*117.38*/profile/*117.45*/.servicesOther),format.raw/*117.59*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*123.6*/if(profileForm.hasGlobalErrors)/*123.37*/ {_display_(Seq[Any](format.raw/*123.39*/("""
					"""),format.raw/*124.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*124.65*/profileForm/*124.76*/.globalError.message),format.raw/*124.96*/("""</span>
				""")))}),format.raw/*125.6*/("""
			"""),format.raw/*126.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/admin" class="buttonCancel">"""),_display_(/*129.44*/Messages("goback")),format.raw/*129.62*/("""</a>
			</div>
		<div class="submit">
			<a href="javascript:deleteProfile('"""),_display_(/*132.40*/profile/*132.47*/.name),format.raw/*132.52*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
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
                  DATE: Mon Nov 28 09:24:53 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showprofile.scala.html
                  HASH: f0bbe08a5914c1b238b16faff1673b2a99ff33c5
                  MATRIX: 845->1|1088->148|1118->153|1136->163|1175->165|1204->168|1294->231|1322->232|1356->240|1439->296|1467->297|1499->303|1600->377|1628->378|1661->385|1711->409|1738->410|1779->424|1807->425|1840->431|1868->432|2508->1045|2524->1052|2550->1057|2865->1344|2882->1351|2912->1359|3075->1494|3092->1501|3123->1510|3271->1630|3288->1637|3315->1642|3506->1805|3523->1812|3551->1818|3745->1984|3762->1991|3788->1995|4015->2196|4062->2234|4102->2236|4138->2245|4296->2373|4331->2381|4364->2386|4393->2387|4429->2396|4583->2523|4611->2524|4645->2531|5017->2876|5033->2883|5071->2900|5283->3085|5299->3092|5337->3108|5664->3407|5693->3408|5723->3410|5752->3411|5881->3513|5897->3520|5931->3533|6298->3873|6314->3880|6348->3893|6712->4230|6728->4237|6768->4256|6982->4443|6998->4450|7038->4468|7367->4769|7396->4770|7426->4772|7455->4773|7586->4877|7602->4884|7638->4899|8009->5243|8025->5250|8061->5265|8315->5492|8360->5520|8401->5522|8437->5530|8505->5570|8557->5612|8598->5614|8638->5622|8668->5623|8770->5696|8788->5703|8816->5708|8862->5726|8879->5733|8906->5738|8988->5789|9022->5795|9376->6121|9393->6128|9429->6142|9603->6289|9644->6320|9685->6322|9720->6329|9807->6388|9828->6399|9870->6419|9915->6433|9948->6438|10096->6558|10136->6576|10244->6656|10261->6663|10288->6668
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|79->48|79->48|79->48|81->50|81->50|81->50|89->58|89->58|89->58|89->58|90->59|90->59|90->59|99->68|99->68|99->68|107->76|107->76|107->76|109->78|109->78|109->78|117->86|117->86|117->86|117->86|118->87|118->87|118->87|127->96|127->96|127->96|134->103|134->103|134->103|135->104|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|139->108|140->109|148->117|148->117|148->117|154->123|154->123|154->123|155->124|155->124|155->124|155->124|156->125|157->126|160->129|160->129|163->132|163->132|163->132
                  -- GENERATED --
              */
          
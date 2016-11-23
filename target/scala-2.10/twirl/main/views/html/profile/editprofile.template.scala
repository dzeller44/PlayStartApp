
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
						placeholder="Business Name..." value=""""),_display_(/*25.46*/profile/*25.53*/.name),format.raw/*25.58*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value=""""),_display_(/*29.193*/profile/*29.200*/.address),format.raw/*29.208*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" value=""""),_display_(/*29.343*/profile/*29.350*/.address1),format.raw/*29.359*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value=""""),_display_(/*29.479*/profile/*29.486*/.city),format.raw/*29.491*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value=""""),_display_(/*29.654*/profile/*29.661*/.state),format.raw/*29.667*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value=""""),_display_(/*29.833*/profile/*29.840*/.zip),format.raw/*29.844*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="country" required="required">
						<option selected="selected" value="" disabled="disabled">--- Select a country ---</option>
						"""),_display_(/*32.8*/if(profile.country != "United States")/*32.46*/ {_display_(Seq[Any](format.raw/*32.48*/("""
							"""),format.raw/*33.8*/("""<option value="United States">United States</option>
							<option value="Canada">Canada</option>
						""")))}),format.raw/*35.8*/("""
						"""),format.raw/*36.7*/("""else """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
							"""),format.raw/*37.8*/("""<option value="United States" selected>United States</option>
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
				<a href="/user" class="buttonCancel">"""),_display_(/*129.43*/Messages("goback")),format.raw/*129.61*/("""</a>
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
                  DATE: Wed Nov 23 10:25:33 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: 34a53b79914191b4e7cc83a4c453bfcfb444e80a
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1296->231|1324->232|1358->240|1441->296|1469->297|1501->303|1602->377|1630->378|1663->385|1713->409|1740->410|1781->424|1809->425|1842->431|1870->432|2510->1045|2526->1052|2552->1057|2867->1344|2884->1351|2914->1359|3077->1494|3094->1501|3125->1510|3273->1630|3290->1637|3317->1642|3508->1805|3525->1812|3553->1818|3747->1984|3764->1991|3790->1995|4037->2216|4084->2254|4124->2256|4160->2265|4298->2373|4333->2381|4366->2386|4395->2387|4431->2396|4574->2512|4602->2513|4636->2520|5008->2865|5024->2872|5062->2889|5274->3074|5290->3081|5328->3097|5655->3396|5684->3397|5714->3399|5743->3400|5872->3502|5888->3509|5922->3522|6289->3862|6305->3869|6339->3882|6703->4219|6719->4226|6759->4245|6973->4432|6989->4439|7029->4457|7358->4758|7387->4759|7417->4761|7446->4762|7577->4866|7593->4873|7629->4888|8000->5232|8016->5239|8052->5254|8306->5481|8351->5509|8392->5511|8428->5519|8496->5559|8548->5601|8589->5603|8629->5611|8659->5612|8761->5685|8779->5692|8807->5697|8853->5715|8870->5722|8897->5727|8979->5778|9013->5784|9367->6110|9384->6117|9420->6131|9594->6278|9635->6309|9676->6311|9711->6318|9798->6377|9819->6388|9861->6408|9906->6422|9939->6427|10086->6546|10126->6564
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|79->48|79->48|79->48|81->50|81->50|81->50|89->58|89->58|89->58|89->58|90->59|90->59|90->59|99->68|99->68|99->68|107->76|107->76|107->76|109->78|109->78|109->78|117->86|117->86|117->86|117->86|118->87|118->87|118->87|127->96|127->96|127->96|134->103|134->103|134->103|135->104|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|139->108|140->109|148->117|148->117|148->117|154->123|154->123|154->123|155->124|155->124|155->124|155->124|156->125|157->126|160->129|160->129
                  -- GENERATED --
              */
          

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
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address1" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required"/><span class="icon-place"></span></span><div class="country">
					<select name="country" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
						<option selected="selected" value="United States">United States</option>
						<option value="Canada">Canada</option>
					</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="county" required="required">
									<option selected="selected" value="" disabled="disabled">--- Select a county ---</option>
									<option value="Adams">Adams</option>
									<option value="Alamosa">Alamosa</option>
									<option value="Arapahoe">Arapahoe</option>
									<option value="Archuleta">Archuleta</option>
									<option value="Baca">Baca</option>
									<option value="Bent">Bent</option>
									<option value="Boulder">Boulder</option>
									<option value="Broomfield">Broomfield</option>
									<option value="Chaffee">Chaffee</option>
									<option value="Cheyenne">Cheyenne</option>
									<option value="Clear Creek">Clear Creek</option>
									<option value="Conejos">Conejos</option>
									<option value="Costilla">Costilla</option>
									<option value="Crowley">Crowley</option>
									<option value="Custer">Custer</option>
									<option value="Delta">Delta</option>
									<option value="Denver">Denver</option>
									<option value="Dolores">Dolores</option>
									<option value="Douglas">Douglas</option>
									<option value="Eagle">Eagle</option>
									<option value="Elbert">Elbert</option>
									<option value="El Paso">El Paso</option>
									<option value="Fremont">Fremont</option>
									<option value="Garfield">Garfield</option>
									<option value="Gilpin">Gilpin</option>
									<option value="Grand">Grand</option>
									<option value="Gunnison">Gunnison</option>
									<option value="Hinsdale">Hinsdale</option>
									<option value="Huerfano">Huerfano</option>
									<option value="Jackson">Jackson</option>
									<option value="Jefferson">Jefferson</option>
									<option value="Kiowa">Kiowa</option>
									<option value="Kit Carson">Kit Carson</option>
									<option value="Lake">Lake</option>
									<option value="La Plata">La Plata</option>
									<option value="Larimer">Larimer</option>
									<option value="Las Animas">Las Animas</option>
									<option value="Lincoln">Lincoln</option>
									<option value="Logan">Logan</option>
									<option value="Mesa">Mesa</option>
									<option value="Mineral">Mineral</option>
									<option value="Moffat">Moffat</option>
									<option value="Montezuma">Montezuma</option>
									<option value="Montrose">Montrose</option>
									<option value="Morgan">Morgan</option>
									<option value="Otero">Otero</option>
									<option value="Ouray">Ouray</option>
									<option value="Park">Park</option>
									<option value="Phillips">Phillips</option>
									<option value="Pitkin">Pitkin</option>
									<option value="Prowers">Prowers</option>
									<option value="Pueblo">Pueblo</option>
									<option value="Rio Blanco">Rio Blanco</option>
									<option value="Rio Grande">Rio Grande</option>
									<option value="Routt">Routt</option>
									<option value="Saguache">Saguache</option>
									<option value="San Juan">San Juan</option>
									<option value="San Miguel">San Miguel</option>
									<option value="Sedgwick">Sedgwick</option>
									<option value="Summit">Summit</option>
									<option value="Teller">Teller</option>
									<option value="Washington">Washington</option>
									<option value="Weld">Weld</option>
									<option value="Yuma">Yuma</option>
								</select>
								<i></i><span class="icon-place"></span>
							</span>
						</div>
					</div>
				</div>		
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>Billing Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="billname" required="required"
						placeholder="Billing Name..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="billaddress" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="billaddress1" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="billcity" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="billstate" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required"/><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
						<option selected="selected" value="United States">United States</option>
						<option value="Canada">Canada</option>
					</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="billcounty" required="required">
									<option selected="selected" value="" disabled="disabled">--- Select a county ---</option>
									<option value="Adams">Adams</option>
									<option value="Alamosa">Alamosa</option>
									<option value="Arapahoe">Arapahoe</option>
									<option value="Archuleta">Archuleta</option>
									<option value="Baca">Baca</option>
									<option value="Bent">Bent</option>
									<option value="Boulder">Boulder</option>
									<option value="Broomfield">Broomfield</option>
									<option value="Chaffee">Chaffee</option>
									<option value="Cheyenne">Cheyenne</option>
									<option value="Clear Creek">Clear Creek</option>
									<option value="Conejos">Conejos</option>
									<option value="Costilla">Costilla</option>
									<option value="Crowley">Crowley</option>
									<option value="Custer">Custer</option>
									<option value="Delta">Delta</option>
									<option value="Denver">Denver</option>
									<option value="Dolores">Dolores</option>
									<option value="Douglas">Douglas</option>
									<option value="Eagle">Eagle</option>
									<option value="Elbert">Elbert</option>
									<option value="El Paso">El Paso</option>
									<option value="Fremont">Fremont</option>
									<option value="Garfield">Garfield</option>
									<option value="Gilpin">Gilpin</option>
									<option value="Grand">Grand</option>
									<option value="Gunnison">Gunnison</option>
									<option value="Hinsdale">Hinsdale</option>
									<option value="Huerfano">Huerfano</option>
									<option value="Jackson">Jackson</option>
									<option value="Jefferson">Jefferson</option>
									<option value="Kiowa">Kiowa</option>
									<option value="Kit Carson">Kit Carson</option>
									<option value="Lake">Lake</option>
									<option value="La Plata">La Plata</option>
									<option value="Larimer">Larimer</option>
									<option value="Las Animas">Las Animas</option>
									<option value="Lincoln">Lincoln</option>
									<option value="Logan">Logan</option>
									<option value="Mesa">Mesa</option>
									<option value="Mineral">Mineral</option>
									<option value="Moffat">Moffat</option>
									<option value="Montezuma">Montezuma</option>
									<option value="Montrose">Montrose</option>
									<option value="Morgan">Morgan</option>
									<option value="Otero">Otero</option>
									<option value="Ouray">Ouray</option>
									<option value="Park">Park</option>
									<option value="Phillips">Phillips</option>
									<option value="Pitkin">Pitkin</option>
									<option value="Prowers">Prowers</option>
									<option value="Pueblo">Pueblo</option>
									<option value="Rio Blanco">Rio Blanco</option>
									<option value="Rio Grande">Rio Grande</option>
									<option value="Routt">Routt</option>
									<option value="Saguache">Saguache</option>
									<option value="San Juan">San Juan</option>
									<option value="San Miguel">San Miguel</option>
									<option value="Sedgwick">Sedgwick</option>
									<option value="Summit">Summit</option>
									<option value="Teller">Teller</option>
									<option value="Washington">Washington</option>
									<option value="Weld">Weld</option>
									<option value="Yuma">Yuma</option>
								</select>
								<i></i><span class="icon-place"></span>
							</span>
						</div>
					</div>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*223.57*/("""{"""),format.raw/*223.58*/("""3"""),format.raw/*223.59*/("""}"""),format.raw/*223.60*/("""[\-]\d"""),format.raw/*223.66*/("""{"""),format.raw/*223.67*/("""3"""),format.raw/*223.68*/("""}"""),format.raw/*223.69*/("""[\-]\d"""),format.raw/*223.75*/("""{"""),format.raw/*223.76*/("""4"""),format.raw/*223.77*/("""}"""),format.raw/*223.78*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" value=""
						required="required" placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*251.57*/("""{"""),format.raw/*251.58*/("""3"""),format.raw/*251.59*/("""}"""),format.raw/*251.60*/("""[\-]\d"""),format.raw/*251.66*/("""{"""),format.raw/*251.67*/("""3"""),format.raw/*251.68*/("""}"""),format.raw/*251.69*/("""[\-]\d"""),format.raw/*251.75*/("""{"""),format.raw/*251.76*/("""4"""),format.raw/*251.77*/("""}"""),format.raw/*251.78*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
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
					"""),_display_(/*268.7*/for(service <- servicesList) yield /*268.35*/ {_display_(Seq[Any](format.raw/*268.37*/("""
					    """),format.raw/*269.10*/("""<label><input type="checkbox" class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*269.113*/service/*269.120*/.name),format.raw/*269.125*/(""""><span>"""),_display_(/*269.134*/service/*269.141*/.name),format.raw/*269.146*/("""</span></label>
					""")))}),format.raw/*270.7*/("""
				"""),format.raw/*271.5*/("""</div>
				
				<input type="hidden" name="services" id="services">
	
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*285.6*/if(profileForm.hasGlobalErrors)/*285.37*/ {_display_(Seq[Any](format.raw/*285.39*/("""
					"""),format.raw/*286.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*286.65*/profileForm/*286.76*/.globalError.message),format.raw/*286.96*/("""</span>
				""")))}),format.raw/*287.6*/("""
			"""),format.raw/*288.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" /> <a href="/user"
					class="buttonCancel">"""),_display_(/*291.28*/Messages("goback")),format.raw/*291.46*/("""</a>
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
                  DATE: Thu Dec 15 12:05:34 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/profile.scala.html
                  HASH: 004e45e85429f317824cd26228ce4eed13f640d2
                  MATRIX: 808->1|990->88|1020->93|1038->103|1077->105|1106->108|1196->171|1224->172|1258->180|1341->236|1369->237|1401->243|1502->317|1530->318|1563->325|1613->349|1640->350|1681->364|1709->365|1742->371|1770->372|13319->11892|13349->11893|13379->11894|13409->11895|13444->11901|13474->11902|13504->11903|13534->11904|13569->11910|13599->11911|13629->11912|13659->11913|15051->13276|15081->13277|15111->13278|15141->13279|15176->13285|15206->13286|15236->13287|15266->13288|15301->13294|15331->13295|15361->13296|15391->13297|16092->13971|16137->13999|16178->14001|16218->14012|16350->14115|16368->14122|16396->14127|16434->14136|16452->14143|16480->14148|16534->14171|16568->14177|17060->14642|17101->14673|17142->14675|17177->14682|17264->14741|17285->14752|17327->14772|17372->14786|17405->14791|17553->14911|17593->14929
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|254->223|254->223|254->223|254->223|254->223|254->223|254->223|254->223|254->223|254->223|254->223|254->223|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|299->268|299->268|299->268|300->269|300->269|300->269|300->269|300->269|300->269|300->269|301->270|302->271|316->285|316->285|316->285|317->286|317->286|317->286|317->286|318->287|319->288|322->291|322->291
                  -- GENERATED --
              */
          
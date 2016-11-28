
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
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value=""""),_display_(/*29.193*/profile/*29.200*/.address),format.raw/*29.208*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address1" value=""""),_display_(/*29.343*/profile/*29.350*/.address1),format.raw/*29.359*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value=""""),_display_(/*29.479*/profile/*29.486*/.city),format.raw/*29.491*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value=""""),_display_(/*29.654*/profile/*29.661*/.state),format.raw/*29.667*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value=""""),_display_(/*29.833*/profile/*29.840*/.zip),format.raw/*29.844*/("""" /><span class="icon-place"></span></span><div class="country">
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
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="county" required="required" value=""""),_display_(/*48.59*/profile/*48.66*/.county),format.raw/*48.73*/("""">
									<option disabled="disabled">--- Select a county ---</option>
									<option """),_display_(/*50.19*/if(profile.county == "Adams")/*50.48*/ {_display_(Seq[Any](format.raw/*50.50*/("""selected="selected"""")))}),format.raw/*50.70*/(""">Adams</option>
									<option """),_display_(/*51.19*/if(profile.county == "Alamosa")/*51.50*/ {_display_(Seq[Any](format.raw/*51.52*/("""selected="selected"""")))}),format.raw/*51.72*/(""">Alamosa</option>
									<option """),_display_(/*52.19*/if(profile.county == "Arapahoe")/*52.51*/ {_display_(Seq[Any](format.raw/*52.53*/("""selected="selected"""")))}),format.raw/*52.73*/(""">Arapahoe</option>
									<option """),_display_(/*53.19*/if(profile.county == "Archuleta")/*53.52*/ {_display_(Seq[Any](format.raw/*53.54*/("""selected="selected"""")))}),format.raw/*53.74*/(""">Archuleta</option>
									<option """),_display_(/*54.19*/if(profile.county == "Baca")/*54.47*/ {_display_(Seq[Any](format.raw/*54.49*/("""selected="selected"""")))}),format.raw/*54.69*/(""">Baca</option>
									<option """),_display_(/*55.19*/if(profile.county == "Bent")/*55.47*/ {_display_(Seq[Any](format.raw/*55.49*/("""selected="selected"""")))}),format.raw/*55.69*/(""">Bent</option>
									<option """),_display_(/*56.19*/if(profile.county == "Boulder")/*56.50*/ {_display_(Seq[Any](format.raw/*56.52*/("""selected="selected"""")))}),format.raw/*56.72*/(""">Boulder</option>
									<option """),_display_(/*57.19*/if(profile.county == "Broomfield")/*57.53*/ {_display_(Seq[Any](format.raw/*57.55*/("""selected="selected"""")))}),format.raw/*57.75*/(""">Broomfield</option>
									<option """),_display_(/*58.19*/if(profile.county == "Chaffee")/*58.50*/ {_display_(Seq[Any](format.raw/*58.52*/("""selected="selected"""")))}),format.raw/*58.72*/(""">Chaffee</option>
									<option """),_display_(/*59.19*/if(profile.county == "Cheyenne")/*59.51*/ {_display_(Seq[Any](format.raw/*59.53*/("""selected="selected"""")))}),format.raw/*59.73*/(""">Cheyenne</option>
									<option """),_display_(/*60.19*/if(profile.county == "Clear Creek")/*60.54*/ {_display_(Seq[Any](format.raw/*60.56*/("""selected="selected"""")))}),format.raw/*60.76*/(""">Clear Creek</option>
									<option """),_display_(/*61.19*/if(profile.county == "Conejos")/*61.50*/ {_display_(Seq[Any](format.raw/*61.52*/("""selected="selected"""")))}),format.raw/*61.72*/(""">Conejos</option>
									<option """),_display_(/*62.19*/if(profile.county == "Costilla")/*62.51*/ {_display_(Seq[Any](format.raw/*62.53*/("""selected="selected"""")))}),format.raw/*62.73*/(""">Costilla</option>
									<option """),_display_(/*63.19*/if(profile.county == "Crowley")/*63.50*/ {_display_(Seq[Any](format.raw/*63.52*/("""selected="selected"""")))}),format.raw/*63.72*/(""">Crowley</option>
									<option """),_display_(/*64.19*/if(profile.county == "Custer")/*64.49*/ {_display_(Seq[Any](format.raw/*64.51*/("""selected="selected"""")))}),format.raw/*64.71*/(""">Custer</option>
									<option """),_display_(/*65.19*/if(profile.county == "Delta")/*65.48*/ {_display_(Seq[Any](format.raw/*65.50*/("""selected="selected"""")))}),format.raw/*65.70*/(""">Delta</option>
									<option """),_display_(/*66.19*/if(profile.county == "Denver")/*66.49*/ {_display_(Seq[Any](format.raw/*66.51*/("""selected="selected"""")))}),format.raw/*66.71*/(""">Denver</option>
									<option """),_display_(/*67.19*/if(profile.county == "Dolores")/*67.50*/ {_display_(Seq[Any](format.raw/*67.52*/("""selected="selected"""")))}),format.raw/*67.72*/(""">Dolores</option>
									<option """),_display_(/*68.19*/if(profile.county == "Douglas")/*68.50*/ {_display_(Seq[Any](format.raw/*68.52*/("""selected="selected"""")))}),format.raw/*68.72*/(""">Douglas</option>
									<option """),_display_(/*69.19*/if(profile.county == "Eagle")/*69.48*/ {_display_(Seq[Any](format.raw/*69.50*/("""selected="selected"""")))}),format.raw/*69.70*/(""">Eagle</option>
									<option """),_display_(/*70.19*/if(profile.county == "Elbert")/*70.49*/ {_display_(Seq[Any](format.raw/*70.51*/("""selected="selected"""")))}),format.raw/*70.71*/(""">Elbert</option>
									<option """),_display_(/*71.19*/if(profile.county == "El Paso")/*71.50*/ {_display_(Seq[Any](format.raw/*71.52*/("""selected="selected"""")))}),format.raw/*71.72*/(""">El Paso</option>
									<option """),_display_(/*72.19*/if(profile.county == "Fremont")/*72.50*/ {_display_(Seq[Any](format.raw/*72.52*/("""selected="selected"""")))}),format.raw/*72.72*/(""">Fremont</option>
									<option """),_display_(/*73.19*/if(profile.county == "Garfield")/*73.51*/ {_display_(Seq[Any](format.raw/*73.53*/("""selected="selected"""")))}),format.raw/*73.73*/(""">Garfield</option>
									<option """),_display_(/*74.19*/if(profile.county == "Gilpin")/*74.49*/ {_display_(Seq[Any](format.raw/*74.51*/("""selected="selected"""")))}),format.raw/*74.71*/(""">Gilpin</option>
									<option """),_display_(/*75.19*/if(profile.county == "Grand")/*75.48*/ {_display_(Seq[Any](format.raw/*75.50*/("""selected="selected"""")))}),format.raw/*75.70*/(""">Grand</option>
									<option """),_display_(/*76.19*/if(profile.county == "Gunnison")/*76.51*/ {_display_(Seq[Any](format.raw/*76.53*/("""selected="selected"""")))}),format.raw/*76.73*/(""">Gunnison</option>
									<option """),_display_(/*77.19*/if(profile.county == "Hinsdale")/*77.51*/ {_display_(Seq[Any](format.raw/*77.53*/("""selected="selected"""")))}),format.raw/*77.73*/(""">Hinsdale</option>
									<option """),_display_(/*78.19*/if(profile.county == "Huerfano")/*78.51*/ {_display_(Seq[Any](format.raw/*78.53*/("""selected="selected"""")))}),format.raw/*78.73*/(""">Huerfano</option>
									<option """),_display_(/*79.19*/if(profile.county == "Jackson")/*79.50*/ {_display_(Seq[Any](format.raw/*79.52*/("""selected="selected"""")))}),format.raw/*79.72*/(""">Jackson</option>
									<option """),_display_(/*80.19*/if(profile.county == "Jefferson")/*80.52*/ {_display_(Seq[Any](format.raw/*80.54*/("""selected="selected"""")))}),format.raw/*80.74*/(""">Jefferson</option>
									<option """),_display_(/*81.19*/if(profile.county == "Kiowa")/*81.48*/ {_display_(Seq[Any](format.raw/*81.50*/("""selected="selected"""")))}),format.raw/*81.70*/(""">Kiowa</option>
									<option """),_display_(/*82.19*/if(profile.county == "Kit Carson")/*82.53*/ {_display_(Seq[Any](format.raw/*82.55*/("""selected="selected"""")))}),format.raw/*82.75*/(""">Kit Carson</option>
									<option """),_display_(/*83.19*/if(profile.county == "Lake")/*83.47*/ {_display_(Seq[Any](format.raw/*83.49*/("""selected="selected"""")))}),format.raw/*83.69*/(""">Lake</option>
									<option """),_display_(/*84.19*/if(profile.county == "La Plata")/*84.51*/ {_display_(Seq[Any](format.raw/*84.53*/("""selected="selected"""")))}),format.raw/*84.73*/(""">La Plata</option>
									<option """),_display_(/*85.19*/if(profile.county == "Larimer")/*85.50*/ {_display_(Seq[Any](format.raw/*85.52*/("""selected="selected"""")))}),format.raw/*85.72*/(""">Larimer</option>
									<option """),_display_(/*86.19*/if(profile.county == "Las Animas")/*86.53*/ {_display_(Seq[Any](format.raw/*86.55*/("""selected="selected"""")))}),format.raw/*86.75*/(""">Las Animas</option>
									<option """),_display_(/*87.19*/if(profile.county == "Lincoln")/*87.50*/ {_display_(Seq[Any](format.raw/*87.52*/("""selected="selected"""")))}),format.raw/*87.72*/(""">Lincoln</option>
									<option """),_display_(/*88.19*/if(profile.county == "Logan")/*88.48*/ {_display_(Seq[Any](format.raw/*88.50*/("""selected="selected"""")))}),format.raw/*88.70*/(""">Logan</option>
									<option """),_display_(/*89.19*/if(profile.county == "Mesa")/*89.47*/ {_display_(Seq[Any](format.raw/*89.49*/("""selected="selected"""")))}),format.raw/*89.69*/(""">Mesa</option>
									<option """),_display_(/*90.19*/if(profile.county == "Mineral")/*90.50*/ {_display_(Seq[Any](format.raw/*90.52*/("""selected="selected"""")))}),format.raw/*90.72*/(""">Mineral</option>
									<option """),_display_(/*91.19*/if(profile.county == "Moffat")/*91.49*/ {_display_(Seq[Any](format.raw/*91.51*/("""selected="selected"""")))}),format.raw/*91.71*/(""">Moffat</option>
									<option """),_display_(/*92.19*/if(profile.county == "Montezuma")/*92.52*/ {_display_(Seq[Any](format.raw/*92.54*/("""selected="selected"""")))}),format.raw/*92.74*/(""">Montezuma</option>
									<option """),_display_(/*93.19*/if(profile.county == "Montrose")/*93.51*/ {_display_(Seq[Any](format.raw/*93.53*/("""selected="selected"""")))}),format.raw/*93.73*/(""">Montrose</option>
									<option """),_display_(/*94.19*/if(profile.county == "Morgan")/*94.49*/ {_display_(Seq[Any](format.raw/*94.51*/("""selected="selected"""")))}),format.raw/*94.71*/(""">Morgan</option>
									<option """),_display_(/*95.19*/if(profile.county == "Otero")/*95.48*/ {_display_(Seq[Any](format.raw/*95.50*/("""selected="selected"""")))}),format.raw/*95.70*/(""">Otero</option>
									<option """),_display_(/*96.19*/if(profile.county == "Ouray")/*96.48*/ {_display_(Seq[Any](format.raw/*96.50*/("""selected="selected"""")))}),format.raw/*96.70*/(""">Ouray</option>
									<option """),_display_(/*97.19*/if(profile.county == "Park")/*97.47*/ {_display_(Seq[Any](format.raw/*97.49*/("""selected="selected"""")))}),format.raw/*97.69*/(""">Park</option>
									<option """),_display_(/*98.19*/if(profile.county == "Phillips")/*98.51*/ {_display_(Seq[Any](format.raw/*98.53*/("""selected="selected"""")))}),format.raw/*98.73*/(""">Phillips</option>
									<option """),_display_(/*99.19*/if(profile.county == "Pitkin")/*99.49*/ {_display_(Seq[Any](format.raw/*99.51*/("""selected="selected"""")))}),format.raw/*99.71*/(""">Pitkin</option>
									<option """),_display_(/*100.19*/if(profile.county == "Prowers")/*100.50*/ {_display_(Seq[Any](format.raw/*100.52*/("""selected="selected"""")))}),format.raw/*100.72*/(""">Prowers</option>
									<option """),_display_(/*101.19*/if(profile.county == "Pueblo")/*101.49*/ {_display_(Seq[Any](format.raw/*101.51*/("""selected="selected"""")))}),format.raw/*101.71*/(""">Pueblo</option>
									<option """),_display_(/*102.19*/if(profile.county == "Rio Blanco")/*102.53*/ {_display_(Seq[Any](format.raw/*102.55*/("""selected="selected"""")))}),format.raw/*102.75*/(""">Rio Blanco</option>
									<option """),_display_(/*103.19*/if(profile.county == "Rio Grande")/*103.53*/ {_display_(Seq[Any](format.raw/*103.55*/("""selected="selected"""")))}),format.raw/*103.75*/(""">Rio Grande</option>
									<option """),_display_(/*104.19*/if(profile.county == "Routt")/*104.48*/ {_display_(Seq[Any](format.raw/*104.50*/("""selected="selected"""")))}),format.raw/*104.70*/(""">Routt</option>
									<option """),_display_(/*105.19*/if(profile.county == "Saguache")/*105.51*/ {_display_(Seq[Any](format.raw/*105.53*/("""selected="selected"""")))}),format.raw/*105.73*/(""">Saguache</option>
									<option """),_display_(/*106.19*/if(profile.county == "San Juan")/*106.51*/ {_display_(Seq[Any](format.raw/*106.53*/("""selected="selected"""")))}),format.raw/*106.73*/(""">San Juan</option>
									<option """),_display_(/*107.19*/if(profile.county == "San Miguel")/*107.53*/ {_display_(Seq[Any](format.raw/*107.55*/("""selected="selected"""")))}),format.raw/*107.75*/(""">San Miguel</option>
									<option """),_display_(/*108.19*/if(profile.county == "Sedgwick")/*108.51*/ {_display_(Seq[Any](format.raw/*108.53*/("""selected="selected"""")))}),format.raw/*108.73*/(""">Sedgwick</option>
									<option """),_display_(/*109.19*/if(profile.county == "Summit")/*109.49*/ {_display_(Seq[Any](format.raw/*109.51*/("""selected="selected"""")))}),format.raw/*109.71*/(""">Summit</option>
									<option """),_display_(/*110.19*/if(profile.county == "Teller")/*110.49*/ {_display_(Seq[Any](format.raw/*110.51*/("""selected="selected"""")))}),format.raw/*110.71*/(""">Teller</option>
									<option """),_display_(/*111.19*/if(profile.county == "Washington")/*111.53*/ {_display_(Seq[Any](format.raw/*111.55*/("""selected="selected"""")))}),format.raw/*111.75*/(""">Washington</option>
									<option """),_display_(/*112.19*/if(profile.county == "Weld")/*112.47*/ {_display_(Seq[Any](format.raw/*112.49*/("""selected="selected"""")))}),format.raw/*112.69*/(""">Weld</option>
									<option """),_display_(/*113.19*/if(profile.county == "Yuma")/*113.47*/ {_display_(Seq[Any](format.raw/*113.49*/("""selected="selected"""")))}),format.raw/*113.69*/(""">Yuma</option>
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
						placeholder="Billing Name..." value=""""),_display_(/*125.45*/profile/*125.52*/.billname),format.raw/*125.61*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="billaddress" required="required" value=""""),_display_(/*129.196*/profile/*129.203*/.billaddress),format.raw/*129.215*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="billaddress1" value=""""),_display_(/*129.354*/profile/*129.361*/.billaddress1),format.raw/*129.374*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="billcity" value=""""),_display_(/*129.498*/profile/*129.505*/.billcity),format.raw/*129.514*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="billstate" required="required" value=""""),_display_(/*129.681*/profile/*129.688*/.billstate),format.raw/*129.698*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required" value=""""),_display_(/*129.868*/profile/*129.875*/.billzip),format.raw/*129.883*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						"""),_display_(/*131.8*/if(profile.billcountry != "United States")/*131.50*/ {_display_(Seq[Any](format.raw/*131.52*/("""
							"""),format.raw/*132.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*134.8*/("""
						"""),format.raw/*135.7*/("""else """),format.raw/*135.12*/("""{"""),format.raw/*135.13*/("""
							"""),format.raw/*136.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*138.7*/("""}"""),format.raw/*138.8*/("""
					"""),format.raw/*139.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="billcounty" required="required" value=""""),_display_(/*147.63*/profile/*147.70*/.billcounty),format.raw/*147.81*/("""">
									<option value="" disabled="disabled">--- Select a county ---</option>
									<option """),_display_(/*149.19*/if(profile.county == "Adams")/*149.48*/ {_display_(Seq[Any](format.raw/*149.50*/("""selected="selected"""")))}),format.raw/*149.70*/(""">Adams</option>
									<option """),_display_(/*150.19*/if(profile.county == "Alamosa")/*150.50*/ {_display_(Seq[Any](format.raw/*150.52*/("""selected="selected"""")))}),format.raw/*150.72*/(""">Alamosa</option>
									<option """),_display_(/*151.19*/if(profile.county == "Arapahoe")/*151.51*/ {_display_(Seq[Any](format.raw/*151.53*/("""selected="selected"""")))}),format.raw/*151.73*/(""">Arapahoe</option>
									<option """),_display_(/*152.19*/if(profile.county == "Archuleta")/*152.52*/ {_display_(Seq[Any](format.raw/*152.54*/("""selected="selected"""")))}),format.raw/*152.74*/(""">Archuleta</option>
									<option """),_display_(/*153.19*/if(profile.county == "Baca")/*153.47*/ {_display_(Seq[Any](format.raw/*153.49*/("""selected="selected"""")))}),format.raw/*153.69*/(""">Baca</option>
									<option """),_display_(/*154.19*/if(profile.county == "Bent")/*154.47*/ {_display_(Seq[Any](format.raw/*154.49*/("""selected="selected"""")))}),format.raw/*154.69*/(""">Bent</option>
									<option """),_display_(/*155.19*/if(profile.county == "Boulder")/*155.50*/ {_display_(Seq[Any](format.raw/*155.52*/("""selected="selected"""")))}),format.raw/*155.72*/(""">Boulder</option>
									<option """),_display_(/*156.19*/if(profile.county == "Broomfield")/*156.53*/ {_display_(Seq[Any](format.raw/*156.55*/("""selected="selected"""")))}),format.raw/*156.75*/(""">Broomfield</option>
									<option """),_display_(/*157.19*/if(profile.county == "Chaffee")/*157.50*/ {_display_(Seq[Any](format.raw/*157.52*/("""selected="selected"""")))}),format.raw/*157.72*/(""">Chaffee</option>
									<option """),_display_(/*158.19*/if(profile.county == "Cheyenne")/*158.51*/ {_display_(Seq[Any](format.raw/*158.53*/("""selected="selected"""")))}),format.raw/*158.73*/(""">Cheyenne</option>
									<option """),_display_(/*159.19*/if(profile.county == "Clear Creek")/*159.54*/ {_display_(Seq[Any](format.raw/*159.56*/("""selected="selected"""")))}),format.raw/*159.76*/(""">Clear Creek</option>
									<option """),_display_(/*160.19*/if(profile.county == "Conejos")/*160.50*/ {_display_(Seq[Any](format.raw/*160.52*/("""selected="selected"""")))}),format.raw/*160.72*/(""">Conejos</option>
									<option """),_display_(/*161.19*/if(profile.county == "Costilla")/*161.51*/ {_display_(Seq[Any](format.raw/*161.53*/("""selected="selected"""")))}),format.raw/*161.73*/(""">Costilla</option>
									<option """),_display_(/*162.19*/if(profile.county == "Crowley")/*162.50*/ {_display_(Seq[Any](format.raw/*162.52*/("""selected="selected"""")))}),format.raw/*162.72*/(""">Crowley</option>
									<option """),_display_(/*163.19*/if(profile.county == "Custer")/*163.49*/ {_display_(Seq[Any](format.raw/*163.51*/("""selected="selected"""")))}),format.raw/*163.71*/(""">Custer</option>
									<option """),_display_(/*164.19*/if(profile.county == "Delta")/*164.48*/ {_display_(Seq[Any](format.raw/*164.50*/("""selected="selected"""")))}),format.raw/*164.70*/(""">Delta</option>
									<option """),_display_(/*165.19*/if(profile.county == "Denver")/*165.49*/ {_display_(Seq[Any](format.raw/*165.51*/("""selected="selected"""")))}),format.raw/*165.71*/(""">Denver</option>
									<option """),_display_(/*166.19*/if(profile.county == "Dolores")/*166.50*/ {_display_(Seq[Any](format.raw/*166.52*/("""selected="selected"""")))}),format.raw/*166.72*/(""">Dolores</option>
									<option """),_display_(/*167.19*/if(profile.county == "Douglas")/*167.50*/ {_display_(Seq[Any](format.raw/*167.52*/("""selected="selected"""")))}),format.raw/*167.72*/(""">Douglas</option>
									<option """),_display_(/*168.19*/if(profile.county == "Eagle")/*168.48*/ {_display_(Seq[Any](format.raw/*168.50*/("""selected="selected"""")))}),format.raw/*168.70*/(""">Eagle</option>
									<option """),_display_(/*169.19*/if(profile.county == "Elbert")/*169.49*/ {_display_(Seq[Any](format.raw/*169.51*/("""selected="selected"""")))}),format.raw/*169.71*/(""">Elbert</option>
									<option """),_display_(/*170.19*/if(profile.county == "El Paso")/*170.50*/ {_display_(Seq[Any](format.raw/*170.52*/("""selected="selected"""")))}),format.raw/*170.72*/(""">El Paso</option>
									<option """),_display_(/*171.19*/if(profile.county == "Fremont")/*171.50*/ {_display_(Seq[Any](format.raw/*171.52*/("""selected="selected"""")))}),format.raw/*171.72*/(""">Fremont</option>
									<option """),_display_(/*172.19*/if(profile.county == "Garfield")/*172.51*/ {_display_(Seq[Any](format.raw/*172.53*/("""selected="selected"""")))}),format.raw/*172.73*/(""">Garfield</option>
									<option """),_display_(/*173.19*/if(profile.county == "Gilpin")/*173.49*/ {_display_(Seq[Any](format.raw/*173.51*/("""selected="selected"""")))}),format.raw/*173.71*/(""">Gilpin</option>
									<option """),_display_(/*174.19*/if(profile.county == "Grand")/*174.48*/ {_display_(Seq[Any](format.raw/*174.50*/("""selected="selected"""")))}),format.raw/*174.70*/(""">Grand</option>
									<option """),_display_(/*175.19*/if(profile.county == "Gunnison")/*175.51*/ {_display_(Seq[Any](format.raw/*175.53*/("""selected="selected"""")))}),format.raw/*175.73*/(""">Gunnison</option>
									<option """),_display_(/*176.19*/if(profile.county == "Hinsdale")/*176.51*/ {_display_(Seq[Any](format.raw/*176.53*/("""selected="selected"""")))}),format.raw/*176.73*/(""">Hinsdale</option>
									<option """),_display_(/*177.19*/if(profile.county == "Huerfano")/*177.51*/ {_display_(Seq[Any](format.raw/*177.53*/("""selected="selected"""")))}),format.raw/*177.73*/(""">Huerfano</option>
									<option """),_display_(/*178.19*/if(profile.county == "Jackson")/*178.50*/ {_display_(Seq[Any](format.raw/*178.52*/("""selected="selected"""")))}),format.raw/*178.72*/(""">Jackson</option>
									<option """),_display_(/*179.19*/if(profile.county == "Jefferson")/*179.52*/ {_display_(Seq[Any](format.raw/*179.54*/("""selected="selected"""")))}),format.raw/*179.74*/(""">Jefferson</option>
									<option """),_display_(/*180.19*/if(profile.county == "Kiowa")/*180.48*/ {_display_(Seq[Any](format.raw/*180.50*/("""selected="selected"""")))}),format.raw/*180.70*/(""">Kiowa</option>
									<option """),_display_(/*181.19*/if(profile.county == "Kit Carson")/*181.53*/ {_display_(Seq[Any](format.raw/*181.55*/("""selected="selected"""")))}),format.raw/*181.75*/(""">Kit Carson</option>
									<option """),_display_(/*182.19*/if(profile.county == "Lake")/*182.47*/ {_display_(Seq[Any](format.raw/*182.49*/("""selected="selected"""")))}),format.raw/*182.69*/(""">Lake</option>
									<option """),_display_(/*183.19*/if(profile.county == "La Plata")/*183.51*/ {_display_(Seq[Any](format.raw/*183.53*/("""selected="selected"""")))}),format.raw/*183.73*/(""">La Plata</option>
									<option """),_display_(/*184.19*/if(profile.county == "Larimer")/*184.50*/ {_display_(Seq[Any](format.raw/*184.52*/("""selected="selected"""")))}),format.raw/*184.72*/(""">Larimer</option>
									<option """),_display_(/*185.19*/if(profile.county == "Las Animas")/*185.53*/ {_display_(Seq[Any](format.raw/*185.55*/("""selected="selected"""")))}),format.raw/*185.75*/(""">Las Animas</option>
									<option """),_display_(/*186.19*/if(profile.county == "Lincoln")/*186.50*/ {_display_(Seq[Any](format.raw/*186.52*/("""selected="selected"""")))}),format.raw/*186.72*/(""">Lincoln</option>
									<option """),_display_(/*187.19*/if(profile.county == "Logan")/*187.48*/ {_display_(Seq[Any](format.raw/*187.50*/("""selected="selected"""")))}),format.raw/*187.70*/(""">Logan</option>
									<option """),_display_(/*188.19*/if(profile.county == "Mesa")/*188.47*/ {_display_(Seq[Any](format.raw/*188.49*/("""selected="selected"""")))}),format.raw/*188.69*/(""">Mesa</option>
									<option """),_display_(/*189.19*/if(profile.county == "Mineral")/*189.50*/ {_display_(Seq[Any](format.raw/*189.52*/("""selected="selected"""")))}),format.raw/*189.72*/(""">Mineral</option>
									<option """),_display_(/*190.19*/if(profile.county == "Moffat")/*190.49*/ {_display_(Seq[Any](format.raw/*190.51*/("""selected="selected"""")))}),format.raw/*190.71*/(""">Moffat</option>
									<option """),_display_(/*191.19*/if(profile.county == "Montezuma")/*191.52*/ {_display_(Seq[Any](format.raw/*191.54*/("""selected="selected"""")))}),format.raw/*191.74*/(""">Montezuma</option>
									<option """),_display_(/*192.19*/if(profile.county == "Montrose")/*192.51*/ {_display_(Seq[Any](format.raw/*192.53*/("""selected="selected"""")))}),format.raw/*192.73*/(""">Montrose</option>
									<option """),_display_(/*193.19*/if(profile.county == "Morgan")/*193.49*/ {_display_(Seq[Any](format.raw/*193.51*/("""selected="selected"""")))}),format.raw/*193.71*/(""">Morgan</option>
									<option """),_display_(/*194.19*/if(profile.county == "Otero")/*194.48*/ {_display_(Seq[Any](format.raw/*194.50*/("""selected="selected"""")))}),format.raw/*194.70*/(""">Otero</option>
									<option """),_display_(/*195.19*/if(profile.county == "Ouray")/*195.48*/ {_display_(Seq[Any](format.raw/*195.50*/("""selected="selected"""")))}),format.raw/*195.70*/(""">Ouray</option>
									<option """),_display_(/*196.19*/if(profile.county == "Park")/*196.47*/ {_display_(Seq[Any](format.raw/*196.49*/("""selected="selected"""")))}),format.raw/*196.69*/(""">Park</option>
									<option """),_display_(/*197.19*/if(profile.county == "Phillips")/*197.51*/ {_display_(Seq[Any](format.raw/*197.53*/("""selected="selected"""")))}),format.raw/*197.73*/(""">Phillips</option>
									<option """),_display_(/*198.19*/if(profile.county == "Pitkin")/*198.49*/ {_display_(Seq[Any](format.raw/*198.51*/("""selected="selected"""")))}),format.raw/*198.71*/(""">Pitkin</option>
									<option """),_display_(/*199.19*/if(profile.county == "Prowers")/*199.50*/ {_display_(Seq[Any](format.raw/*199.52*/("""selected="selected"""")))}),format.raw/*199.72*/(""">Prowers</option>
									<option """),_display_(/*200.19*/if(profile.county == "Pueblo")/*200.49*/ {_display_(Seq[Any](format.raw/*200.51*/("""selected="selected"""")))}),format.raw/*200.71*/(""">Pueblo</option>
									<option """),_display_(/*201.19*/if(profile.county == "Rio Blanco")/*201.53*/ {_display_(Seq[Any](format.raw/*201.55*/("""selected="selected"""")))}),format.raw/*201.75*/(""">Rio Blanco</option>
									<option """),_display_(/*202.19*/if(profile.county == "Rio Grande")/*202.53*/ {_display_(Seq[Any](format.raw/*202.55*/("""selected="selected"""")))}),format.raw/*202.75*/(""">Rio Grande</option>
									<option """),_display_(/*203.19*/if(profile.county == "Routt")/*203.48*/ {_display_(Seq[Any](format.raw/*203.50*/("""selected="selected"""")))}),format.raw/*203.70*/(""">Routt</option>
									<option """),_display_(/*204.19*/if(profile.county == "Saguache")/*204.51*/ {_display_(Seq[Any](format.raw/*204.53*/("""selected="selected"""")))}),format.raw/*204.73*/(""">Saguache</option>
									<option """),_display_(/*205.19*/if(profile.county == "San Juan")/*205.51*/ {_display_(Seq[Any](format.raw/*205.53*/("""selected="selected"""")))}),format.raw/*205.73*/(""">San Juan</option>
									<option """),_display_(/*206.19*/if(profile.county == "San Miguel")/*206.53*/ {_display_(Seq[Any](format.raw/*206.55*/("""selected="selected"""")))}),format.raw/*206.75*/(""">San Miguel</option>
									<option """),_display_(/*207.19*/if(profile.county == "Sedgwick")/*207.51*/ {_display_(Seq[Any](format.raw/*207.53*/("""selected="selected"""")))}),format.raw/*207.73*/(""">Sedgwick</option>
									<option """),_display_(/*208.19*/if(profile.county == "Summit")/*208.49*/ {_display_(Seq[Any](format.raw/*208.51*/("""selected="selected"""")))}),format.raw/*208.71*/(""">Summit</option>
									<option """),_display_(/*209.19*/if(profile.county == "Teller")/*209.49*/ {_display_(Seq[Any](format.raw/*209.51*/("""selected="selected"""")))}),format.raw/*209.71*/(""">Teller</option>
									<option """),_display_(/*210.19*/if(profile.county == "Washington")/*210.53*/ {_display_(Seq[Any](format.raw/*210.55*/("""selected="selected"""")))}),format.raw/*210.75*/(""">Washington</option>
									<option """),_display_(/*211.19*/if(profile.county == "Weld")/*211.47*/ {_display_(Seq[Any](format.raw/*211.49*/("""selected="selected"""")))}),format.raw/*211.69*/(""">Weld</option>
									<option """),_display_(/*212.19*/if(profile.county == "Yuma")/*212.47*/ {_display_(Seq[Any](format.raw/*212.49*/("""selected="selected"""")))}),format.raw/*212.69*/(""">Yuma</option>
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
					required="required" value=""""),_display_(/*224.34*/profile/*224.41*/.primaryNameFirst),format.raw/*224.58*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value=""""),_display_(/*226.79*/profile/*226.86*/.primaryNameLast),format.raw/*226.102*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*234.39*/("""{"""),format.raw/*234.40*/("""3,"""),format.raw/*234.42*/("""}"""),format.raw/*234.43*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value=""""),_display_(/*235.65*/profile/*235.72*/.primaryPhone),format.raw/*235.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*244.58*/profile/*244.65*/.primaryEmail),format.raw/*244.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*252.34*/profile/*252.41*/.secondaryNameFirst),format.raw/*252.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*254.81*/profile/*254.88*/.secondaryNameLast),format.raw/*254.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*262.39*/("""{"""),format.raw/*262.40*/("""3,"""),format.raw/*262.42*/("""}"""),format.raw/*262.43*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value=""""),_display_(/*263.65*/profile/*263.72*/.secondaryPhone),format.raw/*263.87*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*272.58*/profile/*272.65*/.secondaryEmail),format.raw/*272.80*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-checkbox">
				<label class="title">Services Provided:<span class="required">*</span></label>
				<div class="column column1">
					"""),_display_(/*279.7*/for(service <- servicesList) yield /*279.35*/ {_display_(Seq[Any](format.raw/*279.37*/("""
					"""),format.raw/*280.6*/("""<label>
					<input type="checkbox" """),_display_(/*281.30*/if(servicesSelected contains service.name)/*281.72*/ {_display_(Seq[Any](format.raw/*281.74*/("""checked""")))}),format.raw/*281.82*/(""" """),format.raw/*281.83*/("""class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*281.156*/service/*281.163*/.name),format.raw/*281.168*/("""">
					<span>"""),_display_(/*282.13*/service/*282.20*/.name),format.raw/*282.25*/("""</span>
					</label>                    
					""")))}),format.raw/*284.7*/("""
				"""),format.raw/*285.5*/("""</div>
				<input type="hidden" name="services" id="services" value=""""),_display_(/*286.64*/profile/*286.71*/.services),format.raw/*286.80*/("""">
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="serviceOther" 
							placeholder="Other..." value=""""),_display_(/*291.39*/profile/*291.46*/.servicesOther),format.raw/*291.60*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*297.6*/if(profileForm.hasGlobalErrors)/*297.37*/ {_display_(Seq[Any](format.raw/*297.39*/("""
				"""),format.raw/*298.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*298.64*/profileForm/*298.75*/.globalError.message),format.raw/*298.95*/("""</span>
				""")))}),format.raw/*299.6*/("""
			"""),format.raw/*300.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/admin" class="buttonCancel">"""),_display_(/*303.44*/Messages("goback")),format.raw/*303.62*/("""</a>
			</div>
		<div class="submit">
			<a href="javascript:deleteProfile('"""),_display_(/*306.40*/profile/*306.47*/.name),format.raw/*306.52*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
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
                  DATE: Mon Nov 28 14:01:04 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showprofile.scala.html
                  HASH: 880bc891f1f8bfe435208e11e489a22fc9238291
                  MATRIX: 845->1|1088->148|1118->153|1136->163|1175->165|1204->168|1294->231|1322->232|1356->240|1439->296|1467->297|1499->303|1600->377|1628->378|1661->385|1711->409|1738->410|1779->424|1807->425|1840->431|1868->432|2508->1045|2524->1052|2550->1057|2865->1344|2882->1351|2912->1359|3075->1494|3092->1501|3123->1510|3271->1630|3288->1637|3315->1642|3506->1805|3523->1812|3551->1818|3745->1984|3762->1991|3788->1995|4015->2196|4062->2234|4102->2236|4138->2245|4296->2373|4331->2381|4364->2386|4393->2387|4429->2396|4583->2523|4611->2524|4645->2531|4941->2800|4957->2807|4985->2814|5105->2907|5143->2936|5183->2938|5234->2958|5296->2993|5336->3024|5376->3026|5427->3046|5491->3083|5532->3115|5572->3117|5623->3137|5688->3175|5730->3208|5770->3210|5821->3230|5887->3269|5924->3297|5964->3299|6015->3319|6076->3353|6113->3381|6153->3383|6204->3403|6265->3437|6305->3468|6345->3470|6396->3490|6460->3527|6503->3561|6543->3563|6594->3583|6661->3623|6701->3654|6741->3656|6792->3676|6856->3713|6897->3745|6937->3747|6988->3767|7053->3805|7097->3840|7137->3842|7188->3862|7256->3903|7296->3934|7336->3936|7387->3956|7451->3993|7492->4025|7532->4027|7583->4047|7648->4085|7688->4116|7728->4118|7779->4138|7843->4175|7882->4205|7922->4207|7973->4227|8036->4263|8074->4292|8114->4294|8165->4314|8227->4349|8266->4379|8306->4381|8357->4401|8420->4437|8460->4468|8500->4470|8551->4490|8615->4527|8655->4558|8695->4560|8746->4580|8810->4617|8848->4646|8888->4648|8939->4668|9001->4703|9040->4733|9080->4735|9131->4755|9194->4791|9234->4822|9274->4824|9325->4844|9389->4881|9429->4912|9469->4914|9520->4934|9584->4971|9625->5003|9665->5005|9716->5025|9781->5063|9820->5093|9860->5095|9911->5115|9974->5151|10012->5180|10052->5182|10103->5202|10165->5237|10206->5269|10246->5271|10297->5291|10362->5329|10403->5361|10443->5363|10494->5383|10559->5421|10600->5453|10640->5455|10691->5475|10756->5513|10796->5544|10836->5546|10887->5566|10951->5603|10993->5636|11033->5638|11084->5658|11150->5697|11188->5726|11228->5728|11279->5748|11341->5783|11384->5817|11424->5819|11475->5839|11542->5879|11579->5907|11619->5909|11670->5929|11731->5963|11772->5995|11812->5997|11863->6017|11928->6055|11968->6086|12008->6088|12059->6108|12123->6145|12166->6179|12206->6181|12257->6201|12324->6241|12364->6272|12404->6274|12455->6294|12519->6331|12557->6360|12597->6362|12648->6382|12710->6417|12747->6445|12787->6447|12838->6467|12899->6501|12939->6532|12979->6534|13030->6554|13094->6591|13133->6621|13173->6623|13224->6643|13287->6679|13329->6712|13369->6714|13420->6734|13486->6773|13527->6805|13567->6807|13618->6827|13683->6865|13722->6895|13762->6897|13813->6917|13876->6953|13914->6982|13954->6984|14005->7004|14067->7039|14105->7068|14145->7070|14196->7090|14258->7125|14295->7153|14335->7155|14386->7175|14447->7209|14488->7241|14528->7243|14579->7263|14644->7301|14683->7331|14723->7333|14774->7353|14838->7389|14879->7420|14920->7422|14972->7442|15037->7479|15077->7509|15118->7511|15170->7531|15234->7567|15278->7601|15319->7603|15371->7623|15439->7663|15483->7697|15524->7699|15576->7719|15644->7759|15683->7788|15724->7790|15776->7810|15839->7845|15881->7877|15922->7879|15974->7899|16040->7937|16082->7969|16123->7971|16175->7991|16241->8029|16285->8063|16326->8065|16378->8085|16446->8125|16488->8157|16529->8159|16581->8179|16647->8217|16687->8247|16728->8249|16780->8269|16844->8305|16884->8335|16925->8337|16977->8357|17041->8393|17085->8427|17126->8429|17178->8449|17246->8489|17284->8517|17325->8519|17377->8539|17439->8573|17477->8601|17518->8603|17570->8623|18007->9032|18024->9039|18055->9048|18374->9338|18392->9345|18427->9357|18595->9496|18613->9503|18649->9516|18802->9640|18820->9647|18852->9656|19048->9823|19066->9830|19099->9840|19298->10010|19316->10017|19347->10025|19501->10152|19553->10194|19594->10196|19631->10205|19790->10333|19826->10341|19860->10346|19890->10347|19927->10356|20082->10483|20111->10484|20146->10491|20447->10764|20464->10771|20497->10782|20627->10884|20666->10913|20707->10915|20759->10935|20822->10970|20863->11001|20904->11003|20956->11023|21021->11060|21063->11092|21104->11094|21156->11114|21222->11152|21265->11185|21306->11187|21358->11207|21425->11246|21463->11274|21504->11276|21556->11296|21618->11330|21656->11358|21697->11360|21749->11380|21811->11414|21852->11445|21893->11447|21945->11467|22010->11504|22054->11538|22095->11540|22147->11560|22215->11600|22256->11631|22297->11633|22349->11653|22414->11690|22456->11722|22497->11724|22549->11744|22615->11782|22660->11817|22701->11819|22753->11839|22822->11880|22863->11911|22904->11913|22956->11933|23021->11970|23063->12002|23104->12004|23156->12024|23222->12062|23263->12093|23304->12095|23356->12115|23421->12152|23461->12182|23502->12184|23554->12204|23618->12240|23657->12269|23698->12271|23750->12291|23813->12326|23853->12356|23894->12358|23946->12378|24010->12414|24051->12445|24092->12447|24144->12467|24209->12504|24250->12535|24291->12537|24343->12557|24408->12594|24447->12623|24488->12625|24540->12645|24603->12680|24643->12710|24684->12712|24736->12732|24800->12768|24841->12799|24882->12801|24934->12821|24999->12858|25040->12889|25081->12891|25133->12911|25198->12948|25240->12980|25281->12982|25333->13002|25399->13040|25439->13070|25480->13072|25532->13092|25596->13128|25635->13157|25676->13159|25728->13179|25791->13214|25833->13246|25874->13248|25926->13268|25992->13306|26034->13338|26075->13340|26127->13360|26193->13398|26235->13430|26276->13432|26328->13452|26394->13490|26435->13521|26476->13523|26528->13543|26593->13580|26636->13613|26677->13615|26729->13635|26796->13674|26835->13703|26876->13705|26928->13725|26991->13760|27035->13794|27076->13796|27128->13816|27196->13856|27234->13884|27275->13886|27327->13906|27389->13940|27431->13972|27472->13974|27524->13994|27590->14032|27631->14063|27672->14065|27724->14085|27789->14122|27833->14156|27874->14158|27926->14178|27994->14218|28035->14249|28076->14251|28128->14271|28193->14308|28232->14337|28273->14339|28325->14359|28388->14394|28426->14422|28467->14424|28519->14444|28581->14478|28622->14509|28663->14511|28715->14531|28780->14568|28820->14598|28861->14600|28913->14620|28977->14656|29020->14689|29061->14691|29113->14711|29180->14750|29222->14782|29263->14784|29315->14804|29381->14842|29421->14872|29462->14874|29514->14894|29578->14930|29617->14959|29658->14961|29710->14981|29773->15016|29812->15045|29853->15047|29905->15067|29968->15102|30006->15130|30047->15132|30099->15152|30161->15186|30203->15218|30244->15220|30296->15240|30362->15278|30402->15308|30443->15310|30495->15330|30559->15366|30600->15397|30641->15399|30693->15419|30758->15456|30798->15486|30839->15488|30891->15508|30955->15544|30999->15578|31040->15580|31092->15600|31160->15640|31204->15674|31245->15676|31297->15696|31365->15736|31404->15765|31445->15767|31497->15787|31560->15822|31602->15854|31643->15856|31695->15876|31761->15914|31803->15946|31844->15948|31896->15968|31962->16006|32006->16040|32047->16042|32099->16062|32167->16102|32209->16134|32250->16136|32302->16156|32368->16194|32408->16224|32449->16226|32501->16246|32565->16282|32605->16312|32646->16314|32698->16334|32762->16370|32806->16404|32847->16406|32899->16426|32967->16466|33005->16494|33046->16496|33098->16516|33160->16550|33198->16578|33239->16580|33291->16600|33741->17022|33758->17029|33797->17046|34010->17231|34027->17238|34066->17254|34401->17560|34431->17561|34462->17563|34492->17564|34622->17666|34639->17673|34674->17686|35049->18033|35066->18040|35101->18053|35468->18392|35485->18399|35526->18418|35741->18605|35758->18612|35799->18630|36131->18933|36161->18934|36192->18936|36222->18937|36354->19041|36371->19048|36408->19063|36782->19409|36799->19416|36836->19431|37090->19658|37135->19686|37176->19688|37211->19695|37277->19733|37329->19775|37370->19777|37410->19785|37440->19786|37542->19859|37560->19866|37588->19871|37632->19887|37649->19894|37676->19899|37757->19949|37791->19955|37890->20026|37907->20033|37938->20042|38223->20299|38240->20306|38276->20320|38450->20467|38491->20498|38532->20500|38566->20506|38653->20565|38674->20576|38716->20596|38761->20610|38794->20615|38942->20735|38982->20753|39090->20833|39107->20840|39134->20845
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|79->48|79->48|79->48|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|156->125|156->125|156->125|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|162->131|162->131|162->131|163->132|165->134|166->135|166->135|166->135|167->136|169->138|169->138|170->139|178->147|178->147|178->147|180->149|180->149|180->149|180->149|181->150|181->150|181->150|181->150|182->151|182->151|182->151|182->151|183->152|183->152|183->152|183->152|184->153|184->153|184->153|184->153|185->154|185->154|185->154|185->154|186->155|186->155|186->155|186->155|187->156|187->156|187->156|187->156|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|190->159|190->159|190->159|190->159|191->160|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|193->162|193->162|193->162|194->163|194->163|194->163|194->163|195->164|195->164|195->164|195->164|196->165|196->165|196->165|196->165|197->166|197->166|197->166|197->166|198->167|198->167|198->167|198->167|199->168|199->168|199->168|199->168|200->169|200->169|200->169|200->169|201->170|201->170|201->170|201->170|202->171|202->171|202->171|202->171|203->172|203->172|203->172|203->172|204->173|204->173|204->173|204->173|205->174|205->174|205->174|205->174|206->175|206->175|206->175|206->175|207->176|207->176|207->176|207->176|208->177|208->177|208->177|208->177|209->178|209->178|209->178|209->178|210->179|210->179|210->179|210->179|211->180|211->180|211->180|211->180|212->181|212->181|212->181|212->181|213->182|213->182|213->182|213->182|214->183|214->183|214->183|214->183|215->184|215->184|215->184|215->184|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|218->187|218->187|218->187|218->187|219->188|219->188|219->188|219->188|220->189|220->189|220->189|220->189|221->190|221->190|221->190|221->190|222->191|222->191|222->191|222->191|223->192|223->192|223->192|223->192|224->193|224->193|224->193|224->193|225->194|225->194|225->194|225->194|226->195|226->195|226->195|226->195|227->196|227->196|227->196|227->196|228->197|228->197|228->197|228->197|229->198|229->198|229->198|229->198|230->199|230->199|230->199|230->199|231->200|231->200|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|233->202|233->202|234->203|234->203|234->203|234->203|235->204|235->204|235->204|235->204|236->205|236->205|236->205|236->205|237->206|237->206|237->206|237->206|238->207|238->207|238->207|238->207|239->208|239->208|239->208|239->208|240->209|240->209|240->209|240->209|241->210|241->210|241->210|241->210|242->211|242->211|242->211|242->211|243->212|243->212|243->212|243->212|255->224|255->224|255->224|257->226|257->226|257->226|265->234|265->234|265->234|265->234|266->235|266->235|266->235|275->244|275->244|275->244|283->252|283->252|283->252|285->254|285->254|285->254|293->262|293->262|293->262|293->262|294->263|294->263|294->263|303->272|303->272|303->272|310->279|310->279|310->279|311->280|312->281|312->281|312->281|312->281|312->281|312->281|312->281|312->281|313->282|313->282|313->282|315->284|316->285|317->286|317->286|317->286|322->291|322->291|322->291|328->297|328->297|328->297|329->298|329->298|329->298|329->298|330->299|331->300|334->303|334->303|337->306|337->306|337->306
                  -- GENERATED --
              */
          
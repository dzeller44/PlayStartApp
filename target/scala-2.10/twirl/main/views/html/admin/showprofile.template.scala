
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
								<select name="county" required="required">
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
								<select name="billcounty" required="required">
									<option value="" disabled="disabled">--- Select a county ---</option>
									<option """),_display_(/*149.19*/if(profile.billcounty == "Adams")/*149.52*/ {_display_(Seq[Any](format.raw/*149.54*/("""selected="selected"""")))}),format.raw/*149.74*/(""">Adams</option>
									<option """),_display_(/*150.19*/if(profile.billcounty == "Alamosa")/*150.54*/ {_display_(Seq[Any](format.raw/*150.56*/("""selected="selected"""")))}),format.raw/*150.76*/(""">Alamosa</option>
									<option """),_display_(/*151.19*/if(profile.billcounty == "Arapahoe")/*151.55*/ {_display_(Seq[Any](format.raw/*151.57*/("""selected="selected"""")))}),format.raw/*151.77*/(""">Arapahoe</option>
									<option """),_display_(/*152.19*/if(profile.billcounty == "Archuleta")/*152.56*/ {_display_(Seq[Any](format.raw/*152.58*/("""selected="selected"""")))}),format.raw/*152.78*/(""">Archuleta</option>
									<option """),_display_(/*153.19*/if(profile.billcounty == "Baca")/*153.51*/ {_display_(Seq[Any](format.raw/*153.53*/("""selected="selected"""")))}),format.raw/*153.73*/(""">Baca</option>
									<option """),_display_(/*154.19*/if(profile.billcounty == "Bent")/*154.51*/ {_display_(Seq[Any](format.raw/*154.53*/("""selected="selected"""")))}),format.raw/*154.73*/(""">Bent</option>
									<option """),_display_(/*155.19*/if(profile.billcounty == "Boulder")/*155.54*/ {_display_(Seq[Any](format.raw/*155.56*/("""selected="selected"""")))}),format.raw/*155.76*/(""">Boulder</option>
									<option """),_display_(/*156.19*/if(profile.billcounty == "Broomfield")/*156.57*/ {_display_(Seq[Any](format.raw/*156.59*/("""selected="selected"""")))}),format.raw/*156.79*/(""">Broomfield</option>
									<option """),_display_(/*157.19*/if(profile.billcounty == "Chaffee")/*157.54*/ {_display_(Seq[Any](format.raw/*157.56*/("""selected="selected"""")))}),format.raw/*157.76*/(""">Chaffee</option>
									<option """),_display_(/*158.19*/if(profile.billcounty == "Cheyenne")/*158.55*/ {_display_(Seq[Any](format.raw/*158.57*/("""selected="selected"""")))}),format.raw/*158.77*/(""">Cheyenne</option>
									<option """),_display_(/*159.19*/if(profile.billcounty == "Clear Creek")/*159.58*/ {_display_(Seq[Any](format.raw/*159.60*/("""selected="selected"""")))}),format.raw/*159.80*/(""">Clear Creek</option>
									<option """),_display_(/*160.19*/if(profile.billcounty == "Conejos")/*160.54*/ {_display_(Seq[Any](format.raw/*160.56*/("""selected="selected"""")))}),format.raw/*160.76*/(""">Conejos</option>
									<option """),_display_(/*161.19*/if(profile.billcounty == "Costilla")/*161.55*/ {_display_(Seq[Any](format.raw/*161.57*/("""selected="selected"""")))}),format.raw/*161.77*/(""">Costilla</option>
									<option """),_display_(/*162.19*/if(profile.billcounty == "Crowley")/*162.54*/ {_display_(Seq[Any](format.raw/*162.56*/("""selected="selected"""")))}),format.raw/*162.76*/(""">Crowley</option>
									<option """),_display_(/*163.19*/if(profile.billcounty == "Custer")/*163.53*/ {_display_(Seq[Any](format.raw/*163.55*/("""selected="selected"""")))}),format.raw/*163.75*/(""">Custer</option>
									<option """),_display_(/*164.19*/if(profile.billcounty == "Delta")/*164.52*/ {_display_(Seq[Any](format.raw/*164.54*/("""selected="selected"""")))}),format.raw/*164.74*/(""">Delta</option>
									<option """),_display_(/*165.19*/if(profile.billcounty == "Denver")/*165.53*/ {_display_(Seq[Any](format.raw/*165.55*/("""selected="selected"""")))}),format.raw/*165.75*/(""">Denver</option>
									<option """),_display_(/*166.19*/if(profile.billcounty == "Dolores")/*166.54*/ {_display_(Seq[Any](format.raw/*166.56*/("""selected="selected"""")))}),format.raw/*166.76*/(""">Dolores</option>
									<option """),_display_(/*167.19*/if(profile.billcounty == "Douglas")/*167.54*/ {_display_(Seq[Any](format.raw/*167.56*/("""selected="selected"""")))}),format.raw/*167.76*/(""">Douglas</option>
									<option """),_display_(/*168.19*/if(profile.billcounty == "Eagle")/*168.52*/ {_display_(Seq[Any](format.raw/*168.54*/("""selected="selected"""")))}),format.raw/*168.74*/(""">Eagle</option>
									<option """),_display_(/*169.19*/if(profile.billcounty == "Elbert")/*169.53*/ {_display_(Seq[Any](format.raw/*169.55*/("""selected="selected"""")))}),format.raw/*169.75*/(""">Elbert</option>
									<option """),_display_(/*170.19*/if(profile.billcounty == "El Paso")/*170.54*/ {_display_(Seq[Any](format.raw/*170.56*/("""selected="selected"""")))}),format.raw/*170.76*/(""">El Paso</option>
									<option """),_display_(/*171.19*/if(profile.billcounty == "Fremont")/*171.54*/ {_display_(Seq[Any](format.raw/*171.56*/("""selected="selected"""")))}),format.raw/*171.76*/(""">Fremont</option>
									<option """),_display_(/*172.19*/if(profile.billcounty == "Garfield")/*172.55*/ {_display_(Seq[Any](format.raw/*172.57*/("""selected="selected"""")))}),format.raw/*172.77*/(""">Garfield</option>
									<option """),_display_(/*173.19*/if(profile.billcounty == "Gilpin")/*173.53*/ {_display_(Seq[Any](format.raw/*173.55*/("""selected="selected"""")))}),format.raw/*173.75*/(""">Gilpin</option>
									<option """),_display_(/*174.19*/if(profile.billcounty == "Grand")/*174.52*/ {_display_(Seq[Any](format.raw/*174.54*/("""selected="selected"""")))}),format.raw/*174.74*/(""">Grand</option>
									<option """),_display_(/*175.19*/if(profile.billcounty == "Gunnison")/*175.55*/ {_display_(Seq[Any](format.raw/*175.57*/("""selected="selected"""")))}),format.raw/*175.77*/(""">Gunnison</option>
									<option """),_display_(/*176.19*/if(profile.billcounty == "Hinsdale")/*176.55*/ {_display_(Seq[Any](format.raw/*176.57*/("""selected="selected"""")))}),format.raw/*176.77*/(""">Hinsdale</option>
									<option """),_display_(/*177.19*/if(profile.billcounty == "Huerfano")/*177.55*/ {_display_(Seq[Any](format.raw/*177.57*/("""selected="selected"""")))}),format.raw/*177.77*/(""">Huerfano</option>
									<option """),_display_(/*178.19*/if(profile.billcounty == "Jackson")/*178.54*/ {_display_(Seq[Any](format.raw/*178.56*/("""selected="selected"""")))}),format.raw/*178.76*/(""">Jackson</option>
									<option """),_display_(/*179.19*/if(profile.billcounty == "Jefferson")/*179.56*/ {_display_(Seq[Any](format.raw/*179.58*/("""selected="selected"""")))}),format.raw/*179.78*/(""">Jefferson</option>
									<option """),_display_(/*180.19*/if(profile.billcounty == "Kiowa")/*180.52*/ {_display_(Seq[Any](format.raw/*180.54*/("""selected="selected"""")))}),format.raw/*180.74*/(""">Kiowa</option>
									<option """),_display_(/*181.19*/if(profile.billcounty == "Kit Carson")/*181.57*/ {_display_(Seq[Any](format.raw/*181.59*/("""selected="selected"""")))}),format.raw/*181.79*/(""">Kit Carson</option>
									<option """),_display_(/*182.19*/if(profile.billcounty == "Lake")/*182.51*/ {_display_(Seq[Any](format.raw/*182.53*/("""selected="selected"""")))}),format.raw/*182.73*/(""">Lake</option>
									<option """),_display_(/*183.19*/if(profile.billcounty == "La Plata")/*183.55*/ {_display_(Seq[Any](format.raw/*183.57*/("""selected="selected"""")))}),format.raw/*183.77*/(""">La Plata</option>
									<option """),_display_(/*184.19*/if(profile.billcounty == "Larimer")/*184.54*/ {_display_(Seq[Any](format.raw/*184.56*/("""selected="selected"""")))}),format.raw/*184.76*/(""">Larimer</option>
									<option """),_display_(/*185.19*/if(profile.billcounty == "Las Animas")/*185.57*/ {_display_(Seq[Any](format.raw/*185.59*/("""selected="selected"""")))}),format.raw/*185.79*/(""">Las Animas</option>
									<option """),_display_(/*186.19*/if(profile.billcounty == "Lincoln")/*186.54*/ {_display_(Seq[Any](format.raw/*186.56*/("""selected="selected"""")))}),format.raw/*186.76*/(""">Lincoln</option>
									<option """),_display_(/*187.19*/if(profile.billcounty == "Logan")/*187.52*/ {_display_(Seq[Any](format.raw/*187.54*/("""selected="selected"""")))}),format.raw/*187.74*/(""">Logan</option>
									<option """),_display_(/*188.19*/if(profile.billcounty == "Mesa")/*188.51*/ {_display_(Seq[Any](format.raw/*188.53*/("""selected="selected"""")))}),format.raw/*188.73*/(""">Mesa</option>
									<option """),_display_(/*189.19*/if(profile.billcounty == "Mineral")/*189.54*/ {_display_(Seq[Any](format.raw/*189.56*/("""selected="selected"""")))}),format.raw/*189.76*/(""">Mineral</option>
									<option """),_display_(/*190.19*/if(profile.billcounty == "Moffat")/*190.53*/ {_display_(Seq[Any](format.raw/*190.55*/("""selected="selected"""")))}),format.raw/*190.75*/(""">Moffat</option>
									<option """),_display_(/*191.19*/if(profile.billcounty == "Montezuma")/*191.56*/ {_display_(Seq[Any](format.raw/*191.58*/("""selected="selected"""")))}),format.raw/*191.78*/(""">Montezuma</option>
									<option """),_display_(/*192.19*/if(profile.billcounty == "Montrose")/*192.55*/ {_display_(Seq[Any](format.raw/*192.57*/("""selected="selected"""")))}),format.raw/*192.77*/(""">Montrose</option>
									<option """),_display_(/*193.19*/if(profile.billcounty == "Morgan")/*193.53*/ {_display_(Seq[Any](format.raw/*193.55*/("""selected="selected"""")))}),format.raw/*193.75*/(""">Morgan</option>
									<option """),_display_(/*194.19*/if(profile.billcounty == "Otero")/*194.52*/ {_display_(Seq[Any](format.raw/*194.54*/("""selected="selected"""")))}),format.raw/*194.74*/(""">Otero</option>
									<option """),_display_(/*195.19*/if(profile.billcounty == "Ouray")/*195.52*/ {_display_(Seq[Any](format.raw/*195.54*/("""selected="selected"""")))}),format.raw/*195.74*/(""">Ouray</option>
									<option """),_display_(/*196.19*/if(profile.billcounty == "Park")/*196.51*/ {_display_(Seq[Any](format.raw/*196.53*/("""selected="selected"""")))}),format.raw/*196.73*/(""">Park</option>
									<option """),_display_(/*197.19*/if(profile.billcounty == "Phillips")/*197.55*/ {_display_(Seq[Any](format.raw/*197.57*/("""selected="selected"""")))}),format.raw/*197.77*/(""">Phillips</option>
									<option """),_display_(/*198.19*/if(profile.billcounty == "Pitkin")/*198.53*/ {_display_(Seq[Any](format.raw/*198.55*/("""selected="selected"""")))}),format.raw/*198.75*/(""">Pitkin</option>
									<option """),_display_(/*199.19*/if(profile.billcounty == "Prowers")/*199.54*/ {_display_(Seq[Any](format.raw/*199.56*/("""selected="selected"""")))}),format.raw/*199.76*/(""">Prowers</option>
									<option """),_display_(/*200.19*/if(profile.billcounty == "Pueblo")/*200.53*/ {_display_(Seq[Any](format.raw/*200.55*/("""selected="selected"""")))}),format.raw/*200.75*/(""">Pueblo</option>
									<option """),_display_(/*201.19*/if(profile.billcounty == "Rio Blanco")/*201.57*/ {_display_(Seq[Any](format.raw/*201.59*/("""selected="selected"""")))}),format.raw/*201.79*/(""">Rio Blanco</option>
									<option """),_display_(/*202.19*/if(profile.billcounty == "Rio Grande")/*202.57*/ {_display_(Seq[Any](format.raw/*202.59*/("""selected="selected"""")))}),format.raw/*202.79*/(""">Rio Grande</option>
									<option """),_display_(/*203.19*/if(profile.billcounty == "Routt")/*203.52*/ {_display_(Seq[Any](format.raw/*203.54*/("""selected="selected"""")))}),format.raw/*203.74*/(""">Routt</option>
									<option """),_display_(/*204.19*/if(profile.billcounty == "Saguache")/*204.55*/ {_display_(Seq[Any](format.raw/*204.57*/("""selected="selected"""")))}),format.raw/*204.77*/(""">Saguache</option>
									<option """),_display_(/*205.19*/if(profile.billcounty == "San Juan")/*205.55*/ {_display_(Seq[Any](format.raw/*205.57*/("""selected="selected"""")))}),format.raw/*205.77*/(""">San Juan</option>
									<option """),_display_(/*206.19*/if(profile.billcounty == "San Miguel")/*206.57*/ {_display_(Seq[Any](format.raw/*206.59*/("""selected="selected"""")))}),format.raw/*206.79*/(""">San Miguel</option>
									<option """),_display_(/*207.19*/if(profile.billcounty == "Sedgwick")/*207.55*/ {_display_(Seq[Any](format.raw/*207.57*/("""selected="selected"""")))}),format.raw/*207.77*/(""">Sedgwick</option>
									<option """),_display_(/*208.19*/if(profile.billcounty == "Summit")/*208.53*/ {_display_(Seq[Any](format.raw/*208.55*/("""selected="selected"""")))}),format.raw/*208.75*/(""">Summit</option>
									<option """),_display_(/*209.19*/if(profile.billcounty == "Teller")/*209.53*/ {_display_(Seq[Any](format.raw/*209.55*/("""selected="selected"""")))}),format.raw/*209.75*/(""">Teller</option>
									<option """),_display_(/*210.19*/if(profile.billcounty == "Washington")/*210.57*/ {_display_(Seq[Any](format.raw/*210.59*/("""selected="selected"""")))}),format.raw/*210.79*/(""">Washington</option>
									<option """),_display_(/*211.19*/if(profile.billcounty == "Weld")/*211.51*/ {_display_(Seq[Any](format.raw/*211.53*/("""selected="selected"""")))}),format.raw/*211.73*/(""">Weld</option>
									<option """),_display_(/*212.19*/if(profile.billcounty == "Yuma")/*212.51*/ {_display_(Seq[Any](format.raw/*212.53*/("""selected="selected"""")))}),format.raw/*212.73*/(""">Yuma</option>
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
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*235.57*/("""{"""),format.raw/*235.58*/("""3"""),format.raw/*235.59*/("""}"""),format.raw/*235.60*/("""[\-]\d"""),format.raw/*235.66*/("""{"""),format.raw/*235.67*/("""3"""),format.raw/*235.68*/("""}"""),format.raw/*235.69*/("""[\-]\d"""),format.raw/*235.75*/("""{"""),format.raw/*235.76*/("""4"""),format.raw/*235.77*/("""}"""),format.raw/*235.78*/("""" maxlength="24" name="primaryPhone"  						
						required="required" placeholder="Phone Number..." value=""""),_display_(/*236.65*/profile/*236.72*/.primaryPhone),format.raw/*236.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*245.58*/profile/*245.65*/.primaryEmail),format.raw/*245.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*253.34*/profile/*253.41*/.secondaryNameFirst),format.raw/*253.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*255.81*/profile/*255.88*/.secondaryNameLast),format.raw/*255.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*264.57*/("""{"""),format.raw/*264.58*/("""3"""),format.raw/*264.59*/("""}"""),format.raw/*264.60*/("""[\-]\d"""),format.raw/*264.66*/("""{"""),format.raw/*264.67*/("""3"""),format.raw/*264.68*/("""}"""),format.raw/*264.69*/("""[\-]\d"""),format.raw/*264.75*/("""{"""),format.raw/*264.76*/("""4"""),format.raw/*264.77*/("""}"""),format.raw/*264.78*/("""" maxlength="24" name="secondaryPhone"
  						required="required" placeholder="Phone Number..." value=""""),_display_(/*265.67*/profile/*265.74*/.secondaryPhone),format.raw/*265.89*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*274.58*/profile/*274.65*/.secondaryEmail),format.raw/*274.80*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-checkbox">
				<label class="title">Services Provided:<span class="required">*</span></label>
				<div class="column column1">
					"""),_display_(/*281.7*/for(service <- servicesList) yield /*281.35*/ {_display_(Seq[Any](format.raw/*281.37*/("""
					"""),format.raw/*282.6*/("""<label>
					<input type="checkbox" """),_display_(/*283.30*/if(servicesSelected contains service.name)/*283.72*/ {_display_(Seq[Any](format.raw/*283.74*/("""checked""")))}),format.raw/*283.82*/(""" """),format.raw/*283.83*/("""class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*283.156*/service/*283.163*/.name),format.raw/*283.168*/("""">
					<span>"""),_display_(/*284.13*/service/*284.20*/.name),format.raw/*284.25*/("""</span>
					</label>                    
					""")))}),format.raw/*286.7*/("""
				"""),format.raw/*287.5*/("""</div>
				<input type="hidden" name="services" id="services" value=""""),_display_(/*288.64*/profile/*288.71*/.services),format.raw/*288.80*/("""">
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." value=""""),_display_(/*293.39*/profile/*293.46*/.servicesOther),format.raw/*293.60*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*299.6*/if(profileForm.hasGlobalErrors)/*299.37*/ {_display_(Seq[Any](format.raw/*299.39*/("""
				"""),format.raw/*300.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*300.64*/profileForm/*300.75*/.globalError.message),format.raw/*300.95*/("""</span>
				""")))}),format.raw/*301.6*/("""
			"""),format.raw/*302.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/admin" class="buttonCancel">"""),_display_(/*305.44*/Messages("goback")),format.raw/*305.62*/("""</a>
			</div>
			<div class="submit">
				<a href="javascript:deleteProfile('"""),_display_(/*308.41*/profile/*308.48*/.name),format.raw/*308.53*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
			</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					<tr>
						<td>Modified By:</td>
						<td>"""),_display_(/*314.12*/profile/*314.19*/.updatedBy),format.raw/*314.29*/("""</td>
					</tr>
					<tr>
						<td>Last Modified:</td>
						<td>"""),_display_(/*318.12*/profile/*318.19*/.dateUpdated),format.raw/*318.31*/("""</td>
					</tr>
				</table>
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
                  DATE: Thu Dec 15 10:29:32 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showprofile.scala.html
                  HASH: a9370eb2718f3b3112fa0ad9debcca065b8b1b80
                  MATRIX: 845->1|1088->148|1118->153|1136->163|1175->165|1204->168|1294->231|1322->232|1356->240|1439->296|1467->297|1499->303|1600->377|1628->378|1661->385|1711->409|1738->410|1779->424|1807->425|1840->431|1868->432|2508->1045|2524->1052|2550->1057|2865->1344|2882->1351|2912->1359|3075->1494|3092->1501|3123->1510|3271->1630|3288->1637|3315->1642|3506->1805|3523->1812|3551->1818|3745->1984|3762->1991|3788->1995|4015->2196|4062->2234|4102->2236|4138->2245|4296->2373|4331->2381|4364->2386|4393->2387|4429->2396|4583->2523|4611->2524|4645->2531|5024->2883|5062->2912|5102->2914|5153->2934|5215->2969|5255->3000|5295->3002|5346->3022|5410->3059|5451->3091|5491->3093|5542->3113|5607->3151|5649->3184|5689->3186|5740->3206|5806->3245|5843->3273|5883->3275|5934->3295|5995->3329|6032->3357|6072->3359|6123->3379|6184->3413|6224->3444|6264->3446|6315->3466|6379->3503|6422->3537|6462->3539|6513->3559|6580->3599|6620->3630|6660->3632|6711->3652|6775->3689|6816->3721|6856->3723|6907->3743|6972->3781|7016->3816|7056->3818|7107->3838|7175->3879|7215->3910|7255->3912|7306->3932|7370->3969|7411->4001|7451->4003|7502->4023|7567->4061|7607->4092|7647->4094|7698->4114|7762->4151|7801->4181|7841->4183|7892->4203|7955->4239|7993->4268|8033->4270|8084->4290|8146->4325|8185->4355|8225->4357|8276->4377|8339->4413|8379->4444|8419->4446|8470->4466|8534->4503|8574->4534|8614->4536|8665->4556|8729->4593|8767->4622|8807->4624|8858->4644|8920->4679|8959->4709|8999->4711|9050->4731|9113->4767|9153->4798|9193->4800|9244->4820|9308->4857|9348->4888|9388->4890|9439->4910|9503->4947|9544->4979|9584->4981|9635->5001|9700->5039|9739->5069|9779->5071|9830->5091|9893->5127|9931->5156|9971->5158|10022->5178|10084->5213|10125->5245|10165->5247|10216->5267|10281->5305|10322->5337|10362->5339|10413->5359|10478->5397|10519->5429|10559->5431|10610->5451|10675->5489|10715->5520|10755->5522|10806->5542|10870->5579|10912->5612|10952->5614|11003->5634|11069->5673|11107->5702|11147->5704|11198->5724|11260->5759|11303->5793|11343->5795|11394->5815|11461->5855|11498->5883|11538->5885|11589->5905|11650->5939|11691->5971|11731->5973|11782->5993|11847->6031|11887->6062|11927->6064|11978->6084|12042->6121|12085->6155|12125->6157|12176->6177|12243->6217|12283->6248|12323->6250|12374->6270|12438->6307|12476->6336|12516->6338|12567->6358|12629->6393|12666->6421|12706->6423|12757->6443|12818->6477|12858->6508|12898->6510|12949->6530|13013->6567|13052->6597|13092->6599|13143->6619|13206->6655|13248->6688|13288->6690|13339->6710|13405->6749|13446->6781|13486->6783|13537->6803|13602->6841|13641->6871|13681->6873|13732->6893|13795->6929|13833->6958|13873->6960|13924->6980|13986->7015|14024->7044|14064->7046|14115->7066|14177->7101|14214->7129|14254->7131|14305->7151|14366->7185|14407->7217|14447->7219|14498->7239|14563->7277|14602->7307|14642->7309|14693->7329|14757->7365|14798->7396|14839->7398|14891->7418|14956->7455|14996->7485|15037->7487|15089->7507|15153->7543|15197->7577|15238->7579|15290->7599|15358->7639|15402->7673|15443->7675|15495->7695|15563->7735|15602->7764|15643->7766|15695->7786|15758->7821|15800->7853|15841->7855|15893->7875|15959->7913|16001->7945|16042->7947|16094->7967|16160->8005|16204->8039|16245->8041|16297->8061|16365->8101|16407->8133|16448->8135|16500->8155|16566->8193|16606->8223|16647->8225|16699->8245|16763->8281|16803->8311|16844->8313|16896->8333|16960->8369|17004->8403|17045->8405|17097->8425|17165->8465|17203->8493|17244->8495|17296->8515|17358->8549|17396->8577|17437->8579|17489->8599|17926->9008|17943->9015|17974->9024|18293->9314|18311->9321|18346->9333|18514->9472|18532->9479|18568->9492|18721->9616|18739->9623|18771->9632|18967->9799|18985->9806|19018->9816|19217->9986|19235->9993|19266->10001|19420->10128|19472->10170|19513->10172|19550->10181|19709->10309|19745->10317|19779->10322|19809->10323|19846->10332|20001->10459|20030->10460|20065->10467|20458->10832|20501->10865|20542->10867|20594->10887|20657->10922|20702->10957|20743->10959|20795->10979|20860->11016|20906->11052|20947->11054|20999->11074|21065->11112|21112->11149|21153->11151|21205->11171|21272->11210|21314->11242|21355->11244|21407->11264|21469->11298|21511->11330|21552->11332|21604->11352|21666->11386|21711->11421|21752->11423|21804->11443|21869->11480|21917->11518|21958->11520|22010->11540|22078->11580|22123->11615|22164->11617|22216->11637|22281->11674|22327->11710|22368->11712|22420->11732|22486->11770|22535->11809|22576->11811|22628->11831|22697->11872|22742->11907|22783->11909|22835->11929|22900->11966|22946->12002|22987->12004|23039->12024|23105->12062|23150->12097|23191->12099|23243->12119|23308->12156|23352->12190|23393->12192|23445->12212|23509->12248|23552->12281|23593->12283|23645->12303|23708->12338|23752->12372|23793->12374|23845->12394|23909->12430|23954->12465|23995->12467|24047->12487|24112->12524|24157->12559|24198->12561|24250->12581|24315->12618|24358->12651|24399->12653|24451->12673|24514->12708|24558->12742|24599->12744|24651->12764|24715->12800|24760->12835|24801->12837|24853->12857|24918->12894|24963->12929|25004->12931|25056->12951|25121->12988|25167->13024|25208->13026|25260->13046|25326->13084|25370->13118|25411->13120|25463->13140|25527->13176|25570->13209|25611->13211|25663->13231|25726->13266|25772->13302|25813->13304|25865->13324|25931->13362|25977->13398|26018->13400|26070->13420|26136->13458|26182->13494|26223->13496|26275->13516|26341->13554|26386->13589|26427->13591|26479->13611|26544->13648|26591->13685|26632->13687|26684->13707|26751->13746|26794->13779|26835->13781|26887->13801|26950->13836|26998->13874|27039->13876|27091->13896|27159->13936|27201->13968|27242->13970|27294->13990|27356->14024|27402->14060|27443->14062|27495->14082|27561->14120|27606->14155|27647->14157|27699->14177|27764->14214|27812->14252|27853->14254|27905->14274|27973->14314|28018->14349|28059->14351|28111->14371|28176->14408|28219->14441|28260->14443|28312->14463|28375->14498|28417->14530|28458->14532|28510->14552|28572->14586|28617->14621|28658->14623|28710->14643|28775->14680|28819->14714|28860->14716|28912->14736|28976->14772|29023->14809|29064->14811|29116->14831|29183->14870|29229->14906|29270->14908|29322->14928|29388->14966|29432->15000|29473->15002|29525->15022|29589->15058|29632->15091|29673->15093|29725->15113|29788->15148|29831->15181|29872->15183|29924->15203|29987->15238|30029->15270|30070->15272|30122->15292|30184->15326|30230->15362|30271->15364|30323->15384|30389->15422|30433->15456|30474->15458|30526->15478|30590->15514|30635->15549|30676->15551|30728->15571|30793->15608|30837->15642|30878->15644|30930->15664|30994->15700|31042->15738|31083->15740|31135->15760|31203->15800|31251->15838|31292->15840|31344->15860|31412->15900|31455->15933|31496->15935|31548->15955|31611->15990|31657->16026|31698->16028|31750->16048|31816->16086|31862->16122|31903->16124|31955->16144|32021->16182|32069->16220|32110->16222|32162->16242|32230->16282|32276->16318|32317->16320|32369->16340|32435->16378|32479->16412|32520->16414|32572->16434|32636->16470|32680->16504|32721->16506|32773->16526|32837->16562|32885->16600|32926->16602|32978->16622|33046->16662|33088->16694|33129->16696|33181->16716|33243->16750|33285->16782|33326->16784|33378->16804|33828->17226|33845->17233|33884->17250|34097->17435|34114->17442|34153->17458|34603->17879|34633->17880|34663->17881|34693->17882|34728->17888|34758->17889|34788->17890|34818->17891|34853->17897|34883->17898|34913->17899|34943->17900|35081->18010|35098->18017|35133->18030|35508->18377|35525->18384|35560->18397|35927->18736|35944->18743|35985->18762|36200->18949|36217->18956|36258->18974|36705->19392|36735->19393|36765->19394|36795->19395|36830->19401|36860->19402|36890->19403|36920->19404|36955->19410|36985->19411|37015->19412|37045->19413|37179->19519|37196->19526|37233->19541|37607->19887|37624->19894|37661->19909|37915->20136|37960->20164|38001->20166|38036->20173|38102->20211|38154->20253|38195->20255|38235->20263|38265->20264|38367->20337|38385->20344|38413->20349|38457->20365|38474->20372|38501->20377|38582->20427|38616->20433|38715->20504|38732->20511|38763->20520|39049->20778|39066->20785|39102->20799|39276->20946|39317->20977|39358->20979|39392->20985|39479->21044|39500->21055|39542->21075|39587->21089|39620->21094|39768->21214|39808->21232|39918->21314|39935->21321|39962->21326|40182->21518|40199->21525|40231->21535|40331->21607|40348->21614|40382->21626
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|156->125|156->125|156->125|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|162->131|162->131|162->131|163->132|165->134|166->135|166->135|166->135|167->136|169->138|169->138|170->139|180->149|180->149|180->149|180->149|181->150|181->150|181->150|181->150|182->151|182->151|182->151|182->151|183->152|183->152|183->152|183->152|184->153|184->153|184->153|184->153|185->154|185->154|185->154|185->154|186->155|186->155|186->155|186->155|187->156|187->156|187->156|187->156|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|190->159|190->159|190->159|190->159|191->160|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|193->162|193->162|193->162|194->163|194->163|194->163|194->163|195->164|195->164|195->164|195->164|196->165|196->165|196->165|196->165|197->166|197->166|197->166|197->166|198->167|198->167|198->167|198->167|199->168|199->168|199->168|199->168|200->169|200->169|200->169|200->169|201->170|201->170|201->170|201->170|202->171|202->171|202->171|202->171|203->172|203->172|203->172|203->172|204->173|204->173|204->173|204->173|205->174|205->174|205->174|205->174|206->175|206->175|206->175|206->175|207->176|207->176|207->176|207->176|208->177|208->177|208->177|208->177|209->178|209->178|209->178|209->178|210->179|210->179|210->179|210->179|211->180|211->180|211->180|211->180|212->181|212->181|212->181|212->181|213->182|213->182|213->182|213->182|214->183|214->183|214->183|214->183|215->184|215->184|215->184|215->184|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|218->187|218->187|218->187|218->187|219->188|219->188|219->188|219->188|220->189|220->189|220->189|220->189|221->190|221->190|221->190|221->190|222->191|222->191|222->191|222->191|223->192|223->192|223->192|223->192|224->193|224->193|224->193|224->193|225->194|225->194|225->194|225->194|226->195|226->195|226->195|226->195|227->196|227->196|227->196|227->196|228->197|228->197|228->197|228->197|229->198|229->198|229->198|229->198|230->199|230->199|230->199|230->199|231->200|231->200|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|233->202|233->202|234->203|234->203|234->203|234->203|235->204|235->204|235->204|235->204|236->205|236->205|236->205|236->205|237->206|237->206|237->206|237->206|238->207|238->207|238->207|238->207|239->208|239->208|239->208|239->208|240->209|240->209|240->209|240->209|241->210|241->210|241->210|241->210|242->211|242->211|242->211|242->211|243->212|243->212|243->212|243->212|255->224|255->224|255->224|257->226|257->226|257->226|266->235|266->235|266->235|266->235|266->235|266->235|266->235|266->235|266->235|266->235|266->235|266->235|267->236|267->236|267->236|276->245|276->245|276->245|284->253|284->253|284->253|286->255|286->255|286->255|295->264|295->264|295->264|295->264|295->264|295->264|295->264|295->264|295->264|295->264|295->264|295->264|296->265|296->265|296->265|305->274|305->274|305->274|312->281|312->281|312->281|313->282|314->283|314->283|314->283|314->283|314->283|314->283|314->283|314->283|315->284|315->284|315->284|317->286|318->287|319->288|319->288|319->288|324->293|324->293|324->293|330->299|330->299|330->299|331->300|331->300|331->300|331->300|332->301|333->302|336->305|336->305|339->308|339->308|339->308|345->314|345->314|345->314|349->318|349->318|349->318
                  -- GENERATED --
              */
          
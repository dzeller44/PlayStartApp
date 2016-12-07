
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
	$(document).ready(function()"""),format.raw/*5.30*/("""{"""),format.raw/*5.31*/("""		 
		"""),format.raw/*6.3*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*6.59*/("""{"""),format.raw/*6.60*/("""
			"""),format.raw/*7.4*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*7.78*/("""{"""),format.raw/*7.79*/("""
				"""),format.raw/*8.5*/("""return this.value;
			"""),format.raw/*9.4*/("""}"""),format.raw/*9.5*/(""").get());
		"""),format.raw/*10.3*/("""}"""),format.raw/*10.4*/(""");
	"""),format.raw/*11.2*/("""}"""),format.raw/*11.3*/(""");
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
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." value=""""),_display_(/*291.39*/profile/*291.46*/.servicesOther),format.raw/*291.60*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*297.6*/if(profileForm.hasGlobalErrors)/*297.37*/ {_display_(Seq[Any](format.raw/*297.39*/("""
					"""),format.raw/*298.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*298.65*/profileForm/*298.76*/.globalError.message),format.raw/*298.96*/("""</span>
				""")))}),format.raw/*299.6*/("""
			"""),format.raw/*300.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/user" class="buttonCancel">"""),_display_(/*303.43*/Messages("goback")),format.raw/*303.61*/("""</a>
			</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					<tr>
						<td>Modified By:</td>
						<td>"""),_display_(/*309.12*/profile/*309.19*/.updatedBy),format.raw/*309.29*/("""</td>
					</tr>
					<tr>
						<td>Last Modified:</td>
						<td>"""),_display_(/*313.12*/profile/*313.19*/.dateUpdated),format.raw/*313.31*/("""</td>
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
object editprofile extends editprofile_Scope0.editprofile
              /*
                  -- GENERATED --
                  DATE: Wed Dec 07 08:53:25 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: f8a2a0b528223ae9e8e61883e8bbadc3006cc6cd
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1295->230|1323->231|1356->238|1439->294|1467->295|1498->300|1599->374|1627->375|1659->381|1708->404|1735->405|1775->418|1803->419|1835->424|1863->425|2503->1038|2519->1045|2545->1050|2860->1337|2877->1344|2907->1352|3070->1487|3087->1494|3118->1503|3266->1623|3283->1630|3310->1635|3501->1798|3518->1805|3546->1811|3740->1977|3757->1984|3783->1988|4010->2189|4057->2227|4097->2229|4133->2238|4291->2366|4326->2374|4359->2379|4388->2380|4424->2389|4578->2516|4606->2517|4640->2524|5019->2876|5057->2905|5097->2907|5148->2927|5210->2962|5250->2993|5290->2995|5341->3015|5405->3052|5446->3084|5486->3086|5537->3106|5602->3144|5644->3177|5684->3179|5735->3199|5801->3238|5838->3266|5878->3268|5929->3288|5990->3322|6027->3350|6067->3352|6118->3372|6179->3406|6219->3437|6259->3439|6310->3459|6374->3496|6417->3530|6457->3532|6508->3552|6575->3592|6615->3623|6655->3625|6706->3645|6770->3682|6811->3714|6851->3716|6902->3736|6967->3774|7011->3809|7051->3811|7102->3831|7170->3872|7210->3903|7250->3905|7301->3925|7365->3962|7406->3994|7446->3996|7497->4016|7562->4054|7602->4085|7642->4087|7693->4107|7757->4144|7796->4174|7836->4176|7887->4196|7950->4232|7988->4261|8028->4263|8079->4283|8141->4318|8180->4348|8220->4350|8271->4370|8334->4406|8374->4437|8414->4439|8465->4459|8529->4496|8569->4527|8609->4529|8660->4549|8724->4586|8762->4615|8802->4617|8853->4637|8915->4672|8954->4702|8994->4704|9045->4724|9108->4760|9148->4791|9188->4793|9239->4813|9303->4850|9343->4881|9383->4883|9434->4903|9498->4940|9539->4972|9579->4974|9630->4994|9695->5032|9734->5062|9774->5064|9825->5084|9888->5120|9926->5149|9966->5151|10017->5171|10079->5206|10120->5238|10160->5240|10211->5260|10276->5298|10317->5330|10357->5332|10408->5352|10473->5390|10514->5422|10554->5424|10605->5444|10670->5482|10710->5513|10750->5515|10801->5535|10865->5572|10907->5605|10947->5607|10998->5627|11064->5666|11102->5695|11142->5697|11193->5717|11255->5752|11298->5786|11338->5788|11389->5808|11456->5848|11493->5876|11533->5878|11584->5898|11645->5932|11686->5964|11726->5966|11777->5986|11842->6024|11882->6055|11922->6057|11973->6077|12037->6114|12080->6148|12120->6150|12171->6170|12238->6210|12278->6241|12318->6243|12369->6263|12433->6300|12471->6329|12511->6331|12562->6351|12624->6386|12661->6414|12701->6416|12752->6436|12813->6470|12853->6501|12893->6503|12944->6523|13008->6560|13047->6590|13087->6592|13138->6612|13201->6648|13243->6681|13283->6683|13334->6703|13400->6742|13441->6774|13481->6776|13532->6796|13597->6834|13636->6864|13676->6866|13727->6886|13790->6922|13828->6951|13868->6953|13919->6973|13981->7008|14019->7037|14059->7039|14110->7059|14172->7094|14209->7122|14249->7124|14300->7144|14361->7178|14402->7210|14442->7212|14493->7232|14558->7270|14597->7300|14637->7302|14688->7322|14752->7358|14793->7389|14834->7391|14886->7411|14951->7448|14991->7478|15032->7480|15084->7500|15148->7536|15192->7570|15233->7572|15285->7592|15353->7632|15397->7666|15438->7668|15490->7688|15558->7728|15597->7757|15638->7759|15690->7779|15753->7814|15795->7846|15836->7848|15888->7868|15954->7906|15996->7938|16037->7940|16089->7960|16155->7998|16199->8032|16240->8034|16292->8054|16360->8094|16402->8126|16443->8128|16495->8148|16561->8186|16601->8216|16642->8218|16694->8238|16758->8274|16798->8304|16839->8306|16891->8326|16955->8362|16999->8396|17040->8398|17092->8418|17160->8458|17198->8486|17239->8488|17291->8508|17353->8542|17391->8570|17432->8572|17484->8592|17921->9001|17938->9008|17969->9017|18288->9307|18306->9314|18341->9326|18509->9465|18527->9472|18563->9485|18716->9609|18734->9616|18766->9625|18962->9792|18980->9799|19013->9809|19212->9979|19230->9986|19261->9994|19415->10121|19467->10163|19508->10165|19545->10174|19704->10302|19740->10310|19774->10315|19804->10316|19841->10325|19996->10452|20025->10453|20060->10460|20453->10825|20496->10858|20537->10860|20589->10880|20652->10915|20697->10950|20738->10952|20790->10972|20855->11009|20901->11045|20942->11047|20994->11067|21060->11105|21107->11142|21148->11144|21200->11164|21267->11203|21309->11235|21350->11237|21402->11257|21464->11291|21506->11323|21547->11325|21599->11345|21661->11379|21706->11414|21747->11416|21799->11436|21864->11473|21912->11511|21953->11513|22005->11533|22073->11573|22118->11608|22159->11610|22211->11630|22276->11667|22322->11703|22363->11705|22415->11725|22481->11763|22530->11802|22571->11804|22623->11824|22692->11865|22737->11900|22778->11902|22830->11922|22895->11959|22941->11995|22982->11997|23034->12017|23100->12055|23145->12090|23186->12092|23238->12112|23303->12149|23347->12183|23388->12185|23440->12205|23504->12241|23547->12274|23588->12276|23640->12296|23703->12331|23747->12365|23788->12367|23840->12387|23904->12423|23949->12458|23990->12460|24042->12480|24107->12517|24152->12552|24193->12554|24245->12574|24310->12611|24353->12644|24394->12646|24446->12666|24509->12701|24553->12735|24594->12737|24646->12757|24710->12793|24755->12828|24796->12830|24848->12850|24913->12887|24958->12922|24999->12924|25051->12944|25116->12981|25162->13017|25203->13019|25255->13039|25321->13077|25365->13111|25406->13113|25458->13133|25522->13169|25565->13202|25606->13204|25658->13224|25721->13259|25767->13295|25808->13297|25860->13317|25926->13355|25972->13391|26013->13393|26065->13413|26131->13451|26177->13487|26218->13489|26270->13509|26336->13547|26381->13582|26422->13584|26474->13604|26539->13641|26586->13678|26627->13680|26679->13700|26746->13739|26789->13772|26830->13774|26882->13794|26945->13829|26993->13867|27034->13869|27086->13889|27154->13929|27196->13961|27237->13963|27289->13983|27351->14017|27397->14053|27438->14055|27490->14075|27556->14113|27601->14148|27642->14150|27694->14170|27759->14207|27807->14245|27848->14247|27900->14267|27968->14307|28013->14342|28054->14344|28106->14364|28171->14401|28214->14434|28255->14436|28307->14456|28370->14491|28412->14523|28453->14525|28505->14545|28567->14579|28612->14614|28653->14616|28705->14636|28770->14673|28814->14707|28855->14709|28907->14729|28971->14765|29018->14802|29059->14804|29111->14824|29178->14863|29224->14899|29265->14901|29317->14921|29383->14959|29427->14993|29468->14995|29520->15015|29584->15051|29627->15084|29668->15086|29720->15106|29783->15141|29826->15174|29867->15176|29919->15196|29982->15231|30024->15263|30065->15265|30117->15285|30179->15319|30225->15355|30266->15357|30318->15377|30384->15415|30428->15449|30469->15451|30521->15471|30585->15507|30630->15542|30671->15544|30723->15564|30788->15601|30832->15635|30873->15637|30925->15657|30989->15693|31037->15731|31078->15733|31130->15753|31198->15793|31246->15831|31287->15833|31339->15853|31407->15893|31450->15926|31491->15928|31543->15948|31606->15983|31652->16019|31693->16021|31745->16041|31811->16079|31857->16115|31898->16117|31950->16137|32016->16175|32064->16213|32105->16215|32157->16235|32225->16275|32271->16311|32312->16313|32364->16333|32430->16371|32474->16405|32515->16407|32567->16427|32631->16463|32675->16497|32716->16499|32768->16519|32832->16555|32880->16593|32921->16595|32973->16615|33041->16655|33083->16687|33124->16689|33176->16709|33238->16743|33280->16775|33321->16777|33373->16797|33823->17219|33840->17226|33879->17243|34092->17428|34109->17435|34148->17451|34483->17757|34513->17758|34544->17760|34574->17761|34704->17863|34721->17870|34756->17883|35131->18230|35148->18237|35183->18250|35550->18589|35567->18596|35608->18615|35823->18802|35840->18809|35881->18827|36213->19130|36243->19131|36274->19133|36304->19134|36436->19238|36453->19245|36490->19260|36864->19606|36881->19613|36918->19628|37172->19855|37217->19883|37258->19885|37293->19892|37359->19930|37411->19972|37452->19974|37492->19982|37522->19983|37624->20056|37642->20063|37670->20068|37714->20084|37731->20091|37758->20096|37839->20146|37873->20152|37972->20223|37989->20230|38020->20239|38306->20497|38323->20504|38359->20518|38533->20665|38574->20696|38615->20698|38650->20705|38737->20764|38758->20775|38800->20795|38845->20809|38878->20814|39025->20933|39065->20951|39230->21088|39247->21095|39279->21105|39379->21177|39396->21184|39430->21196
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|156->125|156->125|156->125|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|162->131|162->131|162->131|163->132|165->134|166->135|166->135|166->135|167->136|169->138|169->138|170->139|180->149|180->149|180->149|180->149|181->150|181->150|181->150|181->150|182->151|182->151|182->151|182->151|183->152|183->152|183->152|183->152|184->153|184->153|184->153|184->153|185->154|185->154|185->154|185->154|186->155|186->155|186->155|186->155|187->156|187->156|187->156|187->156|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|190->159|190->159|190->159|190->159|191->160|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|193->162|193->162|193->162|194->163|194->163|194->163|194->163|195->164|195->164|195->164|195->164|196->165|196->165|196->165|196->165|197->166|197->166|197->166|197->166|198->167|198->167|198->167|198->167|199->168|199->168|199->168|199->168|200->169|200->169|200->169|200->169|201->170|201->170|201->170|201->170|202->171|202->171|202->171|202->171|203->172|203->172|203->172|203->172|204->173|204->173|204->173|204->173|205->174|205->174|205->174|205->174|206->175|206->175|206->175|206->175|207->176|207->176|207->176|207->176|208->177|208->177|208->177|208->177|209->178|209->178|209->178|209->178|210->179|210->179|210->179|210->179|211->180|211->180|211->180|211->180|212->181|212->181|212->181|212->181|213->182|213->182|213->182|213->182|214->183|214->183|214->183|214->183|215->184|215->184|215->184|215->184|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|218->187|218->187|218->187|218->187|219->188|219->188|219->188|219->188|220->189|220->189|220->189|220->189|221->190|221->190|221->190|221->190|222->191|222->191|222->191|222->191|223->192|223->192|223->192|223->192|224->193|224->193|224->193|224->193|225->194|225->194|225->194|225->194|226->195|226->195|226->195|226->195|227->196|227->196|227->196|227->196|228->197|228->197|228->197|228->197|229->198|229->198|229->198|229->198|230->199|230->199|230->199|230->199|231->200|231->200|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|233->202|233->202|234->203|234->203|234->203|234->203|235->204|235->204|235->204|235->204|236->205|236->205|236->205|236->205|237->206|237->206|237->206|237->206|238->207|238->207|238->207|238->207|239->208|239->208|239->208|239->208|240->209|240->209|240->209|240->209|241->210|241->210|241->210|241->210|242->211|242->211|242->211|242->211|243->212|243->212|243->212|243->212|255->224|255->224|255->224|257->226|257->226|257->226|265->234|265->234|265->234|265->234|266->235|266->235|266->235|275->244|275->244|275->244|283->252|283->252|283->252|285->254|285->254|285->254|293->262|293->262|293->262|293->262|294->263|294->263|294->263|303->272|303->272|303->272|310->279|310->279|310->279|311->280|312->281|312->281|312->281|312->281|312->281|312->281|312->281|312->281|313->282|313->282|313->282|315->284|316->285|317->286|317->286|317->286|322->291|322->291|322->291|328->297|328->297|328->297|329->298|329->298|329->298|329->298|330->299|331->300|334->303|334->303|340->309|340->309|340->309|344->313|344->313|344->313
                  -- GENERATED --
              */
          
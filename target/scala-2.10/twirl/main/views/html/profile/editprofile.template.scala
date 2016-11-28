
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
				<a href="/user" class="buttonCancel">"""),_display_(/*303.43*/Messages("goback")),format.raw/*303.61*/("""</a>
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
                  DATE: Mon Nov 28 14:01:04 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/editprofile.scala.html
                  HASH: c4862460139a171fa3908c00710b05f548a78313
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1295->230|1323->231|1356->238|1439->294|1467->295|1498->300|1599->374|1627->375|1659->381|1708->404|1735->405|1775->418|1803->419|1835->424|1863->425|2503->1038|2519->1045|2545->1050|2860->1337|2877->1344|2907->1352|3070->1487|3087->1494|3118->1503|3266->1623|3283->1630|3310->1635|3501->1798|3518->1805|3546->1811|3740->1977|3757->1984|3783->1988|4010->2189|4057->2227|4097->2229|4133->2238|4291->2366|4326->2374|4359->2379|4388->2380|4424->2389|4578->2516|4606->2517|4640->2524|4936->2793|4952->2800|4980->2807|5100->2900|5138->2929|5178->2931|5229->2951|5291->2986|5331->3017|5371->3019|5422->3039|5486->3076|5527->3108|5567->3110|5618->3130|5683->3168|5725->3201|5765->3203|5816->3223|5882->3262|5919->3290|5959->3292|6010->3312|6071->3346|6108->3374|6148->3376|6199->3396|6260->3430|6300->3461|6340->3463|6391->3483|6455->3520|6498->3554|6538->3556|6589->3576|6656->3616|6696->3647|6736->3649|6787->3669|6851->3706|6892->3738|6932->3740|6983->3760|7048->3798|7092->3833|7132->3835|7183->3855|7251->3896|7291->3927|7331->3929|7382->3949|7446->3986|7487->4018|7527->4020|7578->4040|7643->4078|7683->4109|7723->4111|7774->4131|7838->4168|7877->4198|7917->4200|7968->4220|8031->4256|8069->4285|8109->4287|8160->4307|8222->4342|8261->4372|8301->4374|8352->4394|8415->4430|8455->4461|8495->4463|8546->4483|8610->4520|8650->4551|8690->4553|8741->4573|8805->4610|8843->4639|8883->4641|8934->4661|8996->4696|9035->4726|9075->4728|9126->4748|9189->4784|9229->4815|9269->4817|9320->4837|9384->4874|9424->4905|9464->4907|9515->4927|9579->4964|9620->4996|9660->4998|9711->5018|9776->5056|9815->5086|9855->5088|9906->5108|9969->5144|10007->5173|10047->5175|10098->5195|10160->5230|10201->5262|10241->5264|10292->5284|10357->5322|10398->5354|10438->5356|10489->5376|10554->5414|10595->5446|10635->5448|10686->5468|10751->5506|10791->5537|10831->5539|10882->5559|10946->5596|10988->5629|11028->5631|11079->5651|11145->5690|11183->5719|11223->5721|11274->5741|11336->5776|11379->5810|11419->5812|11470->5832|11537->5872|11574->5900|11614->5902|11665->5922|11726->5956|11767->5988|11807->5990|11858->6010|11923->6048|11963->6079|12003->6081|12054->6101|12118->6138|12161->6172|12201->6174|12252->6194|12319->6234|12359->6265|12399->6267|12450->6287|12514->6324|12552->6353|12592->6355|12643->6375|12705->6410|12742->6438|12782->6440|12833->6460|12894->6494|12934->6525|12974->6527|13025->6547|13089->6584|13128->6614|13168->6616|13219->6636|13282->6672|13324->6705|13364->6707|13415->6727|13481->6766|13522->6798|13562->6800|13613->6820|13678->6858|13717->6888|13757->6890|13808->6910|13871->6946|13909->6975|13949->6977|14000->6997|14062->7032|14100->7061|14140->7063|14191->7083|14253->7118|14290->7146|14330->7148|14381->7168|14442->7202|14483->7234|14523->7236|14574->7256|14639->7294|14678->7324|14718->7326|14769->7346|14833->7382|14874->7413|14915->7415|14967->7435|15032->7472|15072->7502|15113->7504|15165->7524|15229->7560|15273->7594|15314->7596|15366->7616|15434->7656|15478->7690|15519->7692|15571->7712|15639->7752|15678->7781|15719->7783|15771->7803|15834->7838|15876->7870|15917->7872|15969->7892|16035->7930|16077->7962|16118->7964|16170->7984|16236->8022|16280->8056|16321->8058|16373->8078|16441->8118|16483->8150|16524->8152|16576->8172|16642->8210|16682->8240|16723->8242|16775->8262|16839->8298|16879->8328|16920->8330|16972->8350|17036->8386|17080->8420|17121->8422|17173->8442|17241->8482|17279->8510|17320->8512|17372->8532|17434->8566|17472->8594|17513->8596|17565->8616|18002->9025|18019->9032|18050->9041|18369->9331|18387->9338|18422->9350|18590->9489|18608->9496|18644->9509|18797->9633|18815->9640|18847->9649|19043->9816|19061->9823|19094->9833|19293->10003|19311->10010|19342->10018|19496->10145|19548->10187|19589->10189|19626->10198|19785->10326|19821->10334|19855->10339|19885->10340|19922->10349|20077->10476|20106->10477|20141->10484|20442->10757|20459->10764|20492->10775|20622->10877|20661->10906|20702->10908|20754->10928|20817->10963|20858->10994|20899->10996|20951->11016|21016->11053|21058->11085|21099->11087|21151->11107|21217->11145|21260->11178|21301->11180|21353->11200|21420->11239|21458->11267|21499->11269|21551->11289|21613->11323|21651->11351|21692->11353|21744->11373|21806->11407|21847->11438|21888->11440|21940->11460|22005->11497|22049->11531|22090->11533|22142->11553|22210->11593|22251->11624|22292->11626|22344->11646|22409->11683|22451->11715|22492->11717|22544->11737|22610->11775|22655->11810|22696->11812|22748->11832|22817->11873|22858->11904|22899->11906|22951->11926|23016->11963|23058->11995|23099->11997|23151->12017|23217->12055|23258->12086|23299->12088|23351->12108|23416->12145|23456->12175|23497->12177|23549->12197|23613->12233|23652->12262|23693->12264|23745->12284|23808->12319|23848->12349|23889->12351|23941->12371|24005->12407|24046->12438|24087->12440|24139->12460|24204->12497|24245->12528|24286->12530|24338->12550|24403->12587|24442->12616|24483->12618|24535->12638|24598->12673|24638->12703|24679->12705|24731->12725|24795->12761|24836->12792|24877->12794|24929->12814|24994->12851|25035->12882|25076->12884|25128->12904|25193->12941|25235->12973|25276->12975|25328->12995|25394->13033|25434->13063|25475->13065|25527->13085|25591->13121|25630->13150|25671->13152|25723->13172|25786->13207|25828->13239|25869->13241|25921->13261|25987->13299|26029->13331|26070->13333|26122->13353|26188->13391|26230->13423|26271->13425|26323->13445|26389->13483|26430->13514|26471->13516|26523->13536|26588->13573|26631->13606|26672->13608|26724->13628|26791->13667|26830->13696|26871->13698|26923->13718|26986->13753|27030->13787|27071->13789|27123->13809|27191->13849|27229->13877|27270->13879|27322->13899|27384->13933|27426->13965|27467->13967|27519->13987|27585->14025|27626->14056|27667->14058|27719->14078|27784->14115|27828->14149|27869->14151|27921->14171|27989->14211|28030->14242|28071->14244|28123->14264|28188->14301|28227->14330|28268->14332|28320->14352|28383->14387|28421->14415|28462->14417|28514->14437|28576->14471|28617->14502|28658->14504|28710->14524|28775->14561|28815->14591|28856->14593|28908->14613|28972->14649|29015->14682|29056->14684|29108->14704|29175->14743|29217->14775|29258->14777|29310->14797|29376->14835|29416->14865|29457->14867|29509->14887|29573->14923|29612->14952|29653->14954|29705->14974|29768->15009|29807->15038|29848->15040|29900->15060|29963->15095|30001->15123|30042->15125|30094->15145|30156->15179|30198->15211|30239->15213|30291->15233|30357->15271|30397->15301|30438->15303|30490->15323|30554->15359|30595->15390|30636->15392|30688->15412|30753->15449|30793->15479|30834->15481|30886->15501|30950->15537|30994->15571|31035->15573|31087->15593|31155->15633|31199->15667|31240->15669|31292->15689|31360->15729|31399->15758|31440->15760|31492->15780|31555->15815|31597->15847|31638->15849|31690->15869|31756->15907|31798->15939|31839->15941|31891->15961|31957->15999|32001->16033|32042->16035|32094->16055|32162->16095|32204->16127|32245->16129|32297->16149|32363->16187|32403->16217|32444->16219|32496->16239|32560->16275|32600->16305|32641->16307|32693->16327|32757->16363|32801->16397|32842->16399|32894->16419|32962->16459|33000->16487|33041->16489|33093->16509|33155->16543|33193->16571|33234->16573|33286->16593|33736->17015|33753->17022|33792->17039|34005->17224|34022->17231|34061->17247|34396->17553|34426->17554|34457->17556|34487->17557|34617->17659|34634->17666|34669->17679|35044->18026|35061->18033|35096->18046|35463->18385|35480->18392|35521->18411|35736->18598|35753->18605|35794->18623|36126->18926|36156->18927|36187->18929|36217->18930|36349->19034|36366->19041|36403->19056|36777->19402|36794->19409|36831->19424|37085->19651|37130->19679|37171->19681|37206->19688|37272->19726|37324->19768|37365->19770|37405->19778|37435->19779|37537->19852|37555->19859|37583->19864|37627->19880|37644->19887|37671->19892|37752->19942|37786->19948|37885->20019|37902->20026|37933->20035|38218->20292|38235->20299|38271->20313|38445->20460|38486->20491|38527->20493|38561->20499|38648->20558|38669->20569|38711->20589|38756->20603|38789->20608|38936->20727|38976->20745
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|79->48|79->48|79->48|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|156->125|156->125|156->125|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|160->129|162->131|162->131|162->131|163->132|165->134|166->135|166->135|166->135|167->136|169->138|169->138|170->139|178->147|178->147|178->147|180->149|180->149|180->149|180->149|181->150|181->150|181->150|181->150|182->151|182->151|182->151|182->151|183->152|183->152|183->152|183->152|184->153|184->153|184->153|184->153|185->154|185->154|185->154|185->154|186->155|186->155|186->155|186->155|187->156|187->156|187->156|187->156|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|190->159|190->159|190->159|190->159|191->160|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|193->162|193->162|193->162|194->163|194->163|194->163|194->163|195->164|195->164|195->164|195->164|196->165|196->165|196->165|196->165|197->166|197->166|197->166|197->166|198->167|198->167|198->167|198->167|199->168|199->168|199->168|199->168|200->169|200->169|200->169|200->169|201->170|201->170|201->170|201->170|202->171|202->171|202->171|202->171|203->172|203->172|203->172|203->172|204->173|204->173|204->173|204->173|205->174|205->174|205->174|205->174|206->175|206->175|206->175|206->175|207->176|207->176|207->176|207->176|208->177|208->177|208->177|208->177|209->178|209->178|209->178|209->178|210->179|210->179|210->179|210->179|211->180|211->180|211->180|211->180|212->181|212->181|212->181|212->181|213->182|213->182|213->182|213->182|214->183|214->183|214->183|214->183|215->184|215->184|215->184|215->184|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|218->187|218->187|218->187|218->187|219->188|219->188|219->188|219->188|220->189|220->189|220->189|220->189|221->190|221->190|221->190|221->190|222->191|222->191|222->191|222->191|223->192|223->192|223->192|223->192|224->193|224->193|224->193|224->193|225->194|225->194|225->194|225->194|226->195|226->195|226->195|226->195|227->196|227->196|227->196|227->196|228->197|228->197|228->197|228->197|229->198|229->198|229->198|229->198|230->199|230->199|230->199|230->199|231->200|231->200|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|233->202|233->202|234->203|234->203|234->203|234->203|235->204|235->204|235->204|235->204|236->205|236->205|236->205|236->205|237->206|237->206|237->206|237->206|238->207|238->207|238->207|238->207|239->208|239->208|239->208|239->208|240->209|240->209|240->209|240->209|241->210|241->210|241->210|241->210|242->211|242->211|242->211|242->211|243->212|243->212|243->212|243->212|255->224|255->224|255->224|257->226|257->226|257->226|265->234|265->234|265->234|265->234|266->235|266->235|266->235|275->244|275->244|275->244|283->252|283->252|283->252|285->254|285->254|285->254|293->262|293->262|293->262|293->262|294->263|294->263|294->263|303->272|303->272|303->272|310->279|310->279|310->279|311->280|312->281|312->281|312->281|312->281|312->281|312->281|312->281|312->281|313->282|313->282|313->282|315->284|316->285|317->286|317->286|317->286|322->291|322->291|322->291|328->297|328->297|328->297|329->298|329->298|329->298|329->298|330->299|331->300|334->303|334->303
                  -- GENERATED --
              */
          
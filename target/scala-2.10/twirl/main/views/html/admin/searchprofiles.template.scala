
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchprofiles_Scope0 {
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

class searchprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Profile],java.util.List[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profilesList: java.util.List[Profile], servicesList: java.util.List[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableAll").tablesorter();
			$(".selectServices").change(function() """),format.raw/*11.43*/("""{"""),format.raw/*11.44*/("""
				"""),format.raw/*12.5*/("""getByServices();
			"""),format.raw/*13.4*/("""}"""),format.raw/*13.5*/(""");
			$(".selectCounty").change(function() """),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""
				"""),format.raw/*15.5*/("""getByCounty();
			"""),format.raw/*16.4*/("""}"""),format.raw/*16.5*/(""");
		"""),format.raw/*17.3*/("""}"""),format.raw/*17.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
		<h5>All Business Profiles:</h5>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectServices" name="selectServices" id="selectServices">
							<option selected="selected" value="" disabled="disabled">--- Filter By Service ---</option>
							<option value="All">All</option>
							"""),_display_(/*29.9*/for(service <- servicesList) yield /*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
								"""),format.raw/*30.9*/("""<option value=""""),_display_(/*30.25*/service/*30.32*/.name),format.raw/*30.37*/("""">"""),_display_(/*30.40*/service/*30.47*/.name),format.raw/*30.52*/("""</option>
							""")))}),format.raw/*31.9*/("""
						"""),format.raw/*32.7*/("""</select>
						<i></i><span class="iconPlacement"></span>
					</span>
				</div>
			</div>
		</div>
		<div class="searchProfileText"> - OR - </div>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectCounty" name="selectCounty" id="selectCounty">
							<option selected="selected" value="" disabled="disabled">--- Filter By County ---</option>
							<option value="All">All</option>
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
						<i></i><span class="iconPlacement"></span>
					</span>
				</div>
			</div>
		</div>
		<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr>
					<th>Business Name</th>
					<th>Contact</th>
					<th>Phone</th>
					<th>Services</th>
					<th>County</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*127.6*/for(profile <- profilesList) yield /*127.34*/ {_display_(Seq[Any](format.raw/*127.36*/("""
				"""),format.raw/*128.5*/("""<tr>
					<td><a href="/openprofile/"""),_display_(/*129.33*/profile/*129.40*/.name),format.raw/*129.45*/("""">"""),_display_(/*129.48*/profile/*129.55*/.name),format.raw/*129.60*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*130.33*/profile/*130.40*/.name),format.raw/*130.45*/("""">"""),_display_(/*130.48*/profile/*130.55*/.primaryNameFirst),format.raw/*130.72*/(""" """),_display_(/*130.74*/profile/*130.81*/.primaryNameLast),format.raw/*130.97*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*131.33*/profile/*131.40*/.name),format.raw/*131.45*/("""">"""),_display_(/*131.48*/profile/*131.55*/.primaryPhone),format.raw/*131.68*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*132.33*/profile/*132.40*/.name),format.raw/*132.45*/("""">"""),_display_(/*132.48*/profile/*132.55*/.services),format.raw/*132.64*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*133.33*/profile/*133.40*/.name),format.raw/*133.45*/("""">"""),_display_(/*133.48*/profile/*133.55*/.county),format.raw/*133.62*/("""</a></td>
				</tr>
				""")))}),format.raw/*135.6*/(""" 
			"""),format.raw/*136.4*/("""</tbody>
		</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>	
	</section>
""")))}))
      }
    }
  }

  def render(profilesList:java.util.List[Profile],servicesList:java.util.List[Service]): play.twirl.api.HtmlFormat.Appendable = apply(profilesList,servicesList)

  def f:((java.util.List[Profile],java.util.List[Service]) => play.twirl.api.HtmlFormat.Appendable) = (profilesList,servicesList) => apply(profilesList,servicesList)

  def ref: this.type = this

}


}

/**/
object searchprofiles extends searchprofiles_Scope0.searchprofiles
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 14:06:26 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchprofiles.scala.html
                  HASH: 885242ac0af620cd5ad0e43b5a051c244fca49a2
                  MATRIX: 810->1|983->79|1013->84|1031->94|1070->96|1101->101|1141->115|1155->121|1215->161|1292->212|1306->218|1371->263|1447->313|1461->319|1512->350|1643->454|1671->455|1703->460|1804->533|1833->534|1866->540|1914->561|1942->562|2014->606|2043->607|2076->613|2122->632|2150->633|2183->639|2211->640|2715->1118|2759->1146|2799->1148|2836->1158|2879->1174|2895->1181|2921->1186|2951->1189|2967->1196|2993->1201|3042->1220|3077->1228|7094->5218|7139->5246|7180->5248|7214->5254|7280->5292|7297->5299|7324->5304|7355->5307|7372->5314|7399->5319|7470->5362|7487->5369|7514->5374|7545->5377|7562->5384|7601->5401|7631->5403|7648->5410|7686->5426|7757->5469|7774->5476|7801->5481|7832->5484|7849->5491|7884->5504|7955->5547|7972->5554|7999->5559|8030->5562|8047->5569|8078->5578|8149->5621|8166->5628|8193->5633|8224->5636|8241->5643|8270->5650|8328->5677|8362->5683
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|47->16|47->16|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|158->127|158->127|158->127|159->128|160->129|160->129|160->129|160->129|160->129|160->129|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|162->131|162->131|162->131|162->131|162->131|162->131|163->132|163->132|163->132|163->132|163->132|163->132|164->133|164->133|164->133|164->133|164->133|164->133|166->135|167->136
                  -- GENERATED --
              */
          

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
		"""),format.raw/*14.3*/("""}"""),format.raw/*14.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
		<h5>All Business Profiles:</h5>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectServices" name="selectServices" id="selectServices">
							<option selected="selected" value="" disabled="disabled">--- Filter By Service Type ---</option>
							<option value="All">All</option>
							"""),_display_(/*26.9*/for(service <- servicesList) yield /*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""
								"""),format.raw/*27.9*/("""<option value=""""),_display_(/*27.25*/service/*27.32*/.name),format.raw/*27.37*/("""">"""),_display_(/*27.40*/service/*27.47*/.name),format.raw/*27.52*/("""</option>
							""")))}),format.raw/*28.9*/("""
						"""),format.raw/*29.7*/("""</select>
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
				"""),_display_(/*46.6*/for(profile <- profilesList) yield /*46.34*/ {_display_(Seq[Any](format.raw/*46.36*/("""
				"""),format.raw/*47.5*/("""<tr>
					<td><a href="/openprofile/"""),_display_(/*48.33*/profile/*48.40*/.name),format.raw/*48.45*/("""">"""),_display_(/*48.48*/profile/*48.55*/.name),format.raw/*48.60*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*49.33*/profile/*49.40*/.name),format.raw/*49.45*/("""">"""),_display_(/*49.48*/profile/*49.55*/.primaryNameFirst),format.raw/*49.72*/(""" """),_display_(/*49.74*/profile/*49.81*/.primaryNameLast),format.raw/*49.97*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*50.33*/profile/*50.40*/.name),format.raw/*50.45*/("""">"""),_display_(/*50.48*/profile/*50.55*/.primaryPhone),format.raw/*50.68*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*51.33*/profile/*51.40*/.name),format.raw/*51.45*/("""">"""),_display_(/*51.48*/profile/*51.55*/.services),format.raw/*51.64*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*52.33*/profile/*52.40*/.name),format.raw/*52.45*/("""">"""),_display_(/*52.48*/profile/*52.55*/.county),format.raw/*52.62*/("""</a></td>
				</tr>
				""")))}),format.raw/*54.6*/(""" 
			"""),format.raw/*55.4*/("""</tbody>
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
                  DATE: Wed Nov 30 12:40:42 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchprofiles.scala.html
                  HASH: aefa4e3bff73d33afa9ea5ace28f75b3b169ce49
                  MATRIX: 810->1|983->79|1013->84|1031->94|1070->96|1101->101|1141->115|1155->121|1215->161|1292->212|1306->218|1371->263|1447->313|1461->319|1512->350|1643->454|1671->455|1703->460|1804->533|1833->534|1866->540|1914->561|1942->562|1975->568|2003->569|2512->1052|2556->1080|2596->1082|2633->1092|2676->1108|2692->1115|2718->1120|2748->1123|2764->1130|2790->1135|2839->1154|2874->1162|3278->1540|3322->1568|3362->1570|3395->1576|3460->1614|3476->1621|3502->1626|3532->1629|3548->1636|3574->1641|3644->1684|3660->1691|3686->1696|3716->1699|3732->1706|3770->1723|3799->1725|3815->1732|3852->1748|3922->1791|3938->1798|3964->1803|3994->1806|4010->1813|4044->1826|4114->1869|4130->1876|4156->1881|4186->1884|4202->1891|4232->1900|4302->1943|4318->1950|4344->1955|4374->1958|4390->1965|4418->1972|4475->1999|4508->2005
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|77->46|77->46|77->46|78->47|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|85->54|86->55
                  -- GENERATED --
              */
          
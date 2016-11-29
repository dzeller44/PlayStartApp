
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
		<div class="element-select"><label class="title"></label><div class="item-cont"><div class="large"><span>
			<select class="selectServices" name="selectServices" id="selectServices">
				<option selected="selected" value="" disabled="disabled">--- Select service ---</option>
				<option value="All">All</option>
				"""),_display_(/*23.6*/for(service <- servicesList) yield /*23.34*/ {_display_(Seq[Any](format.raw/*23.36*/("""
					"""),format.raw/*24.6*/("""<option value=""""),_display_(/*24.22*/service/*24.29*/.name),format.raw/*24.34*/("""">"""),_display_(/*24.37*/service/*24.44*/.name),format.raw/*24.49*/("""</option>
				""")))}),format.raw/*25.6*/("""
			"""),format.raw/*26.4*/("""</select>
		<i></i><span class="icon-place"></span></span></div></div></div>
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
				"""),_display_(/*39.6*/for(profile <- profilesList) yield /*39.34*/ {_display_(Seq[Any](format.raw/*39.36*/("""
				"""),format.raw/*40.5*/("""<tr>
					<td><a href="/openprofile/"""),_display_(/*41.33*/profile/*41.40*/.name),format.raw/*41.45*/("""">"""),_display_(/*41.48*/profile/*41.55*/.name),format.raw/*41.60*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*42.33*/profile/*42.40*/.name),format.raw/*42.45*/("""">"""),_display_(/*42.48*/profile/*42.55*/.primaryNameFirst),format.raw/*42.72*/(""" """),_display_(/*42.74*/profile/*42.81*/.primaryNameLast),format.raw/*42.97*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*43.33*/profile/*43.40*/.name),format.raw/*43.45*/("""">"""),_display_(/*43.48*/profile/*43.55*/.primaryPhone),format.raw/*43.68*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*44.33*/profile/*44.40*/.name),format.raw/*44.45*/("""">"""),_display_(/*44.48*/profile/*44.55*/.services),format.raw/*44.64*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*45.33*/profile/*45.40*/.name),format.raw/*45.45*/("""">"""),_display_(/*45.48*/profile/*45.55*/.county),format.raw/*45.62*/("""</a></td>
				</tr>
				""")))}),format.raw/*47.6*/(""" 
			"""),format.raw/*48.4*/("""</tbody>
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
                  DATE: Mon Nov 28 14:02:34 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchprofiles.scala.html
                  HASH: be07279e12197f50f71f9f61d3743e9a7612d555
                  MATRIX: 810->1|983->79|1013->84|1031->94|1070->96|1101->101|1141->115|1155->121|1215->161|1292->212|1306->218|1371->263|1447->313|1461->319|1512->350|1643->454|1671->455|1703->460|1804->533|1833->534|1866->540|1914->561|1942->562|1975->568|2003->569|2493->1033|2537->1061|2577->1063|2611->1070|2654->1086|2670->1093|2696->1098|2726->1101|2742->1108|2768->1113|2814->1129|2846->1134|3221->1483|3265->1511|3305->1513|3338->1519|3403->1557|3419->1564|3445->1569|3475->1572|3491->1579|3517->1584|3587->1627|3603->1634|3629->1639|3659->1642|3675->1649|3713->1666|3742->1668|3758->1675|3795->1691|3865->1734|3881->1741|3907->1746|3937->1749|3953->1756|3987->1769|4057->1812|4073->1819|4099->1824|4129->1827|4145->1834|4175->1843|4245->1886|4261->1893|4287->1898|4317->1901|4333->1908|4361->1915|4418->1942|4451->1948
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|70->39|70->39|70->39|71->40|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|78->47|79->48
                  -- GENERATED --
              */
          
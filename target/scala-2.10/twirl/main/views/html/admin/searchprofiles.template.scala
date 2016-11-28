
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
					<th>Services</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*37.6*/for(profile <- profilesList) yield /*37.34*/ {_display_(Seq[Any](format.raw/*37.36*/("""
				"""),format.raw/*38.5*/("""<tr>
					<td><a href="/openprofile/"""),_display_(/*39.33*/profile/*39.40*/.name),format.raw/*39.45*/("""">"""),_display_(/*39.48*/profile/*39.55*/.name),format.raw/*39.60*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*40.33*/profile/*40.40*/.name),format.raw/*40.45*/("""">"""),_display_(/*40.48*/profile/*40.55*/.primaryNameFirst),format.raw/*40.72*/(""" """),_display_(/*40.74*/profile/*40.81*/.primaryNameLast),format.raw/*40.97*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*41.33*/profile/*41.40*/.name),format.raw/*41.45*/("""">"""),_display_(/*41.48*/profile/*41.55*/.services),format.raw/*41.64*/("""</a></td>
				</tr>
				""")))}),format.raw/*43.6*/(""" 
			"""),format.raw/*44.4*/("""</tbody>
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
                  DATE: Mon Nov 28 09:17:08 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchprofiles.scala.html
                  HASH: bfea47baecb30a983ca0b7f015d065ca98e4c1ae
                  MATRIX: 810->1|983->79|1013->84|1031->94|1070->96|1101->101|1141->115|1155->121|1215->161|1292->212|1306->218|1371->263|1447->313|1461->319|1512->350|1643->454|1671->455|1703->460|1804->533|1833->534|1866->540|1914->561|1942->562|1975->568|2003->569|2493->1033|2537->1061|2577->1063|2611->1070|2654->1086|2670->1093|2696->1098|2726->1101|2742->1108|2768->1113|2814->1129|2846->1134|3178->1440|3222->1468|3262->1470|3295->1476|3360->1514|3376->1521|3402->1526|3432->1529|3448->1536|3474->1541|3544->1584|3560->1591|3586->1596|3616->1599|3632->1606|3670->1623|3699->1625|3715->1632|3752->1648|3822->1691|3838->1698|3864->1703|3894->1706|3910->1713|3940->1722|3997->1749|4030->1755
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|74->43|75->44
                  -- GENERATED --
              */
          
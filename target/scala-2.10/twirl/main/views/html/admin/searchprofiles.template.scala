
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

class searchprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profilesList: java.util.List[Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableAll").tablesorter();
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
		<h5>All Users:</h5>
		<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr>
					<th>Business Name</th>
					<th>Contact</th>
					<th>Services</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*25.6*/for(profile <- profilesList) yield /*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
				"""),format.raw/*26.5*/("""<tr>
					<td><a href="/openprofile/"""),_display_(/*27.33*/profile/*27.40*/.name),format.raw/*27.45*/("""">"""),_display_(/*27.48*/profile/*27.55*/.name),format.raw/*27.60*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*28.33*/profile/*28.40*/.name),format.raw/*28.45*/("""">"""),_display_(/*28.48*/profile/*28.55*/.primaryNameFirst),format.raw/*28.72*/(""" """),_display_(/*28.74*/profile/*28.81*/.primaryNameLast),format.raw/*28.97*/("""</a></td>
					<td><a href="/openprofile/"""),_display_(/*29.33*/profile/*29.40*/.name),format.raw/*29.45*/("""">"""),_display_(/*29.48*/profile/*29.55*/.services),format.raw/*29.64*/("""</a></td>
				</tr>
				""")))}),format.raw/*31.6*/(""" 
			"""),format.raw/*32.4*/("""</tbody>
		</table>
		</div		
	</section>
""")))}))
      }
    }
  }

  def render(profilesList:java.util.List[Profile]): play.twirl.api.HtmlFormat.Appendable = apply(profilesList)

  def f:((java.util.List[Profile]) => play.twirl.api.HtmlFormat.Appendable) = (profilesList) => apply(profilesList)

  def ref: this.type = this

}


}

/**/
object searchprofiles extends searchprofiles_Scope0.searchprofiles
              /*
                  -- GENERATED --
                  DATE: Thu Nov 17 15:11:30 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchprofiles.scala.html
                  HASH: c6f3e032e00555e43aca0cba8adab6eda622ae49
                  MATRIX: 786->1|920->40|950->45|968->55|1007->57|1038->62|1078->76|1092->82|1152->122|1229->173|1243->179|1308->224|1384->274|1398->280|1449->311|1580->415|1608->416|1640->421|1700->454|1728->455|2109->810|2153->838|2193->840|2226->846|2291->884|2307->891|2333->896|2363->899|2379->906|2405->911|2475->954|2491->961|2517->966|2547->969|2563->976|2601->993|2630->995|2646->1002|2683->1018|2753->1061|2769->1068|2795->1073|2825->1076|2841->1083|2871->1092|2928->1119|2961->1125
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          
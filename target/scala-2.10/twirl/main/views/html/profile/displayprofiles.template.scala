
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object displayprofiles_Scope0 {
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

class displayprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Profile],play.twirl.api.HtmlFormat.Appendable] {

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
			<h5>All Business Profiles:</h5>
			<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>Business Name</th>
						<th>Contact</th>
						<th>Services</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*25.7*/for(profile <- profilesList) yield /*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
					"""),format.raw/*26.6*/("""<tr>
						<td><a href="/editprofile/"""),_display_(/*27.34*/profile/*27.41*/.name),format.raw/*27.46*/("""">"""),_display_(/*27.49*/profile/*27.56*/.name),format.raw/*27.61*/("""</a></td>
						<td><a href="/editprofile/"""),_display_(/*28.34*/profile/*28.41*/.name),format.raw/*28.46*/("""">"""),_display_(/*28.49*/profile/*28.56*/.primaryNameFirst),format.raw/*28.73*/(""" """),_display_(/*28.75*/profile/*28.82*/.primaryNameLast),format.raw/*28.98*/("""</a></td>
						<td><a href="/editprofile/"""),_display_(/*29.34*/profile/*29.41*/.name),format.raw/*29.46*/("""">"""),_display_(/*29.49*/profile/*29.56*/.services),format.raw/*29.65*/("""</a></td>
					</tr>
					""")))}),format.raw/*31.7*/(""" 
				"""),format.raw/*32.5*/("""</tbody>
			</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
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
object displayprofiles extends displayprofiles_Scope0.displayprofiles
              /*
                  -- GENERATED --
                  DATE: Tue Dec 13 09:47:49 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/displayprofiles.scala.html
                  HASH: cb1d8a4dcc0e56e9c5983451bf1aa36e8bc4d00e
                  MATRIX: 790->1|924->40|954->45|972->55|1011->57|1042->62|1082->76|1096->82|1156->122|1233->173|1247->179|1312->224|1388->274|1402->280|1453->311|1584->415|1612->416|1644->421|1704->454|1732->455|2136->833|2180->861|2220->863|2254->870|2320->909|2336->916|2362->921|2392->924|2408->931|2434->936|2505->980|2521->987|2547->992|2577->995|2593->1002|2631->1019|2660->1021|2676->1028|2713->1044|2784->1088|2800->1095|2826->1100|2856->1103|2872->1110|2902->1119|2961->1148|2995->1155
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          
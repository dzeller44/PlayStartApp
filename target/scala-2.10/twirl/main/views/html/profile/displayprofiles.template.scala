
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
					<td><a href="/editprofile/"""),_display_(/*27.33*/profile/*27.40*/.name),format.raw/*27.45*/("""">"""),_display_(/*27.48*/profile/*27.55*/.name),format.raw/*27.60*/("""</a></td>
					<td><a href="/editprofile/"""),_display_(/*28.33*/profile/*28.40*/.name),format.raw/*28.45*/("""">"""),_display_(/*28.48*/profile/*28.55*/.primaryNameFirst),format.raw/*28.72*/(""" """),_display_(/*28.74*/profile/*28.81*/.primaryNameLast),format.raw/*28.97*/("""</a></td>
					<td><a href="/editprofile/"""),_display_(/*29.33*/profile/*29.40*/.name),format.raw/*29.45*/("""">"""),_display_(/*29.48*/profile/*29.55*/.services),format.raw/*29.64*/("""</a></td>
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
object displayprofiles extends displayprofiles_Scope0.displayprofiles
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 14:50:55 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/displayprofiles.scala.html
                  HASH: 4186c89bbabcb9d2e79a44857eb8afb7d27e93f5
                  MATRIX: 790->1|924->40|954->45|972->55|1011->57|1042->62|1082->76|1096->82|1156->122|1233->173|1247->179|1312->224|1388->274|1402->280|1453->311|1584->415|1612->416|1644->421|1704->454|1732->455|2113->810|2157->838|2197->840|2230->846|2295->884|2311->891|2337->896|2367->899|2383->906|2409->911|2479->954|2495->961|2521->966|2551->969|2567->976|2605->993|2634->995|2650->1002|2687->1018|2757->1061|2773->1068|2799->1073|2829->1076|2845->1083|2875->1092|2932->1119|2965->1125
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          
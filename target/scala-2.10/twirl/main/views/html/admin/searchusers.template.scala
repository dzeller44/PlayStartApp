
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchusers_Scope0 {
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

class searchusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Login],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login], userList: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableEM").tablesorter();
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
		$(document).ready(function() """),format.raw/*12.32*/("""{"""),format.raw/*12.33*/("""
			"""),format.raw/*13.4*/("""$("#tableAll").tablesorter();
		"""),format.raw/*14.3*/("""}"""),format.raw/*14.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>Emergency Managers Needing Approval:</h5>
			<table id="tableEM" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>User Name</th>
						<th>Email</th>
						<th>Role</th>
						<th>Approved?</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*29.7*/for(user <- userList
					if user.approved == "N") yield /*30.30*/{_display_(Seq[Any](format.raw/*30.31*/("""
					"""),format.raw/*31.6*/("""<tr>
						<td><a href="/finduserurl?email="""),_display_(/*32.40*/user/*32.44*/.getEmail()),format.raw/*32.55*/("""">"""),_display_(/*32.58*/user/*32.62*/.fullname),format.raw/*32.71*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*33.40*/user/*33.44*/.getEmail()),format.raw/*33.55*/("""">"""),_display_(/*33.58*/user/*33.62*/.getEmail()),format.raw/*33.73*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*34.40*/user/*34.44*/.getEmail()),format.raw/*34.55*/("""">"""),_display_(/*34.58*/user/*34.62*/.getRoleName(user.role).capitalize),format.raw/*34.96*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*35.40*/user/*35.44*/.getEmail()),format.raw/*35.55*/("""">"""),_display_(/*35.58*/user/*35.62*/.approved),format.raw/*35.71*/("""</a></td>
					</tr>
					""")))}),format.raw/*37.7*/("""
				"""),format.raw/*38.5*/("""</tbody>
			</table>
		</div>
		<div><a href="javascript:openSave()">Open Dialog</a></div>
		<div><a href="/exportusers/EMNeedApproval">Export This Data</a></div>
		<div class="table-responsive">
			<h5>All Users:</h5>
			<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>User Name</th>
						<th>Email</th>
						<th>Role</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*54.7*/for(user <- userList) yield /*54.28*/ {_display_(Seq[Any](format.raw/*54.30*/("""
					"""),format.raw/*55.6*/("""<tr>
						<td><a href="/finduserurl?email="""),_display_(/*56.40*/user/*56.44*/.getEmail()),format.raw/*56.55*/("""">"""),_display_(/*56.58*/user/*56.62*/.fullname),format.raw/*56.71*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*57.40*/user/*57.44*/.getEmail()),format.raw/*57.55*/("""">"""),_display_(/*57.58*/user/*57.62*/.getEmail()),format.raw/*57.73*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*58.40*/user/*58.44*/.getEmail()),format.raw/*58.55*/("""">"""),_display_(/*58.58*/user/*58.62*/.getRoleName(user.role).capitalize),format.raw/*58.96*/("""</a></td>
					</tr>
					""")))}),format.raw/*60.7*/(""" 
				"""),format.raw/*61.5*/("""</tbody>
			</table>
		</div>
		<div><a href="/exportusers/All">Export This Data</a></div>
	</section>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Application.Login],userList:java.util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,userList)

  def f:((Form[Application.Login],java.util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,userList) => apply(loginForm,userList)

  def ref: this.type = this

}


}

/**/
object searchusers extends searchusers_Scope0.searchusers
              /*
                  -- GENERATED --
                  DATE: Thu Nov 17 15:11:30 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/searchusers.scala.html
                  HASH: 1d7be93fdba941de0cc9b3cb834a3d8661fdd1ff
                  MATRIX: 801->1|964->69|994->74|1012->84|1051->86|1082->91|1122->105|1136->111|1196->151|1273->202|1287->208|1352->253|1428->303|1442->309|1493->340|1624->444|1652->445|1684->450|1743->482|1771->483|1834->518|1863->519|1895->524|1955->557|1983->558|2416->965|2483->1016|2522->1017|2556->1024|2628->1069|2641->1073|2673->1084|2703->1087|2716->1091|2746->1100|2823->1150|2836->1154|2868->1165|2898->1168|2911->1172|2943->1183|3020->1233|3033->1237|3065->1248|3095->1251|3108->1255|3163->1289|3240->1339|3253->1343|3285->1354|3315->1357|3328->1361|3358->1370|3417->1399|3450->1405|3929->1858|3966->1879|4006->1881|4040->1888|4112->1933|4125->1937|4157->1948|4187->1951|4200->1955|4230->1964|4307->2014|4320->2018|4352->2029|4382->2032|4395->2036|4427->2047|4504->2097|4517->2101|4549->2112|4579->2115|4592->2119|4647->2153|4706->2182|4740->2189
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|43->12|44->13|45->14|45->14|60->29|61->30|61->30|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|68->37|69->38|85->54|85->54|85->54|86->55|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|91->60|92->61
                  -- GENERATED --
              */
          
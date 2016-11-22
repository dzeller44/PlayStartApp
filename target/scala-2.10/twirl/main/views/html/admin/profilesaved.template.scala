
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profilesaved_Scope0 {
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

class profilesaved extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userRole: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

 """),format.raw/*5.2*/("""<section id="profileCreated">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px">
		<div class="title">
			<h2>Success</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*13.56*/Messages("profile.save")),format.raw/*13.80*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" onclick="window.location.href='/"""),_display_(/*16.58*/userRole),format.raw/*16.66*/("""'" value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>
""")))}))
      }
    }
  }

  def render(userRole:String): play.twirl.api.HtmlFormat.Appendable = apply(userRole)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userRole) => apply(userRole)

  def ref: this.type = this

}


}

/**/
object profilesaved extends profilesaved_Scope0.profilesaved
              /*
                  -- GENERATED --
                  DATE: Tue Nov 22 09:45:41 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/profilesaved.scala.html
                  HASH: e333807fb05a6eca31a6f0da496379de71534b77
                  MATRIX: 765->1|878->19|908->24|921->30|960->32|991->37|1429->448|1474->472|1602->573|1631->581
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|44->13|44->13|47->16|47->16
                  -- GENERATED --
              */
          
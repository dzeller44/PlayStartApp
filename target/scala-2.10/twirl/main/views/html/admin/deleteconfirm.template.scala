
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deleteconfirm_Scope0 {
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

class deleteconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userEmail: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="deleteUserConfirm">
	<!-- Start Formoid form-->
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Delete User</h2>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="Enter your email..." value="""),_display_(/*17.47*/userEmail),format.raw/*17.56*/(""" """),format.raw/*17.57*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>The User Account for """),_display_(/*21.77*/userEmail),format.raw/*21.86*/(""" """),format.raw/*21.87*/("""will be deleted.  Please click Delete below to continue or Cancel to stop this process.</label>
		</div>
		<div class="submit">
			<input type="submit" value="Delete" />
			<a href="/admin" class="buttonCancel">"""),_display_(/*25.43*/Messages("goback")),format.raw/*25.61*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(userEmail:String): play.twirl.api.HtmlFormat.Appendable = apply(userEmail)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userEmail) => apply(userEmail)

  def ref: this.type = this

}


}

/**/
object deleteconfirm extends deleteconfirm_Scope0.deleteconfirm
              /*
                  -- GENERATED --
                  DATE: Fri Dec 02 15:33:11 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/deleteconfirm.scala.html
                  HASH: 8bc5aa9b13cf94bdf241428747df24605b0dfe09
                  MATRIX: 767->1|881->20|911->25|929->35|968->37|998->41|1629->645|1659->654|1688->655|1879->819|1909->828|1938->829|2181->1045|2220->1063|2366->1179
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|48->17|48->17|48->17|52->21|52->21|52->21|56->25|56->25|64->33
                  -- GENERATED --
              */
          
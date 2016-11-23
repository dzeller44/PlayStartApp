
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deleteprofconfirm_Scope0 {
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

class deleteprofconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="deleteProfileConfirm">
	<!-- Start Formoid form-->
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Delete User</h2>
		</div>
		<div class="element-input">
			<label class="title"><span></span>Business
			Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="name" required="required"
					placeholder="Business Name..." value="""),_display_(/*18.44*/profileName),format.raw/*18.55*/(""" """),format.raw/*18.56*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>The Business Profile for """),_display_(/*22.81*/profileName),format.raw/*22.92*/(""" """),format.raw/*22.93*/("""will be deleted.  Please click Delete below to continue or Cancel to stop this process.</label>
		</div>
		<div class="submit">
			<input type="submit" value="Delete" />
			<a href="/admin" class="buttonCancel">"""),_display_(/*26.43*/Messages("goback")),format.raw/*26.61*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(profileName:String): play.twirl.api.HtmlFormat.Appendable = apply(profileName)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (profileName) => apply(profileName)

  def ref: this.type = this

}


}

/**/
object deleteprofconfirm extends deleteprofconfirm_Scope0.deleteprofconfirm
              /*
                  -- GENERATED --
                  DATE: Wed Nov 23 10:25:33 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/deleteprofconfirm.scala.html
                  HASH: 4cfc21205109a2fe22cb43a2aeeb2a1956bd429a
                  MATRIX: 775->1|891->22|921->27|939->37|978->39|1008->43|1648->656|1680->667|1709->668|1904->836|1936->847|1965->848|2208->1064|2247->1082|2393->1198
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|49->18|49->18|49->18|53->22|53->22|53->22|57->26|57->26|65->34
                  -- GENERATED --
              */
          
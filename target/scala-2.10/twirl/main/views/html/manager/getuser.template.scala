
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object getuser_Scope0 {
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

class getuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.FindUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findUserForm: Form[Application.FindUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="getUser">
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Find User</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="text" name="email" required="required"
					placeholder="Enter the user's email..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
		    """),_display_(/*20.8*/if(findUserForm.hasGlobalErrors)/*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""
        		"""),format.raw/*21.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*22.16*/findUserForm/*22.28*/.globalError.message),format.raw/*22.48*/("""
        		"""),format.raw/*23.11*/("""</span>
   			""")))}),format.raw/*24.8*/("""
		"""),format.raw/*25.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Find" />
			<a href="/" class="buttonCancel">"""),_display_(/*28.38*/Messages("goback")),format.raw/*28.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>

""")))}))
      }
    }
  }

  def render(findUserForm:Form[Application.FindUser]): play.twirl.api.HtmlFormat.Appendable = apply(findUserForm)

  def f:((Form[Application.FindUser]) => play.twirl.api.HtmlFormat.Appendable) = (findUserForm) => apply(findUserForm)

  def ref: this.type = this

}


}

/**/
object getuser extends getuser_Scope0.getuser
              /*
                  -- GENERATED --
                  DATE: Mon Oct 31 14:02:58 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/manager/getuser.scala.html
                  HASH: 98f13714c060c8ae58a3692b8cd78cc225676d87
                  MATRIX: 777->1|914->43|942->46|960->56|999->58|1027->60|1697->704|1738->736|1778->738|1817->749|1918->823|1939->835|1980->855|2019->866|2064->881|2094->884|2228->991|2267->1009
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|59->28|59->28
                  -- GENERATED --
              */
          
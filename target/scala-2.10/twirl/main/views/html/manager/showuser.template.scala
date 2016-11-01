
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showuser_Scope0 {
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

class showuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.FindUser],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findUserForm: Form[Application.FindUser], userEmail: String, userName: String, userRole: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.99*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>User Maintenance</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required" value="""),_display_(/*17.81*/userName),format.raw/*17.89*/("""
					"""),format.raw/*18.6*/("""placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" value="""),_display_(/*24.92*/userEmail),format.raw/*24.101*/("""
					"""),format.raw/*25.6*/("""placeholder="Enter your email..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-select">
			<label class="title"><span class="required">*</span>Account
			Role:</label>
			<div class="item-cont">
				<div class="large">
					<span>
						<select name="role" value="""),_display_(/*34.34*/userRole),format.raw/*34.42*/(""" """),format.raw/*34.43*/("""required="required">
						"""),_display_(/*35.8*/if(userRole == "user")/*35.30*/ {_display_(Seq[Any](format.raw/*35.32*/("""
							"""),format.raw/*36.8*/("""<option value="none">Select Role...</option>
							<option value="user" selected>Business User</option>
							<option value="manager">Emergency Manager</option>
						""")))}),format.raw/*39.8*/("""
						"""),format.raw/*40.7*/("""else """),format.raw/*40.12*/("""{"""),format.raw/*40.13*/("""
							"""),format.raw/*41.8*/("""<option value="none">Select Role...</option>
							<option value="user">Business User</option>
							<option value="manager" selected>Emergency Manager</option>
						"""),format.raw/*44.7*/("""}"""),format.raw/*44.8*/("""
						"""),format.raw/*45.7*/("""</select>
						<i></i><span class="icon-place"></span>
					</span>
				</div>
			</div>
		</div>
		<div class="element-input">
		    """),_display_(/*52.8*/if(findUserForm.hasGlobalErrors)/*52.40*/ {_display_(Seq[Any](format.raw/*52.42*/("""
        		"""),format.raw/*53.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*54.16*/findUserForm/*54.28*/.globalError.message),format.raw/*54.48*/("""
        		"""),format.raw/*55.11*/("""</span>
   			""")))}),format.raw/*56.8*/("""
		"""),format.raw/*57.3*/("""</div>
		<div class="submit">
			<a href="/updateuser" class="buttonCustom" style="color: #FFFFFF;">"""),_display_(/*59.72*/Messages("submit")),format.raw/*59.90*/("""</a>
			<a href="/" class="buttonCancel">"""),_display_(/*60.38*/Messages("goback")),format.raw/*60.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*68.2*/("""
"""))
      }
    }
  }

  def render(findUserForm:Form[Application.FindUser],userEmail:String,userName:String,userRole:String): play.twirl.api.HtmlFormat.Appendable = apply(findUserForm,userEmail,userName,userRole)

  def f:((Form[Application.FindUser],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (findUserForm,userEmail,userName,userRole) => apply(findUserForm,userEmail,userName,userRole)

  def ref: this.type = this

}


}

/**/
object showuser extends showuser_Scope0.showuser
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 12:30:14 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/manager/showuser.scala.html
                  HASH: ab5b2ec435f9b5fce70eb41f919cd607abd02cc9
                  MATRIX: 800->1|992->98|1020->101|1038->111|1077->113|1105->115|1692->675|1721->683|1754->689|2058->966|2089->975|2122->981|2444->1276|2473->1284|2502->1285|2556->1313|2587->1335|2627->1337|2662->1345|2862->1515|2896->1522|2929->1527|2958->1528|2993->1536|3189->1705|3217->1706|3251->1713|3413->1849|3454->1881|3494->1883|3533->1894|3634->1968|3655->1980|3696->2000|3735->2011|3780->2026|3810->2029|3938->2130|3977->2148|4046->2190|4085->2208|4223->2316
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|48->17|48->17|49->18|55->24|55->24|56->25|65->34|65->34|65->34|66->35|66->35|66->35|67->36|70->39|71->40|71->40|71->40|72->41|75->44|75->44|76->45|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|87->56|88->57|90->59|90->59|91->60|91->60|99->68
                  -- GENERATED --
              */
          
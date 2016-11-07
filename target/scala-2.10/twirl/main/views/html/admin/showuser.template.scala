
package views.html.admin

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
		
		<div class="element-checkbox">
			<div class="column column1">
				<label><input type="checkbox" name="approve[]"
					value="approve" /><span>Approve Emergency Manager Account</span></label>
			</div>
			<span class="clearfix"></span>
		</div>
		
		<div class="element-input">
		    """),_display_(/*61.8*/if(findUserForm.hasGlobalErrors)/*61.40*/ {_display_(Seq[Any](format.raw/*61.42*/("""
        		"""),format.raw/*62.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*63.16*/findUserForm/*63.28*/.globalError.message),format.raw/*63.48*/("""
        		"""),format.raw/*64.11*/("""</span>
   			""")))}),format.raw/*65.8*/("""
		"""),format.raw/*66.3*/("""</div>
		<div class="submit">
			<a href="/updateuser" class="buttonCustom" style="color: #FFFFFF;">"""),_display_(/*68.72*/Messages("submit")),format.raw/*68.90*/("""</a>
			<a href="/" class="buttonCancel">"""),_display_(/*69.38*/Messages("goback")),format.raw/*69.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*77.2*/("""
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
                  DATE: Mon Nov 07 11:00:36 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showuser.scala.html
                  HASH: 29e896291b56659ff9d85828ca0ac9d6f48c474b
                  MATRIX: 798->1|990->98|1020->103|1038->113|1077->115|1107->119|1706->691|1735->699|1769->706|2079->989|2110->998|2144->1005|2475->1309|2504->1317|2533->1318|2588->1347|2619->1369|2659->1371|2695->1380|2898->1553|2933->1561|2966->1566|2995->1567|3031->1576|3230->1748|3258->1749|3293->1757|3724->2162|3765->2194|3805->2196|3845->2208|3947->2283|3968->2295|4009->2315|4049->2327|4095->2343|4126->2347|4256->2450|4295->2468|4365->2511|4404->2529|4550->2645
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|48->17|48->17|49->18|55->24|55->24|56->25|65->34|65->34|65->34|66->35|66->35|66->35|67->36|70->39|71->40|71->40|71->40|72->41|75->44|75->44|76->45|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|96->65|97->66|99->68|99->68|100->69|100->69|108->77
                  -- GENERATED --
              */
          
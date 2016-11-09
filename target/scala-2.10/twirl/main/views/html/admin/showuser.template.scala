
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
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action=""""),_display_(/*9.26*/routes/*9.32*/.Application.updateUser()),format.raw/*9.57*/("""">
		<div class="title">
			<h2>User Maintenance</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required" 
					placeholder="Choose a user name..." value="""),_display_(/*18.49*/userName),format.raw/*18.57*/(""" """),format.raw/*18.58*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="Enter your email..." value="""),_display_(/*25.47*/userEmail),format.raw/*25.56*/(""" """),format.raw/*25.57*/("""/><span class="icon-place"></span>
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
				<label><input type="checkbox" name="approved"
					value="approved" /><span>Approve Emergency Manager Account</span></label>
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
			<!--<a href="javascript:document.forms['showuser'].submit();" class="buttonCustom" style="color: #FFFFFF;">"""),_display_(/*68.112*/Messages("submit")),format.raw/*68.130*/("""</a> -->
			<input type="submit" value="""),_display_(/*69.32*/Messages("submit")),format.raw/*69.50*/(""" """),format.raw/*69.51*/("""/>
			<a href="/admin" class="buttonCancel">"""),_display_(/*70.43*/Messages("goback")),format.raw/*70.61*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*78.2*/("""
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
                  DATE: Wed Nov 09 11:12:27 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showuser.scala.html
                  HASH: 2828cc228162fa07be6c1de6854aa582f2745787
                  MATRIX: 798->1|990->98|1020->103|1038->113|1077->115|1107->119|1434->420|1448->426|1493->451|1849->780|1878->788|1907->789|2222->1077|2252->1086|2281->1087|2578->1357|2607->1365|2636->1366|2691->1395|2722->1417|2762->1419|2798->1428|3001->1601|3036->1609|3069->1614|3098->1615|3134->1624|3333->1796|3361->1797|3396->1805|3827->2210|3868->2242|3908->2244|3948->2256|4050->2331|4071->2343|4112->2363|4152->2375|4198->2391|4229->2395|4400->2538|4440->2556|4508->2597|4547->2615|4576->2616|4649->2662|4688->2680|4834->2796
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|49->18|49->18|49->18|56->25|56->25|56->25|65->34|65->34|65->34|66->35|66->35|66->35|67->36|70->39|71->40|71->40|71->40|72->41|75->44|75->44|76->45|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|96->65|97->66|99->68|99->68|100->69|100->69|100->69|101->70|101->70|109->78
                  -- GENERATED --
              */
          
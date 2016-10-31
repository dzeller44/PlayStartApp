
package views.html

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
			<input type="submit" value="Submit" />
			<a href="/updateuser" class="buttonCustom" style="color: #FFFFFF;">"""),_display_(/*60.72*/Messages("submit")),format.raw/*60.90*/("""</a>
			<a href="/" class="buttonCancel">"""),_display_(/*61.38*/Messages("goback")),format.raw/*61.56*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/auth"><div class="loginText">"""),_display_(/*68.43*/Messages("account.exists")),format.raw/*68.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*69.48*/Messages("forgot.password")),format.raw/*69.75*/("""</div></a>
	</div>

</section>

""")))}),format.raw/*74.2*/("""
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
                  DATE: Mon Oct 31 13:21:08 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/showuser.scala.html
                  HASH: 76331c9bbff53f9e9622f6af0e7369dc18b646b4
                  MATRIX: 792->1|984->98|1012->101|1030->111|1069->113|1097->115|1684->675|1713->683|1746->689|2050->966|2081->975|2114->981|2436->1276|2465->1284|2494->1285|2548->1313|2579->1335|2619->1337|2654->1345|2854->1515|2888->1522|2921->1527|2950->1528|2985->1536|3181->1705|3209->1706|3243->1713|3405->1849|3446->1881|3486->1883|3525->1894|3626->1968|3647->1980|3688->2000|3727->2011|3772->2026|3802->2029|3972->2172|4011->2190|4080->2232|4119->2250|4309->2413|4356->2439|4441->2497|4489->2524|4552->2557
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|48->17|48->17|49->18|55->24|55->24|56->25|65->34|65->34|65->34|66->35|66->35|66->35|67->36|70->39|71->40|71->40|71->40|72->41|75->44|75->44|76->45|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|87->56|88->57|91->60|91->60|92->61|92->61|99->68|99->68|100->69|100->69|105->74
                  -- GENERATED --
              */
          
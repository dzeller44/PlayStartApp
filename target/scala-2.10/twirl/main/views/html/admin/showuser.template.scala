
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
					placeholder="Choose a user name..." value=""""),_display_(/*18.50*/userName),format.raw/*18.58*/("""" /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="Enter your email..." value=""""),_display_(/*25.48*/userEmail),format.raw/*25.57*/("""" /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-select">
			<label class="title"><span class="required">*</span>Account
			Role:</label>
			<div class="item-cont">
				<div class="large">
					<span>
						<select name="role" value=""""),_display_(/*34.35*/userRole),format.raw/*34.43*/("""" required="required">
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
		<div class="element-radio">
 			<label class="title"><strong>Approve/Deny Emergency Manager</strong></label>
  			<div class="column column1">
 				<label>
 					<input type="radio" name="approved" value="Y" /><span>Approve</span>
 				</label>
 				<label>
 					<input
 					type="radio" name="approved" value="N" /><span>Deny</span>
 				</label>
 			</div>
  			<span class="clearfix"></span>
  		</div>	
		<div class="element-input">
		    """),_display_(/*65.8*/if(findUserForm.hasGlobalErrors)/*65.40*/ {_display_(Seq[Any](format.raw/*65.42*/("""
        		"""),format.raw/*66.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*67.16*/findUserForm/*67.28*/.globalError.message),format.raw/*67.48*/("""
        		"""),format.raw/*68.11*/("""</span>
   			""")))}),format.raw/*69.8*/("""
		"""),format.raw/*70.3*/("""</div>
		<div class="submit">
			<input type="submit" value="""),_display_(/*72.32*/Messages("submit")),format.raw/*72.50*/(""" """),format.raw/*72.51*/("""/>
			<a href="/admin" class="buttonCancel">"""),_display_(/*73.43*/Messages("goback")),format.raw/*73.61*/("""</a>
		</div>
		<div class="submit">
			<a href="javascript:deleteUser('"""),_display_(/*76.37*/userEmail),format.raw/*76.46*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*84.2*/("""
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
                  DATE: Thu Dec 15 12:05:33 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showuser.scala.html
                  HASH: 34dc2cb3fa7a2c5ede1f61b9fdf46cd97ff3fe8d
                  MATRIX: 798->1|990->98|1020->103|1038->113|1077->115|1107->119|1434->420|1448->426|1493->451|1850->781|1879->789|2197->1080|2227->1089|2527->1362|2556->1370|2613->1401|2644->1423|2684->1425|2720->1434|2923->1607|2958->1615|2991->1620|3020->1621|3056->1630|3255->1802|3283->1803|3318->1811|3911->2378|3952->2410|3992->2412|4032->2424|4134->2499|4155->2511|4196->2531|4236->2543|4282->2559|4313->2563|4403->2626|4442->2644|4471->2645|4544->2691|4583->2709|4686->2785|4716->2794|4917->2965
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|49->18|49->18|56->25|56->25|65->34|65->34|66->35|66->35|66->35|67->36|70->39|71->40|71->40|71->40|72->41|75->44|75->44|76->45|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|100->69|101->70|103->72|103->72|103->72|104->73|104->73|107->76|107->76|115->84
                  -- GENERATED --
              */
          
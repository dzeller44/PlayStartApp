
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




"""),_display_(/*6.2*/main(null)/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""

"""),format.raw/*8.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action=""""),_display_(/*12.26*/routes/*12.32*/.Application.updateUser()),format.raw/*12.57*/("""">
		<div class="title">
			<h2>User Maintenance</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required" 
					placeholder="Choose a user name..." value="""),_display_(/*21.49*/userName),format.raw/*21.57*/(""" """),format.raw/*21.58*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="Enter your email..." value="""),_display_(/*28.47*/userEmail),format.raw/*28.56*/(""" """),format.raw/*28.57*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-select">
			<label class="title"><span class="required">*</span>Account
			Role:</label>
			<div class="item-cont">
				<div class="large">
					<span>
						<select name="role" value="""),_display_(/*37.34*/userRole),format.raw/*37.42*/(""" """),format.raw/*37.43*/("""required="required">
						"""),_display_(/*38.8*/if(userRole == "user")/*38.30*/ {_display_(Seq[Any](format.raw/*38.32*/("""
							"""),format.raw/*39.8*/("""<option value="none">Select Role...</option>
							<option value="user" selected>Business User</option>
							<option value="manager">Emergency Manager</option>
						""")))}),format.raw/*42.8*/("""
						"""),format.raw/*43.7*/("""else """),format.raw/*43.12*/("""{"""),format.raw/*43.13*/("""
							"""),format.raw/*44.8*/("""<option value="none">Select Role...</option>
							<option value="user">Business User</option>
							<option value="manager" selected>Emergency Manager</option>
						"""),format.raw/*47.7*/("""}"""),format.raw/*47.8*/("""
						"""),format.raw/*48.7*/("""</select>
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
		    """),_display_(/*64.8*/if(findUserForm.hasGlobalErrors)/*64.40*/ {_display_(Seq[Any](format.raw/*64.42*/("""
        		"""),format.raw/*65.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*66.16*/findUserForm/*66.28*/.globalError.message),format.raw/*66.48*/("""
        		"""),format.raw/*67.11*/("""</span>
   			""")))}),format.raw/*68.8*/("""
		"""),format.raw/*69.3*/("""</div>
		<div class="submit">
			<!--<a href="javascript:document.forms['showuser'].submit();" class="buttonCustom" style="color: #FFFFFF;">"""),_display_(/*71.112*/Messages("submit")),format.raw/*71.130*/("""</a> -->
			<input type="submit" value="""),_display_(/*72.32*/Messages("submit")),format.raw/*72.50*/(""" """),format.raw/*72.51*/("""/>
			<a href="/admin" class="buttonCancel">"""),_display_(/*73.43*/Messages("goback")),format.raw/*73.61*/("""</a>
		</div>
		<div class="submit">
			<a href="javascript:deleteUser('"""),_display_(/*76.37*/userEmail),format.raw/*76.46*/("""')" class="buttonDelete">Delete</a>
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
                  DATE: Wed Nov 09 15:12:52 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/showuser.scala.html
                  HASH: 9708ccc0d876302d4797e6c66cfb82d65e614cb9
                  MATRIX: 798->1|990->98|1026->109|1044->119|1083->121|1113->125|1441->426|1456->432|1502->457|1858->786|1887->794|1916->795|2231->1083|2261->1092|2290->1093|2587->1363|2616->1371|2645->1372|2700->1401|2731->1423|2771->1425|2807->1434|3010->1607|3045->1615|3078->1620|3107->1621|3143->1630|3342->1802|3370->1803|3405->1811|3836->2216|3877->2248|3917->2250|3957->2262|4059->2337|4080->2349|4121->2369|4161->2381|4207->2397|4238->2401|4409->2544|4449->2562|4517->2603|4556->2621|4585->2622|4658->2668|4697->2686|4800->2762|4830->2771|5007->2918
                  LINES: 27->1|32->1|37->6|37->6|37->6|39->8|43->12|43->12|43->12|52->21|52->21|52->21|59->28|59->28|59->28|68->37|68->37|68->37|69->38|69->38|69->38|70->39|73->42|74->43|74->43|74->43|75->44|78->47|78->47|79->48|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|99->68|100->69|102->71|102->71|103->72|103->72|103->72|104->73|104->73|107->76|107->76|115->84
                  -- GENERATED --
              */
          
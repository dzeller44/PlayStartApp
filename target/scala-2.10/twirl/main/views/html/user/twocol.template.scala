
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twocol_Scope0 {
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

class twocol extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.ProfileRegister],java.util.List[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""		 
			"""),format.raw/*6.4*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*6.60*/("""{"""),format.raw/*6.61*/("""
				"""),format.raw/*7.5*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*7.79*/("""{"""),format.raw/*7.80*/("""
					"""),format.raw/*8.6*/("""return this.value;
				"""),format.raw/*9.5*/("""}"""),format.raw/*9.6*/(""").get());
			"""),format.raw/*10.4*/("""}"""),format.raw/*10.5*/(""");
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
	</script>
	<section id="profileMain">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 680px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Business Profile</h2>
			</div>
<div class="container">
<div class="row">
<div class="col-sm-6">
			<div class="element-input">
				<label class="title"><span class="required">*</span>Business
				Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="name" required="required"
						placeholder="Business Name..." /><span class="icon-place"></span>
				</div>
			</div>
	    </div>
    <div class="col-sm-6">		
			<div class="element-input">
				<label class="title"><span class="required">*</span>Billing Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="billname" required="required"
						placeholder="Billing Name..." /><span class="icon-place"></span>
				</div>
			</div>
	    </div>
  </div>
</div>		
			<div class="element-name">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*57.39*/("""{"""),format.raw/*57.40*/("""3,"""),format.raw/*57.42*/("""}"""),format.raw/*57.43*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" value=""
						required="required" placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-name">
				<label class="title"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*85.39*/("""{"""),format.raw/*85.40*/("""3,"""),format.raw/*85.42*/("""}"""),format.raw/*85.43*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" value=""
						required="required" placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-checkbox">
				<label class="title"><span class="required">*</span>Services Provided:</label>
				<div class="column column1">
					"""),_display_(/*102.7*/for(service <- servicesList) yield /*102.35*/ {_display_(Seq[Any](format.raw/*102.37*/("""
					    """),format.raw/*103.10*/("""<label><input type="checkbox" class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*103.113*/service/*103.120*/.name),format.raw/*103.125*/(""""><span>"""),_display_(/*103.134*/service/*103.141*/.name),format.raw/*103.146*/("""</span></label>
					""")))}),format.raw/*104.7*/("""
				"""),format.raw/*105.5*/("""</div>
				
				<input type="hidden" name="services" id="services">
	
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*119.6*/if(profileForm.hasGlobalErrors)/*119.37*/ {_display_(Seq[Any](format.raw/*119.39*/("""
					"""),format.raw/*120.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*120.65*/profileForm/*120.76*/.globalError.message),format.raw/*120.96*/("""</span>
				""")))}),format.raw/*121.6*/("""
			"""),format.raw/*122.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" /> <a href="/user"
					class="buttonCancel">"""),_display_(/*125.28*/Messages("goback")),format.raw/*125.46*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList)

  def f:((Form[Application.ProfileRegister],java.util.List[Service]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList) => apply(profileForm,servicesList)

  def ref: this.type = this

}


}

/**/
object twocol extends twocol_Scope0.twocol
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 10:54:10 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/user/twocol.scala.html
                  HASH: b9c80c2c309a67f26eea0df55ecb4e7f1c6dc1e5
                  MATRIX: 803->1|985->88|1015->93|1033->103|1072->105|1101->108|1191->171|1219->172|1253->180|1336->236|1364->237|1396->243|1497->317|1525->318|1558->325|1608->349|1635->350|1676->364|1704->365|1737->371|1765->372|3654->2233|3683->2234|3713->2236|3742->2237|5025->3492|5054->3493|5084->3495|5113->3496|5814->4170|5859->4198|5900->4200|5940->4211|6072->4314|6090->4321|6118->4326|6156->4335|6174->4342|6202->4347|6256->4370|6290->4376|6782->4841|6823->4872|6864->4874|6899->4881|6986->4940|7007->4951|7049->4971|7094->4985|7127->4990|7275->5110|7315->5128
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|88->57|88->57|88->57|88->57|116->85|116->85|116->85|116->85|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|134->103|135->104|136->105|150->119|150->119|150->119|151->120|151->120|151->120|151->120|152->121|153->122|156->125|156->125
                  -- GENERATED --
              */
          
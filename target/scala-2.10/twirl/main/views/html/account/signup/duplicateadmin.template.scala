
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object duplicateadmin_Scope0 {
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

class duplicateadmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""


	"""),_display_(/*4.3*/main()/*4.9*/ {_display_(Seq[Any](format.raw/*4.11*/("""
	
		"""),format.raw/*6.3*/("""<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post">
		<div class="title">
			<h2>Duplicate Email</h2>
		</div>
		<div class="element-input">
			<label class="title">Admin email: """),_display_(/*13.39*/email),format.raw/*13.44*/(""" """),format.raw/*13.45*/("""is already on file. <label><span><br /></span>

			<a href="/reset/ask">"""),_display_(/*15.26*/Messages("resetpassword")),format.raw/*15.51*/("""</div></a>
			<span><br /></span>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
	

	
	
	
	
	
	
	""")))}))
      }
    }
  }

  def render(email:String): play.twirl.api.HtmlFormat.Appendable = apply(email)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (email) => apply(email)

  def ref: this.type = this

}


}

/**/
object duplicateadmin extends duplicateadmin_Scope0.duplicateadmin
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 12:05:32 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/duplicateadmin.scala.html
                  HASH: 6016726239f2e222310193d9b0bb6077cd646a7a
                  MATRIX: 778->1|888->16|921->24|934->30|973->32|1006->39|1391->397|1417->402|1446->403|1548->478|1594->503
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|44->13|44->13|44->13|46->15|46->15
                  -- GENERATED --
              */
          

package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object duplicateuser_Scope0 {
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

class duplicateuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
			<label class="title">Your email: """),_display_(/*13.38*/email),format.raw/*13.43*/(""" """),format.raw/*13.44*/("""is already on file. If you believe that you have received this message in error
			please <b><a href="/contact">contact admin</a></b>.<label><span><br /></span>

			<a href="/reset/ask">"""),_display_(/*16.26*/Messages("forgot.password")),format.raw/*16.53*/("""</div></a>
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
object duplicateuser extends duplicateuser_Scope0.duplicateuser
              /*
                  -- GENERATED --
                  DATE: Wed Dec 07 08:53:23 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/duplicateuser.scala.html
                  HASH: a18600458c104ef176110db41ea79be4409be9bb
                  MATRIX: 776->1|886->16|919->24|932->30|971->32|1004->39|1388->396|1414->401|1443->402|1660->592|1708->619
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|44->13|44->13|44->13|47->16|47->16
                  -- GENERATED --
              */
          
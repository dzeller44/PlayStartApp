
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object created_Scope0 {
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

class created extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

 """),format.raw/*3.2*/("""<section id="confirmSignup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post">
		<div class="title">
			<h2>Success</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*12.56*/Messages("signup.msg.created")),format.raw/*12.86*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" a href=""""),_display_(/*15.34*/routes/*15.40*/.Application.index),format.raw/*15.58*/(""""
				value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object created extends created_Scope0.created
              /*
                  -- GENERATED --
                  DATE: Tue Oct 18 10:48:41 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/created.scala.html
                  HASH: 719a173265e7feabf4d78205069af6a40c666bee
                  MATRIX: 846->1|859->7|898->9|927->12|1372->430|1423->460|1524->534|1539->540|1578->558
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|46->15|46->15|46->15
                  -- GENERATED --
              */
          
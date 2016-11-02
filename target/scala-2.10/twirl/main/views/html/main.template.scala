
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Html,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""), isLoggedIn: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
		<title>CO-Assist | Colorado Department of Homeland Security Emergency Management</title>
  		<link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("img/favicon.ico")),format.raw/*8.90*/("""">
  	  	
  		<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,700,500,700italic,900,900italic' rel='stylesheet' type='text/css'>
		<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

		<link rel="stylesheet" href=""""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/app.css")),format.raw/*13.64*/("""">
		<link href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.at("css/bootstrap/bootstrap.min.css")),format.raw/*14.67*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*15.16*/routes/*15.22*/.Assets.at("css/flexslider.css")),format.raw/*15.54*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.at("css/prettyPhoto.css")),format.raw/*16.55*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*17.16*/routes/*17.22*/.Assets.at("css/animate.css")),format.raw/*17.51*/("""" rel="stylesheet" type="text/css" media="all" />
		<link href=""""),_display_(/*18.16*/routes/*18.22*/.Assets.at("css/owl.carousel.css")),format.raw/*18.56*/("""" rel="stylesheet">
		<link href=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("css/style.css")),format.raw/*19.49*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("css/formoid/formoid-solid-dark.css")),format.raw/*20.70*/("""" rel="stylesheet" type="text/css" />
         
	    <script data-main=""""),_display_(/*22.26*/routes/*22.32*/.Assets.at("js/main.js")),format.raw/*22.56*/("""" src=""""),_display_(/*22.64*/routes/*22.70*/.Assets.at("lib/requirejs/require.js")),format.raw/*22.108*/(""""></script>
	    <script src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.at("lib/angularjs/angular.js")),format.raw/*23.64*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*24.20*/routes/*24.26*/.Assets.at("js/jquery/jquery.min.js")),format.raw/*24.63*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*25.20*/routes/*25.26*/.Assets.at("js/bootstrap/bootstrap.js")),format.raw/*25.65*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(/*26.20*/routes/*26.26*/.Assets.at("js/password.js")),format.raw/*26.54*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.at("js/jquery/jquery.prettyPhoto.js")),format.raw/*27.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*28.17*/routes/*28.23*/.Assets.at("js/jquery/jquery.nicescroll.min.js")),format.raw/*28.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*29.17*/routes/*29.23*/.Assets.at("js/superfish.min.js")),format.raw/*29.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*30.17*/routes/*30.23*/.Assets.at("js/jquery/jquery.flexslider-min.js")),format.raw/*30.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("js/owl.carousel.js")),format.raw/*31.55*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("js/animate.js")),format.raw/*32.50*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("js/jquery/jquery.BlackAndWhite.js")),format.raw/*33.70*/(""""></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("js/myscript.js")),format.raw/*34.51*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*35.17*/routes/*35.23*/.Assets.at("js/global.js")),format.raw/*35.49*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*36.17*/routes/*36.23*/.Assets.at("js/password.js")),format.raw/*36.51*/("""" type="text/javascript"></script>
	    <script>
						//PrettyPhoto
						jQuery(document).ready(function() """),format.raw/*39.41*/("""{"""),format.raw/*39.42*/("""
							"""),format.raw/*40.8*/("""$("a[rel^='prettyPhoto']").prettyPhoto();
						"""),format.raw/*41.7*/("""}"""),format.raw/*41.8*/(""");

						//BlackAndWhite
						$(window).load(function() """),format.raw/*44.33*/("""{"""),format.raw/*44.34*/("""
							"""),format.raw/*45.8*/("""$('.client_img').BlackAndWhite("""),format.raw/*45.39*/("""{"""),format.raw/*45.40*/("""
								"""),format.raw/*46.9*/("""hoverEffect : true, // default true
								// set the path to BnWWorker.js for a superfast implementation
								webworkerPath : false,
								// for the images with a fluid width and height
								responsive : true,
								// to invert the hover effect
								invertHoverEffect : false,
								// this option works only on the modern browsers ( on IE lower than 9 it remains always 1)
								intensity : 1,
								speed : """),format.raw/*55.17*/("""{"""),format.raw/*55.18*/(""" """),format.raw/*55.19*/("""//this property could also be just speed: value for both fadeIn and fadeOut
									fadeIn : 300, // 200ms for fadeIn animations
									fadeOut : 300
								// 800ms for fadeOut animations
								"""),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""",
								onImageReady : function(img) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
									"""),format.raw/*61.10*/("""// this callback gets executed anytime an image is converted
								"""),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
							"""),format.raw/*63.8*/("""}"""),format.raw/*63.9*/(""");
						"""),format.raw/*64.7*/("""}"""),format.raw/*64.8*/(""");
					</script>   
					
					<script type="text/javascript">
						"""),_display_(/*68.8*/isLoggedIn),format.raw/*68.18*/(""" """),format.raw/*68.19*/("""= isLoggedIn();
					</script> 
    </head>
<body onload=""""),_display_(/*71.16*/isLoggedIn),format.raw/*71.26*/(""" """),format.raw/*71.27*/("""= isLoggedIn();">

	<!-- PRELOADER -->
	<img id="preloader" src=""""),_display_(/*74.28*/routes/*74.34*/.Assets.at("img/preloader.gif")),format.raw/*74.65*/("""" alt="" />
	<!-- //PRELOADER -->
	<div class="preloader_hide">

		<!-- PAGE -->
		<div id="page">


			<!-- HEADER -->
			<header>

				<!-- MENU BLOCK -->
				<div class="menu_block">

					<!-- CONTAINER -->
					<div class="container clearfix">

						<!-- LOGO -->
						<div class="logo pull-left">
							<a href="/"><img src=""""),_display_(/*93.31*/routes/*93.37*/.Assets.at("img/co/DHSEM_Logo_80px.png")),format.raw/*93.77*/(""""></a>
						</div>
						<!-- //LOGO -->

						<!-- MENU -->
						<div class="pull-right">
							<nav class="navmenu center">
								<ul>
									<li class="scroll_btn"><a href="/">Home</a></li>
									<li class="scroll_btn"><a href="/signup">Register</a></li>
									"""),_display_(/*103.11*/if(isLoggedIn == "true")/*103.35*/ {_display_(Seq[Any](format.raw/*103.37*/("""
										"""),format.raw/*104.11*/("""<li class="scroll_btn"><a href="/logout">Logout</a></li>
									""")))}/*105.12*/else/*105.17*/{_display_(Seq[Any](format.raw/*105.18*/("""
  										"""),format.raw/*106.13*/("""<li class="scroll_btn"><a href="/auth">Admin</a></li>
									""")))}),format.raw/*107.11*/("""
								"""),format.raw/*108.9*/("""</ul>
							</nav>
						</div>
						<!-- //MENU -->
					</div>
					<!-- //MENU BLOCK -->
				</div>
				<!-- //CONTAINER -->
			</header>
			<!-- //HEADER -->
			<!-- HOME -->
			<section id="home" class="padbot0">

				<div class="mainBlock">

					<!-- CONTAINER -->
					<div class="container" data-appear-top-offset="-200"
						data-animated="fadeInUp">

						<!-- CUSTOM TAB -->
						<div id="myTabContent" class="tab-content">
							<div class="tab-pane fade in active clearfix" id="tab1">
								<p class="title">
									<b>CO-Assist</b>
								</p>
								<span>The Colorado Department of Public Safety's Division
									of Homeland Security and Emergency Management collects and
									stores local business information for an emergency response to
									natural disasters in the state of Colorado. </span>
							</div>

						</div>
						<!-- //CONTAINER -->
					</div>
					<!-- //CLEAN CODE -->
				</div> <!-- //Main Block -->
			</section>
			<!-- //HOME -->


  			<!--  <div ng-view></div> -->
  			<!-- Used for padding and scrolling -->
			<section id="blankMain">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
  			<div>"""),_display_(/*154.12*/content),format.raw/*154.19*/("""</div>
  
  
  			<!-- Used for padding and scrolling -->
			<section id="blank1">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank2">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank3">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank4">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank5">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank6">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
  			<!-- FOOTER -->
			<footer>

				<!-- CONTAINER -->
				<div class="container">

					<!-- ROW -->
					<div class="row" data-appear-top-offset="-200">
						<div>
							<p>Division of Homeland Security and Emergency Management
								employees will build public trust and confidence through
								performance and partnerships. Employees will achieve this by
								demonstrating a commitment to excellence reflected in the
								services, skills, collaborations, timeliness and understanding
								we provide to those we support, and to those we garner support
								from.</p>
						</div>
						<div class="socialCenterAll">
							<ul class="social">
								<li><a href="http://www.dhsem.state.co.us/" target="_blank">DHSEM</a></li>
								<li><a href="https://facebook.com/COEmergency"
									target="_blank"><i class="fa fa-facebook"></i></a></li>
								<li><a
									href="https://www.google.com/maps/place/9195+E+Mineral+Ave,+Centennial,+CO+80112"
									target="_blank"><i class="map_show fa fa-map-marker"></i></a></li>
								<li><a href="https://www.colorado.gov/publicsafety"
									target="_blank">CDPS</a></li>
							</ul>
						</div>
					</div>
					<!-- //ROW -->
					<div class="row copyright">
						<div class="col-lg-12 text-center">
							<p>Colorado Division of Homeland Security and Emergency
								Management</p>
						</div>
						<div class="linkBack"><a href="https://icons8.com" target="_blank">Icon pack by Icons8</a>&nbsp;||&nbsp;<a href="http://formoid.com/" target="_blank">Forms by Formoid</a></div>
					</div>
					<!-- //ROW -->
				</div>
				<!-- //CONTAINER -->
			</footer>
			<!-- //FOOTER -->

		</div>
	</div>

    </body>
</html>
"""))
      }
    }
  }

  def render(user:User,scripts:Html,isLoggedIn:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts,isLoggedIn)(content)

  def f:((User,Html,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts,isLoggedIn) => (content) => apply(user,scripts,isLoggedIn)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 10:07:13 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/main.scala.html
                  HASH: de48fa404052a9dc1724bc8fa5d3b330415f9749
                  MATRIX: 758->1|938->86|966->88|1172->268|1186->274|1235->303|1590->631|1605->637|1651->662|1696->680|1711->686|1777->731|1857->784|1872->790|1925->822|2005->875|2020->881|2074->914|2154->967|2169->973|2219->1002|2311->1067|2326->1073|2381->1107|2443->1142|2458->1148|2506->1175|2586->1228|2601->1234|2670->1282|2770->1355|2785->1361|2830->1385|2865->1393|2880->1399|2940->1437|2998->1468|3013->1474|3072->1512|3153->1566|3168->1572|3226->1609|3307->1663|3322->1669|3382->1708|3463->1762|3478->1768|3527->1796|3605->1847|3620->1853|3686->1898|3764->1949|3779->1955|3848->2003|3926->2054|3941->2060|3995->2093|4073->2144|4088->2150|4157->2198|4235->2249|4250->2255|4303->2287|4381->2338|4396->2344|4444->2371|4522->2422|4537->2428|4605->2475|4660->2503|4675->2509|4724->2537|4802->2588|4817->2594|4864->2620|4942->2671|4957->2677|5006->2705|5143->2814|5172->2815|5207->2823|5282->2871|5310->2872|5396->2930|5425->2931|5460->2939|5519->2970|5548->2971|5584->2980|6044->3412|6073->3413|6102->3414|6330->3615|6359->3616|6426->3655|6455->3656|6493->3666|6589->3735|6618->3736|6653->3744|6681->3745|6717->3754|6745->3755|6842->3826|6873->3836|6902->3837|6988->3896|7019->3906|7048->3907|7141->3973|7156->3979|7208->4010|7570->4345|7585->4351|7646->4391|7953->4670|7987->4694|8028->4696|8068->4707|8155->4775|8169->4780|8209->4781|8251->4794|8347->4858|8384->4867|9641->6096|9670->6103
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|70->39|70->39|71->40|72->41|72->41|75->44|75->44|76->45|76->45|76->45|77->46|86->55|86->55|86->55|90->59|90->59|91->60|91->60|92->61|93->62|93->62|94->63|94->63|95->64|95->64|99->68|99->68|99->68|102->71|102->71|102->71|105->74|105->74|105->74|124->93|124->93|124->93|134->103|134->103|134->103|135->104|136->105|136->105|136->105|137->106|138->107|139->108|185->154|185->154
                  -- GENERATED --
              */
          
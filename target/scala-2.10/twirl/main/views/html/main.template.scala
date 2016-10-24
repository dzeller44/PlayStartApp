
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

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
    </head>
    <body>

<!-- PRELOADER -->
	<img id="preloader" src=""""),_display_(/*70.28*/routes/*70.34*/.Assets.at("img/preloader.gif")),format.raw/*70.65*/("""" alt="" />
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
							<a href="/"><img src=""""),_display_(/*89.31*/routes/*89.37*/.Assets.at("img/co/DHSEM_Logo_80px.png")),format.raw/*89.77*/(""""></a>
						</div>
						<!-- //LOGO -->

						<!-- MENU -->
						<div class="pull-right">
							<nav class="navmenu center">
								<ul>
									<li class="scroll_btn"><a href="/">Home</a></li>
									<li class="scroll_btn"><a href="/signup">Register</a></li>
									"""),_display_(/*99.11*/if(user != null)/*99.27*/ {_display_(Seq[Any](format.raw/*99.29*/("""
										"""),format.raw/*100.11*/("""<li class="scroll_btn"><a href="/logout">Logout</a></li>
									""")))}/*101.12*/else/*101.17*/{_display_(Seq[Any](format.raw/*101.18*/("""
  										"""),format.raw/*102.13*/("""<li class="scroll_btn"><a href="/auth">Login</a></li>
									""")))}),format.raw/*103.11*/("""
								"""),format.raw/*104.9*/("""</ul>
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
  			<div>"""),_display_(/*150.12*/content),format.raw/*150.19*/("""</div>
  
  
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

  def render(user:User,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts)(content)

  def f:((User,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts) => (content) => apply(user,scripts)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Oct 24 07:45:06 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/main.scala.html
                  HASH: beba2f1c7fb11d808ab36d815629b0b88c76f847
                  MATRIX: 751->1|906->61|934->63|1140->243|1154->249|1203->278|1558->606|1573->612|1619->637|1664->655|1679->661|1745->706|1825->759|1840->765|1893->797|1973->850|1988->856|2042->889|2122->942|2137->948|2187->977|2279->1042|2294->1048|2349->1082|2411->1117|2426->1123|2474->1150|2554->1203|2569->1209|2638->1257|2738->1330|2753->1336|2798->1360|2833->1368|2848->1374|2908->1412|2966->1443|2981->1449|3040->1487|3121->1541|3136->1547|3194->1584|3275->1638|3290->1644|3350->1683|3431->1737|3446->1743|3495->1771|3573->1822|3588->1828|3654->1873|3732->1924|3747->1930|3816->1978|3894->2029|3909->2035|3963->2068|4041->2119|4056->2125|4125->2173|4203->2224|4218->2230|4271->2262|4349->2313|4364->2319|4412->2346|4490->2397|4505->2403|4573->2450|4628->2478|4643->2484|4692->2512|4770->2563|4785->2569|4832->2595|4910->2646|4925->2652|4974->2680|5111->2789|5140->2790|5175->2798|5250->2846|5278->2847|5364->2905|5393->2906|5428->2914|5487->2945|5516->2946|5552->2955|6012->3387|6041->3388|6070->3389|6298->3590|6327->3591|6394->3630|6423->3631|6461->3641|6557->3710|6586->3711|6621->3719|6649->3720|6685->3729|6713->3730|6832->3822|6847->3828|6899->3859|7261->4194|7276->4200|7337->4240|7643->4519|7668->4535|7708->4537|7748->4548|7835->4616|7849->4621|7889->4622|7931->4635|8027->4699|8064->4708|9321->5937|9350->5944
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|70->39|70->39|71->40|72->41|72->41|75->44|75->44|76->45|76->45|76->45|77->46|86->55|86->55|86->55|90->59|90->59|91->60|91->60|92->61|93->62|93->62|94->63|94->63|95->64|95->64|101->70|101->70|101->70|120->89|120->89|120->89|130->99|130->99|130->99|131->100|132->101|132->101|132->101|133->102|134->103|135->104|181->150|181->150
                  -- GENERATED --
              */
          
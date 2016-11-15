
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
	    <script>
						//PrettyPhoto
						jQuery(document).ready(function() """),format.raw/*38.41*/("""{"""),format.raw/*38.42*/("""
							"""),format.raw/*39.8*/("""$("a[rel^='prettyPhoto']").prettyPhoto();
						"""),format.raw/*40.7*/("""}"""),format.raw/*40.8*/(""");

						//BlackAndWhite
						$(window).load(function() """),format.raw/*43.33*/("""{"""),format.raw/*43.34*/("""
							"""),format.raw/*44.8*/("""$('.client_img').BlackAndWhite("""),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""
								"""),format.raw/*45.9*/("""hoverEffect : true, // default true
								// set the path to BnWWorker.js for a superfast implementation
								webworkerPath : false,
								// for the images with a fluid width and height
								responsive : true,
								// to invert the hover effect
								invertHoverEffect : false,
								// this option works only on the modern browsers ( on IE lower than 9 it remains always 1)
								intensity : 1,
								speed : """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/(""" """),format.raw/*54.19*/("""//this property could also be just speed: value for both fadeIn and fadeOut
									fadeIn : 300, // 200ms for fadeIn animations
									fadeOut : 300
								// 800ms for fadeOut animations
								"""),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""",
								onImageReady : function(img) """),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""
									"""),format.raw/*60.10*/("""// this callback gets executed anytime an image is converted
								"""),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
							"""),format.raw/*62.8*/("""}"""),format.raw/*62.9*/(""");
						"""),format.raw/*63.7*/("""}"""),format.raw/*63.8*/(""");
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
  									<li class="scroll_btn"><a href="/auth">Admin</a></li>
								</ul>
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
  			<div>"""),_display_(/*146.12*/content),format.raw/*146.19*/("""</div>
  
  
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
                  DATE: Tue Nov 15 11:20:07 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/main.scala.html
                  HASH: 2a44a59329a04d70856cce81f5cb3913ba4d7651
                  MATRIX: 758->1|938->86|966->88|1172->268|1186->274|1235->303|1590->631|1605->637|1651->662|1696->680|1711->686|1777->731|1857->784|1872->790|1925->822|2005->875|2020->881|2074->914|2154->967|2169->973|2219->1002|2311->1067|2326->1073|2381->1107|2443->1142|2458->1148|2506->1175|2586->1228|2601->1234|2670->1282|2770->1355|2785->1361|2830->1385|2865->1393|2880->1399|2940->1437|2998->1468|3013->1474|3072->1512|3153->1566|3168->1572|3226->1609|3307->1663|3322->1669|3382->1708|3463->1762|3478->1768|3527->1796|3605->1847|3620->1853|3686->1898|3764->1949|3779->1955|3848->2003|3926->2054|3941->2060|3995->2093|4073->2144|4088->2150|4157->2198|4235->2249|4250->2255|4303->2287|4381->2338|4396->2344|4444->2371|4522->2422|4537->2428|4605->2475|4660->2503|4675->2509|4724->2537|4802->2588|4817->2594|4864->2620|5001->2729|5030->2730|5065->2738|5140->2786|5168->2787|5254->2845|5283->2846|5318->2854|5377->2885|5406->2886|5442->2895|5902->3327|5931->3328|5960->3329|6188->3530|6217->3531|6284->3570|6313->3571|6351->3581|6447->3650|6476->3651|6511->3659|6539->3660|6575->3669|6603->3670|6719->3759|6734->3765|6786->3796|7148->4131|7163->4137|7224->4177|8823->5748|8852->5755
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|69->38|69->38|70->39|71->40|71->40|74->43|74->43|75->44|75->44|75->44|76->45|85->54|85->54|85->54|89->58|89->58|90->59|90->59|91->60|92->61|92->61|93->62|93->62|94->63|94->63|101->70|101->70|101->70|120->89|120->89|120->89|177->146|177->146
                  -- GENERATED --
              */
          
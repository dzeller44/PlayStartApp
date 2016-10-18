
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
		<link href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.at("css/bootstrap.min.css")),format.raw/*14.57*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*15.16*/routes/*15.22*/.Assets.at("css/flexslider.css")),format.raw/*15.54*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.at("css/prettyPhoto.css")),format.raw/*16.55*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*17.16*/routes/*17.22*/.Assets.at("css/animate.css")),format.raw/*17.51*/("""" rel="stylesheet" type="text/css" media="all" />
		<link href=""""),_display_(/*18.16*/routes/*18.22*/.Assets.at("css/owl.carousel.css")),format.raw/*18.56*/("""" rel="stylesheet">
		<link href=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("css/style.css")),format.raw/*19.49*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("css/formoid/formoid-solid-dark.css")),format.raw/*20.70*/("""" rel="stylesheet" type="text/css" />
         
	    <script data-main=""""),_display_(/*22.26*/routes/*22.32*/.Assets.at("js/main.js")),format.raw/*22.56*/("""" src=""""),_display_(/*22.64*/routes/*22.70*/.Assets.at("lib/requirejs/require.js")),format.raw/*22.108*/(""""></script>
	    <script src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.at("lib/angular/angular.js")),format.raw/*23.62*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*24.20*/routes/*24.26*/.Assets.at("js/bootstrap.js")),format.raw/*24.55*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(/*25.20*/routes/*25.26*/.Assets.at("js/password.js")),format.raw/*25.54*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*26.17*/routes/*26.23*/.Assets.at("js/jquery.min.js")),format.raw/*26.53*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.at("js/bootstrap.min.js")),format.raw/*27.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*28.17*/routes/*28.23*/.Assets.at("js/jquery.prettyPhoto.js")),format.raw/*28.61*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*29.17*/routes/*29.23*/.Assets.at("js/jquery.nicescroll.min.js")),format.raw/*29.64*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*30.17*/routes/*30.23*/.Assets.at("js/superfish.min.js")),format.raw/*30.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("js/jquery.flexslider-min.js")),format.raw/*31.64*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("js/owl.carousel.js")),format.raw/*32.55*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("js/animate.js")),format.raw/*33.50*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("js/jquery.BlackAndWhite.js")),format.raw/*34.63*/(""""></script>
		<script src=""""),_display_(/*35.17*/routes/*35.23*/.Assets.at("js/myscript.js")),format.raw/*35.51*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*36.17*/routes/*36.23*/.Assets.at("js/global.js")),format.raw/*36.49*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*37.17*/routes/*37.23*/.Assets.at("js/password.js")),format.raw/*37.51*/("""" type="text/javascript"></script>
	    <script>
						//PrettyPhoto
						jQuery(document).ready(function() """),format.raw/*40.41*/("""{"""),format.raw/*40.42*/("""
							"""),format.raw/*41.8*/("""$("a[rel^='prettyPhoto']").prettyPhoto();
						"""),format.raw/*42.7*/("""}"""),format.raw/*42.8*/(""");

						//BlackAndWhite
						$(window).load(function() """),format.raw/*45.33*/("""{"""),format.raw/*45.34*/("""
							"""),format.raw/*46.8*/("""$('.client_img').BlackAndWhite("""),format.raw/*46.39*/("""{"""),format.raw/*46.40*/("""
								"""),format.raw/*47.9*/("""hoverEffect : true, // default true
								// set the path to BnWWorker.js for a superfast implementation
								webworkerPath : false,
								// for the images with a fluid width and height
								responsive : true,
								// to invert the hover effect
								invertHoverEffect : false,
								// this option works only on the modern browsers ( on IE lower than 9 it remains always 1)
								intensity : 1,
								speed : """),format.raw/*56.17*/("""{"""),format.raw/*56.18*/(""" """),format.raw/*56.19*/("""//this property could also be just speed: value for both fadeIn and fadeOut
									fadeIn : 300, // 200ms for fadeIn animations
									fadeOut : 300
								// 800ms for fadeOut animations
								"""),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""",
								onImageReady : function(img) """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
									"""),format.raw/*62.10*/("""// this callback gets executed anytime an image is converted
								"""),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""
							"""),format.raw/*64.8*/("""}"""),format.raw/*64.9*/(""");
						"""),format.raw/*65.7*/("""}"""),format.raw/*65.8*/(""");
					</script>    
    </head>
    <body>

<!-- PRELOADER -->
	<img id="preloader" src=""""),_display_(/*71.28*/routes/*71.34*/.Assets.at("img/preloader.gif")),format.raw/*71.65*/("""" alt="" />
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
							<a href="/"><img src=""""),_display_(/*90.31*/routes/*90.37*/.Assets.at("img/co/DHSEM_Logo_80px.png")),format.raw/*90.77*/(""""></a>
						</div>
						<!-- //LOGO -->

						<!-- MENU -->
						<div class="pull-right">
							<nav class="navmenu center">
								<ul>
									<li class="scroll_btn"><a href="/">Home</a></li>
									<li class="scroll_btn"><a href="/signup">Register</a></li>
									<li class="scroll_btn"><a href="/login">Login</a></li>
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
  			<div>"""),_display_(/*147.12*/content),format.raw/*147.19*/("""</div>
  
  
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
                  DATE: Tue Oct 18 10:12:33 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/main.scala.html
                  HASH: bf2806429e885d2af30a72184791dcb4ba063513
                  MATRIX: 751->1|906->61|934->63|1140->243|1154->249|1203->278|1558->606|1573->612|1619->637|1664->655|1679->661|1735->696|1815->749|1830->755|1883->787|1963->840|1978->846|2032->879|2112->932|2127->938|2177->967|2269->1032|2284->1038|2339->1072|2401->1107|2416->1113|2464->1140|2544->1193|2559->1199|2628->1247|2728->1320|2743->1326|2788->1350|2823->1358|2838->1364|2898->1402|2956->1433|2971->1439|3028->1475|3109->1529|3124->1535|3174->1564|3255->1618|3270->1624|3319->1652|3397->1703|3412->1709|3463->1739|3541->1790|3556->1796|3610->1829|3688->1880|3703->1886|3762->1924|3840->1975|3855->1981|3917->2022|3995->2073|4010->2079|4064->2112|4142->2163|4157->2169|4219->2210|4297->2261|4312->2267|4365->2299|4443->2350|4458->2356|4506->2383|4584->2434|4599->2440|4660->2480|4715->2508|4730->2514|4779->2542|4857->2593|4872->2599|4919->2625|4997->2676|5012->2682|5061->2710|5198->2819|5227->2820|5262->2828|5337->2876|5365->2877|5451->2935|5480->2936|5515->2944|5574->2975|5603->2976|5639->2985|6099->3417|6128->3418|6157->3419|6385->3620|6414->3621|6481->3660|6510->3661|6548->3671|6644->3740|6673->3741|6708->3749|6736->3750|6772->3759|6800->3760|6919->3852|6934->3858|6986->3889|7348->4224|7363->4230|7424->4270|9022->5840|9051->5847
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|71->40|71->40|72->41|73->42|73->42|76->45|76->45|77->46|77->46|77->46|78->47|87->56|87->56|87->56|91->60|91->60|92->61|92->61|93->62|94->63|94->63|95->64|95->64|96->65|96->65|102->71|102->71|102->71|121->90|121->90|121->90|178->147|178->147
                  -- GENERATED --
              */
          
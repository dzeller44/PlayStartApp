
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Nov 01 12:30:13 MDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:7
  Dashboard_2: controllers.Dashboard,
  // @LINE:28
  Index_7: controllers.account.settings.Index,
  // @LINE:29
  Password_1: controllers.account.settings.Password,
  // @LINE:31
  Email_3: controllers.account.settings.Email,
  // @LINE:35
  Signup_5: controllers.account.Signup,
  // @LINE:42
  Reset_0: controllers.account.Reset,
  // @LINE:52
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:28
    Index_7: controllers.account.settings.Index,
    // @LINE:29
    Password_1: controllers.account.settings.Password,
    // @LINE:31
    Email_3: controllers.account.settings.Email,
    // @LINE:35
    Signup_5: controllers.account.Signup,
    // @LINE:42
    Reset_0: controllers.account.Reset,
    // @LINE:52
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_6, Dashboard_2, Index_7, Password_1, Email_3, Signup_5, Reset_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Dashboard_2, Index_7, Password_1, Email_3, Signup_5, Reset_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.openLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """em""", """controllers.Application.managerHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emuser""", """controllers.Application.managerUserMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emsearch""", """controllers.Application.managerSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emfinduser""", """controllers.Application.findUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emfinduser""", """controllers.Application.getUserByEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser""", """controllers.Application.findUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.account.settings.Index.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.runEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.ask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.runAsk()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""", """controllers.account.settings.Email.validateEmail(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Dashboard_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_index1_invoker = createInvoker(
    Dashboard_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    Application_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_6.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_openLogin4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_openLogin4_invoker = createInvoker(
    Application_6.openLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openLogin",
      Nil,
      "GET",
      """ Authenticates/Logins the user...""",
      this.prefix + """auth"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_authenticate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_authenticate5_invoker = createInvoker(
    Application_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_managerHome6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("em")))
  )
  private[this] lazy val controllers_Application_managerHome6_invoker = createInvoker(
    Application_6.managerHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "managerHome",
      Nil,
      "GET",
      """ Emergency Manager pages...""",
      this.prefix + """em"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_managerUserMaintenance7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emuser")))
  )
  private[this] lazy val controllers_Application_managerUserMaintenance7_invoker = createInvoker(
    Application_6.managerUserMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "managerUserMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """emuser"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_managerSearch8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emsearch")))
  )
  private[this] lazy val controllers_Application_managerSearch8_invoker = createInvoker(
    Application_6.managerSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "managerSearch",
      Nil,
      "GET",
      """""",
      this.prefix + """emsearch"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_findUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emfinduser")))
  )
  private[this] lazy val controllers_Application_findUser9_invoker = createInvoker(
    Application_6.findUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findUser",
      Nil,
      "GET",
      """""",
      this.prefix + """emfinduser"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getUserByEmail10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emfinduser")))
  )
  private[this] lazy val controllers_Application_getUserByEmail10_invoker = createInvoker(
    Application_6.getUserByEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """emfinduser"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_findUser11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser")))
  )
  private[this] lazy val controllers_Application_findUser11_invoker = createInvoker(
    Application_6.findUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findUser",
      Nil,
      "GET",
      """""",
      this.prefix + """updateuser"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_account_settings_Index_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index12_invoker = createInvoker(
    Index_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_account_settings_Password_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index13_invoker = createInvoker(
    Password_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_account_settings_Password_runPassword14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword14_invoker = createInvoker(
    Password_1.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "runPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_account_settings_Email_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index15_invoker = createInvoker(
    Email_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_account_settings_Email_runEmail16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail16_invoker = createInvoker(
    Email_3.runEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "runEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_account_Signup_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create17_invoker = createInvoker(
    Signup_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_account_Signup_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save18_invoker = createInvoker(
    Signup_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_account_Signup_confirm19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm19_invoker = createInvoker(
    Signup_5.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """ Accessed when the user confirms the registration.""",
      this.prefix + """confirm/$confirmToken<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_account_Reset_ask20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask20_invoker = createInvoker(
    Reset_0.ask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "ask",
      Nil,
      "GET",
      """ Displays a page to send a reset email given the user's email.""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_account_Reset_runAsk21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk21_invoker = createInvoker(
    Reset_0.runAsk(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runAsk",
      Nil,
      "POST",
      """""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_account_Reset_reset22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset22_invoker = createInvoker(
    Reset_0.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Resets the password using the password.""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_account_Reset_runReset23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset23_invoker = createInvoker(
    Reset_0.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_account_settings_Email_validateEmail24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail24_invoker = createInvoker(
    Email_3.validateEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "validateEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """email/$token<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index())
      }
  
    // @LINE:7
    case controllers_Dashboard_index1_route(params) =>
      call { 
        controllers_Dashboard_index1_invoker.call(Dashboard_2.index())
      }
  
    // @LINE:9
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:10
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_6.logout())
      }
  
    // @LINE:13
    case controllers_Application_openLogin4_route(params) =>
      call { 
        controllers_Application_openLogin4_invoker.call(Application_6.openLogin())
      }
  
    // @LINE:14
    case controllers_Application_authenticate5_route(params) =>
      call { 
        controllers_Application_authenticate5_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:17
    case controllers_Application_managerHome6_route(params) =>
      call { 
        controllers_Application_managerHome6_invoker.call(Application_6.managerHome())
      }
  
    // @LINE:19
    case controllers_Application_managerUserMaintenance7_route(params) =>
      call { 
        controllers_Application_managerUserMaintenance7_invoker.call(Application_6.managerUserMaintenance())
      }
  
    // @LINE:21
    case controllers_Application_managerSearch8_route(params) =>
      call { 
        controllers_Application_managerSearch8_invoker.call(Application_6.managerSearch())
      }
  
    // @LINE:23
    case controllers_Application_findUser9_route(params) =>
      call { 
        controllers_Application_findUser9_invoker.call(Application_6.findUser())
      }
  
    // @LINE:24
    case controllers_Application_getUserByEmail10_route(params) =>
      call { 
        controllers_Application_getUserByEmail10_invoker.call(Application_6.getUserByEmail())
      }
  
    // @LINE:26
    case controllers_Application_findUser11_route(params) =>
      call { 
        controllers_Application_findUser11_invoker.call(Application_6.findUser())
      }
  
    // @LINE:28
    case controllers_account_settings_Index_index12_route(params) =>
      call { 
        controllers_account_settings_Index_index12_invoker.call(Index_7.index())
      }
  
    // @LINE:29
    case controllers_account_settings_Password_index13_route(params) =>
      call { 
        controllers_account_settings_Password_index13_invoker.call(Password_1.index())
      }
  
    // @LINE:30
    case controllers_account_settings_Password_runPassword14_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword14_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:31
    case controllers_account_settings_Email_index15_route(params) =>
      call { 
        controllers_account_settings_Email_index15_invoker.call(Email_3.index())
      }
  
    // @LINE:32
    case controllers_account_settings_Email_runEmail16_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail16_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:35
    case controllers_account_Signup_create17_route(params) =>
      call { 
        controllers_account_Signup_create17_invoker.call(Signup_5.create())
      }
  
    // @LINE:36
    case controllers_account_Signup_save18_route(params) =>
      call { 
        controllers_account_Signup_save18_invoker.call(Signup_5.save())
      }
  
    // @LINE:39
    case controllers_account_Signup_confirm19_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm19_invoker.call(Signup_5.confirm(confirmToken))
      }
  
    // @LINE:42
    case controllers_account_Reset_ask20_route(params) =>
      call { 
        controllers_account_Reset_ask20_invoker.call(Reset_0.ask())
      }
  
    // @LINE:43
    case controllers_account_Reset_runAsk21_route(params) =>
      call { 
        controllers_account_Reset_runAsk21_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:46
    case controllers_account_Reset_reset22_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset22_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:47
    case controllers_account_Reset_runReset23_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset23_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:49
    case controllers_account_settings_Email_validateEmail24_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail24_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:52
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_4.at(path, file))
      }
  }
}
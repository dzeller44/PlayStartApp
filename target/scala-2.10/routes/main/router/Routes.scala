
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Nov 22 09:45:40 MST 2016

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
  // @LINE:62
  Signup_5: controllers.account.Signup,
  // @LINE:70
  Reset_0: controllers.account.Reset,
  // @LINE:75
  Index_7: controllers.account.settings.Index,
  // @LINE:76
  Password_1: controllers.account.settings.Password,
  // @LINE:78
  Email_3: controllers.account.settings.Email,
  // @LINE:99
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:62
    Signup_5: controllers.account.Signup,
    // @LINE:70
    Reset_0: controllers.account.Reset,
    // @LINE:75
    Index_7: controllers.account.settings.Index,
    // @LINE:76
    Password_1: controllers.account.settings.Password,
    // @LINE:78
    Email_3: controllers.account.settings.Email,
    // @LINE:99
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_6, Dashboard_2, Signup_5, Reset_0, Index_7, Password_1, Email_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Dashboard_2, Signup_5, Reset_0, Index_7, Password_1, Email_3, Assets_4, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessdenied""", """controllers.Application.accessDenied()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.userHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprofile""", """controllers.Application.addProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprofile""", """controllers.Application.saveProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getprofiles""", """controllers.Application.getProfilesByUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile/$name<[^/]+>""", """controllers.Application.openProfile(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile/$name<[^/]+>""", """controllers.Application.updateProfile(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """em""", """controllers.Application.managerHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Application.adminHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminuser""", """controllers.Application.userMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchprofiles""", """controllers.Application.getAllProfiles()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchbyservice""", """controllers.Application.getProfilesByService(service:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openprofile/$name<[^/]+>""", """controllers.Application.openProfileAdmin(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openprofile/$name<[^/]+>""", """controllers.Application.updateProfileAdmin(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteprofile/$name<[^/]+>""", """controllers.Application.deleteProfileConfirm(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteprofile/$name<[^/]+>""", """controllers.Application.deleteProfile(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.findUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.getUserByEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser""", """controllers.Application.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportusers/$data<[^/]+>""", """controllers.Application.exportUsers(data:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportOpenFile/$fileName<[^/]+>""", """controllers.Application.exportOpenFile(fileName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportprofiles/$data<[^/]+>""", """controllers.Application.exportProfiles(data:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openuser""", """controllers.Application.openUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addadmin""", """controllers.account.Signup.createAdmin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addadmin""", """controllers.account.Signup.saveAdmin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduserurl""", """controllers.Application.getUserByUrl(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$email<[^/]+>""", """controllers.Application.deleteUserConfirm(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$email<[^/]+>""", """controllers.Application.deleteUser(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetadmin/$token<[^/]+>""", """controllers.account.Reset.resetAdmin(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetadmin/$token<[^/]+>""", """controllers.account.Reset.runResetAdmin(token:String)"""),
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

  // @LINE:16
  private[this] lazy val controllers_Application_accessDenied6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessdenied")))
  )
  private[this] lazy val controllers_Application_accessDenied6_invoker = createInvoker(
    Application_6.accessDenied(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "accessDenied",
      Nil,
      "GET",
      """""",
      this.prefix + """accessdenied"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_userHome7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_userHome7_invoker = createInvoker(
    Application_6.userHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userHome",
      Nil,
      "GET",
      """ User pages...""",
      this.prefix + """user"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_addProfile8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprofile")))
  )
  private[this] lazy val controllers_Application_addProfile8_invoker = createInvoker(
    Application_6.addProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """addprofile"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_saveProfile9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprofile")))
  )
  private[this] lazy val controllers_Application_saveProfile9_invoker = createInvoker(
    Application_6.saveProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """addprofile"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getProfilesByUser10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofiles")))
  )
  private[this] lazy val controllers_Application_getProfilesByUser10_invoker = createInvoker(
    Application_6.getProfilesByUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProfilesByUser",
      Nil,
      "GET",
      """""",
      this.prefix + """getprofiles"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_openProfile11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openProfile11_invoker = createInvoker(
    Application_6.openProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openProfile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """editprofile/$name<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_updateProfile12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProfile12_invoker = createInvoker(
    Application_6.updateProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProfile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """editprofile/$name<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_managerHome13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("em")))
  )
  private[this] lazy val controllers_Application_managerHome13_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_adminHome14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Application_adminHome14_invoker = createInvoker(
    Application_6.adminHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "adminHome",
      Nil,
      "GET",
      """ Admin pages...""",
      this.prefix + """admin"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_userMaintenance15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminuser")))
  )
  private[this] lazy val controllers_Application_userMaintenance15_invoker = createInvoker(
    Application_6.userMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """adminuser"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_getAllUsers16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_getAllUsers16_invoker = createInvoker(
    Application_6.getAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_getAllProfiles17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchprofiles")))
  )
  private[this] lazy val controllers_Application_getAllProfiles17_invoker = createInvoker(
    Application_6.getAllProfiles(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllProfiles",
      Nil,
      "GET",
      """""",
      this.prefix + """searchprofiles"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_getProfilesByService18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchbyservice")))
  )
  private[this] lazy val controllers_Application_getProfilesByService18_invoker = createInvoker(
    Application_6.getProfilesByService(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProfilesByService",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """searchbyservice"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_openProfileAdmin19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openProfileAdmin19_invoker = createInvoker(
    Application_6.openProfileAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openProfileAdmin",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """openprofile/$name<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_updateProfileAdmin20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProfileAdmin20_invoker = createInvoker(
    Application_6.updateProfileAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProfileAdmin",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """openprofile/$name<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_deleteProfileConfirm21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteProfileConfirm21_invoker = createInvoker(
    Application_6.deleteProfileConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteProfileConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteprofile/$name<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Application_deleteProfile22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteProfile22_invoker = createInvoker(
    Application_6.deleteProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteProfile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deleteprofile/$name<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Application_findUser23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_findUser23_invoker = createInvoker(
    Application_6.findUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findUser",
      Nil,
      "GET",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Application_getUserByEmail24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_getUserByEmail24_invoker = createInvoker(
    Application_6.getUserByEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Application_updateUser25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser")))
  )
  private[this] lazy val controllers_Application_updateUser25_invoker = createInvoker(
    Application_6.updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """updateuser"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Application_exportUsers26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportusers/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportUsers26_invoker = createInvoker(
    Application_6.exportUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """exportusers/$data<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Application_exportOpenFile27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportOpenFile/"), DynamicPart("fileName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportOpenFile27_invoker = createInvoker(
    Application_6.exportOpenFile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportOpenFile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """exportOpenFile/$fileName<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Application_exportProfiles28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportprofiles/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportProfiles28_invoker = createInvoker(
    Application_6.exportProfiles(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportProfiles",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """exportprofiles/$data<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Application_openUser29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openuser")))
  )
  private[this] lazy val controllers_Application_openUser29_invoker = createInvoker(
    Application_6.openUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUser",
      Nil,
      "GET",
      """""",
      this.prefix + """openuser"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_account_Signup_createAdmin30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addadmin")))
  )
  private[this] lazy val controllers_account_Signup_createAdmin30_invoker = createInvoker(
    Signup_5.createAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "createAdmin",
      Nil,
      "GET",
      """""",
      this.prefix + """addadmin"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_account_Signup_saveAdmin31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addadmin")))
  )
  private[this] lazy val controllers_account_Signup_saveAdmin31_invoker = createInvoker(
    Signup_5.saveAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "saveAdmin",
      Nil,
      "POST",
      """""",
      this.prefix + """addadmin"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Application_getUserByUrl32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduserurl")))
  )
  private[this] lazy val controllers_Application_getUserByUrl32_invoker = createInvoker(
    Application_6.getUserByUrl(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByUrl",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """finduserurl"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Application_deleteUserConfirm33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserConfirm33_invoker = createInvoker(
    Application_6.deleteUserConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUserConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteuser/$email<[^/]+>"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Application_deleteUser34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUser34_invoker = createInvoker(
    Application_6.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deleteuser/$email<[^/]+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_account_Reset_resetAdmin35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetadmin/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_resetAdmin35_invoker = createInvoker(
    Reset_0.resetAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "resetAdmin",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """resetadmin/$token<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_account_Reset_runResetAdmin36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetadmin/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runResetAdmin36_invoker = createInvoker(
    Reset_0.runResetAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runResetAdmin",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """resetadmin/$token<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_account_settings_Index_index37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index37_invoker = createInvoker(
    Index_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """ User settings...""",
      this.prefix + """settings"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_account_settings_Password_index38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index38_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_account_settings_Password_runPassword39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword39_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_account_settings_Email_index40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index40_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_account_settings_Email_runEmail41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail41_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val controllers_account_Signup_create42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create42_invoker = createInvoker(
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

  // @LINE:83
  private[this] lazy val controllers_account_Signup_save43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save43_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val controllers_account_Signup_confirm44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm44_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_account_Reset_ask45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask45_invoker = createInvoker(
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

  // @LINE:90
  private[this] lazy val controllers_account_Reset_runAsk46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk46_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_account_Reset_reset47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset47_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_account_Reset_runReset48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset48_invoker = createInvoker(
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

  // @LINE:96
  private[this] lazy val controllers_account_settings_Email_validateEmail49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail49_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_Assets_at50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at50_invoker = createInvoker(
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
  
    // @LINE:16
    case controllers_Application_accessDenied6_route(params) =>
      call { 
        controllers_Application_accessDenied6_invoker.call(Application_6.accessDenied())
      }
  
    // @LINE:19
    case controllers_Application_userHome7_route(params) =>
      call { 
        controllers_Application_userHome7_invoker.call(Application_6.userHome())
      }
  
    // @LINE:21
    case controllers_Application_addProfile8_route(params) =>
      call { 
        controllers_Application_addProfile8_invoker.call(Application_6.addProfile())
      }
  
    // @LINE:22
    case controllers_Application_saveProfile9_route(params) =>
      call { 
        controllers_Application_saveProfile9_invoker.call(Application_6.saveProfile())
      }
  
    // @LINE:24
    case controllers_Application_getProfilesByUser10_route(params) =>
      call { 
        controllers_Application_getProfilesByUser10_invoker.call(Application_6.getProfilesByUser())
      }
  
    // @LINE:26
    case controllers_Application_openProfile11_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_openProfile11_invoker.call(Application_6.openProfile(name))
      }
  
    // @LINE:27
    case controllers_Application_updateProfile12_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_updateProfile12_invoker.call(Application_6.updateProfile(name))
      }
  
    // @LINE:30
    case controllers_Application_managerHome13_route(params) =>
      call { 
        controllers_Application_managerHome13_invoker.call(Application_6.managerHome())
      }
  
    // @LINE:33
    case controllers_Application_adminHome14_route(params) =>
      call { 
        controllers_Application_adminHome14_invoker.call(Application_6.adminHome())
      }
  
    // @LINE:35
    case controllers_Application_userMaintenance15_route(params) =>
      call { 
        controllers_Application_userMaintenance15_invoker.call(Application_6.userMaintenance())
      }
  
    // @LINE:37
    case controllers_Application_getAllUsers16_route(params) =>
      call { 
        controllers_Application_getAllUsers16_invoker.call(Application_6.getAllUsers())
      }
  
    // @LINE:39
    case controllers_Application_getAllProfiles17_route(params) =>
      call { 
        controllers_Application_getAllProfiles17_invoker.call(Application_6.getAllProfiles())
      }
  
    // @LINE:41
    case controllers_Application_getProfilesByService18_route(params) =>
      call(params.fromQuery[String]("service", None)) { (service) =>
        controllers_Application_getProfilesByService18_invoker.call(Application_6.getProfilesByService(service))
      }
  
    // @LINE:43
    case controllers_Application_openProfileAdmin19_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_openProfileAdmin19_invoker.call(Application_6.openProfileAdmin(name))
      }
  
    // @LINE:44
    case controllers_Application_updateProfileAdmin20_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_updateProfileAdmin20_invoker.call(Application_6.updateProfileAdmin(name))
      }
  
    // @LINE:46
    case controllers_Application_deleteProfileConfirm21_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_deleteProfileConfirm21_invoker.call(Application_6.deleteProfileConfirm(name))
      }
  
    // @LINE:47
    case controllers_Application_deleteProfile22_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_deleteProfile22_invoker.call(Application_6.deleteProfile(name))
      }
  
    // @LINE:49
    case controllers_Application_findUser23_route(params) =>
      call { 
        controllers_Application_findUser23_invoker.call(Application_6.findUser())
      }
  
    // @LINE:50
    case controllers_Application_getUserByEmail24_route(params) =>
      call { 
        controllers_Application_getUserByEmail24_invoker.call(Application_6.getUserByEmail())
      }
  
    // @LINE:52
    case controllers_Application_updateUser25_route(params) =>
      call { 
        controllers_Application_updateUser25_invoker.call(Application_6.updateUser())
      }
  
    // @LINE:54
    case controllers_Application_exportUsers26_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportUsers26_invoker.call(Application_6.exportUsers(data))
      }
  
    // @LINE:56
    case controllers_Application_exportOpenFile27_route(params) =>
      call(params.fromPath[String]("fileName", None)) { (fileName) =>
        controllers_Application_exportOpenFile27_invoker.call(Application_6.exportOpenFile(fileName))
      }
  
    // @LINE:58
    case controllers_Application_exportProfiles28_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportProfiles28_invoker.call(Application_6.exportProfiles(data))
      }
  
    // @LINE:60
    case controllers_Application_openUser29_route(params) =>
      call { 
        controllers_Application_openUser29_invoker.call(Application_6.openUser())
      }
  
    // @LINE:62
    case controllers_account_Signup_createAdmin30_route(params) =>
      call { 
        controllers_account_Signup_createAdmin30_invoker.call(Signup_5.createAdmin())
      }
  
    // @LINE:63
    case controllers_account_Signup_saveAdmin31_route(params) =>
      call { 
        controllers_account_Signup_saveAdmin31_invoker.call(Signup_5.saveAdmin())
      }
  
    // @LINE:65
    case controllers_Application_getUserByUrl32_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_getUserByUrl32_invoker.call(Application_6.getUserByUrl(email))
      }
  
    // @LINE:67
    case controllers_Application_deleteUserConfirm33_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUserConfirm33_invoker.call(Application_6.deleteUserConfirm(email))
      }
  
    // @LINE:68
    case controllers_Application_deleteUser34_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUser34_invoker.call(Application_6.deleteUser(email))
      }
  
    // @LINE:70
    case controllers_account_Reset_resetAdmin35_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_resetAdmin35_invoker.call(Reset_0.resetAdmin(token))
      }
  
    // @LINE:71
    case controllers_account_Reset_runResetAdmin36_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runResetAdmin36_invoker.call(Reset_0.runResetAdmin(token))
      }
  
    // @LINE:75
    case controllers_account_settings_Index_index37_route(params) =>
      call { 
        controllers_account_settings_Index_index37_invoker.call(Index_7.index())
      }
  
    // @LINE:76
    case controllers_account_settings_Password_index38_route(params) =>
      call { 
        controllers_account_settings_Password_index38_invoker.call(Password_1.index())
      }
  
    // @LINE:77
    case controllers_account_settings_Password_runPassword39_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword39_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:78
    case controllers_account_settings_Email_index40_route(params) =>
      call { 
        controllers_account_settings_Email_index40_invoker.call(Email_3.index())
      }
  
    // @LINE:79
    case controllers_account_settings_Email_runEmail41_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail41_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:82
    case controllers_account_Signup_create42_route(params) =>
      call { 
        controllers_account_Signup_create42_invoker.call(Signup_5.create())
      }
  
    // @LINE:83
    case controllers_account_Signup_save43_route(params) =>
      call { 
        controllers_account_Signup_save43_invoker.call(Signup_5.save())
      }
  
    // @LINE:86
    case controllers_account_Signup_confirm44_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm44_invoker.call(Signup_5.confirm(confirmToken))
      }
  
    // @LINE:89
    case controllers_account_Reset_ask45_route(params) =>
      call { 
        controllers_account_Reset_ask45_invoker.call(Reset_0.ask())
      }
  
    // @LINE:90
    case controllers_account_Reset_runAsk46_route(params) =>
      call { 
        controllers_account_Reset_runAsk46_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:93
    case controllers_account_Reset_reset47_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset47_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:94
    case controllers_account_Reset_runReset48_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset48_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:96
    case controllers_account_settings_Email_validateEmail49_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail49_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:99
    case controllers_Assets_at50_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at50_invoker.call(Assets_4.at(path, file))
      }
  }
}

// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Dec 13 09:47:46 MST 2016

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
  // @LINE:70
  Signup_5: controllers.account.Signup,
  // @LINE:78
  Reset_0: controllers.account.Reset,
  // @LINE:83
  Index_7: controllers.account.settings.Index,
  // @LINE:84
  Password_1: controllers.account.settings.Password,
  // @LINE:86
  Email_3: controllers.account.settings.Email,
  // @LINE:107
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:70
    Signup_5: controllers.account.Signup,
    // @LINE:78
    Reset_0: controllers.account.Reset,
    // @LINE:83
    Index_7: controllers.account.settings.Index,
    // @LINE:84
    Password_1: controllers.account.settings.Password,
    // @LINE:86
    Email_3: controllers.account.settings.Email,
    // @LINE:107
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contact()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contactSend()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.openLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessdenied""", """controllers.Application.accessDenied()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.userHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprofile""", """controllers.Application.addProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprofile""", """controllers.Application.saveProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getprofiles""", """controllers.Application.getProfilesByUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile/$name<[^/]+>""", """controllers.Application.openProfile(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile/$name<[^/]+>""", """controllers.Application.updateProfile(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.openUserAccount(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.updateUserAccount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """em""", """controllers.Application.managerHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Application.adminHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminuser""", """controllers.Application.userMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchprofiles""", """controllers.Application.getAllProfiles()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchbyservice""", """controllers.Application.getProfilesByService(service:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchbycounty""", """controllers.Application.getProfilesByCounty(county:String)"""),
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

  // @LINE:12
  private[this] lazy val controllers_Application_contact4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact4_invoker = createInvoker(
    Application_6.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_contactSend5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contactSend5_invoker = createInvoker(
    Application_6.contactSend(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contactSend",
      Nil,
      "POST",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_openLogin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_openLogin6_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Application_authenticate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_authenticate7_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_Application_accessDenied8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessdenied")))
  )
  private[this] lazy val controllers_Application_accessDenied8_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_Application_userHome9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_userHome9_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Application_addProfile10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprofile")))
  )
  private[this] lazy val controllers_Application_addProfile10_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Application_saveProfile11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprofile")))
  )
  private[this] lazy val controllers_Application_saveProfile11_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Application_getProfilesByUser12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofiles")))
  )
  private[this] lazy val controllers_Application_getProfilesByUser12_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Application_openProfile13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openProfile13_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Application_updateProfile14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProfile14_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Application_openUserAccount15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_openUserAccount15_invoker = createInvoker(
    Application_6.openUserAccount(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUserAccount",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_updateUserAccount16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_updateUserAccount16_invoker = createInvoker(
    Application_6.updateUserAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUserAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_managerHome17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("em")))
  )
  private[this] lazy val controllers_Application_managerHome17_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_Application_adminHome18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Application_adminHome18_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_Application_userMaintenance19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminuser")))
  )
  private[this] lazy val controllers_Application_userMaintenance19_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_Application_getAllUsers20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_getAllUsers20_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_Application_getAllProfiles21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchprofiles")))
  )
  private[this] lazy val controllers_Application_getAllProfiles21_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_Application_getProfilesByService22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchbyservice")))
  )
  private[this] lazy val controllers_Application_getProfilesByService22_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_Application_getProfilesByCounty23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchbycounty")))
  )
  private[this] lazy val controllers_Application_getProfilesByCounty23_invoker = createInvoker(
    Application_6.getProfilesByCounty(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProfilesByCounty",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """searchbycounty"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Application_openProfileAdmin24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openProfileAdmin24_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_Application_updateProfileAdmin25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProfileAdmin25_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_Application_deleteProfileConfirm26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteProfileConfirm26_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Application_deleteProfile27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprofile/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteProfile27_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_Application_findUser28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_findUser28_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_Application_getUserByEmail29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_getUserByEmail29_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_Application_updateUser30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser")))
  )
  private[this] lazy val controllers_Application_updateUser30_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_Application_exportUsers31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportusers/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportUsers31_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_Application_exportOpenFile32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportOpenFile/"), DynamicPart("fileName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportOpenFile32_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_Application_exportProfiles33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportprofiles/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportProfiles33_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_Application_openUser34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openuser")))
  )
  private[this] lazy val controllers_Application_openUser34_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_account_Signup_createAdmin35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addadmin")))
  )
  private[this] lazy val controllers_account_Signup_createAdmin35_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_account_Signup_saveAdmin36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addadmin")))
  )
  private[this] lazy val controllers_account_Signup_saveAdmin36_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_Application_getUserByUrl37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduserurl")))
  )
  private[this] lazy val controllers_Application_getUserByUrl37_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Application_deleteUserConfirm38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserConfirm38_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val controllers_Application_deleteUser39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUser39_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_account_Reset_resetAdmin40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetadmin/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_resetAdmin40_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_account_Reset_runResetAdmin41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetadmin/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runResetAdmin41_invoker = createInvoker(
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

  // @LINE:83
  private[this] lazy val controllers_account_settings_Index_index42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index42_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val controllers_account_settings_Password_index43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index43_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val controllers_account_settings_Password_runPassword44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword44_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val controllers_account_settings_Email_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index45_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val controllers_account_settings_Email_runEmail46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail46_invoker = createInvoker(
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

  // @LINE:90
  private[this] lazy val controllers_account_Signup_create47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create47_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val controllers_account_Signup_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save48_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_account_Signup_confirm49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm49_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val controllers_account_Reset_ask50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask50_invoker = createInvoker(
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

  // @LINE:98
  private[this] lazy val controllers_account_Reset_runAsk51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk51_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val controllers_account_Reset_reset52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset52_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val controllers_account_Reset_runReset53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset53_invoker = createInvoker(
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

  // @LINE:104
  private[this] lazy val controllers_account_settings_Email_validateEmail54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail54_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_Assets_at55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at55_invoker = createInvoker(
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
  
    // @LINE:12
    case controllers_Application_contact4_route(params) =>
      call { 
        controllers_Application_contact4_invoker.call(Application_6.contact())
      }
  
    // @LINE:13
    case controllers_Application_contactSend5_route(params) =>
      call { 
        controllers_Application_contactSend5_invoker.call(Application_6.contactSend())
      }
  
    // @LINE:16
    case controllers_Application_openLogin6_route(params) =>
      call { 
        controllers_Application_openLogin6_invoker.call(Application_6.openLogin())
      }
  
    // @LINE:17
    case controllers_Application_authenticate7_route(params) =>
      call { 
        controllers_Application_authenticate7_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:19
    case controllers_Application_accessDenied8_route(params) =>
      call { 
        controllers_Application_accessDenied8_invoker.call(Application_6.accessDenied())
      }
  
    // @LINE:22
    case controllers_Application_userHome9_route(params) =>
      call { 
        controllers_Application_userHome9_invoker.call(Application_6.userHome())
      }
  
    // @LINE:24
    case controllers_Application_addProfile10_route(params) =>
      call { 
        controllers_Application_addProfile10_invoker.call(Application_6.addProfile())
      }
  
    // @LINE:25
    case controllers_Application_saveProfile11_route(params) =>
      call { 
        controllers_Application_saveProfile11_invoker.call(Application_6.saveProfile())
      }
  
    // @LINE:27
    case controllers_Application_getProfilesByUser12_route(params) =>
      call { 
        controllers_Application_getProfilesByUser12_invoker.call(Application_6.getProfilesByUser())
      }
  
    // @LINE:29
    case controllers_Application_openProfile13_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_openProfile13_invoker.call(Application_6.openProfile(name))
      }
  
    // @LINE:30
    case controllers_Application_updateProfile14_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_updateProfile14_invoker.call(Application_6.updateProfile(name))
      }
  
    // @LINE:32
    case controllers_Application_openUserAccount15_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_openUserAccount15_invoker.call(Application_6.openUserAccount(email))
      }
  
    // @LINE:33
    case controllers_Application_updateUserAccount16_route(params) =>
      call { 
        controllers_Application_updateUserAccount16_invoker.call(Application_6.updateUserAccount())
      }
  
    // @LINE:36
    case controllers_Application_managerHome17_route(params) =>
      call { 
        controllers_Application_managerHome17_invoker.call(Application_6.managerHome())
      }
  
    // @LINE:39
    case controllers_Application_adminHome18_route(params) =>
      call { 
        controllers_Application_adminHome18_invoker.call(Application_6.adminHome())
      }
  
    // @LINE:41
    case controllers_Application_userMaintenance19_route(params) =>
      call { 
        controllers_Application_userMaintenance19_invoker.call(Application_6.userMaintenance())
      }
  
    // @LINE:43
    case controllers_Application_getAllUsers20_route(params) =>
      call { 
        controllers_Application_getAllUsers20_invoker.call(Application_6.getAllUsers())
      }
  
    // @LINE:45
    case controllers_Application_getAllProfiles21_route(params) =>
      call { 
        controllers_Application_getAllProfiles21_invoker.call(Application_6.getAllProfiles())
      }
  
    // @LINE:47
    case controllers_Application_getProfilesByService22_route(params) =>
      call(params.fromQuery[String]("service", None)) { (service) =>
        controllers_Application_getProfilesByService22_invoker.call(Application_6.getProfilesByService(service))
      }
  
    // @LINE:49
    case controllers_Application_getProfilesByCounty23_route(params) =>
      call(params.fromQuery[String]("county", None)) { (county) =>
        controllers_Application_getProfilesByCounty23_invoker.call(Application_6.getProfilesByCounty(county))
      }
  
    // @LINE:51
    case controllers_Application_openProfileAdmin24_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_openProfileAdmin24_invoker.call(Application_6.openProfileAdmin(name))
      }
  
    // @LINE:52
    case controllers_Application_updateProfileAdmin25_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_updateProfileAdmin25_invoker.call(Application_6.updateProfileAdmin(name))
      }
  
    // @LINE:54
    case controllers_Application_deleteProfileConfirm26_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_deleteProfileConfirm26_invoker.call(Application_6.deleteProfileConfirm(name))
      }
  
    // @LINE:55
    case controllers_Application_deleteProfile27_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_deleteProfile27_invoker.call(Application_6.deleteProfile(name))
      }
  
    // @LINE:57
    case controllers_Application_findUser28_route(params) =>
      call { 
        controllers_Application_findUser28_invoker.call(Application_6.findUser())
      }
  
    // @LINE:58
    case controllers_Application_getUserByEmail29_route(params) =>
      call { 
        controllers_Application_getUserByEmail29_invoker.call(Application_6.getUserByEmail())
      }
  
    // @LINE:60
    case controllers_Application_updateUser30_route(params) =>
      call { 
        controllers_Application_updateUser30_invoker.call(Application_6.updateUser())
      }
  
    // @LINE:62
    case controllers_Application_exportUsers31_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportUsers31_invoker.call(Application_6.exportUsers(data))
      }
  
    // @LINE:64
    case controllers_Application_exportOpenFile32_route(params) =>
      call(params.fromPath[String]("fileName", None)) { (fileName) =>
        controllers_Application_exportOpenFile32_invoker.call(Application_6.exportOpenFile(fileName))
      }
  
    // @LINE:66
    case controllers_Application_exportProfiles33_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportProfiles33_invoker.call(Application_6.exportProfiles(data))
      }
  
    // @LINE:68
    case controllers_Application_openUser34_route(params) =>
      call { 
        controllers_Application_openUser34_invoker.call(Application_6.openUser())
      }
  
    // @LINE:70
    case controllers_account_Signup_createAdmin35_route(params) =>
      call { 
        controllers_account_Signup_createAdmin35_invoker.call(Signup_5.createAdmin())
      }
  
    // @LINE:71
    case controllers_account_Signup_saveAdmin36_route(params) =>
      call { 
        controllers_account_Signup_saveAdmin36_invoker.call(Signup_5.saveAdmin())
      }
  
    // @LINE:73
    case controllers_Application_getUserByUrl37_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_getUserByUrl37_invoker.call(Application_6.getUserByUrl(email))
      }
  
    // @LINE:75
    case controllers_Application_deleteUserConfirm38_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUserConfirm38_invoker.call(Application_6.deleteUserConfirm(email))
      }
  
    // @LINE:76
    case controllers_Application_deleteUser39_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUser39_invoker.call(Application_6.deleteUser(email))
      }
  
    // @LINE:78
    case controllers_account_Reset_resetAdmin40_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_resetAdmin40_invoker.call(Reset_0.resetAdmin(token))
      }
  
    // @LINE:79
    case controllers_account_Reset_runResetAdmin41_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runResetAdmin41_invoker.call(Reset_0.runResetAdmin(token))
      }
  
    // @LINE:83
    case controllers_account_settings_Index_index42_route(params) =>
      call { 
        controllers_account_settings_Index_index42_invoker.call(Index_7.index())
      }
  
    // @LINE:84
    case controllers_account_settings_Password_index43_route(params) =>
      call { 
        controllers_account_settings_Password_index43_invoker.call(Password_1.index())
      }
  
    // @LINE:85
    case controllers_account_settings_Password_runPassword44_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword44_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:86
    case controllers_account_settings_Email_index45_route(params) =>
      call { 
        controllers_account_settings_Email_index45_invoker.call(Email_3.index())
      }
  
    // @LINE:87
    case controllers_account_settings_Email_runEmail46_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail46_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:90
    case controllers_account_Signup_create47_route(params) =>
      call { 
        controllers_account_Signup_create47_invoker.call(Signup_5.create())
      }
  
    // @LINE:91
    case controllers_account_Signup_save48_route(params) =>
      call { 
        controllers_account_Signup_save48_invoker.call(Signup_5.save())
      }
  
    // @LINE:94
    case controllers_account_Signup_confirm49_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm49_invoker.call(Signup_5.confirm(confirmToken))
      }
  
    // @LINE:97
    case controllers_account_Reset_ask50_route(params) =>
      call { 
        controllers_account_Reset_ask50_invoker.call(Reset_0.ask())
      }
  
    // @LINE:98
    case controllers_account_Reset_runAsk51_route(params) =>
      call { 
        controllers_account_Reset_runAsk51_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:101
    case controllers_account_Reset_reset52_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset52_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:102
    case controllers_account_Reset_runReset53_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset53_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:104
    case controllers_account_settings_Email_validateEmail54_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail54_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:107
    case controllers_Assets_at55_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at55_invoker.call(Assets_4.at(path, file))
      }
  }
}
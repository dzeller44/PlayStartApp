
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Nov 15 11:20:07 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:75
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseDashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def managerHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.managerHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "em"})
        }
      """
    )
  
    // @LINE:35
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser"})
        }
      """
    )
  
    // @LINE:39
    def openUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openuser"})
        }
      """
    )
  
    // @LINE:26
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:44
    def getUserByUrl: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByUrl",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduserurl" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
        }
      """
    )
  
    // @LINE:33
    def getUserByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:17
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:28
    def userMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminuser"})
        }
      """
    )
  
    // @LINE:19
    def addProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addprofile"})
        }
      """
    )
  
    // @LINE:20
    def saveProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addprofile"})
        }
      """
    )
  
    // @LINE:13
    def openLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:46
    def deleteUserConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserConfirm",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
        }
      """
    )
  
    // @LINE:32
    def findUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:47
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUser",
      """
        function(email) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
        }
      """
    )
  
    // @LINE:30
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:37
    def exportData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "export"})
        }
      """
    )
  
  }


}

// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Wed Nov 30 13:59:57 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:104
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:104
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

  
    // @LINE:33
    def managerHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.managerHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "em"})
        }
      """
    )
  
    // @LINE:57
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser"})
        }
      """
    )
  
    // @LINE:44
    def getProfilesByService: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProfilesByService",
      """
        function(service) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchbyservice" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("service", service)])})
        }
      """
    )
  
    // @LINE:65
    def openUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openuser"})
        }
      """
    )
  
    // @LINE:42
    def getAllProfiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllProfiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchprofiles"})
        }
      """
    )
  
    // @LINE:36
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:26
    def openProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openProfile",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:70
    def getUserByUrl: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByUrl",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduserurl" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
        }
      """
    )
  
    // @LINE:61
    def exportOpenFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportOpenFile",
      """
        function(fileName) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportOpenFile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fileName", encodeURIComponent(fileName))})
        }
      """
    )
  
    // @LINE:63
    def exportProfiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportProfiles",
      """
        function(data) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportprofiles/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data))})
        }
      """
    )
  
    // @LINE:55
    def getUserByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:19
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:51
    def deleteProfileConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteProfileConfirm",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:27
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProfile",
      """
        function(name) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:46
    def getProfilesByCounty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProfilesByCounty",
      """
        function(county) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchbycounty" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("county", county)])})
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
  
    // @LINE:38
    def userMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminuser"})
        }
      """
    )
  
    // @LINE:21
    def addProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addprofile"})
        }
      """
    )
  
    // @LINE:22
    def saveProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addprofile"})
        }
      """
    )
  
    // @LINE:49
    def updateProfileAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProfileAdmin",
      """
        function(name) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
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
  
    // @LINE:16
    def accessDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.accessDenied",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessdenied"})
        }
      """
    )
  
    // @LINE:52
    def deleteProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteProfile",
      """
        function(name) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:48
    def openProfileAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openProfileAdmin",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openprofile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:72
    def deleteUserConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserConfirm",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
        }
      """
    )
  
    // @LINE:54
    def findUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:24
    def getProfilesByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProfilesByUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getprofiles"})
        }
      """
    )
  
    // @LINE:73
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
  
    // @LINE:40
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
  
    // @LINE:29
    def openUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUserAccount",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
        }
      """
    )
  
    // @LINE:30
    def updateUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUserAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount"})
        }
      """
    )
  
    // @LINE:59
    def exportUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportUsers",
      """
        function(data) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportusers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data))})
        }
      """
    )
  
  }


}
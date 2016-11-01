
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Nov 01 12:30:13 MDT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:52
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseDashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def managerHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "em")
    }
  
    // @LINE:19
    def managerUserMaintenance(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emuser")
    }
  
    // @LINE:24
    def getUserByEmail(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "emfinduser")
    }
  
    // @LINE:10
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:13
    def openLogin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:21
    def managerSearch(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emsearch")
    }
  
    // @LINE:23
    def findUser(): Call = {
    
      () match {
      
        // @LINE:23
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "emfinduser")
      
      }
    
    }
  
    // @LINE:9
    def authenticate(): Call = {
    
      () match {
      
        // @LINE:9
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "login")
      
      }
    
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}
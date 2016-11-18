
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Fri Nov 18 14:50:54 MST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:69
package controllers.account.settings {

  // @LINE:72
  class ReverseEmail(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def validateEmail(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "email/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:73
    def runEmail(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "settings/email")
    }
  
    // @LINE:72
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "settings/email")
    }
  
  }

  // @LINE:70
  class ReversePassword(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "settings/password")
    }
  
    // @LINE:71
    def runPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "settings/password")
    }
  
  }

  // @LINE:69
  class ReverseIndex(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "settings")
    }
  
  }


}
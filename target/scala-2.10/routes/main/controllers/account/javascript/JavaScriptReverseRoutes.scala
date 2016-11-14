
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Thu Nov 10 10:02:23 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:41
package controllers.account.javascript {
  import ReverseRouteContext.empty

  // @LINE:41
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def saveAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.saveAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addadmin"})
        }
      """
    )
  
    // @LINE:58
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:41
    def createAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.createAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addadmin"})
        }
      """
    )
  
    // @LINE:62
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.confirm",
      """
        function(confirmToken) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken))})
        }
      """
    )
  
    // @LINE:59
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseReset(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runReset",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:65
    def ask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.ask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
    // @LINE:69
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.reset",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:66
    def runAsk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runAsk",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
  }


}
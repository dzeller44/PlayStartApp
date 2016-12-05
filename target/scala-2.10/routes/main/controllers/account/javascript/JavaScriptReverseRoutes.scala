
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Mon Dec 05 10:44:24 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:72
package controllers.account.javascript {
  import ReverseRouteContext.empty

  // @LINE:72
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def saveAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.saveAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addadmin"})
        }
      """
    )
  
    // @LINE:92
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:72
    def createAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.createAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addadmin"})
        }
      """
    )
  
    // @LINE:96
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.confirm",
      """
        function(confirmToken) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken))})
        }
      """
    )
  
    // @LINE:93
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseReset(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.reset",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:104
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runReset",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:81
    def runResetAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runResetAdmin",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resetadmin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:80
    def resetAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.resetAdmin",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetadmin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:99
    def ask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.ask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
    // @LINE:100
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
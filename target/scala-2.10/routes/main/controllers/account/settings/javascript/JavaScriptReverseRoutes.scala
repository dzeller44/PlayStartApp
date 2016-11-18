
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Fri Nov 18 15:25:28 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:71
package controllers.account.settings.javascript {
  import ReverseRouteContext.empty

  // @LINE:74
  class ReverseEmail(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.validateEmail",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:75
    def runEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.runEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
    // @LINE:74
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
  }

  // @LINE:72
  class ReversePassword(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
    // @LINE:73
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
  }

  // @LINE:71
  class ReverseIndex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Index.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
  }


}
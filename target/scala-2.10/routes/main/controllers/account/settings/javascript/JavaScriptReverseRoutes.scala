
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Wed Oct 26 11:29:53 MDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:15
package controllers.account.settings.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseEmail(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.validateEmail",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:19
    def runEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.runEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
    // @LINE:18
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReversePassword(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
    // @LINE:17
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseIndex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
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

// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/git/PlayAuthenticate/conf/routes
// @DATE:Tue Nov 15 11:20:07 MST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:51
package controllers.account.settings.javascript {
  import ReverseRouteContext.empty

  // @LINE:54
  class ReverseEmail(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.validateEmail",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:55
    def runEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.runEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
    // @LINE:54
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReversePassword(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
    // @LINE:53
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseIndex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
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
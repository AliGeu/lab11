
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab 10 ctd/conf/routes
// @DATE:Wed Dec 13 11:46:01 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:18
    def addCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addCustomer")
    }
  
    // @LINE:20
    def addCustomerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCustomerSubmit")
    }
  
    // @LINE:22
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def deleteCustomer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:28
    def updateCustomer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProduct")
    }
  
    // @LINE:9
    def customer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "customer")
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

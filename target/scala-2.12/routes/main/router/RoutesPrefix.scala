
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab10/conf/routes
// @DATE:Wed Dec 13 10:51:34 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

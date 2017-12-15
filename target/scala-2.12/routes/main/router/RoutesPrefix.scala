
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab 10 ctd/conf/routes
// @DATE:Fri Dec 15 15:44:31 GMT 2017


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


package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

    <nav class="navbar navbar-inverse">

        <div class="container-fluid">

         <div class="navbar-header">

        <a class="navbar-brand" href="#">Online Shop</a>

         </div>

         <ul class="nav navbar-nav">

            <li """),_display_(/*35.18*/if(title =="Products")/*35.40*/ {_display_(Seq[Any](format.raw/*35.42*/("""class="active"""")))}),format.raw/*35.57*/(""">
                <a href=""""),_display_(/*36.27*/routes/*36.33*/.HomeController.index()),format.raw/*36.56*/("""">Products</a>   
            </li>

            <li><a href="#">Services</a></li>

            <li><a href="#">Contact</a></li>

            <li><a href="/customer">Customers</a></li>

            <li """),_display_(/*45.18*/if(title=="Login")/*45.36*/{_display_(Seq[Any](format.raw/*45.37*/("""class="active"""")))}),format.raw/*45.52*/(""">
                """),_display_(/*46.18*/if(user != null)/*46.34*/ {_display_(Seq[Any](format.raw/*46.36*/("""
                """),format.raw/*47.17*/("""<a href=""""),_display_(/*47.27*/routes/*47.33*/.LoginController.logout()),format.raw/*47.58*/("""">Logout</a>
                """)))}/*48.19*/else/*48.24*/{_display_(Seq[Any](format.raw/*48.25*/("""
                """),format.raw/*49.17*/("""<a href=""""),_display_(/*49.27*/routes/*49.33*/.LoginController.login()),format.raw/*49.57*/("""">Login</a>
                """)))}),format.raw/*50.18*/("""    
            """),format.raw/*51.13*/("""</li>

       </ul>

    </div>

    </nav>

    <container>

    <row>

    <div class="col-md-12">

    """),_display_(/*65.6*/content),format.raw/*65.13*/("""

    """),format.raw/*67.5*/("""</div>

    </row>

    </container>

    <container>

    <row>

    <div class="col-md-12">

    Copyright <strong>Online Shop</strong>

    </div>

    </row>

    </container>

    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("javascripts/main.js")),format.raw/*87.65*/(""""></script>

</body>

</html> """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 16:18:13 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/main.scala.html
                  HASH: 40560d7bb48bb191e2d6f6ec3154ee996009c774
                  MATRIX: 970->1|1120->56|1148->58|1264->147|1290->152|1489->324|1504->330|1566->371|1881->659|1912->681|1952->683|1998->698|2053->726|2068->732|2112->755|2342->958|2369->976|2408->977|2454->992|2500->1011|2525->1027|2565->1029|2610->1046|2647->1056|2662->1062|2708->1087|2757->1118|2770->1123|2809->1124|2854->1141|2891->1151|2906->1157|2951->1181|3011->1210|3056->1227|3189->1334|3217->1341|3250->1347|3476->1546|3491->1552|3552->1592
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|67->35|67->35|67->35|67->35|68->36|68->36|68->36|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|81->49|82->50|83->51|97->65|97->65|99->67|119->87|119->87|119->87
                  -- GENERATED --
              */
          
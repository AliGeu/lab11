
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<div class="col-xs-4">
        <h3>Sign in</h3>
        """),_display_(/*7.10*/if(loginForm.hasGlobalErrors)/*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
            """),format.raw/*8.13*/("""<p class="alert alert-warning">
                """),_display_(/*9.18*/loginForm/*9.27*/.globalError.message),format.raw/*9.47*/("""
            """),format.raw/*10.13*/("""</p>
        """)))}),format.raw/*11.10*/("""
        """),_display_(/*12.10*/if(flash.containsKey("error"))/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
            """),format.raw/*13.13*/("""<p class="alert alert-warning">
                """),_display_(/*14.18*/flash/*14.23*/.get("loginRequired")),format.raw/*14.44*/("""
            """),format.raw/*15.13*/("""</p>
        """)))}),format.raw/*16.10*/("""

        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*18.80*/ {_display_(Seq[Any](format.raw/*18.82*/("""
            """),_display_(/*19.14*/CSRF/*19.18*/.formField),format.raw/*19.28*/("""

            """),format.raw/*21.13*/("""<div class="form-group">
                """),_display_(/*22.18*/inputText(loginForm("email"), '_label ->"",
                'class ->"form-control input-xs", 'placeholder -> "Email")),format.raw/*23.75*/("""
            """),format.raw/*24.13*/("""</div>
            <div class="form-group">
                    """),_display_(/*26.22*/inputPassword(loginForm("password"), '_label ->"",
                    'class ->"form-control input-xs", 'placeholder -> "Password")),format.raw/*27.82*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                    <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 15:53:11 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/login.scala.html
                  HASH: 1772c1574256a41c9351b244c24aefd0cdac5716
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1218->83|1245->102|1283->103|1314->108|1397->165|1434->194|1473->196|1513->209|1588->258|1605->267|1645->287|1686->300|1731->314|1768->324|1807->354|1847->356|1888->369|1964->418|1978->423|2020->444|2061->457|2106->471|2144->482|2159->488|2232->552|2272->554|2313->568|2326->572|2357->582|2399->596|2468->638|2607->756|2648->769|2740->834|2893->966|2934->979|3119->1133|3151->1138
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|50->18|50->18|50->18|51->19|51->19|51->19|53->21|54->22|55->23|56->24|58->26|59->27|60->28|64->32|65->33
                  -- GENERATED --
              */
          

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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add customer", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new customer</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.106*/ {_display_(Seq[Any](format.raw/*8.108*/("""
        """),format.raw/*9.37*/("""
        """),format.raw/*10.99*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.86*/("""
  
        """),_display_(/*15.10*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.75*/("""
  
        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Customer" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.index(0)),format.raw/*19.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*23.6*/(""" """),format.raw/*23.24*/("""
""")))}),format.raw/*24.27*/(""" """))
      }
    }
  }

  def render(customerForm:Form[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,user)

  def f:((Form[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,user) => apply(customerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 15:52:20 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/addCustomer.scala.html
                  HASH: 36e704048a34cc088fe905dd74bc910183ef0e0b
                  MATRIX: 987->1|1122->66|1167->63|1195->82|1222->84|1256->110|1295->112|1326->117|1396->162|1505->262|1545->264|1581->301|1618->400|1655->410|1668->414|1699->424|1737->435|1834->511|1874->524|1960->589|1999->601|2156->731|2171->737|2216->761|2364->879|2393->897|2426->924
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|47->15|47->15|49->17|51->19|51->19|51->19|55->23|55->23|56->24
                  -- GENERATED --
              */
          
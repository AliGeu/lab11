
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add customer")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new customer</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.106*/ {_display_(Seq[Any](format.raw/*8.108*/("""
        """),format.raw/*9.37*/("""
        """),format.raw/*10.99*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.86*/("""
  
        """),_display_(/*15.10*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.75*/("""
  
        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Customer" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.index),format.raw/*19.50*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*23.6*/(""" """),format.raw/*23.24*/("""
""")))}),format.raw/*24.27*/(""" """))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 16:34:07 GMT 2017
                  SOURCE: /home/wdd/webapps/lab10/app/views/addCustomer.scala.html
                  HASH: d75505fb117a8409cc353d6cac07c24420501f62
                  MATRIX: 969->1|1079->41|1124->38|1152->57|1179->59|1207->79|1246->81|1277->86|1347->131|1456->231|1496->233|1532->270|1569->369|1606->379|1619->383|1650->393|1688->404|1785->480|1825->493|1911->558|1950->570|2107->700|2122->706|2164->727|2312->845|2341->863|2374->890
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|47->15|47->15|49->17|51->19|51->19|51->19|55->23|55->23|56->24
                  -- GENERATED --
              */
          
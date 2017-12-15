
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add or update a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
        """),format.raw/*9.37*/("""
        """),format.raw/*10.99*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.99*/("""
        """),_display_(/*15.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*20.10*/("""
        """),_display_(/*21.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*21.87*/("""
        """),_display_(/*22.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.87*/("""
  
        """),_display_(/*24.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.74*/("""
  
        """),format.raw/*26.9*/("""<div class="actions">
            <input type="submit" value="Add/update Product" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.index(0)),format.raw/*28.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*32.6*/(""" """),format.raw/*32.24*/("""
""")))}),format.raw/*33.27*/(""" """))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 15:51:33 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/addProduct.scala.html
                  HASH: 341c613ce359f19b6db9ebd70d7e4ae39b5931ed
                  MATRIX: 985->1|1118->64|1163->61|1191->80|1218->82|1251->107|1290->109|1321->114|1400->168|1508->267|1548->269|1584->306|1621->405|1658->415|1671->419|1702->429|1740->440|1836->515|1873->525|1983->614|2020->624|2277->860|2314->870|2412->947|2449->957|2547->1034|2587->1047|2672->1111|2711->1123|2867->1252|2882->1258|2927->1282|3075->1400|3104->1418|3137->1445
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|52->20|53->21|53->21|54->22|54->22|56->24|56->24|58->26|60->28|60->28|60->28|64->32|64->32|65->33
                  -- GENERATED --
              */
          
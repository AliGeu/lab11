
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
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

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 14:06:25 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/addProduct.scala.html
                  HASH: fd16053f0dced342df0f4b4831d42d139808b1ad
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1175->57|1202->76|1241->78|1272->83|1351->137|1459->236|1499->238|1535->275|1572->374|1609->384|1622->388|1653->398|1691->409|1787->484|1824->494|1934->583|1971->593|2228->829|2265->839|2363->916|2400->926|2498->1003|2538->1016|2623->1080|2662->1092|2818->1221|2833->1227|2878->1251|3026->1369|3055->1387|3088->1414
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|52->20|53->21|53->21|54->22|54->22|56->24|56->24|58->26|60->28|60->28|60->28|64->32|64->32|65->33
                  -- GENERATED --
              */
          
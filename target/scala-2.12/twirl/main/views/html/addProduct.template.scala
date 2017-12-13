
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
        """),_display_(/*15.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*15.87*/("""
        """),_display_(/*16.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.87*/("""
  
        """),_display_(/*18.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.74*/("""
  
        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Add/update Product" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.index(0)),format.raw/*22.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*26.6*/(""" """),format.raw/*26.24*/("""
""")))}),format.raw/*27.27*/(""" """))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 11:46:01 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/addProduct.scala.html
                  HASH: 18af5dade98e20865d8cfcf8afae8099987c4a0d
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1175->57|1202->76|1241->78|1272->83|1351->137|1459->236|1499->238|1535->275|1572->374|1609->384|1622->388|1653->398|1691->409|1787->484|1824->494|1934->583|1971->593|2069->670|2106->680|2204->757|2244->770|2329->834|2368->846|2524->975|2539->981|2584->1005|2732->1123|2761->1141|2794->1168
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|50->18|50->18|52->20|54->22|54->22|54->22|58->26|58->26|59->27
                  -- GENERATED --
              */
          
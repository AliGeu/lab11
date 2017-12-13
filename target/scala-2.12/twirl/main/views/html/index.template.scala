
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/(products: List[models.Product], categories: List[models.Category])),format.raw/*3.69*/("""

"""),_display_(/*5.2*/main("Products")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
 """),format.raw/*6.2*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <div class="list-group">
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.index(0)),format.raw/*11.49*/("""" class="list-group-item">All categories</a>
        """),_display_(/*12.10*/for(c <- categories) yield /*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
          """),format.raw/*13.11*/("""<a href=""""),_display_(/*13.21*/routes/*13.27*/.HomeController.index(c.getId)),format.raw/*13.57*/("""" class="list-group-item">"""),_display_(/*13.84*/c/*13.85*/.getName),format.raw/*13.93*/("""
            """),format.raw/*14.13*/("""<span class="badge">"""),_display_(/*14.34*/c/*14.35*/.getProducts.size()),format.raw/*14.54*/("""</span>
          </a>
        """)))}),format.raw/*16.10*/("""
      """),format.raw/*17.7*/("""</div>
    </div>
    <div class="col-sm-10">
 """),format.raw/*20.66*/("""
 """),_display_(/*21.3*/if(flash.containsKey("success"))/*21.35*/ {_display_(Seq[Any](format.raw/*21.37*/("""
   """),format.raw/*22.4*/("""<div class="alert alert-success">
      """),_display_(/*23.8*/flash/*23.13*/.get("success")),format.raw/*23.28*/("""
   """),format.raw/*24.4*/("""</div>
 """)))}),format.raw/*25.3*/("""
    """),format.raw/*26.5*/("""</div>
  
<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>

      <th>Category</th>
      
      <th>Description</th>
      
      <th>Stock</th>
      
      <th class="numeric">Price</th>
      
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*53.55*/("""
    """),_display_(/*54.6*/for(p<-products) yield /*54.22*/ {_display_(Seq[Any](format.raw/*54.24*/("""
  
  """),format.raw/*56.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*60.12*/p/*60.13*/.getId),format.raw/*60.19*/("""</td>
      
      <td>"""),_display_(/*62.12*/p/*62.13*/.getName),format.raw/*62.21*/("""</td>

      <td>"""),_display_(/*64.12*/p/*64.13*/.getCategory.getName),format.raw/*64.33*/("""</td> 
      
      <td>"""),_display_(/*66.12*/p/*66.13*/.getDescription),format.raw/*66.28*/("""</td>
      
      <td>"""),_display_(/*68.12*/p/*68.13*/.getStock),format.raw/*68.22*/("""</td>
      
      <td class="numeric">&euro; """),_display_(/*70.35*/("%.2f".format(p.getPrice))),format.raw/*70.62*/("""</td>

      <td>
        <a href=""""),_display_(/*73.19*/routes/*73.25*/.HomeController.updateProduct(p.getId)),format.raw/*73.63*/("""" class="btn-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>
    </td>

      <td>
          <a href=""""),_display_(/*79.21*/routes/*79.27*/.HomeController.deleteProduct(p.getId)),format.raw/*79.65*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
      </td>

    
    </tr>
  """)))}),format.raw/*86.4*/(""" """),format.raw/*86.22*/("""
  
  """),format.raw/*88.3*/("""</tbody>
  
  </table>
  <p> 
    <a href=""""),_display_(/*92.15*/routes/*92.21*/.HomeController.addProduct()),format.raw/*92.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a>
  </p>

  <p> 
    <a href=""""),_display_(/*98.15*/routes/*98.21*/.HomeController.addCustomer()),format.raw/*98.50*/("""">
      <button class="btn btn-primary">Add a customer</button>
    </a>
  </p>
</div>
</div>
  """)))}),format.raw/*104.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 10:46:33 GMT 2017
                  SOURCE: /home/wdd/webapps/lab10/app/views/index.scala.html
                  HASH: c0a34605f013afc6c59d171ffaa8378d6db02bf5
                  MATRIX: 962->1|1089->33|1117->36|1204->103|1232->106|1256->122|1295->124|1323->126|1510->286|1525->292|1570->316|1651->370|1687->390|1727->392|1766->403|1803->413|1818->419|1869->449|1923->476|1933->477|1962->485|2003->498|2051->519|2061->520|2101->539|2164->571|2198->578|2273->689|2302->692|2343->724|2383->726|2414->730|2481->771|2495->776|2531->791|2562->795|2601->804|2633->809|3018->1216|3050->1222|3082->1238|3122->1240|3155->1246|3234->1298|3244->1299|3271->1305|3322->1329|3332->1330|3361->1338|3406->1356|3416->1357|3457->1377|3509->1402|3519->1403|3555->1418|3606->1442|3616->1443|3646->1452|3720->1499|3768->1526|3831->1562|3846->1568|3905->1606|4075->1749|4090->1755|4149->1793|4345->1959|4374->1977|4407->1983|4478->2027|4493->2033|4542->2061|4671->2163|4686->2169|4736->2198|4865->2296
                  LINES: 28->1|33->1|35->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|85->53|86->54|86->54|86->54|88->56|92->60|92->60|92->60|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|100->68|100->68|100->68|102->70|102->70|105->73|105->73|105->73|111->79|111->79|111->79|118->86|118->86|120->88|124->92|124->92|124->92|130->98|130->98|130->98|136->104
                  -- GENERATED --
              */
          
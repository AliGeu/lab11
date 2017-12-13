
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <div class="list-group">
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.index(0)),format.raw/*9.49*/("""" class="list-group-item">All categories</a>
        """),_display_(/*10.10*/for(c <- categories) yield /*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
          """),format.raw/*11.11*/("""<a href=""""),_display_(/*11.21*/routes/*11.27*/.HomeController.index(c.getId)),format.raw/*11.57*/("""" class="list-group-item">"""),_display_(/*11.84*/c/*11.85*/.getName),format.raw/*11.93*/("""
            """),format.raw/*12.13*/("""<span class="badge">"""),_display_(/*12.34*/c/*12.35*/.getProducts.size()),format.raw/*12.54*/("""</span>
          </a>
        """)))}),format.raw/*14.10*/("""
      """),format.raw/*15.7*/("""</div>
    </div>
    <div class="col-sm-10">
 """),format.raw/*18.66*/("""
 """),_display_(/*19.3*/if(flash.containsKey("success"))/*19.35*/ {_display_(Seq[Any](format.raw/*19.37*/("""
   """),format.raw/*20.4*/("""<div class="alert alert-success">
      """),_display_(/*21.8*/flash/*21.13*/.get("success")),format.raw/*21.28*/("""
   """),format.raw/*22.4*/("""</div>
 """)))}),format.raw/*23.3*/("""
    """),format.raw/*24.5*/("""</div>
  
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
    """),format.raw/*51.55*/("""
    """),_display_(/*52.6*/for(p<-products) yield /*52.22*/ {_display_(Seq[Any](format.raw/*52.24*/("""
  
  """),format.raw/*54.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*58.12*/p/*58.13*/.getId),format.raw/*58.19*/("""</td>
      
      <td>"""),_display_(/*60.12*/p/*60.13*/.getName),format.raw/*60.21*/("""</td>

      <td>"""),_display_(/*62.12*/p/*62.13*/.getCategory.getName),format.raw/*62.33*/("""</td> 
      
      <td>"""),_display_(/*64.12*/p/*64.13*/.getDescription),format.raw/*64.28*/("""</td>
      
      <td>"""),_display_(/*66.12*/p/*66.13*/.getStock),format.raw/*66.22*/("""</td>
      
      <td class="numeric">&euro; """),_display_(/*68.35*/("%.2f".format(p.getPrice))),format.raw/*68.62*/("""</td>

      <td>
        <a href=""""),_display_(/*71.19*/routes/*71.25*/.HomeController.updateProduct(p.getId)),format.raw/*71.63*/("""" class="btn-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>
    </td>

      <td>
          <a href=""""),_display_(/*77.21*/routes/*77.27*/.HomeController.deleteProduct(p.getId)),format.raw/*77.65*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
      </td>

    
    </tr>
  """)))}),format.raw/*84.4*/(""" """),format.raw/*84.22*/("""
  
  """),format.raw/*86.3*/("""</tbody>
  
  </table>
  <p> 
    <a href=""""),_display_(/*90.15*/routes/*90.21*/.HomeController.addProduct()),format.raw/*90.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a>
  </p>

  <p> 
    <a href=""""),_display_(/*96.15*/routes/*96.21*/.HomeController.addCustomer()),format.raw/*96.50*/("""">
      <button class="btn btn-primary">Add a customer</button>
    </a>
  </p>
</div>
</div>
  """)))}),format.raw/*102.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 11:47:13 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/index.scala.html
                  HASH: 9f4b13efa0475ccc74325a5c664bca6175c79fc8
                  MATRIX: 984->1|1146->68|1174->71|1198->87|1237->89|1265->91|1451->251|1465->257|1509->281|1590->335|1626->355|1666->357|1705->368|1742->378|1757->384|1808->414|1862->441|1872->442|1901->450|1942->463|1990->484|2000->485|2040->504|2103->536|2137->543|2212->654|2241->657|2282->689|2322->691|2353->695|2420->736|2434->741|2470->756|2501->760|2540->769|2572->774|2957->1181|2989->1187|3021->1203|3061->1205|3094->1211|3173->1263|3183->1264|3210->1270|3261->1294|3271->1295|3300->1303|3345->1321|3355->1322|3396->1342|3448->1367|3458->1368|3494->1383|3545->1407|3555->1408|3585->1417|3659->1464|3707->1491|3770->1527|3785->1533|3844->1571|4014->1714|4029->1720|4088->1758|4284->1924|4313->1942|4346->1948|4417->1992|4432->1998|4481->2026|4610->2128|4625->2134|4675->2163|4804->2261
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|46->14|47->15|50->18|51->19|51->19|51->19|52->20|53->21|53->21|53->21|54->22|55->23|56->24|83->51|84->52|84->52|84->52|86->54|90->58|90->58|90->58|92->60|92->60|92->60|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|100->68|100->68|103->71|103->71|103->71|109->77|109->77|109->77|116->84|116->84|118->86|122->90|122->90|122->90|128->96|128->96|128->96|134->102
                  -- GENERATED --
              */
          
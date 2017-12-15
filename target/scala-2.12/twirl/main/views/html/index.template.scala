
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/main("Products", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
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
          """),_display_(/*71.12*/if(user != null && user.getRole  == "admin")/*71.56*/ {_display_(Seq[Any](format.raw/*71.58*/("""  
        """),format.raw/*72.9*/("""<a href=""""),_display_(/*72.19*/routes/*72.25*/.HomeController.updateProduct(p.getId)),format.raw/*72.63*/("""" class="btn-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>""")))}),format.raw/*74.14*/("""
    """),format.raw/*75.5*/("""</td>

      <td>
          """),_display_(/*78.12*/if(user != null && user.getRole  == "admin")/*78.56*/ {_display_(Seq[Any](format.raw/*78.58*/("""  
          """),format.raw/*79.11*/("""<a href=""""),_display_(/*79.21*/routes/*79.27*/.HomeController.deleteProduct(p.getId)),format.raw/*79.65*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
            <span class="glyphicon glyphicon-trash"></span>
          </a> """)))}),format.raw/*81.17*/("""
      """),format.raw/*82.7*/("""</td>

    
    </tr>
  """)))}),format.raw/*86.4*/(""" """),format.raw/*86.22*/("""
  
  """),format.raw/*88.3*/("""</tbody>
  
  </table>
  <p> 
     
    """),_display_(/*93.6*/if(user != null && user.getRole  == "admin")/*93.50*/ {_display_(Seq[Any](format.raw/*93.52*/("""       
    """),format.raw/*94.5*/("""<a href=""""),_display_(/*94.15*/routes/*94.21*/.HomeController.addProduct()),format.raw/*94.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a> """)))}),format.raw/*96.11*/("""
  
  """),format.raw/*98.3*/("""</p>

  <p> 
    """),_display_(/*101.6*/if(user != null && user.getRole == "admin")/*101.49*/ {_display_(Seq[Any](format.raw/*101.51*/("""
    """),format.raw/*102.5*/("""<a href=""""),_display_(/*102.15*/routes/*102.21*/.HomeController.addCustomer()),format.raw/*102.50*/("""">
      <button class="btn btn-primary">Add a customer</button>
    </a> """)))}),format.raw/*104.11*/("""
  """),format.raw/*105.3*/("""</p>
</div>
</div>
  """)))}),format.raw/*108.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 16:36:19 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 10 ctd/app/views/index.scala.html
                  HASH: 11efe476f4cf242342d69e9b867845896046fdb9
                  MATRIX: 1002->1|1189->93|1217->96|1247->118|1286->120|1314->122|1500->282|1514->288|1558->312|1639->366|1675->386|1715->388|1754->399|1791->409|1806->415|1857->445|1911->472|1921->473|1950->481|1991->494|2039->515|2049->516|2089->535|2152->567|2186->574|2261->685|2290->688|2331->720|2371->722|2402->726|2469->767|2483->772|2519->787|2550->791|2589->800|2621->805|3006->1212|3038->1218|3070->1234|3110->1236|3143->1242|3222->1294|3232->1295|3259->1301|3310->1325|3320->1326|3349->1334|3394->1352|3404->1353|3445->1373|3497->1398|3507->1399|3543->1414|3594->1438|3604->1439|3634->1448|3708->1495|3756->1522|3812->1551|3865->1595|3905->1597|3943->1608|3980->1618|3995->1624|4054->1662|4186->1763|4218->1768|4274->1797|4327->1841|4367->1843|4408->1856|4445->1866|4460->1872|4519->1910|4686->2046|4720->2053|4775->2078|4804->2096|4837->2102|4904->2143|4957->2187|4997->2189|5036->2201|5073->2211|5088->2217|5137->2245|5242->2319|5275->2325|5320->2343|5373->2386|5414->2388|5447->2393|5485->2403|5501->2409|5552->2438|5659->2513|5690->2516|5743->2538
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|46->14|47->15|50->18|51->19|51->19|51->19|52->20|53->21|53->21|53->21|54->22|55->23|56->24|83->51|84->52|84->52|84->52|86->54|90->58|90->58|90->58|92->60|92->60|92->60|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|100->68|100->68|103->71|103->71|103->71|104->72|104->72|104->72|104->72|106->74|107->75|110->78|110->78|110->78|111->79|111->79|111->79|111->79|113->81|114->82|118->86|118->86|120->88|125->93|125->93|125->93|126->94|126->94|126->94|126->94|128->96|130->98|133->101|133->101|133->101|134->102|134->102|134->102|134->102|136->104|137->105|140->108
                  -- GENERATED --
              */
          
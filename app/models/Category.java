package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Category extends Model {

    //Properties
    
    @Id
    private Long  id;
   
    @Constraints.Required
    private String name;
   
    @OneToMany
    private List<Product> products;
    //Default constructor
    public Category() {

    }
    //Constructor to initialise object
    public Category(Long id, String name, List<Product> products){
        this.id=id;
        this.name=name;
        this.products=products;
        }

    //Accessor methods
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public List<Product> getProducts() {
        return products;
    }

   public void setName(String name) {
       this.name=name;
   }

    public void setId(Long id) {
        this.id=id;
    }

    public void setProducts(List<Product> products) {
        this.products=products;
    }


//noch mit in der klammer oder nicht?
public static Finder<Long, Category> find = new Finder<Long, Category>(Category.class);

public static List<Category> findAll(){
    return Category.find.query().where().orderBy("name asc").findList();
}
}

public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<>();

    for(Category c: Category.findAll() {
        options.put(c.getId().toString(), c.getName());
    }
    return options;
}
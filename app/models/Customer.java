package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Customer extends Model {

    //Properties
    
    @Id
    private Long  id;
   
    @Constraints.Required
    private String name;
   

    //Default constructor
    public Customer() {

    }
    //Constructor to initialise object
    public Customer(Long id, String name){
        this.id=id;
        this.name=name;
    }

    //Accessor methods
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


   public void setName(String name) {
       this.name=name;
   }

    public void setId(Long id) {
        this.id=id;
    }

//noch mit in der klammer oder nicht?
public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

public static final List<Customer> findAll(){
    return Customer.find.all();
}
}
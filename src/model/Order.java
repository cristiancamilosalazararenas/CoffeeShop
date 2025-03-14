package model;
import java.util.ArrayList;

public class Order {
    private static int currentId  = 1; //Es un atributo que se puede llamar sin gnerar una instancia
    private int id;
    
    private ArrayList<Product> products;

    public Order(){
        this.id = Order.currentId;
        Order.currentId++;
        
        this.products = new ArrayList();
    }

    public int getId() {
        return id;
    }
    
    
    
}

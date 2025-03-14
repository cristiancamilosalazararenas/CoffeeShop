package model;

public class Coffee extends Product {
    private CoffeeSize size; //También se puede colocar Enum como tipo de dato
    private String milkType = null;

    public Coffee(String name, float price, CoffeeSize size) {
        super(name, price);
        this.size = size;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public float getPrice() { //Aprender qué es override
        if (this.milkType != null){
            return (float)(super.getPrice() + super.getPrice()*0.05 + super.getPrice() * this.size.getPercentage()); //Es bastante importante aprender de casting
        }
        return super.getPrice() + super.getPrice() * this.size.getPercentage();
    }
    
    
}

package model;

public class CoffeeSize {
    private String size;
    private float percentage;

    public CoffeeSize(String size, float percentage) {
        this.size = size;
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    
    
}

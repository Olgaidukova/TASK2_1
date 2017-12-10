package Gifts;

public class Candy extends Sweet {
    private String type;
    public Candy (String name, double weight, float cost, String type) {
        super(name, weight,cost);
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", weight: " + getWeight() + ", cost: " +getCost()+ ", type: " + getType();
    }
}


package Gifts;

public abstract class Sweet {
    private String name;
    private double weight;
    private float cost;

    public Sweet(String name, double weight, float cost) {
        setName(name);
        setWeight(weight);
        setCost(cost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public abstract String toString();
}

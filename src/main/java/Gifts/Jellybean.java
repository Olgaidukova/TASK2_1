package Gifts;

public class Jellybean extends Sweet {
    private double ductility;
    public Jellybean(String name, double weight, float cost, double ductility) {
        super(name, weight, cost);
        setDuctility(ductility);
    }

    public void setDuctility(double ductility) {
        this.ductility = ductility;
    }

    public double getDuctility() {
        return ductility;
    }

    public String toString() {
        return "name: " + getName() + ", weight: " + getWeight() + ", cost: " +getCost()+ ", ductility: " + getDuctility();
    }
}


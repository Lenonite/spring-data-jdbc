package demo;

public class ChicagoPizza extends PizzaTemplate {
    @Override
    public void prepared() {
        System.out.println("Chicago::prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicago::baked");

    }

    @Override
    public void topping() {
        System.out.println("Chicago:: Topping");
    }

    @Override
    public void serve() {
        System.out.println("Chicago:: Served");
    }

    @Override
    public void checkBill() {
        System.out.println("Chicago:: CHeckBill");
    }
}

package demo;

public class NewYorkPizza extends PizzaTemplate {
    @Override
    public void prepared() {
        System.out.println("NEwYorK::prepared");
    }

    @Override
    public void bake() {
        System.out.println("NewYork::baked");
    }

    @Override
    public void topping() {
        System.out.println("NEWYork::topping");
    }

    @Override
    public void serve() {
        System.out.println("NEWYork::served");
    }

    @Override
    public void checkBill() {
        System.out.println("NEwYork::checkBill");
    }
}

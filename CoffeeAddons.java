public class CoffeeAddons implements ICoffee {
    ICoffee decoratedCoffee;

    CoffeeAddons(ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String coffeeDetails() {
        return decoratedCoffee.coffeeDetails();
    }
}


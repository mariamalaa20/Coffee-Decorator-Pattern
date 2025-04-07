public class MilkAddon extends CoffeeAddons {
    MilkAddon(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String coffeeDetails() {
        return decoratedCoffee.coffeeDetails() + " with milk added";
    }
}

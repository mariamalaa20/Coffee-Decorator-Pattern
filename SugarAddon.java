public class SugarAddon extends CoffeeAddons {
    SugarAddon(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String coffeeDetails() {
        return decoratedCoffee.coffeeDetails() + " with sugar added";
    }
}

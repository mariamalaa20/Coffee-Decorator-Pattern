public class Main {
        public static void main(String[] args) {
            ICoffee coffee = new PlainCoffee();
    
            System.out.println("Your coffee: "
                    + coffee + " is prepared as plain coffee");
    
            coffee = new MilkAddon(coffee);
            System.out.println("Milk has been added to your coffee: "
                    + coffee);
    
            coffee = new SugarAddon(coffee);
            System.out.println("Sugar has been added to your coffee: "
                    + coffee);
        }
    }
    
public class HealthyBurger extends StandardBurger {


    public HealthyBurger(String meat, float price) {
        super("brown", meat, price);
    }


    public double totalPrice(boolean lettuce, boolean tomato, boolean pickle, boolean onion) {
        double priceOfBaseBurger = 5;
        double priceOfLettuce = 0.5;
        double priceOfTomato = 1;
        double priceOfPickle = 2;
        double priceOfOnion = 0.5;
        double finalPrice = 0;

        if (lettuce) {
            finalPrice += priceOfLettuce;
            System.out.println("Lettuce added for: " + priceOfLettuce);
        }
        if (tomato) {
            finalPrice += priceOfTomato;
            System.out.println("Tomato added for: " + priceOfTomato);
        }
        if (pickle) {
            finalPrice += priceOfPickle;
            System.out.println("Pickle added for: " + priceOfPickle);
        }
        if (onion) {
            finalPrice += priceOfOnion;
            System.out.println("Onion added for: " + priceOfOnion);
        }

        finalPrice += priceOfBaseBurger;
        System.out.println("Standard Burger costs: " + finalPrice);
        return finalPrice;
    }


    public void inspect(){

        System.out.println("Base price of Standard Burger is: " + priceOfBaseBurger);
        System.out.println("Cost of adding extra Lettuce is: " + priceOfLettuce);
        System.out.println("Cost of adding extra Tomato is: " + priceOfTomato);
        System.out.println("Cost of adding extra Pickle is: " + priceOfPickle);
        System.out.println("Cost of adding extra Onion is: " + priceOfOnion);
        System.out.println("Sum is: " + (priceOfOnion+priceOfLettuce+priceOfTomato+priceOfPickle+priceOfOnion));
    }
}
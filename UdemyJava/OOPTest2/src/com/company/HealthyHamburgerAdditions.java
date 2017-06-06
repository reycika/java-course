package com.company;

public class HealthyHamburgerAdditions {

    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    private boolean carrot;
    private boolean onion;
    private boolean chilli;
    private boolean sauce;
    private double healthyHamburgerPrice;

    public HealthyHamburgerAdditions(boolean lettuce, boolean tomato, boolean pickles,
                                     boolean carrot, boolean onion, boolean chilli, boolean sauce) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.carrot = carrot;
        this.onion = onion;
        this.chilli = chilli;
        this.sauce = sauce;
        this.healthyHamburgerPrice = 4.0;
    }

    HealthyHamburgerAdditionsPrice additionsPrice = new HealthyHamburgerAdditionsPrice();

    public void choose() {
        int itemsSelected = 0;
        double additionPriceTotal = 0.0;

        if (isLettuce()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " +  "Lettuce " +
                    ".... " + additionsPrice.getLettuce());
            additionPriceTotal += additionsPrice.getLettuce();
        }

        if (isTomato()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " +  "Tomato " +
                    ".... " + additionsPrice.getTomato());
            additionPriceTotal += additionsPrice.getTomato();
        }

        if (isCarrot()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " +  "Carrot " +
                    ".... " + additionsPrice.getCarrot());
            additionPriceTotal += additionsPrice.getCarrot();
        }

        if (isChilli()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " + "Chilli " +
                    ".... " + additionsPrice.getChilli());
            additionPriceTotal += additionsPrice.getChilli();
        }

        if (isOnion()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " + "Onion " +
                    ".... " + additionsPrice.getOnion());
            additionPriceTotal += additionsPrice.getOnion();
        }

        if (isPickles()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " + "Pickles " +
                    ".... " + additionsPrice.getPickles());
            additionPriceTotal += additionsPrice.getPickles();
        }

        if (isSauce()) {
            itemsSelected++;
            System.out.println("(" + itemsSelected + ") " + "Sauce " +
                    ".... " + additionsPrice.getSauce());
            additionPriceTotal += additionsPrice.getSauce();
        }

        if (itemsSelected > 6 && itemsSelected > 0) {
            System.out.println("You can have up to 6 additional items in hamburger. You chose " + itemsSelected + ". Unpick " + (itemsSelected-6));
        } else if (itemsSelected == 0) {
            System.out.println("Plain hamburger without additions ... " + this.healthyHamburgerPrice);
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("Base cost of hamburger without additions is " + this.healthyHamburgerPrice);
            System.out.println("Total price of additions is " + String.format("%.2f",additionPriceTotal));
            double total = getHealthyHamburgerPrice() + additionPriceTotal;
            System.out.println("-----------------------------------");
            System.out.println("TOTAL: " + total);
        }
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPickles() {
        return pickles;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isChilli() {
        return chilli;
    }

    public boolean isSauce() {
        return sauce;
    }

    public double getHealthyHamburgerPrice() {
        return healthyHamburgerPrice;
    }
}

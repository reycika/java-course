package com.company;

public class Hamburger {

    private boolean breadRoll;
    private boolean meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    private boolean carrot;
    private boolean onion;
    private boolean chilli;
    private boolean sauce;
    private double hamPrice;
    private int numberOfAdditions;
    private double additionPrice;

    public Hamburger(boolean lettuce, boolean tomato, boolean pickles,
                     boolean carrot, boolean onion, boolean chilli, boolean sauce) {

        this.breadRoll = true;
        this.meat = true;
        this.hamPrice = 3.5;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.carrot = carrot;
        this.onion = onion;
        this.chilli = chilli;
        this.sauce = sauce;
        this.numberOfAdditions = 0;
        this.additionPrice = 0;

        AdditionsPrice additionsPrice = new AdditionsPrice();

        if (this.lettuce) {
            this.numberOfAdditions++;
            System.out.println("Add lettuce " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getLettuce());
            this.additionPrice += additionsPrice.getLettuce();
        }

        if (this.tomato) {
            this.numberOfAdditions++;
            System.out.println("Add tomato " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getTomato());
            this.additionPrice += additionsPrice.getTomato();
        }

        if (this.pickles) {
            this.numberOfAdditions++;
            System.out.println("Add pickles " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getPickles());
            this.additionPrice += additionsPrice.getPickles();
        }

        if (this.carrot) {
            this.numberOfAdditions++;
            System.out.println("Add carrot " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getCarrot());
            this.additionPrice += additionsPrice.getCarrot();
        }

        if (this.onion) {
            this.numberOfAdditions++;
            System.out.println("Add onion " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getOnion());
            this.additionPrice += additionsPrice.getOnion();
        }

        if (this.chilli) {
            this.numberOfAdditions++;
            System.out.println("Add chilli " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getChilli());
            this.additionPrice += additionsPrice.getChilli();
        }

        if (this.sauce) {
            this.numberOfAdditions++;
            System.out.println("Add sauce " + "(" + numberOfAdditions + ")" +
                    ".... " + additionsPrice.getSauce());
            this.additionPrice += additionsPrice.getSauce();
        }

        if (this.numberOfAdditions > 4 && this.numberOfAdditions > 0) {
            System.out.println("You can only have up to 4 additional items in hamburger. You chose " + this.numberOfAdditions + ". Unpick " + (this.numberOfAdditions-4));
        } else if (this.numberOfAdditions == 0) {
            System.out.println("Plain hamburger without additions ... " + this.hamPrice);
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("Base cost of hamburger without additions is " + this.hamPrice);
            System.out.println("Total price of additions is " + String.format("%.2f",this.additionPrice));
            double total = this.hamPrice + this.additionPrice;
            System.out.println("-----------------------------------");
            System.out.println("TOTAL: " + total);
        }
    }
}

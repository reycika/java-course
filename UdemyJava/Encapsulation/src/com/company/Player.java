package com.company;

/**
 * Created by Reycika on 5.6.2017.at 16:43
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("The player knocked out");
            // Reduce number of lives of the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}

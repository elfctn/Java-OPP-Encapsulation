
package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        // Apply health constraints
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // No getters or setters for name, healthPercentage, weapon as per requirements

    // Method to get remaining health
    public int healthRemaining() {
        return this.healthPercentage;
    }

    // Method to lose health
    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            this.healthPercentage = 0; // Ensure health doesn't go below 0
            System.out.println(this.name + " player has been knocked out of game");
        }
    }

    // Method to restore health
    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100; // Ensure health doesn't exceed 100
        }
    }
}
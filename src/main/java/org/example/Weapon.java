
package org.example;

public enum Weapon {
    SWORD(15, 1.2),
    DAGGER(8, 2.5),
    AXE(20, 0.9);

    private final int damage;
    private final double attackSpeed;

    // Constructor for enum constants
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getters for enum fields
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
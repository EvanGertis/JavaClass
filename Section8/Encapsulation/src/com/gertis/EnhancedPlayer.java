package com.gertis;

public class EnhancedPlayer {
    private String name;
    private int hitpoints;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon)
    {
        this.name = name;
        if(health > 0 && health <= 100)
        {
            this.hitpoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0)
        {
            System.out.println("Player knowcked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
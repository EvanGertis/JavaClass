package com.gertis;

public class Player {

    public String full_name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            System.out.println("Player knowcked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}

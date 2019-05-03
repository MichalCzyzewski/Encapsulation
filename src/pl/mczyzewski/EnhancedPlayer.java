package pl.mczyzewski;

public class EnhancedPlayer
{
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitpoints, String weapon)
    {
        this.name = name;
        if(hitpoints <= 0 && hitpoints <= 100)
        {
            this.hitpoints = hitpoints;
        }

        this.weapon = weapon;
    }

    public int getHitpoints()
    {
        return hitpoints;
    }

    public void loseHealth(int damage)
    {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0)
        {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }

    }
}

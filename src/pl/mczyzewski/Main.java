package pl.mczyzewski;

public class Main
{

    public static void main(String[] args)
    {
        Player player = new Player();
        player.health= 122;
        player.fullName = "Micheal";
        player.weapon = "Riffel";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        damage = 112;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

    }
}

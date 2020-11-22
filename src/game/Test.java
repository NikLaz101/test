package game;

import game.player.Player;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.setName("TEST#001");
        player2.setName("TEST#002");
        
        System.out.println(player1);
        System.out.println(player2);
        
        player1.useSkill(0, player2);
        player2.useSkill(1, player1);
        
        System.out.println(player1);
        System.out.println(player2);
        
        player1.useSkill(2, player1);
        
        System.out.println(player1);
        System.out.println(player2);
    }
}
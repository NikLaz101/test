package game.player;

import game.skill.Skill;

public class Player {
    private final int MAX_HP = 50;
    private int currentHP;
    private String name;

    public Player() {
        currentHP = MAX_HP;
    }
    
    public void setName(String name) {
        this.name = name; 
    }
    
    public String getName() {
        return name;
    }

    public int getMAX_HP() {
        return MAX_HP;
    }

    public int getCurrentHP() {
        return currentHP;
    }
    
    public void useSkill(int index, Player anotherPlayer) {
        String tempSkill = Skill.values()[index].toString();
        switch (index) {
            case 0 -> {
                System.out.println(getName() + " use " + tempSkill + " to " + anotherPlayer.getName());
                currentHP = getCurrentHP() - 10;
                checkDmg(this);
                break;
            }
            case 1 -> {
                System.out.println(getName() + " use " + tempSkill + " to " + anotherPlayer.getName());
                currentHP = getCurrentHP() - 200;
                checkDmg(this);
                break;
            }
            case 2 -> {
                System.out.println(getName() + " use " + tempSkill + " to " + anotherPlayer.getName());
                currentHP = getCurrentHP() + 5;
                if (getCurrentHP() > getMAX_HP()) {
                    currentHP = getMAX_HP();
                }
                break;
            }
        }
    }
    
    public void checkDmg(Player player) {
        if (player.getCurrentHP() <= 0) {
            currentHP = 0;
            System.out.println(player.getName() + " fainted");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append("[").append(getCurrentHP()).append("]: ");
        for (int i = 0; i < getCurrentHP(); ++i) {
            sb.append("\u25a0");
        }
        return sb.toString();
    }
}

package Activity14;

public class Character {
    private String name;
    private int health, attackpt, strength;

    public Character(){
    }
    public Character(String charName){
        this.name = charName;
    }
    public Character(String charName, int charHealth, int charAttackpt, int charStrength){
        this.name = charName;
        this.health = charHealth;
        this.attackpt = charAttackpt;
        this.strength = charStrength;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }
    public void setHealth(int newHealth, int strength){
        if (strength > 10){
            health = newHealth + 5;
        }
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
}

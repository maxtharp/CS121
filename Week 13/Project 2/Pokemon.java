package Project;
public class Pokemon {
    public String pokemonName, pokemonMove;
    public int pokemonPower, pokemonHP, pokemonSpeed;

    public String displayPokemonStats(){
        return ("Name: " + getName() + "\nHP: " + getHP() + "\nMove: " + getMove() + "\nPower: " + getPower() + "\nSpeed: " + getSpeed());
    }
    Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed){
        this.pokemonName = name;
        this.pokemonHP = hitPoints;
        this.pokemonMove = move;
        this.pokemonPower = movePower;
        this.pokemonSpeed = attackSpeed;
    }
    public String getName(){
        return pokemonName;
    }
    public int getHP() {
        return pokemonHP;
    }
    public String getMove(){
        return pokemonMove;
    }
    public int getPower(){
        return pokemonPower;
    }
    public int getSpeed() {
        return pokemonSpeed;
    }
}

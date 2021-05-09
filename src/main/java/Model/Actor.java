package Model;

import Model.Enum.CreatureType;

// Basic actor that can be a player, opponent or any entity that has life
public class Actor {
    private CreatureType type;
    private int hitPoints;
    private int attack;
    private int defense;
    private int modifier;

    public int calculateDamage() {
       return attack - defense;
    }
}

package Entities.Mobiles;
import Entities.Item;
import java.util.*;
import BaseClasses.Position;
import BaseClasses.Region;

public class Player extends Mobile {



    /**
     * @param startingHealth - Spawning a player with how much health.
     */
    public Player(int startingHealth){
        this.health = startingHealth;
        this.Inventory = new ArrayList<>();
    }
    /**
     * @param startingHealth - Spawning a player with how much health.
     * @param startingInventory - Spawning a player with a specified inventory
     */

    public Player(int startingHealth, ArrayList<Item> startingInventory){
        this.health = startingHealth;
        this.Inventory = startingInventory;
    }

    /**
     * @param startingHealth - Spawning a player with how much health.
     * @param startingInventory - Spawning a player with a specified inventory
     * @param startingPosition - Spawing a player with a specified starting poition
     */

    public Player(int startingHealth, ArrayList<Item> startingInventory, Position startingPosition){
        this.health = startingHealth;
        this.Inventory = startingInventory;
        this.position = startingPosition;
    }
}
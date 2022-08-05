package net.encrafted.plugin.players;

public class CustomPlayer {
    /**
     * Increment the player's health by 1.
     */
    public void incrementHealth() { }

    /**
     * Add mana to the player
     * @param mana The amount of mana to add
     */
    public void addMana(int mana) { }

    /**
     * Remove mana from a player
     * @param mana The amount of mana to remove
     * @return whether the player has enough mana to remove
     */
    public boolean removeMana(int mana) {
        return false;
    }

    /**
     * Check if a player has more than a certain amount of mana
     * @param mana The threshold
     * @return whether the player has enough mana
     */
    public boolean hasMana(int mana) {
        return false;
    }

    /**
     * Add money to a player
     * @param amount The amount to add
     */
    public void addMoney(int amount) { }
}

package net.encrafted.plugin.spells.spells.utils.damage;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * The class that manages damage
 */
public class  DamageManager implements Listener {
    /**
     * Does damage to a specific entity
     * @param damagee The entity to damage
     * @param damager The entity that did the damage
     * @param spellName The name of the spell that did the damage
     * @param damage The amount of damage to do
     */
    public static boolean doDamage(LivingEntity damagee, LivingEntity damager, String spellName, int damage) {
        return false;
    }

    /**
     * Do a certain amount of damage to an entity and track the damage
     * @param damage The damage to deal
     * @param arrow The arrow that was fired
     * @param entity The entity that was hit
     * @param event The event that was run
     */
    public static boolean doArrowDamage(int damage, Arrow arrow, Entity entity, EntityDamageByEntityEvent event) {
        return false;
    }

    /**
     * Check if a player is NOT allowed to do damage (note that this generally only happens with NPCs and players with PvP off).
     * @param player The player to check
     * @param damaged The entity damaged
     * @return If they are NOT allowed to do damage
     */
    public static boolean isNotAllowedToDoDamage(Player player, Entity damaged) {
        return false;
    }
}

package net.encrafted.plugin.spells.spells.utils;

import lombok.Getter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.function.Predicate;

/**
 * The class that manages entity highlighting
 */
public class EntityHighlighter {

    @Getter
    private static final EntityHighlighter mainInstance = new EntityHighlighter();
    @Getter
    private static final EntityHighlighter lookingInstance = new EntityHighlighter();

    /**
     * Highlights an entity in the player's line of sight
     * @param player The player to check
     */
    public void highlightSingleEntity(Player player, Entity entity) { }

    /**
     * Remove highlighting from all entities for a player
     * @param player The player
     */
    public void removeHighlightFromALl(Player player) { }

    /**
     * Remove highlighting from all entities except a specific one for a player
     * @param player The player
     * @param entity The entity not to remove highlight from
     */
    public void removeHighlightFromALlNot(Player player, Entity entity) { }

    /**
     * Highlights an entity if the player is looking at them
     * @param player The player
     * @param range The range to check in
     * @param bounds The distance around the crosshair to check
     * @param blockedByShield If the ray is blocked by a shield
     * @param filter The filter
     */
    public void highlightEntityIfLooking(Player player, int range, double bounds, boolean blockedByShield, Predicate<Entity> filter) { }
}

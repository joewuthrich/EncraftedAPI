package net.encrafted.plugin.spells.spells.utils;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The class that manages ray tracing and getting blocks/entities
 */
public class RayTraceUtils {

    /**
     * Get an entity in the player looking direction, not including the player themselves
     * @param player The player searching
     * @param length The total length of the ray
     * @param bounds The area around the ray to check at each position
     * @param blockedByShield If the ray can be blocked by a shield
     * @return An entity if it's found, else null
     */
    public static Entity rayTraceEntityNoPlayer(Player player, double length, double bounds, boolean blockedByShield) {
        return null;
    }

    /**
     * Get all entities in a player's line of sight
     * @param caster The entity searching
     * @param length The total length of the ray
     * @param bounds The area around the ray to check at each position
     * @param filter Entities to filter out
     * @param blockedByShield If the ray can be blocked by a shield
     * @return An arraylist of entities in the player's line of sight
     */
    public static ArrayList<Entity> getEntitiesInLineOfSight(LivingEntity caster, double length, double bounds, @Nullable Predicate<Entity> filter,
                                                             boolean blockedByShield) {
        return null;
    }

    /**
     * Get an entity in the player looking direction
     * @param player The player searching
     * @param length The total length of the ray
     * @param bounds The area around the ray to check at each position
     * @param filter Entities to filter out
     * @param blockedByShield If the ray can be blocked by a shield
     * @return An entity if it's found, else null
     */
    public static Entity rayTraceEntity(Player player, double length, double bounds, Predicate<Entity> filter, boolean blockedByShield) {
        return null;
    }

    /**
     * Get an entity in a cone in front of another entity
     * @param location The location to start the check at
     * @param direction The direction to check in
     * @param range The range to check
     * @param dotBound The dot angle bound (1 = directly in front, 0 = anywhere in front, -1 = anywhere around)
     * @param nameFilter A list of entities to filter out based on their name
     * @return The entity if found, else null
     */
    public static LivingEntity getEntityInFront(final Location location, final Vector direction, double range, double dotBound, List<String> nameFilter) {
        return null;
    }

    /**
     * Get the probable target of an entity by searching in it's looking direction
     * @param player The entity searching
     * @param length The total length of the ray
     * @param bounds The area around the ray to check at each position
     * @param filter Entities to filter out
     * @return An entity if it's found, else null
     */
    public static LivingEntity getProbableTarget(Player player, double length, double bounds, Predicate<Entity> filter) {
        return null;
    }

    /**
     * Get the probable target of an entity by searching in it's looking direction
     * @param location The location to search from
     * @param direction The direction to search in
     * @param length The total length of the ray
     * @param bounds The area around the ray to check at each position
     * @param filter Entities to filter out
     * @return An entity if it's found, else null
     */
    public static LivingEntity getProbableTarget(Location location, Vector direction, double length, double bounds, Predicate<Entity> filter) {
        return null;
    }

    /**
     * Check if there are no impassible blocks between two locations.
     * @param loc1 The first location
     * @param loc2 The second location
     * @return If the first location can see the second location
     */
    public static boolean hasLineOfSight(Location loc1, Location loc2) {
        return false;
    }

    /**
     * Check if an entity is in front of a location
     * @param location The location
     * @param direction The direction which describes forward
     * @param entity The entity to check
     * @param bound The maximum bounds that defines in front (1 is directly in front, -1 is directly behind)
     * @return If the entity is in front of the location
     */
    public static boolean isInFront(Location location, Vector direction, Entity entity, double bound) {
        return false;
    }

    /**
     * Get a closest block in a player direction
     * @param player The player
     * @param direction The direction to search in
     * @param maxDistance The maximum distance to check
     * @return The closest block, or null if it doesn't exist.
     */
    public static Block getClosestBlock(Player player, Vector direction, int maxDistance) {
        return null;
    }

    /**
     * Get the block a player is looking at
     * @param player The player
     * @param direction The direction to search in
     * @param maxDistance The maximum distance
     * @param blockedByShield If the ray is blocked by a shield
     * @param blockFilter Blocks to filter in (if true, you've found the block)
     * @param blockedByBarrier If the ray should be blocked by a barrier
     * @param blockedByNotPassable If the ray should be blocked by any block that is not passable
     * @return The block, or null if none exists
     */
    public static Block getBlockLocation(Player player, Vector direction, int maxDistance, boolean blockedByShield,
                                         Predicate<Block> blockFilter, boolean blockedByBarrier, boolean blockedByNotPassable) {
        return null;
    }

    /**
     * Check if a player is on the ground
     * @param player The player to check
     * @return If the player is on the ground
     */
    public static boolean isOnGround(LivingEntity player) {
        return false;
    }
}

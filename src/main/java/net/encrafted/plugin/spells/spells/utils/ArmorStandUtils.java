package net.encrafted.plugin.spells.spells.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

/**
 * The class that deals with armorstand spawning
 */
public class ArmorStandUtils {
    /**
     * Get a minecraft head from skull data
     * @param skullData The skull data as a string
     * @return The minecraft head
     */
    public static ItemStack getSkull(String skullData) {
        return null;
    }

    /**
     * Get an armorstand with the specified head texturew-
     * @param livingEntity The livingEntity to spawn the armorstand at
     * @param skullData The texture of the head (The part in SkullOwner: {})
     * @param isChild If the armorstand is a child
     * @return The armorstand entity as an Entity
     */
    public static Entity getHeadEntity(LivingEntity livingEntity, String skullData, boolean isChild) {
        return null;
    }

    /**
     * Get an armorstand with the specified head texture
     * @param location The location to spawn the head at
     * @param velocity The velocity to throw blocks at
     * @param block The block material
     * @param isChild If the armorstand is a child
     * @param duration The total time before the block disappears
     * @param onFire whether the block should be on fire or not
     * @return The armorstand created
     */
    public static ArmorStand throwBlock(Location location, Vector velocity, Material block, boolean isChild, int duration,
                                        boolean onFire) {
        return null;
    }

    /**
     * Get an armorstand with the specified item as head
     * @param livingEntity The livingEntity to spawn the armorstand at
     * @param material The material of the head
     * @param isChild If the armorstand is a child
     * @return The armorstand entity as an Entity
     */
    public static Entity getItemHeadEntity(LivingEntity livingEntity, Material material, boolean isChild) {
        return null;
    }

    /**
     * Get an armorstand with the specified item as head
     * @param location The location to spawn the armorstand at
     * @param itemStack The itemstack of the head
     * @param isChild If the armorstand is a child
     * @return The armorstand entity as an Entity
     */
    public static Entity getItemHeadEntity(Location location, Vector velocity, ItemStack itemStack, boolean isChild) {
        return null;
    }

    /**
     * Get an armorstand with the specified item in it's hand
     * @param player The player to spawn the armorstand at
     * @param spawnLocation The spawn location of the armorstand
     * @param item The item to put in the hand
     * @param isChild If the armorstand is a child
     * @param velocity If the armorstand is a child
     * @param ticksTillItem The number of ticks till the item appears on the entity
     * @return The armorstand entity as an Entity
     */
    public static ArmorStand getItemHandEntity(Player player, Location spawnLocation, ItemStack item, boolean isChild,
                                               Vector velocity, int ticksTillItem) {
        return null;
    }
}

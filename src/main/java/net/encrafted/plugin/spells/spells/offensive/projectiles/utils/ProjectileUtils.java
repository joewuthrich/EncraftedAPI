package net.encrafted.plugin.spells.spells.offensive.projectiles.utils;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class ProjectileUtils {
    /**
     * Get the projectile spawn location.
     * @param livingEntity the projectile shooter
     * @param yOffset The y offset
     * @return The spawn location
     */
    public static Location spawnLocation(LivingEntity livingEntity, double yOffset) {
        return null;
    }

    /**
     * Get a living entity target
     * @param caster The caster of the projectile
     * @param length The maximum length at which the ray should search
     * @param bounds The maximum distance around the ray to search
     * @return The living entity target, or null if none exist
     */
    public static LivingEntity getTarget(LivingEntity caster, int length, double bounds) {
        return null;
    }

    /**
     * Get a living entity target
     * @param caster The caster of the projectile
     * @param length The maximum length at which the ray should search
     * @param bounds The maximum distance around the ray to search
     * @param filter The filter for entities
     * @return The living entity target, or null if none exist
     */
    public static LivingEntity getTarget(LivingEntity caster, int length, double bounds, @Nullable Predicate<Entity> filter) {
        return null;
    }

    /**
     * Makes an arrow invisible
     * @param arrow The arrow to make invisible
     */
    public static void setArrowInvisible(Arrow arrow) { }
}

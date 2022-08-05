package net.encrafted.plugin.spells.spells.utils;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

/**
 * The class that manages explosions
 */
public class ExplosionManager {
    /**
     * Creates an explosion
     * @param size The size of the explosion
     * @param caster The caster of the explosion
     * @param entity The entity that created the explosion (should be named the spell name)
     */
    public static void createExplosion(float size, LivingEntity caster, Entity entity) { }

    /**
     * Creates an explosion
     * @param size The size of the explosion
     * @param caster The caster of the explosion
     * @param location The location of the explosion
     * @param spellName The name of the spell that caused the explosion
     */
    public static void createExplosion(float size, LivingEntity caster, Location location, String spellName) { }
}

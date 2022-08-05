package net.encrafted.plugin.spells.spells;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.UUID;

/**
 * The class that deals with projectile spells
 */
public abstract class ProjectileSpell extends Spell implements Listener {

    public static final HashMap<UUID, ProjectileSpell> projectileSpells = new HashMap<>();

    /**
     * The length that the projectile will travel
     */
    public final int length;

    /**
     * The speed of the projectile
     */
    public final float speed;

    /**
     * Creates a new projectile spell instance
     * @param caster The entity that cast the spell
     * @param spellClass The entity that cast the spell
     * @param length The total length that the projectile can travel in blocks
     * @param speed The initial velocity of the projectile
     */
    public ProjectileSpell(@NotNull LivingEntity caster, @NotNull SpellClass spellClass, int length, float speed) {
        super(caster, spellClass);
        this.length = length;
        this.speed = speed;
    }

    /**
     * What do to every tick that the projectile exists
     * @param location The location of the projectile
     */
    abstract public void onTick(Location location);

    /**
     * What to do when the projectile hits an entity
     * @param entity The entity that was hit
     * @param arrow The projectile
     * @param event The hit event
     */
    abstract public void onHit(LivingEntity entity, Arrow arrow, EntityDamageByEntityEvent event);

    /**
     * What to do when the projectile is removed
     * @param arrow The projectile
     */
    abstract public void onExpire(Arrow arrow);
}

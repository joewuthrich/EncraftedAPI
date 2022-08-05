package net.encrafted.plugin.spells.spells.offensive.projectiles.utils;

import net.encrafted.plugin.spells.spells.ProjectileSpell;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Listener;
import org.bukkit.util.Vector;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Projectile implements Listener {

    public Projectile(LivingEntity caster, ProjectileSpell spell, float speed, int length, boolean arrowInvisible, boolean hasNoGravity) { }

    /**
     * Create a new projectile
     * @param caster The caster of the spell
     * @param spell The spell that was cast
     * @param speed The speed of the projectile
     * @param length The length of the projectile
     * @param hasNoGravity If the projectile is affected by velocity changes
     * @param passenger The passenger of the projectile
     */
    public Projectile(LivingEntity caster, ProjectileSpell spell, float speed, int length, boolean hasNoGravity, Entity passenger) { }

    /**
     * Create a new projectile with a different height
     * @param caster The caster of the spell
     * @param spell The spell that was cast
     * @param speed The speed of the projectile
     * @param length The length of the projectile
     * @param hasNoGravity If the projectile is affected by velocity changes
     * @param passenger The passenger of the projectile
     * @param yOffset The y offset spawn height of the projectile
     */
    public Projectile(LivingEntity caster, ProjectileSpell spell, float speed, int length, boolean hasNoGravity, Entity passenger, double yOffset) { }

    /**
     * Get the probable target of a caster
     * @param length The length to check
     * @param bounds The bounds to check in
     * @param homingIntensity How intensely the projectile should home when cast
     * @return A probably target entity
     */
    public void setTargetEntity(int length, double bounds, double homingIntensity) { }

    /**
     * Get the probable target of a caster
     * @param length The length to check
     * @param bounds The bounds to check in
     * @param filter What entities to select
     * @return A probably target entity
     */
    public void setTargetEntity(int length, double bounds, double homingIntensity, @Nullable Predicate<Entity> filter) { }

    /**
     * Get the probable target of a caster
     * @param length The length to check
     * @param bounds The bounds to check in
     * @return A probably target entity
     */
    public void setTargetEntity(Vector direction, int length, double bounds) { }

    /**
     * Set the target direction
     * @param onCaster If the direction should be based on the caster's eyes (false for arrow velocity)
     */
    public void setDirection(boolean onCaster) { }

    /**
     * Set the target direction
     * @param velocity The velocity to set the arrow to
     */
    public void setDirection(Vector velocity) { }

    /**
     * Fire the projectile.
     * @return the location of the projectile on spawn.
     */
    public Location fire() {
        return null;
    }
}

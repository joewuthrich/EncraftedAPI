package net.encrafted.plugin.spells.spells.defensive.shields;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Slime;
import org.bukkit.util.Consumer;

import java.util.HashMap;

public class Shield {
    @Getter
    public final static HashMap<Integer, Shield> activeShields = new HashMap<>();

    public static Slime getShieldSlime(LivingEntity caster, Location location, int id, String spellName) {
        return null;
    }

    public static Slime getShieldSlimeSize(LivingEntity caster, Location location, int id, String spellName, int size) {
        return null;
    }

    @Setter
    Location location;
    @Getter
    LivingEntity caster;
    @Getter
    int id;

    Consumer<Arrow> onProjectileHit;

    public Shield(int id, Location location, LivingEntity caster, Consumer<Arrow> onProjectileHit) {
    }

    /**
     * What to do when a projectile hits the shield
     * @param arrow The arrow that his the shield
     */
    public void runOnProjectileHit(Arrow arrow) { }

    /**
     * Remove a shield
     * @param id The shield ID
     */
    public void removeShield(int id) {}
}

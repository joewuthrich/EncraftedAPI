package net.encrafted.plugin.spells.spells;

import lombok.Getter;
import org.bukkit.entity.LivingEntity;

import java.util.UUID;

/**
 * The generic spell class
 */
public abstract class Spell {
    @Getter
    private final UUID uuid;

    @Getter
    public final LivingEntity caster;

    @Getter
    public final SpellClass spellClass;

    /**
     * Creates a new spell instance
     * @param caster The entity that cast the spell
     * @param spellClass The class of the spell
     */
    public Spell(LivingEntity caster, SpellClass spellClass) {
        this.uuid = UUID.randomUUID();
        this.caster = caster;
        this.spellClass = spellClass;
    }

    /**
     * Get the spell name
     * @return The full name of the spell, using the latin words
     */
    public String getSpellName() {
        return null;
    }

    /**
     * Runs the spell
     * @return whether the spell ran correctly or not
     */
    abstract public String runSpell();

    /**
     * Runs a task every tick before the spell is cast
     */
    abstract public void runAnticipationTask();
}

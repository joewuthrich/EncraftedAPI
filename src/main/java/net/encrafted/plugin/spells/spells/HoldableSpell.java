package net.encrafted.plugin.spells.spells;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.function.Predicate;

/**
 * The interface for a holdable spell
 */
public interface HoldableSpell {
    /**
     * The code to run every interval
     * @param caster The caster of the spell
     * @param currentTicks The current amount of time the spell has been held in ticks
     * @param objects Extra information that can be passed
     */
    void onInterval(LivingEntity caster, int currentTicks, Object... objects);

    /**
     * The code to run when the holdable spell is cancelled
     * @param caster The caster of the spell
     * @param objects Extra information that can be passed
     */
    void onCancel(LivingEntity caster, Object... objects);

    /**
     * Start the ticking
     * @param delay The delay between ticks
     * @param intervalTicks The interval
     * @param caster The caster
     * @param spell The spell
     * @param objects any extra objects to give to the interval
     */
    default void startTicking(int delay, int intervalTicks, LivingEntity caster, Spell spell, Object... objects) { }

    /**
     * Start the ticking
     * @param delay The delay between ticks
     * @param intervalTicks The interval
     * @param caster The caster
     * @param spell The spell
     * @param filter The filter that must be true for the spell to continue
     * @param objects any extra objects to give to the interval
     */
    default void startTicking(int delay, int intervalTicks, LivingEntity caster, Spell spell, Predicate<LivingEntity> filter, Object... objects) { }

    /**
     * Starts the interval ticker
     * @param delay The delay before the interval starts
     * @param intervalTicks The interval between each tick
     * @param livingEntityTicks The maximum number of ticks if the caster is a living entity rather than a player
     * @param caster The caster
     * @param condition A condition that must be met every second for the spell to continue casting
     * @param objects any extra objects to give to the interval
     */
    default void startTickingEntity(int delay, int intervalTicks, int livingEntityTicks, LivingEntity caster, Predicate<LivingEntity> condition,
                                    Object... objects) { }

    /**
     * Starts the interval ticker
     * @param delay The delay before the interval starts
     * @param intervalTicks The interval between each tick
     * @param caster The caster
     * @param spell The spell
     * @param condition A condition that must be met every second for the spell to continue casting
     * @param objects any extra objects to give to the interval
     */
    default void startTickingPlayer(int delay, int intervalTicks, Player caster, Spell spell, Predicate<LivingEntity> condition, Object... objects) { }
}

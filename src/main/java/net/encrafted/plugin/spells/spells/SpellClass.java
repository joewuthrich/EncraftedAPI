package net.encrafted.plugin.spells.spells;

import lombok.Getter;
import net.encrafted.plugin.spells.recognition.template.Template;
import org.jetbrains.annotations.NotNull;

public enum SpellClass {
    ;

    @Getter
    private final String englishName;
    @Getter
    private final String description;

    /**
     * The spell type of the spell
     */
    @Getter
    public final SpellType spellType;
    private final Template template1;
    private final Template template2;
    private final Template template3;
    private final Template template4;
    @Getter
    private final int level;
    @Getter
    private final int cost;

    @Getter
    private final Class<?> spellFinalClass;

    SpellClass(Class<?> spellClass, @NotNull String englishName, @NotNull String description, @NotNull SpellType spellType, @NotNull Template template1, Template template2,
               Template template3, Template template4, int level, int cost) {
        this.spellFinalClass = spellClass;
        this.englishName = englishName;
        this.description = description;
        this.spellType = spellType;
        this.template1 = template1;
        this.template2 = template2;
        this.template3 = template3;
        this.template4 = template4;
        this.level = level;
        this.cost = cost;
    }

    /**
     * Get the spell cost of the spell
     * @return The spell cost of the spell
     */
    public int getSpellCost() {
        return cost + level * 3 + 5;
    }
}

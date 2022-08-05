package net.encrafted.plugin.spells.spells;

import lombok.Getter;

/**
 * The different spell types in the game
 */
public enum SpellType {
    OFFENSIVE("Offensive", 0, "Offensive spells, that do damage to enemies."),
    DEFENSIVE("Defensive", 1, "Defensive spells, that protect or heal you and others."),
    UTILITY("Utility", 2, "Utility spells, that move you around or effect your environment."),
    HARMFUL("Chaos", 3, "Chaotic spells, that can harm both you and others.");

    @Getter
    String name;
    @Getter
    int id;
    @Getter
    String description;

    SpellType(String name, int id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }
}

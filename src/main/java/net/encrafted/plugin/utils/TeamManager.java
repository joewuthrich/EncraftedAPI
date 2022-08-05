package net.encrafted.plugin.utils;

import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

/**
 * A class to manage teams
 */

public class TeamManager {
    /**
     * Get the team for no collisions
     * @param scoreboard The scoreboard
     * @return The team
     */
    public static Team getNoCollisionTeam(Scoreboard scoreboard) {
        return null;
    }

    /**
     * Get the team for no nametag
     * @return The team
     */
    public static Team getNoNametagTeam() {
        return null;
    }
}

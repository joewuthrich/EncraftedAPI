package net.encrafted.plugin.spells.spells.utils;

import lombok.Getter;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * The class that deals with highlighting blocks
 */
public class BlockHighlighter {
    @Getter
    private static final BlockHighlighter mainInstance = new BlockHighlighter();
    @Getter
    private static final BlockHighlighter lookingInstance = new BlockHighlighter();

    /**
     * Highlight a single block, removing other highlights
     * @param player The player to highlight for
     * @param block The block to highlight
     */
    public void setSingleBlockHighlighted(Player player, Block block) { }

    /**
     * Highlight a single block, removing other highlights
     * @param player The player to highlight for
     * @param location The block to highlight
     * @param color The color to highlight the block
     */
    public void setSingleBlockHighlighted(Player player, Location location, NamedTextColor color) { }

    /**
     * Set a list of blocks as highlighted for a player
     * @param player The player to highlight the blocks for
     * @param locations The locations to highlight
     */
    public void setHighlightedBlocks(Player player, List<Location> locations) { }

    /**
     * Set a list of blocks as highlighted for a player
     * @param player The player to highlight the blocks for
     * @param locations The locations to highlight
     * @param isSameObject If the slimes are all the same object or not
     */
    public void setHighlightedBlocks(Player player, List<Location> locations, boolean isSameObject) { }

    /**
     * Set a list of blocks as highlighted for a player
     * @param player The player to highlight the blocks for
     * @param locations The locations to highlight
     * @param isSameObject If the slimes are all the same object or not
     * @param color The color to highlight the block
     */
    public void setHighlightedBlocks(Player player, List<Location> locations, boolean isSameObject, NamedTextColor color) { }

    /**
     * Remove all the highlighted blocks for a player
     * @param player The player to remove the blocks for
     */
    public void removeAllHighlightedBlocks(Player player) { }

    /**
     * Remove a specific set of highlighted blocks
     * @param player The player to remove the blocks for
     * @param locations The list of blocks to remove highlight from (if it exists)
     */
    public void removeHighlightedBlocks(Player player, List<Location> locations) { }

    /**
     * Remove all highlighted blocks for a player other than those in the same group as one of the nonRemoveLocations.
     * @param player The player to remove the blocks for
     * @param nonRemoveLocations The blocks to prevent removal of (will also prevent removal for blocks in the same group)
     */
    public void removeAllOtherHighlightedBlocks(Player player, List<Location> nonRemoveLocations) { }

    /**
     * Check if a block is highlighted for a player
     * @param player The player
     * @param location The location of the block
     * @return If the block is highlighted
     */
    public boolean isBlockHighlighted(Player player, Location location) {
        return true;
    }

    /**
     * Highlight blocks if a player is looking at them, only if they can be opened (iron door and trapdoor).
     * @param player The player
     * @param range The range of the highlight.
     */
    public void highlightBlockIfLookingOpenable(Player player, int range) { }
}

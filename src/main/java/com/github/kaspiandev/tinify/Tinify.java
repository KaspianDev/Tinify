package com.github.kaspiandev.tinify;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public final class Tinify extends PlaceholderExpansion {

    private static final String BOLD_PARAMETER = "bold_";

    @Override
    public @NotNull String getIdentifier() {
        return "tinify";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Kaspian";
    }

    @Override
    public @NotNull String getVersion() {
        return "1";
    }

    @Override
    public @NotNull String onRequest(OfflinePlayer player, @NotNull String params) {
        String parsedString;
        if (params.startsWith(BOLD_PARAMETER)) {
            params = params.substring(BOLD_PARAMETER.length());
            parsedString = PlaceholderAPI.setBracketPlaceholders(player, params);

            return ChatColor.BOLD + TinyReplacer.replace(parsedString);
        }

        parsedString = PlaceholderAPI.setBracketPlaceholders(player, params);
        return TinyReplacer.replace(parsedString);

    }

}

package com.kvteam.backend.dataformats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by maxim on 28.03.17.
 */
public class CardData {
    @NotNull
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("side")
    private String side;

    @JsonCreator
    public CardData(
            @JsonProperty("alias") @NotNull String alias,
            @JsonProperty("side") @Nullable String side) {
        this.alias = alias;
        this.side = side;
    }

    @NotNull
    public String getAlias(){
        return alias;
    }
}

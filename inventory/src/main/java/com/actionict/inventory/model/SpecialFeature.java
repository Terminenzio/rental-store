package com.actionict.inventory.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum SpecialFeature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String text;

    @JsonValue
    public String getText() {
        return text;
    }

    @JsonCreator
    public static SpecialFeature fromText(String text) {
        return Arrays.stream(values())
                .filter(v -> v.text.equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid SpecialFeature: " + text));
    }

}
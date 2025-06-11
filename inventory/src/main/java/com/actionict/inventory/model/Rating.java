package com.actionict.inventory.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Rating {
    
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String text;

    @JsonValue
    public String getText() {
        return text;
    }

    @JsonCreator
    public static Rating fromText(String text) {
        return Arrays.stream(values())
                .filter(v -> v.text.equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Rating: " + text));
    }

}

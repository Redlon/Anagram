package com.test.anagram.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Words {

    @NonNull
    private String firstWord;

    @NonNull
    private String secondWord;

    private Boolean areAnagrams;

}
package com.test.anagram.service;

import com.test.anagram.model.Words;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BasicService {

    public Words isAnagram(Words words){
        //Remove all white spaces and transform all char in lower case for later comparison
        String firstWord = words.getFirstWord().toLowerCase().replaceAll("\\s+","");
        String secondWord = words.getSecondWord().toLowerCase().replaceAll("\\s+","");
        //If the lenght of the strings are different (without spaces), is not possible for them to be anagram
        if (firstWord.length() != secondWord.length()) {
            words.setAreAnagrams(false);
        } else {
            char[] a1 = firstWord.toCharArray();
            char[] a2 = secondWord.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            words.setAreAnagrams(Arrays.equals(a1, a2));
            return words;
        }
        return words;

    }
}

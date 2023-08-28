package com.test.anagram.service;

import com.test.anagram.model.Words;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicServiceTest {

    @Test
    public void testIsAnagramAreTrue(){
        BasicService basicService = new BasicService();
        Words words = new Words("New york Times", "monkeys write");
        Words response = basicService.isAnagram(words);
        assertTrue(response.getAreAnagrams());
    }

    @Test
    public void testIsAnagramAreFalse(){
        BasicService basicService = new BasicService();
        Words words = new Words("first word", "second word");
        Words response = basicService.isAnagram(words);
        assertFalse(response.getAreAnagrams());
    }

}

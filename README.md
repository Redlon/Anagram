# Simple Anagram API Rest 
 
The structure used as enter parameters and responses is call "*Words*", it's contain only 3 attributes: 
* *firstWord* and *secondWord* are the two string to bo compared and check if they are anagram or not
* *isAnagram* is a boolean attribute that give the answer of the comparison

Using the next URL **localhost:8080/isAnagram** is possible to try the API with this few examples that can be used while the app is running: <br>

| **Input**                                                        | **Output**                                                                        |
|------------------------------------------------------------------|-----------------------------------------------------------------------------------|
| { "firstWord": "New york Times", "secondWord": "monkeys write" } | { "firstWord":"New york Times","secondWord":"monkeys write","areAnagrams":true }  |
| { "firstWord": "first word", "secondWord": "second word"}        | { "firstWord":"first word","secondWord":"second word","areAnagrams":false }       |
| { "firstWord": "a gentleman", "secondWord": "elegant man"}       | { "firstWord":"a gentleman","secondWord":"elegant man","areAnagrams":true }       |
| { "firstWord": "ThE MoRsE CoDe", "secondWord": "hErE cOmE dOtS"} | { "firstWord":"ThE MoRsE CoDe","secondWord":"hErE cOmE dOtS","areAnagrams":true } |


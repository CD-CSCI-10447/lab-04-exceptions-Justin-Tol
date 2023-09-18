package edu.desu.partA;

public class ProblemA {
    /*
        Determine if the given string contains between 1 and 3 'e' characters.
        Only if the string contains between 1 and 3 'e' characters; return true.
        containE("Hello") --> true
        containE("Heelle") --> true
        containE("Heelele") --> false
     */
    // f(x) = x + 3
    public static Boolean containE(String str) {
        int eCount = 0;
        char[] characters = str.toCharArray();
        for(char current: characters){
            eCount = (current == 'e')? ++eCount: eCount;
        }
        return (eCount > 0 && eCount < 4);
    }
}

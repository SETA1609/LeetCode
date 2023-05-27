package Day2.IsomorphicStrings.Java;
import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        // The value of the length is saved as a boolean after checking the limits
        boolean isSizeCorrect = (s.length () >= 1 && s.length () <= (5 * 100000));
        // The proof of the 2 length are checked and passed as boolean
        boolean isStringLengthEqual = s.length() == t.length();
        // It checks of one of the two booleans is not true
        if (!isSizeCorrect || !isStringLengthEqual) {
            return false;
        }
        // Two maps are set to check that all the keys and values are correctly matched
        HashMap<Character, Character> charMapSToT = new HashMap<> ();
        HashMap<Character, Character> charMapTToS = new HashMap<>();

        // An index loop is started  to iterate through the strings
        for (int i = 0; i < s.length(); i++) {
            // current chars for s and t
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // the next two booleans are place to check that the maps are not mapped correctly
            // so if one is not return the current s/tChar is set to true
            boolean isSMapFalselyMapped=(
                    charMapSToT.containsKey(sChar) &&
                            (charMapSToT.get(sChar) != tChar)
            );
            boolean isTMapFalselyMapped=(
                    charMapTToS.containsKey(tChar) &&
                            (charMapTToS.get(tChar) != sChar)
            );
            // here would return false if the last step is true
            if (isSMapFalselyMapped) {
                return false;
            }

            if (isTMapFalselyMapped) {
                return false;
            }
            // if there is no mapped <k,v> in the maps they would be set with the current values
            charMapSToT.put(sChar, tChar);
            charMapTToS.put(tChar, sChar);
        }
        // if after passing all the steps are the maps correctly passed then is the value correct
        // now if you wish you can make a new string and iterate through s and replaced the mapped values
        // then check if 2 strings are equal, but it would be more performance intensive
        return true;

    }

}

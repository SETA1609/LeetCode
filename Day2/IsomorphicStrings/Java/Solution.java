package Day2.IsomorphicStrings.Java;
import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        //
        boolean isSizeCorrect = (s.length () >= 1 && s.length () <= (5 * 100000));
        //
        boolean isStringLengthEqual = s.length() == t.length();
        //
        if (!isSizeCorrect || !isStringLengthEqual) {
            return false;
        }
        //
        HashMap<Character, Character> charMapSToT = new HashMap<> ();
        HashMap<Character, Character> charMapTToS = new HashMap<>();

        //
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            boolean isSMapCorrectlyMapped=(
                    charMapSToT.containsKey(sChar) &&
                            (charMapSToT.get(sChar) != tChar)
            );
            boolean isTMapCorrectlyMapped=(
                    charMapTToS.containsKey(tChar) &&
                            (charMapTToS.get(tChar) != sChar)
            );

            if (isSMapCorrectlyMapped) {
                return false;
            }

            if (isTMapCorrectlyMapped) {
                return false;
            }

            charMapSToT.put(sChar, tChar);
            charMapTToS.put(tChar, sChar);
        }

        return true;

    }

}

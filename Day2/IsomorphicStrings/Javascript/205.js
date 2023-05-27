/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function (s, t) {

    let isSizeCorrect = (s.length >= 1 && s.length <= (5 * 100000));
    let isStringLengthEqual = s.length === t.length;

    if (!isSizeCorrect || !isStringLengthEqual) {
        return false;
    }

    let charMapSToT = {};
    let charMapTToS = {};

    for (let i = 0; i < s.length; i++) {
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);

        let isSMapFalselyMapped = (
            charMapSToT.hasOwnProperty(sChar) &&
            (charMapSToT[sChar] !== tChar)
        );

        let isTMapFalselyMapped = (
            charMapTToS.hasOwnProperty(tChar) &&
            (charMapTToS[tChar] !== sChar)
        );

        if (isSMapFalselyMapped) {
            return false;
        }

        if (isTMapFalselyMapped) {
            return false;
        }

        charMapSToT[sChar] = tChar;
        charMapTToS[tChar] = sChar;

    }
    console.log(charMapSToT)
    console.log(charMapTToS)
    return true;
};
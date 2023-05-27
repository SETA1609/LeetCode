package Day2.IsomorphicStrings.Java;

public class Test {
    public static void main(String[] args) {
        Solution testSolutionIsomorphic = new Solution ();

        //true
        System.out.println ( testSolutionIsomorphic.isIsomorphic ("egg","add"));
        //false
        System.out.println ( testSolutionIsomorphic.isIsomorphic ("foo","bar"));
        //true
        System.out.println ( testSolutionIsomorphic.isIsomorphic ("paper","title"));

        System.out.println ( testSolutionIsomorphic.isIsomorphic ("babc","baba"));
        //false
        System.out.println ( testSolutionIsomorphic.isIsomorphic ("egcd","adfd"));


    }
}

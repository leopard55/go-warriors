package javabase.deng;

public class IsAnagram {

    public static boolean isAnagran(char[] s, char[] t){
        int[] statS = new int[26];
        int[] statT = new int[26];

        int lenS = s.length;
        int lenT = t.length;
        for (int i = 0; i < lenS; i++) {
            int index = s[i] - 'a';
            statS[index]++;
        }
        for (int i = 0; i < lenT; i++) {
            int index = t[i] - 'a';
            statT[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if(statS[i] != statT[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = "ten".toCharArray();
        char[] t = "net".toCharArray();
        System.out.println(isAnagran(s,t));
    }
}

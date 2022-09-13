package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-06-30 19:05
 * KMP算法
*/


public class KMP {

    public static void prefix_table(char[] pattern, int[] prefix, int n){
        prefix[0] = 0;
        int len = 0;
        int i = 1;
        while(i < n){
            if (pattern[i] == pattern[len]){
                  len++;
                  prefix[i] = len;
                  i++;
            }else{
                if(len > 0){
                    len = prefix[len - 1];
                }else{
                    prefix[i] = len;
                    i++;
                }
            }
        }
    }

    public static void move_prefix_table(int[] prefix, int n){
        int i ;
        for(i = n-1; i > 0; i-- ){
            prefix[i] = prefix[i-1];
        }
        prefix[0] = -1;
    }

    public static void kmp_search(char[] text, char[] pattern){
        int n = pattern.length;
        int m= text.length;
        int[] prefix = new int[9];
        prefix_table(pattern, prefix, n);
        move_prefix_table(prefix, n);

        //text[i]      text.length    = m
        //pattern[j]   pattern.length = n
        int i = 0;
        int j = 0;
        while (i < m){
            if(j == n-1 && text[i] == pattern[j]){
                System.out.println("Fount patter at "+ (i - j));
                j = prefix[j];
            }
            if(text[i] == pattern[j]){
                i++;j++;
            }else{
                j = prefix[j];
                if(j == -1){
                    i++;j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] pattern = "ABABCABAA".toCharArray();
        char[] text = "ABABABCABAABABABAB".toCharArray();
//        int[] prefix = new int[9];
//        int n = 9;
//
//        prefix_table(pattern, prefix, n);
//        move_prefix_table(prefix, 9);
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(prefix[i]);
//        }

        kmp_search(text,pattern);

    }
}

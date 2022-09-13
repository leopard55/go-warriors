package javabase.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Title: FindFirstRepeatedChar
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/10/20 9:42
 * @Version: 1.0
 */
public class FindFirstRepeatedChar {
    public static Character findFirstRepeatedChar(String string){
        if(Objects.isNull(string) || string.isEmpty()){
            return null;
        }

        char[] charArray = string.toCharArray();
        Set<Character> charSet = new HashSet<>(charArray.length);
        for (char ch : charArray) {
//           if(charSet.contains(ch)) {
//               return ch;
//           }
//           charSet.add(ch);

            if(!charSet.add(ch)) {
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String string = "abcbdf";
        System.out.println(findFirstRepeatedChar(string));
    }
}

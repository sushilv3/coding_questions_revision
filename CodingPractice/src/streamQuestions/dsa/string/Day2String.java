package streamQuestions.dsa.string;

import java.util.*;

public class Day2String {
    public static void main(String[] args) {
        String s="tab",t="bat";
        System.out.println("check valid anagram : "+ validAnagram(s,t));
/*hw a. aaabbccdd= a3b2c2d3*/
        System.out.println("group of anagram : "+ helper(new String[]{"eat","tea","tan","ate","nat","bat"} ));

    }

    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int c:freq){
            if(c!=0) return false;
        }
        return true;
    }
    public static List<List<String>> helper(String[] s){
        Map<String,List<String>> map = new HashMap<>();
        for(String word:s){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}

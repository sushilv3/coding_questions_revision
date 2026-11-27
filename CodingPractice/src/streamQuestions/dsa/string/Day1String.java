package streamQuestions.dsa.string;

public class Day1String {
    public static void main(String[] args) {
        String isItPolindrome = "A man, a plan, a canal : panama";
        System.out.println("check string is  polindrome or not : " +
                isPol(isItPolindrome));
        String reverseS = "abcd erty uiop";
        System.out.println("reverse : " + reverse(reverseS));
        System.out.println(" reverseOptimize: " + reverseOptimize(reverseS));
/*hw a.  zig zag conversion
* b. valid anagram
* c. first unique character
* d.word pattern*/
    }

    public static boolean isPol(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String reverse(String s) {
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }

    public static String reverseOptimize(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int left = 0, right = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                /*string reverse two pointer logic*/
              while(left<right){
                  char temp = chars[right];
                  chars[right]=chars[left];
                  chars[left]=temp;
                  left++;
                  right--;
              }
              start = i+1;
            }
        }
//        System.out.println("char array : " + new String(chars));
        return new String(chars);
    }

}

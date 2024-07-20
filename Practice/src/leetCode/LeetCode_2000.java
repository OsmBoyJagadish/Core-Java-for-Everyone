package leetCode;
public class LeetCode_2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        StringBuilder prefix = new StringBuilder(word.substring(0, index + 1));
        prefix.reverse();

        return prefix.toString() + word.substring(index + 1);
    }

    public static void main(String[] args) {
        LeetCode_2000 name = new LeetCode_2000();
        String result = name.reversePrefix("abcdefd", 'd');
        System.out.println(result);  // Output: dcbaefd
    }
}
//ChatGPT
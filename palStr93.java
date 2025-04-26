class palStr93 {
    public static void main(String[] args) {
        String str = "madam anna civic kayak level";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                System.out.println(words[i] + " is a palindrome");
            } else {
                System.out.println(words[i] + " is not a palindrome");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int start = 0, end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

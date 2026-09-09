class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstCharArray = s.toCharArray();
        char[] secondCharArray = t.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        if (Arrays.compare(firstCharArray, secondCharArray) == 0) {
            return true;
        }
    return false;
    }
}

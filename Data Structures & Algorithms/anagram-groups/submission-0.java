class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        char[] myArray;
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            myArray = strs[i].toCharArray();
            Arrays.sort(myArray);

            String key = new String(myArray);

            if (map.containsKey(key)) {
                List<String> value = map.get(key);
                value.add(strs[i]);
            } else {
                List<String> str = new ArrayList<>();
                str.add(strs[i]);
                map.put(key, str);
            }
        }

        for (List<String> gruppe : map.values()) {
            result.add(gruppe);
        }

        return result;
    }
}

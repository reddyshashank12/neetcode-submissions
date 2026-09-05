class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){

            String fstr = getFreqStr(str);

            if(map.containsKey(fstr)){
                    map.get(fstr).add(str);
            }
            else{
                List<String> strlist = new ArrayList<>();
                strlist.add(str);
                map.put(fstr,strlist);
            }
        }
        return new ArrayList<>(map.values());
    }

    public String getFreqStr(String string){

        int[] freq = new int[26];

        for(char ch : string.toCharArray()){
            freq[ch-'a']++;
        }


        StringBuilder sb = new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
      return sb.toString();
    }
}

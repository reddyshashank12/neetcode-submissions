class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> result = new ArrayList();
       findAll(new StringBuilder("("), 1, 0, result, n);
       return result; 
    }

   void findAll(StringBuilder current, int obc, int cbc, List<String> result, int n ){
        if(current.length() == 2 * n){
            result.add(current.toString());
            return;
        }

        if(obc < n) {
            current.append("("); // Mutate
            findAll(current, obc + 1, cbc, result, n);
            current.deleteCharAt(current.length() - 1); // BACKTRACK: Undo mutation
        }
        if(cbc < obc) {
            current.append(")"); // Mutate
            findAll(current, obc, cbc + 1, result, n);
            current.deleteCharAt(current.length() - 1); // BACKTRACK: Undo mutation
        }
    }
}
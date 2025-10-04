class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        permutation(n, k, 1, new ArrayList<>(), arr);
        return arr;
    }

    private void permutation(int n, int k, int i, List<Integer> ans, List<List<Integer>> arr) {
        if (k == 0) {
            arr.add(new ArrayList<>(ans));
            return;
        }
        if (i > n) {
            return;
        }
        permutation(n, k, i + 1, ans, arr); 
        ans.add(i);
        permutation(n, k - 1, i + 1, ans, arr);
        ans.remove(ans.size() - 1);
    }
}
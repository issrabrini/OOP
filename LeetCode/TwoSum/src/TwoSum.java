import java.util.HashMap;

class TwoSum {
    public TwoSum() {
    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] r = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - numbers[i])) {
                r[1] = i;
                r[0] = map.get(target - numbers[i]);
                return r;
            }
            map.put(numbers[i], i);
        }
        return r;

    }
}
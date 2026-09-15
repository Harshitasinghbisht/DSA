class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int min = 0;
        int max = 0;
        
        for (int i : weights) {
            min = Math.max(min, i);
            max += i;
        }

        while (min <= max) {

            int mid = min + (max - min) / 2;
            int currentLoad = 0;
            int guessedDay = 1;

            for (int i : weights) {

                if (currentLoad + i > mid) {
                    guessedDay++;
                    currentLoad = i;
                } else {
                    currentLoad += i;
                }
            }

            if (guessedDay <= days) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}
class TimeMap {

    class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    HashMap<String, ArrayList<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        map.putIfAbsent(key, new ArrayList<>());

        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        ArrayList<Pair> list = map.get(key);

        int low = 0;
        int high = list.size() - 1;

        String ans = "";

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid).timestamp <= timestamp) {

                // Possible answer
                ans = list.get(mid).value;

                // Try to find a later timestamp
                low = mid + 1;

            } else {

                // timestamp is too large
                high = mid - 1;
            }
        }

        return ans;
    }
}
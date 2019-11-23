public class hacker {
    public static void main(String[] args) {

        // System.out.println()

    }

    /*
     * Complete the 'getMinGates' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY landingTimes 2. INTEGER_ARRAY takeOffTimes 3.
     * INTEGER maxWaitTime 4. INTEGER initialPlanes
     */

    public static int getMinGates(List<Integer> landingTimes, List<Integer> takeOffTimes, int maxWaitTime,
            int initialPlanes) {
        ArrayList<Integer> gates = new ArrayList<Integer>();
        int gate = initialPlanes;
        gates.add(gate);

        HashMap<String, Integer> hashmoop = new HashMap<String, Integer>();
        for (int i = 0; i < landingTimes.size(); i++) {
            hashmoop.put("land" + i, landingTimes.get(i));
        }
        for (int j = 0; j < takeOffTimes.size(); j++) {
            hashmoop.put("off", takeOffTimes.get(j));
        }
        Map<String, Integer> awesomeMap = sortByValue(hashmoop);

        int i = 0;
        for (String key : awesomeMap.keySet()) {
            if (key.contains("land" + i) && i == 0) {
                gate++;
                gates.add(gate);
                i++;
            }
            if (key.contains("land" + i)) {
                int currentValue = awesomeMap.get("land" + i);
                int previousValue = awesomeMap.get("land" + (i - 1));
                int diff = currentValue - previousValue;
                if (diff >= maxWaitTime) {
                    gate++;
                    gates.add(gate);
                }
            }
            if (key.contains("off")) {
                gate--;
                gates.add(gate);
            }
        }

        Collections.sort(gates);
        int tail = gates.size();
        int result = gates.get(tail - 1);
        // go through the hashmap (loop), check for each key.
        // say the key for landing time + index,
        // check for the key, check if the key is landing if it is the first landing,
        // add the gate by 1
        // if key is landing check the value of the current landing compared to the
        // previous landing, if there are differences greater than wait time, then gate
        // ++
        // if the key is off gate

        return result;
    }

    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}

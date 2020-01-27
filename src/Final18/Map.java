package Final18;

import java.util.ArrayList;

class Map {
    protected ArrayList<Entry> arr;

    /**
     * Constructor of the map. Represented by a sorted ArrayList.
     */
    public Map() {
        arr = new ArrayList<>();
    }

    /**
     * Takes a String as input and finds the corresponding value in the map.
     * If the Entry with this key can't be found, this will return -1.
     *
     * @param s
     *     - Key that you are looking for.
     * @return - value corresponding to the Entry found.
     */
    public int get(String s) {
        // TODO
        int j = findIndex(s);
        if (j == arr.size() || s.compareTo(arr.get(j).getKey()) != 0) {
            return -1; // no match
        }
        return arr.get(j).getValue();
    }

    public int findIndex(String s){ return findIndex(s, 0, arr.size()-1);}

    public int findIndex(String s, int low, int high){
        if(high<low){return high + 1;}
        int mid = (low + high) / 2;
        int comp = s.compareTo(arr.get(mid).getKey());
        System.out.println("s: "+s+"middle: "+arr.get(mid).getKey()+" diff: "+comp );
        if (comp == 0) {
            return mid; // found exact match
        }
        else if (comp < 0) {
            return findIndex(s, low, mid-1); // answer is left of mid (or possibly mid)
        } else {
            return findIndex(s, mid+1, high); // answer is right of mid
        }
    }

    /**
     * Left biased union of two maps, adds all entries from the map given as input to this map, keeping the maps sorted alphabetically on the key.
     * If a duplicate key occurs, takes the value from this map.
     *
     * @param m
     *     - other map used for the union
     */
    public Map union(Map m) {
        Map result = new Map();
        return null;
    }
}
//

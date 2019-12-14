
package Sorting;

import java.util.*;

//WE LOVE BUCKET SORT!!!!!

class BucketSort{
    @SuppressWarnings("unchecked")
    public static Queue<Integer>[] fillBuckets(int[] array) {
        if(array.length==0) return new Queue[0];
        int vmin = Integer.MAX_VALUE;
        int vmax = Integer.MIN_VALUE;

        for(int x : array) {
            vmin = Math.min(vmin, x);
            vmax = Math.max(vmax, x);
        }

        Queue<Integer>[] buckets = new Queue[vmax - vmin + 1];

        for(int i = 0; i< buckets.length; i++) {
            buckets[i] = new PriorityQueue<Integer>();
        }

        for(int i = 0; i< array.length; i++) {
            //hashing
            int index = array[i] - vmin;
            buckets[index].add(array[i]);
        }

        return buckets;
    }

    public static int[] readBuckets(Queue<Integer>[] buckets) {
        int size = 0;
        for(int i = 0; i< buckets.length; i++) {
            size += buckets[i].size();
        }

        int[] result = new int[size];
        int j = 0;
        for(int i = 0; i<buckets.length; i++) {
            while(!buckets[i].isEmpty()) {
                result[j] = buckets[i].poll();
                j++;
            }
        }
        return result;
    }
}
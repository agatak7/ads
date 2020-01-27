package Final;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    /**
     * Sorts a list of words using MSD radix sort.
     *
     * @param words
     *     The list of words to sort.
     * @return The sorted list of words.
     * @throws NullPointerException
     *     If `words` equals `null`.
     */
    static List<String> radixSortMSD(List<String> words) {
        if(words == null) throw new NullPointerException();
        return sort(words, 0);
    }


    /**
     *Radix Sort - A version of BUCKET SORT:
     * Keep an array of buckets (length of the alphabet)
     * For each index that we're sorting on, add the words to the
     * correct bucket of that letter, then RECURSIVELY call sort on
     * each bucket going to the next index!
     */
    @SuppressWarnings("unchecked")
    static List<String> sort(List<String> words, int index) {
        List<String> result = new ArrayList<>();
        //Bucket array of size of alphabet
        List<String>[] buckets = new List[26];

        //initialize buckets!
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //if the word is < index, it is already sorted!
        //else add to bucket.
        for(String i : words) {
            if (i.length() - 1 < index) {
                result.add(i);
            } else {
                buckets[ (int) i.charAt(index) - (int) 'a'].add(i);
            }
        }

        //recursively sort buckets for next index and add to result.
        for(int i = 0; i < buckets.length; i++) {
            if(buckets[i].size() > 0) {
                buckets[i] = sort(buckets[i], index + 1);
                result.addAll(buckets[i]);
            }
        }

        return result;

    }
}

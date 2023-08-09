package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class CollectionsAssignment {

    // 1
    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list     - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < minValue) {
                list.remove(i);
            }
        }

        // input = a list of integers (eg 1,2,3,5 and the minValue is 2)
        // output = a new list of integers with all integers less than minValue removed
        // (3,5)
    }

    // 2
    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */

    // input: a collection of integers
    // iterate over the collection
    // have a way to check an element is present more than once
    // we sort the collection in order (ascending)
    // we use the iterator to check whether the first element is equal to the next
    // element and so on
    // if the element == to the next element we return true
    // if not return false
    // return true if that condition is satisfied

    // output: boolean based on if there are duplicates (true is true and false if
    // false)
    // dont use any LOOPS!!
    public static boolean containsDuplicates(Collection<Integer> integers) {

        List<Integer> integersList = new ArrayList<>(integers);

        Collections.sort(integersList);

        boolean hasDuplicates = IntStream.range(0, integersList.size() - 1)
                .mapToLong(operand -> integersList.get(operand + 1) -
                        integersList.get(operand))
                .anyMatch(value -> value == 0);

        if (hasDuplicates == true) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * For future reference, this can also be done using a Hashmap, if we convert
     * the list into a hashmap then compare the size of the list and hashmap, we can
     * determine if there are any duplicates.
     * this is because hashmaps do not allow for duplicate values!!
     * import java.HashSet;
     * public static boolean containsDuplicates(Collection<Integer> integers) {
     * Set<Integer> uniqueSet = new HashSet<>(integers);
     * Return uniqueSet.size() != integers.size();}
     * 
     * // 3
     * /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     *         collection.
     */
    // This must be done with no loops.

    // input: two arrayLists
    // output: one arrayLIst with integers combined and no duplicates

    /**
     * Create a hashSet containing the integers in the first arraylist
     * then add the second list to the first - this prevents any duplicates
     * then convert the hashSet into an arrayLIst
     * then sort the arrayList
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        ArrayList<Integer> integerList1 = new ArrayList<>(ints1);
        ArrayList<Integer> integerList2 = new ArrayList<>(ints2);

        Set<Integer> set = new HashSet<>(integerList1);
        set.addAll(integerList2);

        ArrayList<Integer> combinedIntegersList = new ArrayList<>(set);

        Collections.sort(combinedIntegersList);

        return combinedIntegersList;
    }

    // 4
    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     * NO LOOPS!!
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     *         collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {

        ArrayList<Integer> integerList1 = new ArrayList<>(ints1);
        ArrayList<Integer> integerList2 = new ArrayList<>(ints2);

        ArrayList<Integer> combinedIntegerList = new ArrayList<>(integerList1);

        // the retainAll function removes elements that are not present in integerList2
        combinedIntegerList.retainAll(integerList2);

        return combinedIntegerList;
    }

    // 5
    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     * 
     * 
     *         // You should solve this problem in two stages: First iterate through
     *         // the list to count occurrences of each String. Then iterate through
     *         // your counts to find the largest. You'll need a collection that
     *         allows you to store a mapping from Strings to counts.
     *         // No nested loops or non-enhanced for-loops are allowed.
     */
    public static String mostFrequent(List<String> list) {

        // This code handles situations when the list is empty or = null
        if (list == null || list.isEmpty()) {
            return "";
        }

        // I created an arraylist containing all the strings in the list given so that
        // it can be iterated over
        List<String> stringCountList = new ArrayList<>(list);

        // a hashmap is created so that I can map the strings in the arraylist to the
        // count of occurences
        Map<String, Integer> stringMap = new HashMap<>();

        /**
         * an enhanced for loop which uses the frequency method from the collection to
         * count the number of occurences for a string
         * for each string in the stringCountList, we put a string and its count value
         * in the hashmap
         * the default count value is 0, but if the string is counted more than once we
         * add one to the count
         */

        for (String str : stringCountList) {
            stringMap.put(str, stringMap.getOrDefault(str, 0) + 1);
        }

        /*
         * The variable maxOccruences is initiated at zero
         * The variable for the mostFrequentString is initialised as empty
         */

        int maxOccurrences = 0;
        String mostFrequentString = "";

        /*
         * For each entry in the hash map (ie string : integer), if the count is more
         * than max occurences set the maxoccurence value to the value of the count
         * the most frequent string is the string with the key associated with the value
         * larger than the maximum number of occurences
         */
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                maxOccurrences = entry.getValue();
                mostFrequentString = entry.getKey();
            }
        }

        return mostFrequentString;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}

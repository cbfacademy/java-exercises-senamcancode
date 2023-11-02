package com.cbfacademy;

public class LinearSearch {
    
        public static int linearSearch(Object[] arr, Object target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(target)) {
                    return i;  // Return the index where the element is found
                }
            }
            return -1; // Return -1 if the element is not found in the list
        }
    
}

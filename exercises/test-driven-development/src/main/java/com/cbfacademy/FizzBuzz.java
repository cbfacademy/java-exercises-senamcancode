package com.cbfacademy; 

//the Integer class should be the data type used because in the end we need to give it a list of Integers 
//what is teh benefit of using an Integer datatype vs int 

public class FizzBuzz {
    public static String of(Integer number){
        if(number == "3"){
            return "Fizz"; 
        } else {
            return ; 
        }
    }
}


// public class FizzBuzz {
//     public String get(int number) {
//         if (number % 15 == 0) {
//             return "FizzBuzz";
//         } else if (number % 3 == 0) {
//             return "Fizz";
//         } else if (number % 5 == 0) {
//             return "Buzz";
//         } else {
//             return Integer.toString(number);
//         }
//     }

//     public static String of(Integer value) {
//         return null;
//     }
// }





//   List<String> result = new ArrayList<>();
//         for (int i = 1; i <= value; i++) {
//             if (i % 15 == 0) {
//                 result.add("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 result.add("Fizz");
//             } else if (i % 5 == 0) {
//                 result.add("Buzz");
//             } else {
//                 result.add(Integer.toString(i));
//             }
//         }
//         return result;
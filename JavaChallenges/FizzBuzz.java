<<<<<<< HEAD:JavaChallenges/FizzBuzz.java
package leetcodepractice;
import java.util.*;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * Example 1:
    Input: n = 3git 
    Output: ["1","2","Fizz"]
 * Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * Constraints:
    1 <= n <= 10^4
 * 
 * COMPLETED ON 7/11/2022
 */
public class FizzBuzz {
  
    public List<String> fizzBuzz(int n) {
        ArrayList<String> numbers = new ArrayList<String>();

        for (int i = 1; i <= n; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                numbers.add("FizzBuzz");
            } else if (i % 3 == 0){
                numbers.add("Fizz");
            } else if (i % 5 == 0){
                numbers.add("Buzz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        System.out.print(numbers);
        return numbers;
    }
}
=======
package leetcodepractice;
import java.util.*;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * Example 1:
    Input: n = 3git 
    Output: ["1","2","Fizz"]
 * Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * Constraints:
    1 <= n <= 10^4
 * 
 * COMPLETED ON 7/11/2022
 */
public class FizzBuzz {
  
    public List<String> fizzBuzz(int n) {
        ArrayList<String> numbers = new ArrayList<String>();

        for (int i = 1; i <= n; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                numbers.add("FizzBuzz");
            } else if (i % 3 == 0){
                numbers.add("Fizz");
            } else if (i % 5 == 0){
                numbers.add("Buzz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        System.out.print(numbers);
        return numbers;
    }
}
>>>>>>> d09d1f9e48e7bdc83ef4e564830f6c3de62b2930:FizzBuzz.java

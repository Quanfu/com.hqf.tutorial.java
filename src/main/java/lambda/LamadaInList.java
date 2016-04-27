package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by huoquanfu on 2016/4/27.
 */
public class LamadaInList {

    /**测试*/
    public static void TestAggrateFunction() {

        //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }

    /**测试遍历List*/
    public static void TestForeach(){
        System.out.println("\n TestForeach:");
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
                "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }

}

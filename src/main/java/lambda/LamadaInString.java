package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by huoquanfu on 2016/4/27.
 */
public class LamadaInString {

    public static void Test() {
        /* Create a List with String more than 2 characters */
        List<String> strList = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.", "Canada");
        List<String> filtered = strList.stream().filter(x -> x.length() > 5)
                .collect(Collectors.toList());
        System.out.println();
        System.out.printf("Original List : %s, \nfiltered list : %s %n",
                strList, filtered);
    }

}

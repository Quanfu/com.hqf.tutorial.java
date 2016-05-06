package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by huoquanfu on 2016/5/5.
 */
public class CollectionsTest
{
    public static void distinctByHashSet(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,2,5);

        List<Integer> distinctResult= new ArrayList(new HashSet(primes));

        System.out.println("\nprimes:");
        primes.stream().forEach(System.out::println);
        System.out.println("\n distinctResult:");
        distinctResult.stream().forEach(System.out::println);
        System.out.print("\n\n");

    }

    public static void distinctByLamada(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,2,5);

        List<Integer> distinctResult=primes.stream().distinct().collect(Collectors.toList());

        System.out.println("\nprimes:");
        primes.stream().forEach(System.out::println);
        System.out.println("\n distinctResult:");
        distinctResult.stream().forEach(System.out::println);
        System.out.print("\n\n");

    }



}

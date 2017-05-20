import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.Arrays;

public class SumOfMultiples {
    private int[] set;
    private int num;

    public SumOfMultiples(int num, int[] set) {
        this.num = num;
        this.set = set;
    }

    public int getSum() {
        int sum = 0;
        Set<Integer> multiples = new HashSet<Integer>(); // create a collection that contains no duplicate elements

        for (int s: set) {
            int factors = 1;
            while( (s * factors) < num) {
                multiples.add(s * factors);
                factors++;
            }
        }

        for (int multiple: multiples) {
            sum += multiple;
        }

        return sum;
    }
}


class otherImplementation {
    private final int sum;

    public otherImplementation(int n, int[] ints) {
        IntFunction<IntStream> multiplesOf =
                i -> IntStream.iterate(i, mult -> mult + i).limit((n - 1) / i);
        this.sum = IntStream.of(ints).flatMap(multiplesOf).distinct().sum();


//        int i = 3;
//        IntStream.iterate(5, mult -> mult + i).limit((n - 1) / i).forEach(System.out::println);
//        int j = 5;
//        IntStream.iterate(5, mult -> mult + j).limit((n - 1) / j).forEach(System.out::println);
//        IntStream.of(ints).flatMap(multiplesOf).distinct().forEach(System.out::println);
    }

    public int getSum() {
        return this.sum;
    }
}

class test {
    public static void main(String[] args) {
        int[] set = {
                3,
                5
        };
        otherImplementation test = new otherImplementation(20, set);
        System.out.println(test.getSum());
    }
}


import java.util.HashSet;
import java.util.Set;

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


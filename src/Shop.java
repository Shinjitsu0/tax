import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop {
    LongAdder sum = new LongAdder();
    final int ARRAY_SIZE = 3;
    final int MAX_VALUE = 100000;
    static int abc = 5;

    public void taxGenerator() {
        Random random = new Random();
        long[] tax = new long[ARRAY_SIZE];
        for (int i = 0; i < tax.length; i++) {
            tax[i] = Math.abs(random.nextInt(MAX_VALUE));
            sum.add(tax[i]);
        }
        System.out.println(Arrays.toString(tax));
    }

}

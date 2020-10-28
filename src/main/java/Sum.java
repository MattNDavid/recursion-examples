import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum {

    // helper function
    // find the sum data[0]...data[n-1]
    private static int recursiveSum(int[] data, int n) {
        if (n==0) {
            return 0;
        }
        return recursiveSum(data, n-1) + data[n-1];
    }

    public static int recursiveSum(int[] data) {
        return recursiveSum(data, data.length);
    }

    public static int iterativeSum(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    // convert array to List https://www.java67.com/2019/03/how-to-convert-int-array-to-arraylist-in-java-8-example.html
    // use lamda for sum https://www.baeldung.com/java-stream-sum
    public static int coolSum(int[] data) {
        List<Integer> dataAsList = IntStream.of(data)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        return dataAsList.stream().reduce(0, Integer::sum);
    }
}

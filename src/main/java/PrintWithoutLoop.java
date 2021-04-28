import java.util.ArrayList;
import java.util.List;

public class PrintWithoutLoop {

    // print with a loop, nothing fancy
    public static void printWithLoop() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static List<Integer> printWithoutLoop(int upTo) {
        if (upTo <= 0) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        printWithoutLoop(0, upTo, result);
        return result;
    }

    private static void printWithoutLoop(int start, int finish, List<Integer> result) {
        if (start >= finish) {
            return;
        }
        result.add(start);
        printWithoutLoop(start + 1, finish, result);
    }

}

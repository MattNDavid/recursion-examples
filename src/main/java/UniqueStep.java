public class UniqueStep {
    public static int uniqueSteps(int size) {
        if (size < 0) {
            return 0;
        }
        if (size <= 1) {
            return size;
        }

        // repeated subproblem
        return uniqueSteps(size - 1) + uniqueSteps(size - 2);
    }
}

public class Max {
    // helper function
    // find the max from data[k]...data[data.length-1]

    public static int findMaxRecursive(int[] data) {
        return -1;
    }

    public static int findMaxIterative(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            System.out.printf("findMaxIterative: comparing %d with %d\n", max, data[i]);
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    /*
    this is to implement the findMax that does the same comparison
    sequence as the recursion version without actually using recursion
     */
    public static int findMaxUsingStack(int[] data) {
        Stack<Integer> stack = new ArrayStack<>(data.length);
        for (int i = 0; i < data.length - 1; i++) {
            stack.push(data[i]);
        }

        int max = data[data.length - 1];
        while (stack.size() != 0) {
            int topVal = stack.peek();
            System.out.printf("findMaxUsingStack: comparing %d with %d\n", topVal, max);
            max = Math.max(topVal, max);
            stack.pop();
        }
        return max;
    }
}

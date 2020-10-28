public class CallMeMaybe {
    private static void callMeMaybe() {
        System.out.println("Hello Maybe!");
        callMeMaybe();
    }

    public static void main(String[] args) {
       callMeMaybe();
    }

}

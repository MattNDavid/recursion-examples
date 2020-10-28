public class Dream {
    public static void dream(int level) {
        System.out.println("started dreaming in level " + level);

        if (level > 0) {
            System.out.println("pause everything. going into " +
                    (level - 1) + " level of dream");
            dream(level - 1);
            System.out.println("woke up from " + (level - 1) + " level of dream, continue in level " + level);
        }

        System.out.println("waking up from dream level " + level);
    }

    /*
    HOW TO TEST THIS?
     */
}

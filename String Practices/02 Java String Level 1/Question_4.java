public class Question_4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment below to see abrupt stop
        // generateException();
        handleException();
    }
}
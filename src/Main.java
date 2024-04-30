public class Main {
    public static void main(String[] args) {
        String text = "banana";
        String part = "a";
        System.out.println(removePart(text, part));
    }

    public static String removePart(String text, String part) {
        return text.replace(part, "");
    }
}
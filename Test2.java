public class Test2 {
    public static void main(String args[]) {
        String str = "Hello";
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[str.length()-1-i] = str.charAt(i);

        }
        System.out.println(result);

    }
}

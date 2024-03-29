public class Utility {
    public static boolean isValidResponseXorO(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        return c == 'X' || c == 'O';
    }

    public static boolean isValidResponseYorN(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        return (c == 'Y' || c == 'N');
    }

    public static boolean isValidResponse1to9(String str) {
        int n = Integer.parseInt(str.substring(0, 1));
        return (n >= 1 && n <= 9);
    }

}

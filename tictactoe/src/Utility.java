public class Utility {
    public static boolean isValidResponseXorO(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        return c == 'X' || c == 'O';
    }

    public static boolean isValidResponseYorN(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        return (c == 'Y' || c == 'N');
    }

}

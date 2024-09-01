public class Utility {
    public static boolean isXO(String str) {
        if (str.isEmpty())
            return false;
        char c = Character.toUpperCase(str.charAt(0));
        return c == 'X' || c == 'O';
    }

    public static boolean isYN(String str) {
        if (str.isEmpty())
            return false;
        char c = Character.toUpperCase(str.charAt(0)); // TODO try/catch
        return (c == 'Y' || c == 'N');
    }
    public static boolean is1to9(String str) {
        if (str.isEmpty())
            return false;
        int n = Integer.parseInt(str); // TODO try/catch
        return (n >= 1 && n <= 9);
    }

}

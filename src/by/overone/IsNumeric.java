package by.overone;

public class IsNumeric {
    public static boolean isInt(String enter) throws NumberFormatException {
        try {
            Integer.parseInt(enter);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}

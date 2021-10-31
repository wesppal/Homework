package by.overone;


public class Field {
    //    public String[][] field = {{".",".","."},{".",".","."},{".",".","."}};
    private final char[][] fieldTempast = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '.'}};
    public char[][] field = fieldTempast;
    int length;

    public void clearField(){
        this.field = this.fieldTempast;
    }

    //    private static String[][] help() {
//        String[][] field = new String[3][3];
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[i].length; j++) {
//                field[i][j] = i + ";" + j;
//            }
//        }
//        return field;
//    }

//    public static void printHelp(){
//        System.out.println("\n" + "Help. Coordinates of the field.");
//        for (String[] arr : Field.help()) {
//            System.out.println(Arrays.toString(arr));
//        }
//    }


}

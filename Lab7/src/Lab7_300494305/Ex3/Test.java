package Lab7_300494305.Ex3;

public class Test {

    public static boolean algorithm1 (String str) {
        int brace, square, bow;
        brace = square = bow = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == '(') {
                bow++;
            } else if (current == ')') {
                bow--;
            } else if (current == '[') {
                square++;
            } else if (current == ']') {
                square--;
            } else if (current == '{') {
                brace++;
            } else if (current == '}') {
                brace--;
            }
        }

        return brace == 0 && square == 0 && bow == 0;
    }

   
    public static void main( String[] args ) {
            System.out.println( "algorithm1( \"" + "()[]() " + "\" ) returns " + algorithm1( "()[]()" ) );
            System.out.println( "algorithm1( \"" + "([][()])" + "\" ) returns " + algorithm1( "([][()])" ) );
            System.out.println( "algorithm1( \"" + "(4 * (7 - 2)) " + "\" ) returns " + algorithm1( "(4 * (7 - 2))" ) );
            System.out.println( "algorithm1( \"" + "([[()])" + "\" ) returns " + algorithm1( "([[()])" ) );
    }
}

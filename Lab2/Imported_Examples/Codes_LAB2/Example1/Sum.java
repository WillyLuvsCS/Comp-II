/*************************Example1 *********************/
public class Sum {
    public static void main( String[] args ) {

        int res = 0;
        for ( int i=0; i<args.length; i++ ) {
            res += Integer.parseInt( args[ i ] );
        }
        System.out.println( "The sum is " + res);

    }
}

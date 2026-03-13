package Lab7_300494305.Ex2;

public class Test {
 
   static Stack<Integer> sort(Stack<Integer> p1) {
        Stack<Integer> p2 = new ArrayStack<Integer>(10);
        Stack<Integer> p3 = new ArrayStack<Integer>(10);

        while (!p1.isEmpty()) {
            if (p2.isEmpty() || p1.peek() < p2.peek()) {
                p2.push(p1.pop());
                while (!p3.isEmpty()) {
                    p2.push(p3.pop());
                }
            } else {
                p3.push(p2.pop());
            }
        }
        return p2;
    }

    public static void main(String[] args) {

        int[] tab = {4,3,2,5,8,0,2,6,9,3};
        Stack<Integer> pile;
        pile = new ArrayStack<Integer>( 10 );
         
        
         Stack<Integer> sortedPile;
         sortedPile = new ArrayStack<Integer>( 10 );

       // stack the tab elements and display its elements
        for (int i = 0; i < tab.length; i++) {
                pile.push(tab[i]);
        }

       System.out.println( "The elements of my stack are initially: "  );
       while (!pile.isEmpty()) {
            System.out.println(pile.pop());
        }
        
        
       // Re-stack the stack using Tab and display its sorted elements
       for (int i = 0; i < tab.length; i++) {
                pile.push(tab[i]);
        }
       sortedPile = sort(pile);
        
        System.out.println();
        System.out.println( "The elements of my sorted stack are: "  );
        while ( !sortedPile.isEmpty() ) {
            System.out.println( sortedPile.pop() );
        }

    }

}

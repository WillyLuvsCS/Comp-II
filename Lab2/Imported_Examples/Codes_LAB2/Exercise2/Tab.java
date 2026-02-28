/*************************Exercice 2*********************/
class Tab {
public static void trier( int [ ] tab ){
//YOUR CODE HERE
}

public static int average(int[] tab){

        //CODE HERE
}


public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i, average;
int[] tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
trier(tab1 ) ;
trier(tab2 ) ;


System.out.println ("The sorted elements of tab1 are : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Printout of contents from tab1 sorted*/
  if ( i >0) {
  System.out.print ( " , " ) ;
  }
  System.out.print (tab1 [ i ] ) ;
}
System.out.println ( ) ;
System.out.println ("The sorted elements of tab2 are : " ) ;
for ( i =0; i<tab2.length ; i++) {
/*Printout of contents from tab2 sorted*/
  if ( i >0) {
    System.out.print ( " , " ) ;
  }
  System.out.print (tab2 [ i ] ) ;
}
System.out.println ( ) ;
System.out.print ("The average value of tab1 is " + average(tab1)) ;
System.out.println ( ) ;
moyenne=moyenne(tab2);
System.out.print ("The average value of tab2 is " + average ) ;
System.out.println ( ) ;
}

}


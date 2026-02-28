/*Exercise2 LAB3*/

class Tab {
public static void sort( int [ ] tab ){
//COMPLETE WITH SOLUTION LAB2 
 }

public static int average(int[] tab){
//COMPLETE WITH SOLUTION LAB2
}

public static int count(int[] tab, int val){

        //YOUR CODE HERE
}

public static void split(int[] tab,int[] smallTab, int val){ 
        //YOUR CODE HERE
        
}

public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i,average, size;
int[] smallTab,tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
sort(tab1 ) ;
sort(tab2 ) ;
average=average(tab2);
size = count(tab2, average); 
smallTab = new int[size];

System.out.println ("The sorted elements of tab1 and tab2 are : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Printout of contents from tab1 sorted*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab1 [ i ] ) ;
 }
System.out.println ( ) ;
for ( i =0; i<tab2.length ; i++) {
/*Printout of contents from tab2 sorted*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab2 [ i ] ) ;
 }
System.out.println ( ) ;
System.out.print ("The average value of tab2 is " + average(tab2)) ;
System.out.println ( ) ;
average=average(tab2);
split(tab2,smallTab,average);
 System.out.print("The elements of smallTab are : ");           
        for(i=0; i<smallTab.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(smallTab[i]);           
        }
System.out.println ( ) ;
 }

}

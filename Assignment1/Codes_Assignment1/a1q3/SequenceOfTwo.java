
public class SequenceOfTwo{
public static sequenceOfTwo(int[] x) {
    /*
     A function that takes an array of integers and returns 
     true if there is at least one sequence of two consecutive equal elements, and false otherwise.
     */
     
     // YOUR CODE COMES HERE

  }

 
public static void main(String[] args) {
   
    int[] Tab1 = {3,1,1,7,5};
    int[] Tab2 = {1,6,4,3,3,3};
    int[] Tab3 = {2,1,5,3,1,2,1};
    
     System.out.println("There is at least one sequence of two consecutive equal elements in Tab1: " + sequenceOfTwo(Tab1));
     
     System.out.println("There is at least one sequence of two consecutive equal elements in Tab2: " + sequenceOfTwo(Tab2));
  
     System.out.println("There is at least one sequence of two consecutive equal elements in Tab3: " + sequenceOfTwo(Tab3));
     System.out.println();
    }

  } 


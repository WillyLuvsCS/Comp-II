/*************************Example3 *********************/
class SortCmd {
    // Sorting an array of integers
    static void sort(int [] tab)
    {
      int i;   // Index of the element to insert
      int j;   // Insertion position index
      int save;   // Saving the element to be inserted
      for (i = 1; i < tab.length; i++) {
 // Save the element
 save = tab[i];
 // search for the insertion position
 for (j = i-1; j >= 0 && tab[j] > save; j--)
   tab[j+1] = tab[j];
 // Insertion 
 tab[j+1] = save;
      }
    }
    // Reading and sorting integers on the command line
    public static void main(String [] args)
    {
 // Array creation 
 int[] a = new int [args.length];

 // Reading integers
 for(int i = 0; i < args.length; i++)
     a[i] = Integer.parseInt(args[i]);

 // sorting
 sort(a);

 // Display in order
System.out.print("The sorted array is : {");
 System.out.print(a[0]);
 for(int i = 1; i < a.length; i++)
     System.out.print(","+ a[i]);
  System.out.println("}");
    }

}

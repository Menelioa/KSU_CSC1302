package mod1;

public class Lab_5_Menelio {//PatternRecognistion_2DimMain
  public static void main(String[] args) {
/*    int[][] board = {
        {0, 1, 0, 6, 1, 6, 1},
        {0, 1, 6, 8, 6, 0, 1},
        {5, 2, 2, 1, 8, 2, 9},
        {6, 5, 6, 1, 1, 2, 1},
        {6, 9, 6, 2, 1, 9, 1},
        {3, 5, 9, 1, 3, 1, 1},
        {6, 5, 6, 3, 1, 9, 3},
        {1, 3, 6, 1, 9, 0, 7}    
    }; */
    
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int numberOfRows = input.nextInt();
    System.out.print("Enter the number of columns: ");
    int numberOfColumns = input.nextInt();
    
    int[][] board = new int[numberOfRows][numberOfColumns];
    
//////////////////////Debugging    
    System.out.println("\n number of rows "+ (board.length+1));
    System.out.println("\n number of column "+ (board[0].length+1)+"\n");
///////////////////////
    
    System.out.println("Enter the array values: ");
    for (int i = 0; i < board.length; i++) {
    	for (int j = 0; j < board[i].length; j++) {
    		
    		board[i][j] = input.nextInt();
    	}
    }
    System.out.println(isConsecutiveFour(board));
  }

  public static boolean isConsecutiveFour(int[][] values) {
    int numberOfRows = (values.length);
    int numberOfColumns = (values[0].length);
	//counter for number of consecutive numbers
    int counter=0;

    // Check rows
      for (int i =0; i < numberOfRows;i++ ){
    	  for(int j = 0 ;j < numberOfColumns; j++ ) {
    		  if ((j+1) < numberOfColumns) {
    			  if (values[i][j]==values[i][j+1]) {
    				  counter++;
///////////////////////Debugging
    				  System.out.println("Flag"+" i= "+i+" j= "+j);
////////////////////////////////
    			  }
    		  }
    	  }
      }   
    if(counter >= 4) {
    	return true;
    }
    counter = 0;
    
    // Check columns
    
    
    
  
   // Get a column into an array
      
      
      
      
          
        
    // Check major diagonal (lower part)   
   
   
   
   
   
       
    // Check major diagonal (upper part)
   
   
   
   
   
   
   
   
    // Check sub-diagonal (left part)
    
    
    
    
    
    
    
    
        
    // Check sub-diagonal (right part)
    return false;
  }
}
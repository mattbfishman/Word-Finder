import java.util.Scanner;
import java.io.*;

public class WordFinder
{
	
	//Instance Variables
	private int rows;
	private int cols;
	private int words;
	private char[][] wordFinder1;
	private char[][] wordFinder2;
	
	//Constructor
	public WordFinder()
	{
		//left blank on purpose 
	}

	//Methods
public void findWord(){


}

public void readWordFinder(){
        String inputLine;
		
		Scanner fileInput;
		File inFile = new File("input.txt");
		
		try{
        fileInput = new Scanner(inFile);

        //Pulls the data at the top out to make the maze.
        //it also sets the start and end row for win.
        rows = fileInput.nextInt();
        cols = fileInput.nextInt();
        wordFinder1 = new char[rows][cols];

        fileInput.nextLine();
        //here i placed the nested loops need to populate the array
            for(int i = 0; i<rows; i++){
                inputLine = fileInput.nextLine();
                for(int j = 0; j<cols; j++){
                wordFinder1[i][j] = inputLine.charAt(j);
                }
                System.out.println();
         	   	}   

       	words = fileInput.nextInt();
        wordFinder2 = new char[rows][cols];

        for(int i = 0; i<rows; i++){
            inputLine = fileInput.nextLine();
            for(int j = 0; j<cols; j++){
            wordFinder2[i][j] = inputLine.charAt(j);
            }
            System.out.println();
            }   


        fileInput.close();

    } // end try
		
		catch (FileNotFoundException e){
			System.out.println(e);
			System.exit(1);		// IO error; exit program
		} // end catch
    }
    
    
    //call this aswell in order to display the solve and array
    public void printWordFinder(){
       
		
		//loop through maze and print its contents
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
		        System.out.print(wordFinder1[i][j]);
		    }
            System.out.println();
		}
    }
}
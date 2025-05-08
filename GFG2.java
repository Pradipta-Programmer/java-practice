// Import the File class
import java.io.File;

// Import this class for handling errors
import java.io.FileNotFoundException; 

// Import the Scanner class to read content from text files
import java.util.Scanner; 

public class GFG2 {
	public static void main(String[] args)
	{
		try {
			File Obj = new File("myfile.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}

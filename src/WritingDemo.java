import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WritingDemo {
    //Java.io thorws a FileNotFound Exception

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scan.nextLine();

        try {

          //  FileOutputStream stream = new FileOutputStream(fileName,true);

            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName,true));

            //this is not a default constructor; It accepts an arguement
            //No default constructor....
            //Accepts String object or an object of FileOutputStream value

            //PrintWriter//
            //If the file does not exit, it will create the file
            //If the file exists, then it will overwrite it;

            //PrintWriter writer = new PrintWriter(stream);

            //Write Data
            //When you write your program, which exists in RAM...
            // ...your data goes to the buffer before sent to disk as a batch file
            //It not full, data only exists in buffer
            //Use flush to clean the buffer of any residual shit
            System.out.println("Enter a line:");
            //writer.println("Enter any line:");
            writer.println(scan.nextLine());

            writer.close();


        }catch(FileNotFoundException e){

            System.out.println("Unable to create file:(");
            System.exit(0);

        }

    }

}

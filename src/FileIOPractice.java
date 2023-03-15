import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileIOPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    System.out.println("Enter the file name: ");

    String fileName = scan.nextLine();

    PrintWriter writer = null;

    try {
        //If you want to add data to file, append true
        writer = new PrintWriter(new FileOutputStream(fileName, true));
    } catch (FileNotFoundException e) {
        System.out.println("Unable to open file " + fileName);
        System.exit(0);
    }

    System.out.println("Enter a line: ");

    writer.println(scan.nextLine());

    writer.close();



    }




}

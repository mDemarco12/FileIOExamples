import java.io.*;
import java.util.Scanner;

public class copyContents {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String sourceFile = scan.nextLine();

        System.out.println("Enter target file name: ");
        String targetFile = scan.nextLine();

        scan.close();

        Scanner sourceReader = null;
        PrintWriter targetWriter = null;
        try{

            sourceReader = new Scanner(new FileInputStream(sourceFile));


        }catch(FileNotFoundException e){

            System.out.println("Unable to open " + sourceFile);
            System.exit(0);

        }

        //Open targetFile

        try{
            targetWriter = new PrintWriter(new FileOutputStream(targetFile));

        }catch(FileNotFoundException e){

            System.out.println("Unable to open " + targetFile);
            System.exit(0);



        }
        int counter = 1;
        while(sourceReader.hasNextLine()){


            targetWriter.println(counter + " . " + sourceReader.nextLine());
         counter++;
        }

        sourceReader.close();
        targetWriter.close();

    }
}

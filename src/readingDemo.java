import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//You need these three imports to read data from file


public class readingDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter file name to read in:");
        String fileName = scan.nextLine();

        Scanner fileReader = null;
        try {
          fileReader = new Scanner(new FileInputStream(fileName));

        }catch(FileNotFoundException e){
            System.out.println("Unable to open " + fileName);
            System.exit(0);

        }
        //.hasNextLine()
    while(fileReader.hasNext()) {
        //Read first line from file;;
        System.out.println(fileReader.next());
        //fileReader.nextLine();

        //This will skip a line within the text file
        //fileReader.nextLine();


    }
        //Read, then close
        fileReader.close();
    }


}

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);

        try {

            Scanner scan = new Scanner(new File("ziptable.txt"));
            PrintWriter writer = new PrintWriter("output.txt");

            do {

                String line = scan.nextLine();
                String [] writeThis = line.split(" ");
                writer.print(writeThis[0] + " " + writeThis[1] + " " + writeThis[2] + "\n");

            }

            while (scan.hasNext());

            scan.close();
            writer.close();
        }

        catch (FileNotFoundException fnf){

            System.out.println("File not found");
        }

    }
}

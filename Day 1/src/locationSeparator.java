import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class locationSeparator {
    public static ArrayList[] readFile(String file) throws FileNotFoundException {
        File locations = new File("input.txt");
        Scanner scan = new Scanner(locations);
        ArrayList<Integer> locations1 = new ArrayList<Integer>();
        ArrayList<Integer> locations2 = new ArrayList<Integer>();
        while (scan.hasNextInt()){
            locations1.add(scan.nextInt());
            locations2.add(scan.nextInt());
        }
        return new ArrayList[]{locations1, locations2};
    }
}
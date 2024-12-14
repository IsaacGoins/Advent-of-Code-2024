import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList[] bothLocations = locationSeparator.readFile("input.txt");
        Collections.sort(bothLocations[0]);
        Collections.sort(bothLocations[1]);
        int totalDistance = 0;
        for (int i = 0; i < bothLocations[0].size(); i++) {
            System.out.println(bothLocations[0].get(i) + " " + bothLocations[1].get(i));
            totalDistance += Math.abs((int)bothLocations[0].get(i) - (int)bothLocations[1].get(i));
        }
        System.out.println(totalDistance);
    }
}

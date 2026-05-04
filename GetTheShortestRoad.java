/**
 * GetTheShortestRoad
 * App to calculate the shortest road in four diffrent zones.
 */

import java.util.*;

public class GetTheShortestRoad {
    public static void main(String[] args) {
        System.out.println("**********************\n**GetTheShortestRoad**\n**********************");
        Scanner in_vlaue = new Scanner(System.in);
        int Ustations, Vstations;
        // Input, number of stations 
        System.out.print("Enter the number of stop stations for U: ");
        Ustations = in_vlaue.nextInt();
        System.out.print("Enter the number of stop stations for V: ");
        Vstations = in_vlaue.nextInt();
        System.out.println();

        double[] XtoU = new double[Ustations];
        double[][] UtoV = new double[Ustations][Vstations];
        double[] VtoY = new double[Vstations];
        // Input, length of stations
        System.out.println("Enter the length for the stations: ");
        for(int i = 0; i < Ustations; i++) {
            System.out.print("X to U" + (i + 1) +": ");
            XtoU[i] = in_vlaue.nextDouble();
        }
        for(int i = 0; i < Ustations; i++) {
            for(int j = 0; j < Vstations; j++) {
                System.out.print("U" + (i + 1) + " to V" + (j + 1) +": ");
                UtoV[i][j] = in_vlaue.nextDouble();
            }
        }
        for(int j = 0; j < Vstations; j++) {
            System.out.print("V" +(j + 1) + " to Y" + ": ");
            VtoY[j] = in_vlaue.nextDouble();
        }
        System.out.println();

        // Results
        int[] station = ShortestRoad.stations(XtoU, UtoV, VtoY);
        System.out.println("Stations chosen for the shortest road are X-U" + 
        (station[0] + 1) + "-V" + (station[1] + 1) + "-Y");
        System.out.println("Shortest Road length is " + ShortestRoad.length(XtoU, UtoV, VtoY));

    }
    
}
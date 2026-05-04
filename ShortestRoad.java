/**
 * ShortestRoad
 * Functionality methods to calculate the shortest road from X station to Y station with 
 * U and V stations in between. Road consists of four zones Z1(X), Z2(U), Z3(V) and Z4(Y), noting that
 * X and Y are single station. 
 */

public class ShortestRoad {
    // Get the map for the shortest road.
    // @param two one dimensional arrays and two dimensional array.
    // @return the stations U and V for the shortest road, int array with the station numbers. 
    public static int[] stations(double[] a, double[][] b, double[] c) {
        int[] stations = new int[2];
        double[] XtoU = a;
        double[][] UtoV = b;
        double[] VtoY = c;
        double shortestRoad = XtoU[0] + UtoV[0][0] + VtoY[0];
        stations[0] = 0;
        stations[1] = 0;
        for(int i = 0; i < XtoU.length; i++) {
            for(int j = 0; j < VtoY.length; j++) {
                double temp = XtoU[i] + UtoV[i][j] + VtoY[j];
                if(temp < shortestRoad) {
                    shortestRoad = temp;
                    stations[0] = i;
                    stations[1] = j;
                }
            }
        }
        return stations;
    }

    // Get the length of the shortest road.
    // @param two one dimensional arrays and two dimensional array.
    // @return the length of the shortest road in the desired unit.
    public static double length(double[] a, double[][] b, double[] c) {
        double[] XtoU = a;
        double[][] UtoV = b;
        double[] VtoY = c;
        double length = XtoU[0] + UtoV[0][0] + VtoY[0];
        for(int i = 0; i < XtoU.length; i++) {
            for(int j = 0; j < VtoY.length; j++) {
                double temp = XtoU[i] + UtoV[i][j] + VtoY[j];
                if(temp < length) {
                    length = temp;
                }
            }
        }
        return length;
    }
}
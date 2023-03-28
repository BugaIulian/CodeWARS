//https://www.codewars.com/kata/5601c5f6ba804403c7000004/train/java

import java.util.Arrays;

public class TriangleBayCenter {
    public static void main(String[] args) {
        double[] x = {4, 6};
        double[] y = {12, 4};
        double[] z = {10, 10};
        System.out.println(Arrays.toString(barTriangle(x, y, z)));
    }

    public static double[] barTriangle(double[] x, double[] y, double[] z) {

        double[] arrayResult = new double[2];
        double xT1 = (x[0] + y[0] + z[0]) / 3;
        double yT1 = (x[1] + y[1] + z[1]) / 3;
        xT1 = Math.round(xT1 * 10000d) / 10000d;
        yT1 = Math.round(yT1 * 10000d) / 10000d;
        arrayResult[0] = xT1;
        arrayResult[1] = yT1;
        return arrayResult;
    }
}

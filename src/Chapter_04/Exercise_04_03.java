package Chapter_04;
/**
 * Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities. (Hint: Use the formula in Programming Exercise  4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise  2.19 to compute the area of a triangle.)
 */
public class Exercise_04_03 {
    public static void main(String[] args) {
        double RADIUS = 6371.01;



        // Point of Atlanta, Georgia
        String xy1 = "33.7489954, -84.3879824";

        //Point of Orlando, Florida
        String xy2 = "28.5383355, -81.37923649999999";

        // Point of Charlotte, North Carolina
        String xy3 = "35.2270869, -80.84312669999997";

        int k = xy1.indexOf(',');
        double x1 = Double.parseDouble(xy1.substring(0, k - 1));
        double y1 = Double.parseDouble(xy1.substring(k + 2));


        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0, k - 1));
        double y2 = Double.parseDouble(xy2.substring(k + 2));


        k = xy3.indexOf(',');
        double x3 = Double.parseDouble(xy3.substring(0, k - 1));
        double y3 = Double.parseDouble(xy3.substring(k + 2));


        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        x3 = Math.toRadians(x3);
        y3 = Math.toRadians(y3);


        double distanceab =
                RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        double distancebc =
                RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));

        double distanceca =
                RADIUS * Math.acos(Math.sin(x3) * Math.sin(x1) + Math.cos(x3) * Math.cos(x1) * Math.cos(y3 - y1));

        // Result
        // Compute the total of sides
        double s = (distanceab + distancebc + distanceca) / 2;

        // Compute the area
        double area = Math.pow(s * (s - distanceab) * (s - distancebc) * (s - distanceca), 0.5);

        System.out.printf("The area between the points is %10.3f ", area);


    }
}

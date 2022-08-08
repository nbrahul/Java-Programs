public class Calculator
{
    public static double add(double x, double y) {
        double z=x+y;
        return z;
    }

    public static double subtract(double x, double y) {
        double z=x-y;
        return z;
    }

    public static double multiply(double x, double y) {
        double z=x*y;
        return z;
    }

    public static double divide(double x, double y) {
        double z=x/y;
        return z;
    }

    public static double power(double x, double y) {
        
        return Math.pow(x,y);
    }

    public static double sin(double x) {
          return Math.sin(x);
    }

    public static double cosin(double x) {
        return Math.cos(x);
    }

   public static double sec(double x) {
        return 1/Math.cos(x);
    }

    public static double cosec(double x) {
        return 1/Math.sin(x);
    }

    public static double cot(double x) {
        return Math.sin(x)/Math.cos(x);
    }

    public static double tan(double x) {
        return Math.tan(x);
    }
}


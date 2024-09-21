package app;

public class Main {

    private static final double CONV_K = 0.6213;

    public static void main(String[] args) {
        System.out.println("App for measures converting");
        System.out.println("Version 2.0");

        double km = 7;
        double ml = 15;
        double mile = convKmtoMl(km);
        double kilometers = convMltoKm(mile);
        System.out.println("Result is " + kilometers + " kilometers is " + mile  + " miles");
    }

    private static double convKmtoMl(double km) {
        return km * CONV_K;
    }
    private static double convMltoKm(double mile) {
        return mile / CONV_K;
    }
}

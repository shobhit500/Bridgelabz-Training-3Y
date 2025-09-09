package JavaMethods.level2;

class UnitConverter {
    // Distance conversions
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double yardsToFeet(double yards) {
        return yards * 3;
    }

    public static double feetToYards(double feet) {
        return feet / 3;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    // Volume conversions
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("100°F = " + UnitConverter.fahrenheitToCelsius(100) + "°C");
        System.out.println("5 pounds = " + UnitConverter.poundsToKg(5) + " kg");
        System.out.println("2 gallons = " + UnitConverter.gallonsToLiters(2) + " liters");
    }

}
import java.util.Scanner;

// Exception for high temperature
class HighTemperatureException extends Exception {

    HighTemperatureException(String msg) {
        super(msg);
    }
}

// Exception for low temperature
class LowTemperatureException extends Exception {

    LowTemperatureException(String msg) {
        super(msg);
    }
}

public class FurnaceMonitor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Furnace Temperature in Kelvin: ");
        int temp = sc.nextInt();

        try {

            if (temp > 1500) {
                throw new HighTemperatureException(
                        "ALARM! Temperature is above 1500K");
            }

            else if (temp < 1000) {
                throw new LowTemperatureException(
                        "ALARM! Temperature is below 1000K");
            }

            else {
                System.out.println("Temperature is Normal");
            }

        }

        catch (HighTemperatureException e) {
            System.out.println(e.getMessage());
        }

        catch (LowTemperatureException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

package app;
import java.util.Scanner;

public class Main1 {

    static String[] winterDevices;

    static String device;

    static String powerbank;

    static String solarBattery;

    static int count;

    public static void main(String[] args) {

        winterDevices = new String[]{"Powerbank Baseus", "Smartphone Samsung", "Generator Yamaha", "Smartphone LG", "Powerbank Duracell", "Smartphone Samsung", "Smartphone Nokia", "Solar battery RZTK", "Generator Honda", "Powerbank Baseus", "Powerbank Anker", "Powerbank Remax", "Smartphone Samsung", "Solar battery RZTK", "Solar battery Promate", "Solar battery RZTK"};

        device = "Smartphone Samsung";

        powerbank = "Powerbank Baseus";

        solarBattery = "Solar battery RZTK";

        count = 0;

        System.out.println("Buyings for winter are:");

        for (int index = 0; index < winterDevices.length; index++) {
            String a = winterDevices[index];
            count++;
            System.out.println(count + ") " + a);
        }


        Scanner scanner= new Scanner(System.in);

        System.out.print( "\n--------------------\n" + "Input value for device: " + "\n");

        String search = scanner.nextLine().trim();

        count = 0;

        for (String name : winterDevices) {

            if (name.equals(search)) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("\n" + search + " has been found in " + count +
                    " cases");

        if (count == 0)
            System.out.println("\n" + search + " is absent");
    }
}
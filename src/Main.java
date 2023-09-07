import java.util.Arrays;
import static java.lang.System.*;
public class Main {

    static String[] winterDevices;
    // Шаблон пошуку
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

        System.out.println("--------------------\n" + "Repeating of Smartphone Samsung:");

        count = 0;
        for (String name : winterDevices) {
            if (name.equals(device)) {
                int i = count++;
                System.out.println(count + ") " + name);
            }
        }
            if (count > 0){
                System.out.println("Number of " + device +
                        "'s matches are " + count);
            }
        System.out.println("--------------------\n" + "Repeating of Powerbank Baseus:");

        count = 0;
        for (String name : winterDevices) {
            if (name.equals(powerbank)) {
                int i = count++;
                System.out.println(count + ") " + name);
            }
        }
        if (count > 0){
            System.out.println("Number of " + powerbank +
                    "'s matches are " + count);

            System.out.println("--------------------\n" + "Repeating of Solar battery RZTK:");

            count = 0;
            for (String name : winterDevices) {
                if (name.equals(solarBattery)) {
                    int i = count++;
                    System.out.println(count + ") " + name);
                }
            }
            if (count > 0){
                System.out.println("Number of " + solarBattery +
                        "'s matches are " + count);
        }

            }

        }
}

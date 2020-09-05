import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double angle = scanner.nextDouble();

        //code
        int hours = 12;
        int minutes = 0;
        while (angle >= 360)
        {
          angle -= 360;
        }
        minutes = (int) (angle*2);
        System.out.println(minutes);
        while (minutes >= 60)
        {
          minutes -= 60;
          hours++;
        }
        if (hours >= 13)
        {
          hours -= 12;
        }
        System.out.print(hours + ":");
        System.out.printf("%02d%n", minutes);
        // closing the scanner object
        scanner.close();
    }
}
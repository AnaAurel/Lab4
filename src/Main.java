public class Main {

    public static void main(String[] args) {
       // de la Fahrenheit la Celsius de la 100 la 140


        System.out.println("Celsius to Fahrenheit");

     /*   for (int f = 100; f <= 120; f++)
        {
            double c=5/9d*(f-32);
            System.out.println(f+" grade Fahrenheit " +c+" grade Celsius");
        }*/

     /*   int f = 100;
        while (f<=120)
        {
            double c=5/9d*(f-32);
            System.out.println(f+" grade Fahrenheit " +c+" grade Celsius");
            f++;
        }   */

        int f = 50;
        do
        {
            double c=5/9d*(f-32);
            System.out.println(f+" grade Fahrenheit " +c+" grade Celsius");
            f++;
        }
        while (f<=80);
    }
}

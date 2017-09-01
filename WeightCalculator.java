public class WeightCalculator
{
    public static void main(String[] args)
    {

    //EarthWeight
    double E = Double.parseDouble(args[0]);
    System.out.println("Mars Weight "+E*.38);
    System.out.println("Jupiter Weight "+E*2.36);
    System.out.println("Venus Weight "+ E*.91);
    System.out.println("Saturn Weight "+E*1.06);
    System.out.println("Neutron Star "+E*14+"*10^10");

        printPlanet(E, 0.38, "Mars");
        printPlanet(E, 2.36, "Jupiter");
        printPlanet(E, .91, "Venus");
        printPlanet(E, 1.06, "Saturn");

    }

    public static void printPlanet (double earth, double factor, String planet)
    {
        double weight = earth*factor;
        System.out.println(planet + ": " + weight);




    }

}




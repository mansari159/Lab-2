public class HybridCar {
    public static void main(String[] args) {
        Hybrid hybridVehicle = new Hybrid(300, 120, 70); // Example data
        hybridVehicle.setCostPerGallon(3.50);
        hybridVehicle.setCostPerKWh(0.24);

        System.out.println("MPG in gas mode: " + hybridVehicle.calculateMPG());
        System.out.println("MPGe in electric mode: " + hybridVehicle.calculateMPGe());
        System.out.println("Average MPG in hybrid mode: " + 
                           (hybridVehicle.calculateMPG() + hybridVehicle.calculateMPGe()) / 2);
    }
}

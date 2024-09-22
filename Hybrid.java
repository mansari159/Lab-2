public class Hybrid implements GasolineInterface, ElectricInterface {
    private double costPerGallon;
    private double costPerKWh;
    private double milesDrivenOnGas;
    private double milesDrivenOnElectric;
    private double kWhUsed;

    // Constructor without using 'this'
    public Hybrid(double milesDrivenOnGasInput, double milesDrivenOnElectricInput, double kWhUsedInput) {
        milesDrivenOnGas = milesDrivenOnGasInput;
        milesDrivenOnElectric = milesDrivenOnElectricInput;
        kWhUsed = kWhUsedInput;
    }

    @Override
    public double calculateMPG() {
        return milesDrivenOnGas / 10.0; // Modify this for actual calculation
    }

    @Override
    public double calculateMPGe() {
        return (milesDrivenOnElectric / kWhUsed) * 33.7;
    }

    @Override
    public double getCostPerGallon() {
        return costPerGallon;
    }

    @Override
    public void setCostPerGallon(double costPerGallonInput) {
        costPerGallon = costPerGallonInput;
    }

    @Override
    public double getCostPerKWh() {
        return costPerKWh;
    }

    @Override
    public void setCostPerKWh(double costPerKWhInput) {
        costPerKWh = costPerKWhInput;
    }
}

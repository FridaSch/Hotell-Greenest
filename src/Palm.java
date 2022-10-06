public class Palm extends Växt implements Vattnas {

    private String name;
    private String fluidType = "Kranvatten";
    private double height;
    private double fluidAmount;
    public Palm() {
    }
    public Palm(String name, String fluidType, double height, double fluidAmount) {
        super(name, fluidType, height, fluidAmount);
        this.name = name;
        this.fluidType = fluidType;
        this.height = height;
        this.fluidAmount = fluidAmount;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public String GetName() {
        return this.name;
    }
    public void SetFluidType(String fluidType) {
        this.fluidType = fluidType;
    }
    public String GetFluidType() {
        return fluidType;
    }
    public void SetHeight(double height) {
        this.height = height;
    }
    public double GetHeight() {
        return this.height;
    }
    public void SetFluidAmount(double fluidAmount) {
        this.fluidAmount = fluidAmount;
    }
    public double GetFluidAmount() {
        double fluidAmount = this.height * 0.5;
        return fluidAmount;
    }
    @Override
    public String needOfFluid() {
        return null;
    }
}


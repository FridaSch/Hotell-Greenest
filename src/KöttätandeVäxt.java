public class KöttätandeVäxt extends Växt implements Vattnas {

    private String name;
    private String fluidType = "Proteidryck";
    private double height;
    private double fluidAmount;
    public KöttätandeVäxt() {}

    public KöttätandeVäxt(String name, String fluidType, double height, double fluidAmount) {
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
        return this.fluidType;
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
        double fluidAmount = this.height*0.2+0.1;
        return this.fluidAmount;
    }
    @Override
    public boolean needOfFluid(boolean b) {
        return true;
    }

}



public class Växt implements Vattnas{
    protected String name;
    protected String fluidType;
    protected double height;
    protected double fluidAmount;
    public Växt() {}
    public Växt(String name, String fluidType, double height, double fluidAmount) {
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
       this.height = height;}
    public double GetHeight() {
        return this.height;}
    public void SetFluidAmount(double fluidAmount) {
        this.fluidAmount = fluidAmount;
    }
    public double GetFluidAmount() {
        return this.fluidAmount;
    }
    @Override
    public String needOfFluid() {
        return null;
    }
}


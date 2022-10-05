public class Kaktus extends Växt implements Vattnas {

    private String name;
    private String fluidType;
    private double height;
    private double fluidAmount;
    //Inkapsling
    public Kaktus(){}

    public Kaktus(String name, String fluidType, double height, double fluidAmount) {
        super(name, fluidType, height, fluidAmount);
        this.name = name;
        this.fluidType = fluidType;
        this.height = height;
        this.fluidAmount = fluidAmount;           //Konstruktor
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
        double fluidAmount = this.fluidAmount;
        return this.fluidAmount;
    }

}
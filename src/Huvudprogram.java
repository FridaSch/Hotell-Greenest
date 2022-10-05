import javax.swing.*;

public abstract class Huvudprogram implements Vattnas{
    public static void main(String[] args) {

        String name;
        double height;
        String fluidType;
        double fluidAmount;

        Växt Igge = new Kaktus();
        Växt Laura = new Palm();
        Växt Putte = new Palm();
        Växt Meatloaf = new KöttätandeVäxt();

        Igge.SetName("Igge");
        Igge.SetHeight(0.2);
        Igge.SetFluidType("Mineralvatten");
        Igge.SetFluidAmount(0.02);
        name = Igge.GetName();
        height = Igge.GetHeight();
        fluidType = Igge.GetFluidType();
        fluidAmount = Igge.GetFluidAmount();

        Putte.SetHeight(1);
        Putte.SetFluidType("Kranvatten");
        Putte.SetFluidAmount(0.5);

        Meatloaf.SetHeight(1);
        Meatloaf.SetFluidType("Proteindryck");
        Meatloaf.SetFluidAmount(0.24);
        //Polymorfism

        String VäxtAttMata = JOptionPane.showInputDialog("Skriv in namnet på den växt som ska matas: ");

        JOptionPane.showMessageDialog(null, VäxtAttMata + " behöver "
                + Igge.GetFluidAmount() + "liter" + Igge.GetFluidType());



        JOptionPane.showMessageDialog(null, VäxtAttMata + " behöver "
                + Laura.GetFluidAmount() + "liter" + Laura.GetFluidType());;
    }

}



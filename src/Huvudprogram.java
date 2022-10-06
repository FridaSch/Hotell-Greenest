import javax.swing.*;

import static javax.swing.JOptionPane.*;
public abstract class Huvudprogram implements Vattnas {
    public static void main(String[] args) {

        String name;
        double height;
        String fluidType;
        double fluidAmount;

        Växt Igge = new Kaktus();
        Växt Putte = new Palm();
        Växt Laura = new Palm();
        Växt Meatloaf = new KöttätandeVäxt();

        Igge.SetName("Igge");
        Igge.SetHeight(0.2);
        Igge.SetFluidType("mineralvatten");
        Igge.SetFluidAmount(0.02);
        name = Igge.GetName();
        height = Igge.GetHeight();
        fluidType = Igge.GetFluidType();
        fluidAmount = Igge.GetFluidAmount();

        Putte.SetName("Putte");
        Putte.SetHeight(1);
        Putte.SetFluidType("kranvatten");
        Putte.SetFluidAmount(0.5);
        name = Putte.GetName();
        height = Putte.GetHeight();
        fluidType = Putte.GetFluidType();
        fluidAmount = Putte.GetFluidAmount();

        Laura.SetName("Laura");
        Laura.SetHeight(5);
        Laura.SetFluidType("kranvatten");
        Laura.SetFluidAmount(2.5);
        name = Laura.GetName();
        height = Laura.GetHeight();
        fluidType = Laura.GetFluidType();
        fluidAmount = Laura.GetFluidAmount();

        Meatloaf.SetName("Meatloaf");
        Meatloaf.SetHeight(0.7);
        Meatloaf.SetFluidType("proteindryck");
        Meatloaf.SetFluidAmount(0.24);
        name = Meatloaf.GetName();
        height = Meatloaf.GetHeight();
        fluidType = Meatloaf.GetFluidType();
        fluidAmount = Meatloaf.GetFluidAmount();
        //Polymorfism


        String VäxtAttMata = showInputDialog("Skriv in namnet på den växt som ska matas: ");
        switch (VäxtAttMata) {
            case "Igge":
                JOptionPane.showMessageDialog(null, Igge.GetName() + " behöver "
                        + Igge.GetFluidAmount() + " liter " + Igge.GetFluidType());
                break;

            case "Putte":
                JOptionPane.showMessageDialog(null, Putte.GetName() + " behöver "
                        + Putte.GetFluidAmount() + " liter " + Putte.GetFluidType());
                break;

            case "Laura":
                JOptionPane.showMessageDialog(null, Laura.GetName() + " behöver "
                        + Laura.GetFluidAmount() + " liter " + Laura.GetFluidType());
                break;

            case "Meatloaf":
                JOptionPane.showMessageDialog(null, Meatloaf.GetName() + " behöver "
                        + Meatloaf.GetFluidAmount() + " liter " + Meatloaf.GetFluidType());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Fel namn inmatat.");
        }
    }
}
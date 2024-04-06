
package cafe.management;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SuperClass {
    public  double latte;
    public double valecoffee;
    public double Espresso;
    public double icedlatte;
    public double cappuccino;
    public double americancoffee;
    public double icedcappuccino;
    public double redvelvetcake;
    public double pineapplecake;
    public double blackforestcake;
    public double hazelnutcake;
    public double dutchcake;
    public double cheesecake;
    public double coffeecake;
    public double coffee;
    public double cake;
    public double totalc;
    public double allcost;
    public double GetAmount()
    {
coffee=Espresso+latte+valecoffee+icedlatte+cappuccino+americancoffee+icedcappuccino ; 
cake=redvelvetcake+pineapplecake+blackforestcake+hazelnutcake+dutchcake+cheesecake+coffeecake ;
        totalc=coffee+cake;
        allcost=totalc;
        return allcost;
    }
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Cafe Management System",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }   
    }
    public double platte = 40;
    public double pvalecoffee = 40;
    public double pEspresso = 40;
    public double picedlatte= 40;
    public double pcappuccino = 40;
    public double pamericancoffee = 40;
    public double picedcappuccino = 40;
    public double predvelvetcake = 40;
    public double ppineapplecake = 40;
    public double pblackforestcake= 40;
    public double phazelnutcake = 40;
    public double pdutchcake = 40;
    public double pcheesecake = 40;
    public double pcoffeecake = 40;    
    public double tax = 0.90;
    public Double cfindtax(double cAmount)
    {
        double FindTax = cAmount - (cAmount *tax);
        return FindTax;
    }  
}
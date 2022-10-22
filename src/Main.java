import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Moneda1000 moneda = null;
        Expendedora exp1 = new Expendedora(1,1000);
        Comprador juan = new Comprador(exp1,moneda,1);
        juan.comprarBebida();
        System.out.println(juan.cuantoVuelto());
        System.out.println(juan.queBebida());
    }
}

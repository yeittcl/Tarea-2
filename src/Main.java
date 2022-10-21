import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Moneda1000 moneda = new Moneda1000();
        Expendedora exp1 = new Expendedora(2,500);
        Comprador juan = new Comprador(exp1,moneda,1);
        juan.comprarBebida();
        System.out.println(juan.cuantoVuelto());
        System.out.println(juan.queBebida());
    }
}

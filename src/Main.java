public class Main {
    public static void main(String[] args) {
        Moneda peso = new Moneda1000();
        Expendedora expend1 = new Expendedora(10,500);
        Comprador juan = new Comprador(expend1,peso,1);
        juan.comprarBebida();
        System.out.println(juan.queBebida());
        System.out.println(juan.cuantoVuelto());

        Moneda yen = new Moneda100();
        Expendedora expend2 = new Expendedora(10,500);
        Comprador pedro = new Comprador(expend2,yen,1);
        pedro.comprarBebida();
        System.out.println(pedro.cuantoVuelto());

        Moneda yuan = new Moneda500();
        Expendedora expend3 = new Expendedora(0,500);
        Comprador miguel = new Comprador(expend3,yuan,1);
        miguel.comprarBebida();
        System.out.println(miguel.cuantoVuelto());

        Moneda won = null;
        Expendedora expend4 = new Expendedora(10,500);
        Comprador diego = new Comprador(expend4,won,2);
        diego.comprarBebida();
    }
}

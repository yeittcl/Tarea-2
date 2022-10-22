public class Comprador {
    private Moneda moneda;
    private int eleccion;
    private Expendedora expend;
    private String bebida;
    private int vuelto;

    public Comprador(Expendedora expend, Moneda moneda, int eleccion){
        this.expend = expend;
        this.moneda = moneda;
        this.eleccion = eleccion;
        this.vuelto = 0;
    }
    public void comprarBebida(){
        try {
            Bebida b = expend.VenderBebida(moneda,eleccion);
            bebida = b.beber();
        }catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        }catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        }catch (NoHayBebidaException e){
            System.out.println(e.getMessage());
        }
    }
    public int cuantoVuelto(){
        while(true) {
            Moneda aux = expend.DarVuelto();
            if (aux == null) {
                break;
            } else {
                vuelto = vuelto + aux.getValor();
            }
        }
        return vuelto;
    }

    public String queBebida(){
        return bebida;
    }
}

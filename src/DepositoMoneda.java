import java.util.ArrayList;
public class DepositoMoneda{
    private ArrayList<Moneda> almacen;

    public DepositoMoneda(){
        almacen = new ArrayList<Moneda>();
    }
    public void addBebida(Moneda moneda){
        almacen.add(moneda);
    }
    public Moneda getBebida(){
        if(almacen.size()==0){
            return null;
        }else{
            return almacen.remove(0);
        }
    }
}
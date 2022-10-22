import java.util.ArrayList;
public class DepositoBebida{
    private ArrayList<Bebida> almacen;

    public DepositoBebida(){
        almacen = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida bebida){
        almacen.add(bebida);
    }
    public Bebida getBebida(){
        if(almacen.size()==0){
            return null;
        }else{
            return almacen.remove(0);
        }
    }
    public int size(){
        return almacen.size();
    }
}
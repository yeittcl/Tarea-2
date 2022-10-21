import java.util.ArrayList;
public class Deposito{
    private ArrayList<Bebida> almacen;

    public Deposito(){
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
}
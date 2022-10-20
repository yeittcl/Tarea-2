public class Fanta extends Bebida{
    public Fanta(int Serie){
        super(Serie);
    }
    public String beber(){
        String x = new String(super.beber()+ "fanta");
        return x;
    }
}
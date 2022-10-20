public class Sprite extends Bebida{
    public Sprite(int Serie){
        super(Serie);
    }
    public String beber(){
        String x = new String(super.beber()+ "sprite");
        return x;
    }
}

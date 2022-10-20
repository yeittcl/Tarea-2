abstract class Bebida{
    private int Serie;
    public Bebida(int Serie){
        this.Serie = Serie;
    }
    public int getSerie(){
        return Serie;
    }
    public String beber(){
        String x = new String("sabor: ");
        return x;
    }
}

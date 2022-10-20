class CocaCola extends Bebida{
    public CocaCola(int Serie){
        super(Serie);
    }
    public String beber(){
        String x = new String(super.beber()+ "cocacola");
        return x;
    }
}
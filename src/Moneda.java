public abstract class Moneda {
    String serie;
    public Moneda(){
        serie = new String(this);
    }
    public abstract int getValor();
}


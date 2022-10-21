public class Expendedora {
    private int numBebida;
    private int precioBebida;
    private DepositoBebida depositoCoca;
    private DepositoBebida depositoFanta;
    private DepositoBebida depositoSprite;
    private DepositoMoneda depositoMoneda;
    private int valorMoneda;
    

    public Expendedora(int numBebida, int precioBebida){
        this.numBebida = numBebida;
        this.precioBebida = precioBebida;

        depositoCoca = new DepositoBebida();
        depositoFanta = new DepositoBebida();
        depositoSprite = new DepositoBebida();
        depositoMoneda = new DepositoMoneda();

        for(int i=0;i<numBebida;i++){
            CocaCola tempCocaCola = new CocaCola(100+i);
            Sprite tempSprite = new Sprite(200+i);
            Fanta tempFanta = new Fanta(300+i);
            depositoCoca.addBebida(tempCocaCola);
            depositoSprite.addBebida(tempSprite);
            depositoFanta.addBebida(tempFanta);
        }
    }
    public Bebida VenderBebida(Moneda moneda, int select){
        if(moneda.getValor() >= precioBebida){
            valorMoneda = moneda.getValor();
            switch(select){
                case 1:
                    crearVuelto();
                    return depositoCoca.getBebida();
                case 2:
                    crearVuelto();
                    return depositoSprite.getBebida();
                case 3:
                    crearVuelto();
                    return depositoFanta.getBebida();
                default: return null;  
            }           
        }
        return null;
    }

    public void crearVuelto(){
        Moneda100 aux;
        for (int i=precioBebida; i<valorMoneda; i+=100){
            aux = new Moneda100();
            depositoMoneda.addMoneda(aux);
        }
    }
    
    public Moneda DarVuelto(){
        return depositoMoneda.getMoneda();
    }
}
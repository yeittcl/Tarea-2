public class Expendedora {
    //private int numBebida;
    //private int precioBebida;
    private DepositoBebida depositoCoca;
    private DepositoBebida depositoFanta;
    private DepositoBebida depositoSprite;
    private DepositoMoneda depositoMoneda;
    private int valorMoneda;
    

    public Expendedora(int cantidad, int precio){
        depositoCoca = new DepositoBebida();
        depositoFanta = new DepositoBebida();
        depositoSprite = new DepositoBebida();
        depositoMoneda = new DepositoMoneda();
        for(int i=0;i<cantidad;i++){
            CocaCola tempCocaCola = new CocaCola(100+i);
            Sprite tempSprite = new Sprite(200+i);
            Fanta tempFanta = new Fanta(300+i);
            depositoCoca.addBebida(tempCocaCola);
            depositoSprite.addBebida(tempSprite);
            depositoFanta.addBebida(tempFanta);
        }
    }
    public Bebida VenderBebida(Moneda moneda, int select){
        if(moneda.getValor() == 1000){
            valorMoneda = moneda.getValor();
            switch(select){
                case 1: return depositoCoca.getBebida();
                case 2: return depositoSprite.getBebida();
                case 3: return depositoFanta.getBebida();
                default: return null;  
            }           
        }
        return null;
    }
    
    public Moneda Darvuelto(){
        if(depositoMoneda.size() == 0){
            if(valorMoneda < 1000){
                for(int i=valorMoneda; i<1000 ;i=+100){
                    
                }
            return null;
            }
        }
        return null;
    }
}
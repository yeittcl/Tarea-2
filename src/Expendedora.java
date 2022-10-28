public class Expendedora {
    private int numBebida;
    private int precioBebida;
    private DepositoBebida depositoCoca;
    private DepositoBebida depositoFanta;
    private DepositoBebida depositoSprite;
    private DepositoMoneda depositoMoneda;
    

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
    public Bebida VenderBebida(Moneda moneda, int select) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException{
        if(moneda == null){
            throw new PagoIncorrectoException("Ingrese una moneda valida porfavor!");
        }
        if(moneda.getValor() >= precioBebida){
            int valorMoneda = moneda.getValor();
            switch(select){
                case 1:
                    if(depositoCoca.size() == 0){
                        depositoMoneda.addMoneda(moneda);
                        throw new NoHayBebidaException("Fuera de Stock, intente con otro sabor!");
                    }else {
                        crearVuelto(valorMoneda);
                        return depositoCoca.getBebida();
                    }
                case 2:
                    if(depositoSprite.size() == 0){
                        depositoMoneda.addMoneda(moneda);
                        throw new NoHayBebidaException("Fuera de Stock, intente con otro sabor!");
                    }else {
                        crearVuelto(valorMoneda);
                        return depositoSprite.getBebida();
                    }
                case 3:
                    if(depositoFanta.size() == 0){
                        depositoMoneda.addMoneda(moneda);
                        throw new NoHayBebidaException("Fuera de Stock, intente con otro sabor!");
                    }else {
                        crearVuelto(valorMoneda);
                        return depositoFanta.getBebida();
                    }
                default: return null;  
            }           
        }if(moneda.getValor() < precioBebida){
            depositoMoneda.addMoneda(moneda);
            throw new PagoInsuficienteException("El pago es insuficiente para la compra, intentelo nuevamente!");
        }
        return null;
    }

    public void crearVuelto(int valor){
        Moneda100 aux;
        for (int i=precioBebida; i<valor; i+=100){
            aux = new Moneda100();
            depositoMoneda.addMoneda(aux);
        }
    }
    
    public Moneda DarVuelto(){
        return depositoMoneda.getMoneda();
    }
}
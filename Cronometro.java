
public class Cronometro {
    private MostradorNumero minutos;
    private MostradorNumero segundos;
    private String mostradorString;
    
    public Cronometro(){
        this.minutos = new MostradorNumero(60);
        this.segundos = new MostradorNumero(60);
        segundos.setValor(0);
        minutos.setValor(0);
    }
    public void timeTick(){
        segundos.incrementar();
        if(segundos.getValor() == 0){
            minutos.incrementar();
        }
        atualizaMostrador();
    }
    public String getTime() {
        return mostradorString;
    }
    public void atualizaMostrador() {
        mostradorString = minutos.getMostradorValor() + ":" + segundos.getMostradorValor();
    }
}

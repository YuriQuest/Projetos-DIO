package one.digitalinovation.gof.Stategy;

public class ComportamentoAgressivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se Agressivamente...");
    }
}

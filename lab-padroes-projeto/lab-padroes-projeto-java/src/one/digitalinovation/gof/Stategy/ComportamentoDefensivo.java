package one.digitalinovation.gof.Stategy;

public class ComportamentoDefensivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente...");
    }
}

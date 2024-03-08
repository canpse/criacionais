package lucas.padroescriaconais.builder.exemplo1;

/**
 *
 * Nest exemplo simples pode ser dificil ver a utilidade do padrao
 * mas nem sempre as pecas sendo colocados serao aoenas um set
 * geralmente ao usar este padrao voce ira precisar configurar as partes colocadas 
 * 
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        this.carro = new Carro();
    }

    public void setMotor(String motor) {
        this.carro.setMotor(motor);
    }


    public void setNumeroportas(String numeroportas) {
        this.carro.setNumeroportas(numeroportas);
    }

    public void setManualautomatico(String manualautomatico) {
        this.carro.setManualautomatico(manualautomatico);
    }


    public void setTurbo(String turbo) {
        this.carro.setTurbo(turbo);
    }

    public void setNeon(String neon) {
        this.carro.setNeon(neon);
    }
    
    public Carro constroiCarro(){
        return carro;
    }
    
    
    
}

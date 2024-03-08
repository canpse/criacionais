package lucas.padroescriaconais.builder.exemplo1;

/**
 * Aqui teremos um objeto com muitos parametros opcionais
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class Carro {
    
    private String motor;
    private String numeroportas;
    private String manualautomatico;
    private String turbo;
    private String neon;

    // podemoss ver que construir o objeto assim é complicado tendo que passar muitos parametros
    public Carro(String motor, String numeroportas, String manualautomatico, String turbo, String neon) {
        this.motor = motor;
        this.numeroportas = numeroportas;
        this.manualautomatico = manualautomatico;
        this.turbo = turbo;
        this.neon = neon;
    }

    public Carro() {
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNumeroportas() {
        return numeroportas;
    }

    public void setNumeroportas(String numeroportas) {
        this.numeroportas = numeroportas;
    }

    public String getManualautomatico() {
        return manualautomatico;
    }

    public void setManualautomatico(String manualautomatico) {
        this.manualautomatico = manualautomatico;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public String getNeon() {
        return neon;
    }

    public void setNeon(String neon) {
        this.neon = neon;
    }
    
    
    
}

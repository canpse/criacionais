package lucas.padroescriaconais.fluent;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class Casa {

    private String janela;
    private String porta;
    private String ceramica;
    private String pizzo;
    private String cozinha;
    private String porao;

    public String getJanela() {
        return janela;
    }

    public Casa setJanela(String janela) {
        this.janela = janela;
        return this;
    }

    public String getPorta() {
        return porta;
    }

    public Casa setPorta(String porta) {
        this.porta = porta;
        return this;
    }

    public String getCeramica() {
        return ceramica;
    }

    public Casa setCeramica(String ceramica) {
        this.ceramica = ceramica;
        return this;
    }

    public String getPizzo() {
        return pizzo;
    }

    public Casa setPizzo(String pizzo) {
        this.pizzo = pizzo;
        return this;
    }

    public String getCozinha() {
        return cozinha;
    }

    public Casa setCozinha(String cozinha) {
        this.cozinha = cozinha;
        return this;
    }

    public String getPorao() {
        return porao;
    }

    public Casa setPorao(String porao) {
        this.porao = porao;
        return this;
    }

}

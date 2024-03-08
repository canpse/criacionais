package lucas.padroescriaconais.singleton.exemplo2;

import lucas.padroescriaconais.singleton.singleton;

/**
 * Neste exemplo temos um recurso do sistema bastante custoso que não queremos
 * ter que instanciar na memoria todo o tempo
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class Conexao implements singleton{

    private Conexao self;
    
    private Conexao() {
        
    }
    
    @Override
    public singleton getInstance() {
        if (self == null) {
            self = new Conexao();
        }
        return self;
    }
    
}

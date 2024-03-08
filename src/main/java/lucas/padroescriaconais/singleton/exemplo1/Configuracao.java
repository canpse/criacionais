package lucas.padroescriaconais.singleton.exemplo1;

import lucas.padroescriaconais.singleton.singleton;

/**
 * 
 * Imaginando uma Configuracao global que todo o sistema deve usar e voce quer
 * que se mantenha consistente sempre que for chamada
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class Configuracao implements singleton{

    private Configuracao self;
    
    private Configuracao(){
        
    }
    
    @Override
    public singleton getInstance() {
        if (self == null) {
            self = new Configuracao();
        }
        return self;
    }
    
}

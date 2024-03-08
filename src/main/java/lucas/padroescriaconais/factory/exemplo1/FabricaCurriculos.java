package lucas.padroescriaconais.factory.exemplo1;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class FabricaCurriculos implements FabricaDocumentos{

    @Override
    public Documento criaDocumento() {
        return new Curriculo();
    }
    
}

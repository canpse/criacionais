package lucas.padroescriaconais.factory.exemplo1;

/**
 * Neste exmplo teremos diversos documentos com uma mesma interface que serao 
 * criados em diversos lugares em nosso codigo
 * 
 * mas sempre sera usado um unico tipo de documento
 * portanto queremos que as criacoes dos documentos sejam feitas por um outro 
 * objeto que pode ser trocado em tempo de execucao e dependendo o tipo deste 
 * objeto ele ira criar outro tipo de documento
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public interface FabricaDocumentos {
    
    Documento criaDocumento();
    
}

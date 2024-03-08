package lucas.padroescriaconais.abstractFactory.exemplo1;

/**
 * A fabrica abstrata serve quando voce tem familias de objetos a seremm criados
 * 
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public interface GuiFactory {
   
    Botao criarBotao();
    Janela criarJanela();
    
}

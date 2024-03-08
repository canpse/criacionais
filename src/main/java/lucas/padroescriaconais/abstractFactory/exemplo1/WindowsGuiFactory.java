package lucas.padroescriaconais.abstractFactory.exemplo1;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class WindowsGuiFactory implements GuiFactory{

    @Override
    public Object criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Object criarJanela() {
        return new JanelaWindows();
    }

    
    
}

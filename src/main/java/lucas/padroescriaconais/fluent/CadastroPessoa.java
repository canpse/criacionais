package lucas.padroescriaconais.fluent;

/**
 * 
 * Aqui vamos demonstar o uso do padrão fluente que tem como objetivo diminuir 
 * construtores e melhorar a legibilidade do codigo
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class CadastroPessoa {
    
    private String nome;
    private String cpf;
    private String genero;
    private String nascimento;
    private String nacionalidade;

    public String getNome() {
        return nome;
    }

    public CadastroPessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public CadastroPessoa setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public CadastroPessoa setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getNascimento() {
        return nascimento;
    }

    public CadastroPessoa setNascimento(String nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public CadastroPessoa setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }
    
}

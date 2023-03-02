//Com um classe (ex. public class Empregado{}) se descreve algo de interesse do mundo real.

//Iniciar git => "git init".
//Transformar untracked ou modified em staged => "git add [nome do arquivo]".
//Transformar staged em unmodified => "git commit -m "[mensagem, é obrigatória]"".
//Mudar o autor de um arquivo permanente => "git commit --amend --author="[nome do autor] <[e-mail]>"".
//Acessar o histórico de commits => "git log". Acessar o código também => "git log -p"

//Passos referentes a manipulação de repositórios remotamente. Uso do GitHub.
//No próprio GitHub, cria-se um repositório. Então cria-se um tokenclássico (que é um mecanismo que dá permissão,...
//... cujas limitações são estipuladas pelo tipo do token, à quem o usar para mexer nos arquivos do repositório)...
//... que é introduzido no link do repositório (ex. https://[token]@[resto do link]).
//No VSCode, para adicionar esse git remoto o comando é o seguinte: "git remote add [nome dado ao git] ...
//[link do repositório com token]".
//"git remote add [link]" => faz com que esse git remoto seja reconhecido.
//"git push [nome do git] [nome da branch, geralmente "main"]" => cria a relação com esse git remoto,...
//o que não os torna sincronizados em tempo real, significa que mudanças no repositório local agora...
//...podem ser passados para o remoto.
//"git remote -v" => mostra quais são os gits remotos reconhecidos.
//"git remote --help" => Lista uma série de comandos.

//Encapsulamento: marcar como private. Outras classes não podem acessá-las... 
//...Em casos de mudanças realizadas à elas, outras classes que delas fazem uso não são afetadas.

public class Empregado{
    //Variáveis de instância (objetos).
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;
    private int tipo;

    public double calcularSalario(){
        if(tipo==0)
            return salario;
        if(tipo==1)
            return salario + salario * comissao;
        if(tipo==2)
            return salario + bonus;
        return 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        //Operador de autorreferência (this).
        //...Neste caso, ele fará o apontamento para o objeto,...
        //...enquanto fica claro que o outro "nome" se refere a váriavel local.
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

//Criação de Tags = Tags leves e Tags que são anotadas.
//Tags leves são como branchs, imutáveis, agem apenas como ponteiro.
//Tags anotadas contêm diversas informações,como nome de quem as fez, e-mail, data da criação,...
//... anotações etc.
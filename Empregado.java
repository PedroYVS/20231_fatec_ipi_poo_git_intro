//Com um classe (ex. public class Empregado{}) se descreve algo de interesse do mundo real.
//Iniciar git => "git init".
//Transformar untracked ou modified em staged => "git add [nome do arquivo]".
//Transformar staged em unmodified => "git commit -m "[mensagem, é obrigatória]"".
//Mudar o autor de um arquivo permanente => "git commit --amend --author="[nome do autor] <[e-mail]>"".
//Acessar o histórico de commits => "git log". Acessar o código também => "git log -p"

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
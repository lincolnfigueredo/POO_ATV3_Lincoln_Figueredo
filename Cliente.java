public class Cliente {
    private String nome;
    private int idade;

    public Cliente() {
    }

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método get e set NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método get e set IDADE
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método toString
    public String toString() {
        return "Nome:" + nome + ", Idade:" + idade;
    }
}
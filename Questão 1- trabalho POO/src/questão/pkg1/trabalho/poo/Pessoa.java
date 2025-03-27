package questão.pkg1.trabalho.poo;

public class Pessoa {
    
    private int codigo;
    private String nome;
    private String dataCadastro;
    
    public Pessoa (int codigo, String nome, String dataCadastro){
       this.codigo=codigo;
       this.nome=nome;
       this.dataCadastro=dataCadastro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public void imprimir (){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de cadastro: " + getDataCadastro());
    }
}

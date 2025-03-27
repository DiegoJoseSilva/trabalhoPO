package questão.pkg1.trabalho.poo;

public class Cliente extends Pessoa {
    private String email;
    private String endereco;
    private String telefone;
    
    public Cliente (int codigo, String nome, String dataCadastro, String email, String endereco, String telefone){
        super (codigo, nome, dataCadastro);
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void imprimir (){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de cadastro: " + getDataCadastro());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
    }
}

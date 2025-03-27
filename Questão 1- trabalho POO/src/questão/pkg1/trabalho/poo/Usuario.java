package questão.pkg1.trabalho.poo;

public class Usuario extends Pessoa{
    private String login;
    private String senha;
    
    public Usuario (int codigo, String nome, String dataCadastro, String login, String senha){
    super (codigo, nome, dataCadastro);
    this.login=login;
    this.senha=senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void imprimir (){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de cadastro: " + getDataCadastro());
        System.out.println("Login: " + getLogin());
        System.out.println("Senha: "+ getSenha());
    } 
}

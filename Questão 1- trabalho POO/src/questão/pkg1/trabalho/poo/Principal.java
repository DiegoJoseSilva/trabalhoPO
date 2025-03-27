package questão.pkg1.trabalho.poo;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Teste classe pessoa");
        Pessoa p1 = new Pessoa (1, "Diego", "27-03-2025");
        Pessoa p2 = new Pessoa (2, "Julia", "01-01-2023");
        p1.imprimir();
        p2.imprimir();
        System.out.println("----------------------------------------------------");
        
        System.out.println("Teste classe Cliente");
        Cliente c1= new Cliente (1, "Andre", "02-02-23","andre@gmail.com", "Faria Pereira, 01", "3433-2850");
        Cliente c2= new Cliente (2, "Bia", "05-12-22","bia@gmail.com", "Rui Barbosa, 12", "3433-2790");
        c1.imprimir();
        c2.imprimir();
        System.out.println("----------------------------------------------------");
        
        System.out.println("Teste classe Usuario");
        Usuario u1=new Usuario (1, "Pedro", "03-09-96", "adm", "1234");
        Usuario u2=new Usuario (2, "Rafael", "09-10-2005", "gerente", "3515");
        u1.imprimir();
        u2.imprimir();
        System.out.println("----------------------------------------------------");
    }
}
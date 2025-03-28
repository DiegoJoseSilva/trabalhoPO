package trabalho.q2;

public class Principal {
    public static void main(String[] args) {
       System.out.println("Iniciando testes conta bancaria");
       
       ContaBancaria conta1= new ContaBancaria ("Diego", 1000, 3500);
       ContaBancaria conta2= new ContaBancaria (" ", 250, 3200);
       ContaBancaria conta3= new ContaBancaria ("Maria", 4, 1500);
       conta1.depositar(150.00);
       conta2.depositar(500.00);
       conta3.depositar(100.00);
       conta1.sacar(1200.00);
       conta2.sacar(100.00);
       conta3.sacar(5.00);
       System.out.println("--------------------------------------------------");
       
       System.out.println("Iniciando testes conta poupanca");
       
       ContaPouPanca contapoupanca1= new ContaPouPanca ("Joaquim", 1000, 3500, 2.5);
       ContaPouPanca contapoupanca2= new ContaPouPanca ("Cleide", 2000, 500, 5);
       ContaPouPanca contapoupanca3= new ContaPouPanca ("Pedro", 800, 2800, 2.8);
       contapoupanca1.depositar(500.00);
       contapoupanca1.sacar(400.00);
       contapoupanca1.aplicarJuros();
       contapoupanca2.depositar(1000.00);
       contapoupanca2.sacar(1200.00);
       contapoupanca2.aplicarJuros();
       contapoupanca3.depositar(200.00);
       contapoupanca3.sacar(500.00);
       contapoupanca3.aplicarJuros();
       System.out.println("--------------------------------------------------");
       
       System.out.println("Iniciando testes conta Corrente");
        
       ContaCorrente contacorrente1 = new ContaCorrente ("Ana", 430.00, 2000.00, 3500.00);
       ContaCorrente contacorrente2 = new ContaCorrente ("Carlos", 1330.00, 8000.00, 4000.00);
       ContaCorrente contacorrente3 = new ContaCorrente ("Bia", 5400.00, 10000.00, 3500.00);
    }
}

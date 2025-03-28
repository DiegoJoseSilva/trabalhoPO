package trabalho.q2;
//Diego José da Silva e Douglas Miquéias.
public class Principal {
    public static void main(String[] args) {
       System.out.println("Iniciando testes conta bancaria");
       
       ContaBancaria conta1= new ContaBancaria ();
       ContaBancaria conta2= new ContaBancaria ();
       ContaBancaria conta3= new ContaBancaria ();
       
       conta1.setTitular("Diego");
       conta1.setRendaMensal(4.500);
       conta1.setSaldo(2000.00);
       conta1.depositar(100.00);
       
       conta2.setTitular("");
       conta2.setRendaMensal(3200.00);
       conta2.setSaldo(1500.00);
       conta2.depositar(200.00);
       
       conta3.setTitular("Rafael");
       conta3.setRendaMensal(6320.00);
       conta3.setSaldo(800.00);
       conta3.depositar(150.00);
             
       conta1.sacar(1200.00);
       conta2.sacar(100.00);
       conta3.sacar(950.00);
       
       System.out.println("--------------------------------------------------");
       
       System.out.println("Iniciando testes conta poupanca");
       
       ContaPouPanca contapoupanca1= new ContaPouPanca ();
       ContaPouPanca contapoupanca2= new ContaPouPanca ();
       ContaPouPanca contapoupanca3= new ContaPouPanca ();
       
       contapoupanca1.setTitular("Joaquim");
       contapoupanca1.setSaldo(1500.00);
       contapoupanca1.setTaxaJuros(2);
       contapoupanca1.aplicarJuros();
           
       contapoupanca2.setTitular("Jose");
       contapoupanca2.setSaldo(1000.00);
       contapoupanca2.setTaxaJuros(1);
       contapoupanca2.aplicarJuros();
       
       contapoupanca3.setTitular("Bia");
       contapoupanca3.setSaldo(3000.00);
       contapoupanca3.setTaxaJuros(2.9);
       contapoupanca3.aplicarJuros();
       
       System.out.println("--------------------------------------------------");
       
       System.out.println("Iniciando testes conta Corrente");
        
       ContaCorrente contacorrente1 = new ContaCorrente ();
       ContaCorrente contacorrente2 = new ContaCorrente ();
       ContaCorrente contacorrente3 = new ContaCorrente ();
       
       contacorrente1.setTitular("Joana");
       contacorrente1.setRendaMensal(2500.00);
       contacorrente1.setLimiteEspecial(3500);
       
       contacorrente2.setTitular("Mauricio");
       contacorrente2.setRendaMensal(4000.00);
       contacorrente2.setLimiteEspecial(2500);
       
       contacorrente3.setTitular("Marcelo");
       contacorrente3.setRendaMensal(20000.00);
       contacorrente3.setLimiteEspecial(12500);
    }
}

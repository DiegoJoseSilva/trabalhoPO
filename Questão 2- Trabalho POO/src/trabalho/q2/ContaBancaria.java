package trabalho.q2;

public class ContaBancaria {
    
    private String titular;
    private Double saldo;
    private Double rendaMensal;
    private static final double SALARIO_MINIMO= 1518.00;
    

    public ContaBancaria(String titular, double saldo, double rendaMensal){
        if (rendaMensal < SALARIO_MINIMO){
            this.rendaMensal= 2*SALARIO_MINIMO;
        }else{
             this.rendaMensal = rendaMensal;
        }
        this.saldo= saldo;
        if (titular == null || titular.equals(" ")){
             this.titular= "Nao identificado";
         }else{
             this.titular = titular;
         } 
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void depositar (Double montante){
        saldo = saldo + montante;
        verificarSaldo (saldo);
    }
    
    public void sacar (Double montante){ 
        if (saldo>montante){
            saldo = saldo - montante;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        verificarSaldo (saldo);
    }
    
    public void verificarSaldo (double saldo){
        System.out.println("O saldo na conta de " + titular + " e: R$ " + saldo);
    }
}
package trabalho.q2;
//Diego José da Silva e Douglas Miquéias.
public class ContaBancaria {
    
    private String titular;
    private Double saldo;
    private Double rendaMensal;
    private Double salarioMinimo=3036.00;


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
        System.out.println("O saldo na conta de " + getTitular()+ " e: R$ " + getSaldo());
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.equals ("")){
            this.titular= "Nao identificado";
        }else{
            this.titular = titular;
        }
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        if (rendaMensal> 3036){
            this.rendaMensal = rendaMensal;
        }else{
            this.rendaMensal= salarioMinimo;
        } 
    }
}

package trabalho.q2;

public class ContaPouPanca extends ContaBancaria{
    private double taxaJuros;
    private double saldo;
    
    ContaPouPanca (String titular, double saldo, double rendaMensal, double taxaJuros){
        super (titular, saldo, rendaMensal);
        if (taxaJuros>=0.6 && taxaJuros<=2.8){
            this.taxaJuros=taxaJuros;
        }else{
            System.out.println("Valor invalido. A taxa de juros aplicada a conta de " + titular + " deve estar entre 0.6 e 2.8!");
        }
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
    
     public double getsaldo(){
        return saldo;
    }
     
     public void setsaldo (double saldo){
         this.saldo=saldo;
     }
    
    public void aplicarJuros (){
        double juros= getSaldo () * (taxaJuros/100);
        depositar (juros);
    } 
}
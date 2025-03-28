package trabalho.q2;
//Diego José da Silva e Douglas Miquéias.
public class ContaPouPanca extends ContaBancaria{
    
    private double taxaJuros;
  
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        if (taxaJuros>=0.6 && taxaJuros<=2.8){
            this.taxaJuros=taxaJuros;
        }else{
            System.out.println("Valor invalido. A taxa de juros aplicada a conta de " + super.getTitular() + " deve estar entre 0.6 e 2.8!");
        }
    }   
        
    public void aplicarJuros (){
        double juros= super.getSaldo() * (getTaxaJuros()/100);
        depositar (juros);
    } 
}
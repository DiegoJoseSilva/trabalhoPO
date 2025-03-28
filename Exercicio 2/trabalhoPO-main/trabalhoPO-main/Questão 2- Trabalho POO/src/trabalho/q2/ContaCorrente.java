package trabalho.q2;

public class ContaCorrente extends ContaBancaria{
    
    private double limiteEspecial;
    
    public ContaCorrente (String titular, double saldo, double rendaMensal, double limiteEspecial){
        super (titular, saldo, rendaMensal);
        double limiteMaximo = getRendaMensal() * 0.4;
      
        if (limiteEspecial > limiteMaximo){
            System.out.println("Limite especial excede 40% da renda mensal. Ajustado para o maximo permitido.");
            this.limiteEspecial= limiteMaximo;
            System.out.println("O limite especial da conta corrente do titular " + titular+ " e: " + limiteMaximo);
        }else{
            this.limiteEspecial=limiteEspecial;
             System.out.println("O limite especial da conta corrente do titular " + titular+ " e: " + limiteEspecial);
        } 
    }
    
    public double getLimiteEspecial() {
        return limiteEspecial;
    }
}

    
    
   
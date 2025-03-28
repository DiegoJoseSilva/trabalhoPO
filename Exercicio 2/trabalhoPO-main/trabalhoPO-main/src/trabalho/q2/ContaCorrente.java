package trabalho.q2;
//Diego José da Silva e Douglas Miquéias.
public class ContaCorrente extends ContaBancaria{
    
    private double limiteEspecial;
    private double limiteMaximo;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public double getLimiteMaximo() {
         return limiteMaximo;
    }

    public void setLimiteMaximo(double limiteMaximo) {
        this.limiteMaximo = 0.4 * super.getRendaMensal();
    }
    
    public void setLimiteEspecial(double limiteEspecial) {
    if (limiteEspecial > getLimiteMaximo()) {
        System.out.println("Limite especial excede 40% da renda mensal. Ajustado para o maximo permitido.");
        this.limiteEspecial = 0.4 * super.getRendaMensal();
    } else {
        this.limiteEspecial = limiteEspecial;
    }

    System.out.println("O limite especial da conta corrente do titular " + super.getTitular() + " e: " + this.limiteEspecial);
    }
    
}

    
    
   
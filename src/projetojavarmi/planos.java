package projetojavarmi;

public class planos {
    private int plano;
    
    public planos(int plano){   
        this.plano = plano;
    }
    
    public int getPlanos(){
        return plano;
    }
    
    public void mostrarPlano(){
        System.out.println("Plano Escolhido: "+getPlanos());
    }  
}
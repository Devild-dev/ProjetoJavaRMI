package projetojavarmi;

public class mes {
    private int mesRef;
    
    public mes(int mesRef){
        this.mesRef = mesRef;
    }
    
    public int getMes(){
        return mesRef;
    }
    
    public void mostrarMes(){
        System.out.println("O mes escolhido foi: "+getMes());
    }
}

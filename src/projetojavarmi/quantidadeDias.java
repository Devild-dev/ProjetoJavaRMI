package projetojavarmi;

public class quantidadeDias {
    
    anoBissexto ano = new anoBissexto();
    private int qtdDias = 0;
    
    public quantidadeDias(int m){
        if(m == 2){
            if(this.ano.bissexto == 1){
                this.qtdDias = 29;
            }else{
               this. qtdDias = 28;
            }
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            this.qtdDias = 30;
        }else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            this.qtdDias = 31;
        }else{
            this.qtdDias = 1;   
        }
     this.qtdDias = qtdDias;
    }
    
    public int getQuantidadeDias(){
        return qtdDias;
    }
    public void setQuantidadeDias(int p){
        this.qtdDias = p;
    }
    
    
    public void mostrarQtdDias(){
        System.out.println("Quantidade de dias: "+getQuantidadeDias());
    }
}
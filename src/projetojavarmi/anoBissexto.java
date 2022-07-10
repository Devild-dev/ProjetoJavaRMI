package projetojavarmi;

import java.util.Calendar;

public class anoBissexto {
   
    
    public int bissexto = 0;
    
    public anoBissexto(){
        Calendar year = Calendar.getInstance();
        int ano = year.get(Calendar.YEAR);
        
        if(ano%4==0 && ano%100 != 0){
            this.bissexto = 1;
        }else if(ano%4 != 1 && ano%400 == 0){
            this.bissexto = 1;
        }
    }   
}
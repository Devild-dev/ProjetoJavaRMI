package projetojavarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImple extends UnicastRemoteObject implements Calculadora{//estende de UnicastRemoteObject e implementa a interface Calculadora
   private static final long serialVersionUID = 1l;
    
    protected CalculadoraImple() throws RemoteException{
        super();
    }
    public double proporcional(int diaInst, int diaPag, int qtdDias, double valorDia) throws RemoteException{// diainst, diapag, periodo, valorDia
        int periodo;
        double valor;
        
        if(diaInst > diaPag){
            periodo = diaPag + qtdDias;
            periodo -= diaInst;
            valor = periodo * valorDia;
        }else{
              diaPag -= diaInst;
              valor = diaPag * valorDia;
       }
        return valor;
    }
}

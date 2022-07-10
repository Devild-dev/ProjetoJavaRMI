package projetojavarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote{//estende de remote
    public double proporcional(int diaInst, int diaPag, int period, double valorDia) throws RemoteException;
    //construtor proporcional
    //throws RemoteException para retorno de exceções 
}

package projetojavarmi;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
    CalculadoraServer(){
        try{
            //propriedade do sistema para criar o endereço do servidor p/ fazer a comunicação
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);//porta do serviço
            Calculadora c = new CalculadoraImple();//cria o objeto do tipo Calculadora
            Naming.bind("CalculadoraService", (Remote) c);//Nome do nosso serviço
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new CalculadoraServer();//Chama a calculadora server
    }
}

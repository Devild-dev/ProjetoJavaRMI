package projetojavarmi;

import java.rmi.Naming;
import java.util.Scanner;

public class CalculadoraClient {
    public static void main(String[] args){
        try{   
            Scanner scanf = new Scanner(System.in);//permite trabalhar com o Scanner
            int dataInst, dataPag, planoEsc, mesRef;
            //objeto do tipo calculadora com endereço do server
            Calculadora c = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculadoraService");
            System.out.println("\nPlanos - Mensalidade - Diaria" +"\n"+"20Mbps  -  R$49,90   - R$1,66\n" +
                                "25Mbps  -  R$59,90   - R$1,99\n" +"30Mbps  -  R$69,90   - R$2,33\n" +
                                "40Mbps  -  R$74,90   - R$2,49\n" +"100Mbps -  R$89,90   - R$2,96\n" +
                                "200Mbps -  R$99,90   - R$3,33\n" +"400Mbps -  R$149,90  - R$4,99\n");            
            do{
                System.out.println("Qual o mes da Instalacao: ");//solicita o mes da operação
                mesRef = scanf.nextInt();           
            }while(mesRef < 1 || mesRef > 12);
        
            mes mes1 = new mes(mesRef);//quantidade de dias do mes de referencia  
            quantidadeDias qtdDias = new quantidadeDias(mes1.getMes());
            int qtdD = qtdDias.getQuantidadeDias();
      
            do{
                System.out.println("Digite a data da Instalacao: ");//data da instalação
                dataInst = scanf.nextInt();
            }while(dataInst < 1 || dataInst > qtdD);
        
            do{
                System.out.println("Digite a data de Pagamento: ");//data do pagamento
                dataPag = scanf.nextInt();
            }while(dataPag < 1 || (dataPag % 5) != 0 || dataPag > qtdD );
        
            do{
                System.out.println("Digite qual o plano Escolhido");//insere o plano: 20, 25, 30, 40, 100, 200 e 400Mbps
                planoEsc = scanf.nextInt();
            }while(planoEsc != 20 && planoEsc != 25 && planoEsc != 30 && planoEsc != 40 && planoEsc != 100 && planoEsc != 200 && planoEsc != 400);
       
            planos plano1 = new planos(planoEsc);//int p = plano1.getPlanos();//plano1.getPlanos();
            valoresPlanos valorPlano = new valoresPlanos(plano1.getPlanos());//pega os valores diários do plano escolhido//valorPlano.mostrarValorPlano();
            double valorP = valorPlano.getValoresPlanos();
            
            //System.out.println("Valor do Proporcional: R$"+ c.proporcional(dataInst, dataPag, qtdD, valorP));
            String resultado = String.format("R$%.2f", c.proporcional(dataInst, dataPag, qtdD, valorP));
            System.out.println("Valor do Proporcional: "+resultado);
            }catch(Exception e){
                e.printStackTrace();
                }   
    }
}

 
package ex01_contabancaria;
import java.util.Scanner;

public class ContaCorrente {
    public static void main( String [] args){

        }

    String numeroConta = "";
    String numeroAgencia = "";
    String nomeCliente = "";
    String dataNascimento = "01/01/1900";
    double saldoConta = 0.0;


    double sacar(double valor){
        saldoConta = saldoConta - valor;
        return 0;
    }

    void transferir(){
        System.out.println("Digite a conta de destino");
        Scanner sc = new Scanner(System.in); // cria leitor
        String n = sc.nextLine(); // lê uma string
        System.out.println("Conta destino: " + n);
        sc.close(); // fecha o scanner

        System.out.println("Digite o Valor a ser transferido para " + n);
        Scanner sc2 = new Scanner(System.in); // cria leitor
        Double m = sc2.nextDouble(); // lê uma double
        System.out.println("Valor: " + m);
        sc2.close(); // fecha o scanner

        System.out.println(String.format("Transferindo %d para %s ", n,m));

    }

    // cancelar a conta com uma justificativa

    // consultar extrato entre duas datas

    // consultar saldo atual
}

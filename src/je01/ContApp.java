package je01;

public class ContApp {
    public static void main(){
        Conta conta = new Conta();

        conta.imprimirSaldo();

        conta.sacar(5.0) ;

        conta.imprimirSaldo();
    }
}

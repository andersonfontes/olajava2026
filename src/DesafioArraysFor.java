import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    // DESAFIO PARTE 2: Evolua o codigo abaixo para realizar o cadastro dos
    // carros usando um loop  FOR e a impressao dos resultados na tela tambem usando FOR

    //String[] carros = new String[4]; //

//    println("\n*** CADASTRO DE CARROS***\n");
//    carros[0] = readln("Digite o carro 1: ");
//    carros[1] = readln("Digite o carro 2: ");
//    carros[2] = readln("Digite o carro 3: ");
//    carros[3] = readln("Digite o carro 4: ");
//
//    println("\nO carro 1 é o : " + carros[0]);
//    println("O carro 2 é o : " + carros[1]);
//    println("O carro 3 é o : " + carros[2]);
//    println("O carro 4 é o : " + carros[3]);

// SOLUÇÃO DO DESAFIO:
        String[] carros = new String[8];

        println("\n*** CADASTRO DE CARROS***\n");

        for(int i = 0; i < 8; i++) {
            carros[i] = readln("Digite o nome do carro: ");
        }
        println("-------------------------------");
        for(int i = 0; i < 8; i++) {
            println("Os carros são: " + carros[i]);
        }
    }
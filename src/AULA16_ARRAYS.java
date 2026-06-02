// Arrays são estruturas de dados que podem armazenar mais de um elemento
// Os arrays são criados com um tamanho fixo
// voce pode alterar elementos mas nao pode aumentar ou diminuir o tamanho do Array

import static java.lang.IO.* ;

void main() {

    String[] selecoes = {"Brasil" , "Alemanha" , "Espanha" , "Italia", "Congo"};
    println(selecoes[0]); // imprimir um elemento do Array
    println(selecoes[1]);
    println(selecoes[2]);
    println(selecoes[3]);
    println(selecoes[4]);

    println("------------");
    selecoes[0] = "França"; // alterando o primeiro elemento do Array
    println(selecoes[0]); // imprimir um elemento do Array

    selecoes[4] = "Russia";
    println(selecoes[4]);

    // criando um Array vazio, é necessario especificar o numero de elementos!!

    String[] carros = new String[4]; // 

    // DESAFIO: peça para o usuario digitar 4 carros em seguida e grave-os no Array criado acima
    // Ao final, imprima a lista de carros com a numeracao de 1 a 4


}
import static java.lang.IO.*;

void main() {

    String nome = "anderson";

    println("\n -- Imprimindo o conteudo de uma variavel");
    println("Nome: " + nome);


    String[] nomes = {"anderson", "atila", "lucas"};
    println("\n -- Imprimindo o conteudo de um ARRAY");
    println("Nome: " + nomes[0] );
    println("Nome: " + nomes[1] );
    println("Nome: " + nomes[2] );

    println("\n -- Imprimindo o conteudo de um ARRAY com um loop FOR");

    for(int i = 0 ; i < 3 ; i++ ){
        println("Nome: " + nomes[i] );
    }





}
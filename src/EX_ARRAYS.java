import static java.lang.IO.*;

void main() {
    String[] frutas = {"uva" , "banana" , "morango" , "pera"};

    println(Arrays.toString(frutas) ); // impriminado a lista original

    println(frutas[2]);

    frutas[0] = "manga"; // alterando o primeiro elementos

    println(Arrays.toString(frutas) ); // imprimindo a lista alterada

    // frutas[3] = readln("Digite uma fruta pra substituir a pera: ");

    print("LISTA ALTERADA COM SUCESSO! \n NOVA LISTA:" + Arrays.toString(frutas) );

    println("\n\nLISTA DE FRUTAS - imprimindo manualmente");
    println(frutas[0]);
    println(frutas[1]);
    println(frutas[2]);
    println(frutas[3]);

    println("\n\nLISTA DE FRUTAS - imprimindo usando FOR");
    for(int i = 0 ; i < 4 ; i++){
        println(frutas[i] );
    }

    //PESQUISAR O ARRAY E DESCOBRIR O INDICE DO ELEMENTO
    println(Arrays.asList(frutas).indexOf("pera"));





}


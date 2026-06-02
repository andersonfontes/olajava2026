//AULA 16 - MENU USANDO LOOPS

import static java.lang.IO.*;

void main() {

    String opcao;

    do {
        IO.println("Bem-Vindo ao Sistema de Cadastro");
        IO.println("** MENU DE OPÇÕES **");
        IO.println("1- CADASTRAR PACIENTE");
        IO.println("2- ALTERAR PACIENTE");
        IO.println("3- EXCLUIR PACIENTE");
        IO.println("4- SAIR ");

        opcao = readln("\nDigite a opcao desejada: ");

        IO.println("\nOpção escolhida:" + opcao);

        if (opcao.equals("1")) {
            IO.println("\nIniciando Cadastro de Paciente.....");
            // TODO: Implementar rotina de cadastro
            IO.println("Cadastro finalizado....");
        }

        if (opcao.equals("2")) {
            IO.println("\nIniciando Alteração Cadastro de Paciente.....");
            // TODO: Implementar rotina de alteração
            IO.println("Alteração finalizada....");
        }

        if (opcao.equals("3")) {
            IO.println("\nExcluir Paciente.....");
            // TODO: Implementar rotina de alteração
            IO.println("Cliente Excluído....");
        }

        if (opcao.equals("4")) {
            IO.println("\nFINALIZANDO PROGRAMA...");
            break;
        }
    }while(!opcao.equals("4"));
}
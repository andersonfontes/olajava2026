import static java.lang.IO.*;

public class CadastroAlunos {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] cursos = new String[10];

        int totalAlunos = 0;
        int opcao = 0;

        while (opcao != 5) {

            println("\n===== SISTEMA DE CADASTRO DE ALUNOS =====");
            println("1 - Cadastrar aluno");
            println("2 - Listar alunos");
            println("3 - Buscar aluno pelo nome");
            println("4 - Remover aluno");
            println("5 - Sair");

            opcao = Integer.parseInt(readln("Escolha uma opção: "));

            if (opcao == 1) {

                if (totalAlunos >= 10) {
                    println("Limite máximo de alunos atingido.");
                } else {

                    String nome = readln("Digite o nome do aluno: ");

                    if (nome.trim().isEmpty()) {
                        println("ERRO: o nome do aluno não pode ficar vazio.");
                    } else {

                        int idade = Integer.parseInt(
                                readln("Digite a idade do aluno: ")
                        );

                        String curso = readln("Digite o curso do aluno: ");

                        nomes[totalAlunos] = nome;
                        idades[totalAlunos] = idade;
                        cursos[totalAlunos] = curso;

                        totalAlunos++;

                        println("Aluno cadastrado com sucesso!");
                    }
                }

            } else if (opcao == 2) {

                if (totalAlunos == 0) {

                    println("Nenhum aluno cadastrado.");

                } else {

                    println("\n===== LISTA DE ALUNOS =====");

                    for (int i = 0; i < totalAlunos; i++) {

                        println("\nAluno " + (i + 1));
                        println("Nome: " + nomes[i]);
                        println("Idade: " + idades[i]);
                        println("Curso: " + cursos[i]);
                    }
                }

            } else if (opcao == 3) {

                if (totalAlunos == 0) {

                    println("Nenhum aluno cadastrado.");

                } else {

                    String nomeBusca =
                            readln("Digite o nome do aluno que deseja buscar: ");

                    boolean encontrado = false;

                    for (int i = 0; i < totalAlunos; i++) {

                        if (nomes[i].equalsIgnoreCase(nomeBusca)) {

                            println("\nAluno encontrado!");
                            println("Nome: " + nomes[i]);
                            println("Idade: " + idades[i]);
                            println("Curso: " + cursos[i]);

                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        println("Aluno não encontrado.");
                    }
                }

            } else if (opcao == 4) {

                if (totalAlunos == 0) {

                    println("Nenhum aluno cadastrado.");

                } else {

                    String nomeRemover =
                            readln("Digite o nome do aluno que deseja remover: ");

                    int posicaoEncontrada = -1;

                    for (int i = 0; i < totalAlunos; i++) {

                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            posicaoEncontrada = i;
                            break;
                        }
                    }

                    if (posicaoEncontrada == -1) {

                        println("Aluno não encontrado.");

                    } else {

                        println("\nAluno encontrado:");
                        println("Nome: " + nomes[posicaoEncontrada]);
                        println("Idade: " + idades[posicaoEncontrada]);
                        println("Curso: " + cursos[posicaoEncontrada]);

                        String confirmacao =
                                readln("Deseja realmente remover este aluno? (S/N): ");

                        if (confirmacao.equalsIgnoreCase("S")) {

                            for (int i = posicaoEncontrada;
                                 i < totalAlunos - 1;
                                 i++) {

                                nomes[i] = nomes[i + 1];
                                idades[i] = idades[i + 1];
                                cursos[i] = cursos[i + 1];
                            }

                            nomes[totalAlunos - 1] = null;
                            idades[totalAlunos - 1] = 0;
                            cursos[totalAlunos - 1] = null;

                            totalAlunos--;

                            println("Aluno removido com sucesso.");

                        } else {

                            println("Remoção cancelada.");
                        }
                    }
                }

            } else if (opcao == 5) {

                println("Sistema encerrado.");

            } else {

                println("Opção inválida.");
            }
        }
    }
}
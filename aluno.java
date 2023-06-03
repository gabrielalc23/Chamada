package sp.senai.br.chamada;

import java.util.ArrayList;
import java.util.Scanner;
   
public class aluno {

    

      public static void main (String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int presencas = 0;
        int faltas = 0;

        while (opcao != 5) {
            System.out.println("_______________________________ ");
            System.out.println("            Menu               |");
            System.out.println("_______________________________|");
            System.out.println("------------------------------- ");
            System.out.println("    1. Adicionar aluno         |");
            System.out.println("------------------------------ |");
            System.out.println("    2. Exibir chamada          |");
            System.out.println("------------------------------ |");
            System.out.println("    3. Remover aluno           |");
            System.out.println("------------------------------ |");
            System.out.println("    4. Fazer chamada           |");
            System.out.println("------------------------------ |");
            System.out.println("    5.Sair                     |");
            System.out.println("_______________________________|");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                //Adicionar nome do aluno
                case 1:
                    System.out.println("Digite o nome do aluno: \n");
                    String nomeAluno = scanner.next();
                    listaAlunos.add(nomeAluno);
                    System.out.println("Aluno adicionado com sucesso! \n");
                    break;
                    //Mostrar a chamada
                    case 2:
                    
                        System.out.println("Lista de chamada: \n");
                    for (String aluno : listaAlunos) {
                        System.out.println(aluno);
                    }
                    break;
                    //Remover aluno
                     case 3:
                    
                         System.out.println("Digite o nome do aluno a ser removido: ");
                    String alunoRemovido = scanner.next();
                    if (listaAlunos.contains(alunoRemovido)) {
                        listaAlunos.remove(alunoRemovido);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado na lista!");
                    }
                    break;
                     case 4:
                         System.out.println("Fazendo a chamada:");
                    for (String aluno : listaAlunos) {
                        System.out.println("Presente? (S/N): " + aluno);
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("S")) {
                            System.out.println("Aluno " + aluno + " presente.");
                            presencas++;
                        } else {
                            System.out.println("Aluno " + aluno + " ausente.");
                            faltas++;
                        }
                    }
                    break;
                         
                    // Sair do programa
                    case 5:
                    System.out.println("Saindo do programa... \n");
                    break;

                    default:
                    System.out.println("Opção inválida. Tente novamente. \n");
                    break;
            }
        }
                 System.out.println("Presenças: " + presencas);
                 System.out.println("Faltas: " + faltas);  
        
        scanner.close();
    
      }
}

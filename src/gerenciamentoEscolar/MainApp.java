package gerenciamentoEscolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        AlunoServiceImpl service = new AlunoServiceImpl(alunos);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno por Matrícula");
            System.out.println("4. Apagar Aluno");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do Aluno: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe a matrícula do Aluno: ");
                    int matricula = scanner.nextInt();
                    System.out.println("Informe a nota do Aluno");
                    double nota = scanner.nextDouble();
                    Aluno alunoNovo = new Aluno(nome, matricula, nota);
                    service.adicionarAluno(alunoNovo);
                    break;
                case 2:
                    System.out.println("Lista de Alunos cadastrados:");
                    alunos = service.listarAlunos();
                    System.out.println(alunos);
                    break;
                case 3:
                    System.out.println("Informe a matrícula do Aluno: ");
                    int matriculaInformada = scanner.nextInt();
                    Aluno alunoEncontrado = service.buscarAlunoPorMatricula(matriculaInformada);
                    System.out.println(alunoEncontrado);
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}

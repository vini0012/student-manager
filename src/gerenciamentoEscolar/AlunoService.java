package gerenciamentoEscolar;

import java.util.List;

public sealed interface AlunoService permits AlunoServiceImpl {
    void adicionarAluno(Aluno aluno);
    List<Aluno> listarAlunos();
    Aluno buscarAlunoPorMatricula(int matricula);
}

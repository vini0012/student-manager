package gerenciamentoEscolar;

import java.util.List;

public final class AlunoServiceImpl implements AlunoService {

    private List<Aluno> alunos;

    public AlunoServiceImpl(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return alunos;
    }

    @Override
    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
}

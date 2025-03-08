package classes;

public class EstadoRecuperacao implements EstadoAluno{
    public void setNota(AlunoTurma aluno, double nota){
        aluno.setNotaRecuperacao(nota);
        System.out.println("Nota definida no estado Recuperacao: " + nota);
    }
}

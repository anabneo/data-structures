import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adicionaAluno(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++){
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }
    }

    public Aluno pego(int posicao) {

        return null;
    }

    public void remove(int posicao) {

    }

    public boolean contem(Aluno aluno) {

        return false;
    }

    public int tamanho() {

        return 0;
    }

    public String toString() {

        return Arrays.toString(alunos);
    }
}

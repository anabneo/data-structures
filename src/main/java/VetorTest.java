public class VetorTest {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adicionaAluno(a1);
        lista.adicionaAluno(a2);

        System.out.println(lista);
    }
}

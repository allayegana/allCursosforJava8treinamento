import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class trainamentoStream {

    public static void main(String[] args) {


        class Curso {
            private String nome;
            private int alunos;

            public Curso(String nome, int alunos) {
                this.nome = nome;
                this.alunos = alunos;
            }

            public String getNome() {
                return nome;
            }

            public int getAlunos() {
                return alunos;
            }
        }

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

       // cursos.sort(Comparator.comparingInt(Curso::getAlunos)); compare alunos en int

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
       System.out.println(sum);

    }
}

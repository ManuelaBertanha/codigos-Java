import java.util.ArrayList;
//import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana Marcela", 25);
        Aluno a2 = new Aluno("André", 20);
        Aluno a3 = new Aluno("Joana", 18);
        Aluno a4 = new Aluno("Eduardo", 19);
        Aluno a5 = new Aluno("Carolina", 22);
        Aluno a6 = new Aluno("Matheus", 17);        
        
        ArrayList<Aluno> alunos1 = new ArrayList<>();
        alunos1.add(a1);
        alunos1.add(a2);
        alunos1.add(a3);
        ArrayList<Aluno> alunos2 = new ArrayList<>();
        alunos2.add(a1);
        alunos2.add(a4);
        alunos2.add(a5);
        ArrayList<Aluno> alunos3 = new ArrayList<>();
        alunos2.add(a2);
        alunos2.add(a3);
        alunos2.add(a6);        
        
        Disciplina d1 = new Disciplina("Banco de dados", alunos1);
        Disciplina d2 = new Disciplina("Hardware I", alunos1);
        Disciplina d3 = new Disciplina("Estrutura de dados", alunos2);
        Disciplina d4 = new Disciplina("Teoria dos Grafos", alunos3);
        Disciplina d5 = new Disciplina("Hardware II", alunos3);        
        
        ArrayList<Disciplina> disciplinas1 = new ArrayList<>();
        disciplinas1.add(d1);
        disciplinas1.add(d2);
        disciplinas1.add(d3);

        ArrayList<Disciplina> disciplinas2 = new ArrayList<>();
        disciplinas2.add(d1);
        disciplinas2.add(d2);
        disciplinas2.add(d3);
        disciplinas2.add(d4);

        ArrayList<Disciplina> disciplinas3 = new ArrayList<>();
        disciplinas3.add(d1);
        disciplinas3.add(d2);
        disciplinas3.add(d5);
        disciplinas3.add(d3);
        disciplinas3.add(d4);
        
        Curso c1 = new Curso("Sistemas de Informação", disciplinas1);
        Curso c2 = new Curso("Jogos Digitais", disciplinas2);
        Curso c3 = new Curso("Ciência da Computação", disciplinas3);

        ArrayList<Curso> cursos1 = new ArrayList<>();
        cursos1.add(c1);
        cursos1.add(c2);
        cursos1.add(c3);

        /* TESTES:
        System.out.println("\n" + c1.toString());
        System.out.print("Disciplinas do curso: ");
        for (int i=0; i<disciplinas1.size(); i++)
            System.out.print(disciplinas1.get(i) + " | ");

        System.out.println("\nAlunos matriculados em " + d1.getNomeDisciplina() + ":");
        for (int i=0; i<alunos1.size(); i++)
            System.out.println(alunos1.get(i)); */

        /* QUANTIDADE DE CURSOS NA FACULDADE: */
        long qtd_cursos = cursos1.stream()
                                 .count();
        System.out.println("\nQuantidade de CURSOS registrados: " + qtd_cursos + "\n");

        /* QUANTIDADE DE DISCIPLINAS EM CADA CURSO: */
        cursos1.stream()
               .map(Curso::qtdDisciplinas)
               .forEach(x -> System.out.println(x));
             //.forEach(System.out::println)
             //.iterate() -> estudar essa função

        /*
        cursos1.stream()
               .map(Curso::getDisciplina)
               .forEach(x -> System.out.println(x)); */

        /*
        disciplinas3.stream()
                    .map(Disciplina::mediaIdade_C)
                    .forEach(x -> System.out.println(x)); */

        //System.out.print(d4.mediaIdade_C());
                  
    }
    
}

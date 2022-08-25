import java.util.ArrayList;

public class Curso {
    
    private String nomeCurso;
    private ArrayList<Disciplina> disciplina;
    
    Curso(String nomeCurso, ArrayList disciplina) {
        this.nomeCurso = nomeCurso;
        this.disciplina = disciplina;
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public String qtdDisciplinas() {
        return ("Quantidade de DISCIPLINAS em " + nomeCurso.toUpperCase() + ": " + disciplina.size());
    }

    /*
    public void media_C() {
        for (int d=0; d<disciplina.size(); d++) {
            ArrayList<Aluno> aluno = disciplina.get(d).getAluno();
            int soma = 0;
            for (int a=0; a<aluno.size(); a++) {
                soma += aluno.get(a).getIdade();
            }
            float media = 0;
            media = soma/aluno.size();
            System.out.println("Média de idade dxs alunxs de " + disciplina.get(d).getNomeDisciplina() + " = " + media);
      }
    } */
    
    @Override
    public String toString() {
        return ("Curso: " + nomeCurso);
    }
    
}

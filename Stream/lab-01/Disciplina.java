import java.util.ArrayList;

public class Disciplina {
    
    private String nomeDisciplina;
    private ArrayList<Aluno> aluno;
    
    Disciplina(String nomeDisciplina, ArrayList aluno) {
        this.nomeDisciplina = nomeDisciplina;
        this.aluno = aluno;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public ArrayList<Aluno> getAluno() {
        return aluno;
    }
    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    /*
    public String mediaIdade_C() {
        int soma = 0;
        for (int i=0; i<aluno.size(); i++) {
            ArrayList<Aluno> aux = getAluno();
            soma += aux.get(i).getIdade();
        }
        double media = soma/aluno.size();
        return ("teste = " + media);
    } */
  
    @Override
    public String toString() {
        return (nomeDisciplina);
    }
    
}

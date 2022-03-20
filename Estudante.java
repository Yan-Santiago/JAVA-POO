package classeprincipal;
public class Estudante extends Funcionarios {
    private String curso;
    private int semestre;
    private float mensal;
    private int numCadeira;
    public Estudante() {
        super();
        this.setMatricula(0);
        this.setNome("Sem nome");
        this.setDepartamento("Sem departamento");
        this.setSituação("Não confirmada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getMensal() {
        return mensal;
    }

    public void setMensal(float mensal) {
        this.mensal = mensal;
    }

    public int getNumCadeira() {
        return numCadeira;
    }

    public void setNumCadeira(int numCadeira) {
        this.numCadeira = numCadeira;
    }
    
    public void status(){
        System.out.println("N° de matricula: " + this.getMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Situação do curso: " + this.getSituação());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Semestre: " + this.getSemestre());
        System.out.println("Valor da mensalidade: " + this.getMensal());
        System.out.println("Quantidade de cadeiras: " + this.getNumCadeira());
    }
    
    
}

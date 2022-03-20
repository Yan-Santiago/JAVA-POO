package classeprincipal;
public class Professor extends Funcionarios {
    private String disciplina;
    private String sala;
    private String hora;
    private double salario;

    public Professor() {
        super();
        this.setMatricula(0);
        this.setNome("Sem nome");
        this.setDepartamento("Sem departamento");
        this.setSituação("Não confirmada");
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    public void status(){
        System.out.println("N° de matricula: " + this.getMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Situação: " + this.getSituação());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Sala: " + this.getSala());
        System.out.println("Horario: " + this.getHora());
    }    
    
    
    
}

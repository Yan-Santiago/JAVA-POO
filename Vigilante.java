package classeprincipal;
public class Vigilante extends Funcionarios {
    private String turno;
    private String tipoArmamento;
    private String sede;

    public Vigilante() {
        super();
        this.setMatricula(0);
        this.setNome("Sem nome");
        this.setDepartamento("Sem departamento");
        this.setSituação("Não confirmada");
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipoArmamento() {
        return tipoArmamento;
    }

    public void setTipoArmamento(String tipoArmamento) {
        this.tipoArmamento = tipoArmamento;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public void status(){
        System.out.println("N° de matricula: " + this.getMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Situação: " + this.getSituação());
        System.out.println("Qual armamento: " + this.getTipoArmamento());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Turno " + this.getTurno());
        System.out.println("Sede da vigilancia: " + this.getSede());
    }    
    
}

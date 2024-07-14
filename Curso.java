public class Curso extends Conteudo{

    // atributos
    private int cargaHoraria;

    // construtor
    public Curso(){
    }
    // getters e setters
    public int getCargaHoraria(int i) {
        return cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // métodos

    @Override
    public String toString() {
        return "Curso {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

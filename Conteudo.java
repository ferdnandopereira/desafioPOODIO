public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    // atributos
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public abstract double calcularXP();

    // construtor
    public Conteudo(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    // getters e setters
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // metodos


    @Override
    public String toString() {
        return "Conteudo { " +
                "descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

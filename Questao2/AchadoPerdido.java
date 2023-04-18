package Questao2;

public class AchadoPerdido {

    private String titulo;
    private String descricao;
    private String local_achado;
    private String foto;
    private String tipo;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String local_achado, String foto, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local_achado = local_achado;
        this.foto = foto;
        this.tipo = tipo;
        this.status = status;
    }

    public String getTitulo() {
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

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String buscarTitulo(String tituloBuscado) {
        if (titulo.equals(tituloBuscado)) {
            return "Título: " + titulo + "\nDescrição: " + descricao + "\nLocal: " + local_achado;
        } else {
            return "Não encontrado";
        }

    }

    public void visualizaDetalhes() {
    }
}

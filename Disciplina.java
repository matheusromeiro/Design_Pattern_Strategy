public class Disciplina {
    private ICalcMedia CalcMedia;

    private double media;

    private double p1;

    private double p2;
    private String nome;

    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    Disciplina(){

    }

    Disciplina(ICalcMedia calc){
        this.CalcMedia = calc;
    }

    void CalculoMedia(){
        this.media = CalcMedia.CalculaMedia(this.p1, this.p2);
        this.situacao = CalcMedia.Situacao(this.media);
    }
}

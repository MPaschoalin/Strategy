public class Disciplina {
    private ICalcMedia CalcMedia;
    public double Media;
    private String Nome;
    private double P1;
    private double P2;
    public String Situacao;

    public void CalcularMedia(){
        Media = CalcMedia.CalculaMedia(P1,P2);
        Situacao = CalcMedia.Situacao(Media);
    }

    Disciplina(ICalcMedia calculo){
        this.CalcMedia = calculo;
    }


    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia CalcMedia) {
        CalcMedia = CalcMedia;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        this.Media = media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }


}

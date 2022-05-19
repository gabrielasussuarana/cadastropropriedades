public abstract class Imovel {

    private String proprietario;
    private Geo geoLoc;
    private int areaConstruida;
    private static double valorReferencia;
    
    public Imovel(String proprietario, Geo geoLoc, int areaConstruida){
        this.proprietario = proprietario;
        this.geoLoc = geoLoc;
        this.areaConstruida = areaConstruida;

        if (proprietario == null || geoLoc == null){
            throw new IllegalArgumentException();
       }
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }
    public String getProprietario(){
        return proprietario;
    }

    public static void setValorReferencia(double valorRef){
        valorReferencia = valorRef;
    }
    public static double getValorReferencia(){
        return valorReferencia;
    }

    public abstract double calculaImposto();

    public String toString(){
        return "\n\tProprietario: " + proprietario + "\n\tValor Imposto: " + calculaImposto() + "\n\tLocalizacao:" + geoLoc.toString() + "\n\tArea Construida: " + areaConstruida;
    }
}


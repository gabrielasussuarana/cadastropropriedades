public class Residencial extends Imovel {
    private int areaTerreno;

    public Residencial(String proprietario, Geo geoLoc,  int areaTerreno, int areaConstruida){
        super(proprietario, geoLoc, areaConstruida);
        this.areaTerreno = areaTerreno;
    }
    
    
    @Override
    public double calculaImposto() {
        double imposto=0;

        if(getAreaConstruida()<= 200){
            imposto = 0;
        }

        if (getAreaConstruida() > 200 && getAreaConstruida() <= 500){
            imposto = getValorReferencia() * (getAreaConstruida() - 200);
        }

        if(getAreaConstruida() > 500){
            imposto = 100 * getValorReferencia();
        }

        return imposto;
    }

    public String toString(){
        return super.toString() + "\n\timposto: " + calculaImposto() + "\n\tareaTerreno: "+areaTerreno;
    }

}
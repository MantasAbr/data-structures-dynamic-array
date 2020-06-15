package projektas;




public class Automobilis implements Comparable<Automobilis> {
    
    private String modelis;     //Auto modelis
    private String marke;       //Auto marke
    private String kuroTipas;   //Auto kuro tipas
    private double likesKuras;  //Kiek kuro like masinoje?
    private double kaina;       //Auto kaina uz minute
    private String arUzimta;   //Ar auto siuo metu vairuojama (uzimta)?
    private String adresas;     //Jei ne, kurioje vietoje palikta?
    
    
    /**
     * Tuscias konstruktorius
     */
    public Automobilis(){}
    
    /**
     * Konstruktorius
     * @param marke Auto marke
     * @param modelis Auto modelis
     * @param kuroTipas Auto kuro Tipas
     * @param likesKuras Likes kuro kiekis litrais
     * @param kaina Auto nuomos kaina
     * @param arUzimta Ar auto uzimta? "Taip", "Ne"
     * @param adresas Auto vietos adresas, jeigu ji neuzimta (priesingai "-")
     */
    public Automobilis(String marke, String modelis, String kuroTipas, double likesKuras, double kaina, String arUzimta, String adresas){
        this.modelis = modelis;
        this.marke = marke;
        this.kuroTipas = kuroTipas;
        this.likesKuras = likesKuras;
        this.kaina = kaina;
        this.arUzimta = arUzimta;
        this.adresas = adresas;
    }
    
    //Get'eriai
    
    /**
     * Grazina marke
     * @return Auto marke
     */
    public String getMarke(){
        return marke;
    }
    
    /**
     * Grazina modeli
     * @return Auto modeli
     */
    public String getModelis(){
        return modelis;
    }
    
    /**
     * Grazina kuro tipa
     * @return Auto kuro tipas
     */
    public String getKuroTipas(){
        return kuroTipas;
    }
    
    /**
     * Grazina likusi kura automobilyje
     * @return Likes kuro kiekis
     */
    public double getLikesKuras(){
        return likesKuras;
    }
    
    /**
     * Grazina auto nuomos kaina
     * @return Auto kaina
     */
    public double getKaina(){
        return kaina;
    }
    
    /**
     * Nurodo, ar masina uzimta
     * @return Taip, Ne
     */
    public String getArUzimta(){
        return arUzimta;
    }
    
    /**
     * Grazina auto vietos adresa
     * @return Auto vietos adresa
     */
    public String getAdresas(){
        return adresas;
    }
    
    //Set'eriai
    
    /**
     * Nustato auto marke
     * @param marke markes pavadinimas
     */
    private void setMarke(String marke){
        this.marke = marke;
    }
    
    /**
     * Nustato auto modeli
     * @param modelis modelio pavadinimas
     */
    private void setModelis(String modelis){
        this.modelis = modelis;
    }
    
    /**
     * Nustato auto kuro tipa
     * @param kuroTipas auto kuro tipas
     */
    private void setKuroTipas(String kuroTipas){
        this.kuroTipas = kuroTipas;
    }
    
    /**
     * Nustato likusi kuro kieki
     * @param likesKuras likes kuro kiekis
     */
    private void setLikesKuras(double likesKuras){
        this.likesKuras = likesKuras;
    }
    
    /**
     * Nustato auto nuomos kaina
     * @param kaina auto kaina
     */
    private void setKaina(double kaina){
        this.kaina = kaina;
    }
    
    /**
     * Nustato, ar auto uzimta
     * @param arUzimta Taip, Ne
     */
    private void setArUzimta(String arUzimta){
        this.arUzimta = arUzimta;
    }
    
    /**
     * Nustato auto stovejimo adresa
     * @param adresas 
     */
    private void setAdresas(String adresas){
        this.adresas = adresas;
    }
    
    
    /**
     * ToString() metodas
     * @return objekto eilute
     */
    @Override
    public String toString(){
        return String.format("%-11s %-10s %-10s %-9.1f %.2f \t %-8s %s", marke, modelis, kuroTipas, likesKuras, kaina, arUzimta, adresas);
    }
    

    /**
     * Compare to metodas
     * @param o sekancio objekto pavadinimas
     * @return CompareTo laipsni
     */
    @Override
    public int compareTo(Automobilis o) {
        double kainaKita = o.getKaina();
        return Double.compare(kainaKita, kaina);
    }
    
}

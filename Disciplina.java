package esercitazionetpsit;

/**
 * <p> classe astratta che identifica una disciplina che sarà possibile
 * svolgere all'interno del circolo, è formata da un costo mensile , annuale
 * e possiede un nome identificativo
 * 
 * @author silvestri.alex
 */
abstract public class Disciplina {
    
    public String nome;
    private float mensile;
    private float annuale;

     /**
     * metodo utilizzato per impostare la retta mensile
     * @param mensile prezzo da pagare al mese 
     */
    public void setMensile(float mensile) {
        this.mensile = mensile;
    }

    /**
     * metodo utilizzato per impostare la retta annuale
     * @param annuale prezzo da pagare all'anno 
     */
    public void setAnnuale(float annuale) {
        this.annuale = annuale;
    }

    /**
     * metodo utilizzato per visualizzare la retta mensile
     * @return ritorna il prezzo al mese
     */
    public float getMensile() {
        return mensile;
    }

    /**
     * metodo utilizzato per visualizzare la retta annuale
     * @return ritorna il prezzo all'anno
     */
    public float getAnnuale() {
        return annuale;
    }
    
    
    
}

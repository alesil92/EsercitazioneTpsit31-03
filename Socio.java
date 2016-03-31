package esercitazionetpsit;

/**
 * 
 * <p> classe che identifica un socio, il quale 
 * possiede un nome , un cognome ed un codice fiscale
 * 
 * @author silvestri.alex
 *
 */
public class Socio {
    private String nome;
    private String cognome;
    private String cf;
    private String [] elencodisclipline;
    
    /**
     * Metodo che permette di calcolare la retta che il socio dovrà pagare
     * @param isAnnuale parametro che vale true se la retta è annuale
     * @return ritorna la retta calcolata
     */
    public float CalcoloRetta (boolean isAnnuale){
       return 0; //per permettere la compilazione 
    }
    
    /**
     * metodo utilizzato per impostare il nome del socio
     * @param nome nome da impostare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

     /**
     * metodo utilizzato per impostare il codice fiscale del socio
     * @param cf codice fiscale da inserire
     */
    public void setCf(String cf) {
        this.cf = cf;
    }

     /**
     * metodo utilizzato per impostare il cognome del socio
     * @param cognome cognome da inserire
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

     /**
     * metodo utilizzato per visualizzare il nome del socio
     * @return nome da ritornare
     */
    public String getNome() {
        return nome;
    }

    /**
     * metodo utilizzato per visualizzare il cognome del socio
     *  @return cognome da ritornare
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * metodo utilizzato per visualizzare il codice fiscale del socio
     * @return codice fiscale da ritornare
     */
    public String getCf() {
        return cf;
    }

    /**
     * metodo utilizzato per impostare le discipline del socio
     * @param elencodisclipline vettore di stringhe contenente le disclipline
     */
    public void setElencodisclipline(String[] elencodisclipline) {
        this.elencodisclipline = elencodisclipline;
    }

    /**
     * metodo utilizzato per visualizzare l'elenco delle discipline di un socio
     * @return ritorna un vettore di stringhe con le discipline
     */
    public String[] getElencodisclipline() {
        return elencodisclipline;
    }
    
    
    
    
}

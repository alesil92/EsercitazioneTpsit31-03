package esercitazionetpsit;

/**
 *<p> classe che estende la classe {@link Disciplina} con l'aggiunta 
 * della corsia e del codice del corso
 * 
 * @author silvestri.alex
 */
public class Nuoto extends Disciplina {
    
    private String codicecorso;
    public int corsia;

    /**
     * metodo utilizzato per impostare il codice del corso
     * @param codicecorso codice da inserire
     */
    public void setCodicecorso(String codicecorso) {
        this.codicecorso = codicecorso;
    }

    /**
     * metodo che ritorna il codice del corso
     * @return codice da ritornare
     */
    public String getCodicecorso() {
        return codicecorso;
    }
    
    
    
}

package esercitazionetpsit;

/**
 *<p> classe che estende la classe astratta {@link Disciplina}
 * aggiungendo il codice del corso
 * 
 * @author silvestri.alex
 */
public class Aerobica {
    
    private String codicecorso;
    
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

package esercitazionetpsit;

/**
 * <p> classe che estende la classe {@link Disciplina}, con l'aggiunta 
 * dell'attributo peso
 * 
 * @author silvestri.alex
 */

public class BodyBuilding extends Disciplina {
    
    private String peso;

    /**
     * metodo utilizzato per impostare il peso
     * @param peso peso da inserire
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * metodo che ritorna il peso
     * @return ritorna il peso al valore attuale
     */
    public String getPeso() {
        return peso;
    }
    
    
    
}

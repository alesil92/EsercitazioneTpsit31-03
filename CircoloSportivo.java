package esercitazionetpsit;

/**
 * <p> identifica la struttura circolo sportivo ed è composta
 *     da un nome, ed un elenco di persone iscritte
 * 
 * @author silvestri.alex
 */
public class CircoloSportivo {
   
    public String nome;
    
    private Socio [] ElencoSoci;

    /**
     * metodo che imposta l'elenco dei soci appartenenti al circolo
     * @param ElencoSoci elenco dei soci da inserire 
     */
    public void setElencoSoci(Socio[] ElencoSoci) {
        this.ElencoSoci = ElencoSoci;
    }

    /**
     * metodo che ritorno l'elenco dei soci iscritti al circolo
     * @return ritorno l'elenco dei soci iscritti 
     */
    public Socio[] getElencoSoci() {
        return ElencoSoci;
    }
    
     /**
     * metodo che visualizza l'elenco di tutti i soci iscritti
     */
    public void ElencoIscritti (){
        
    }
    
    /**
     * metodo che visualizza l'elenco dei soci iscritti di una 
     * determinata disciplina
     * @param disc identifica la disciplina
     */
    public void ElencoIscrittiPerDisciplina (String disc){
        
    }
    
}

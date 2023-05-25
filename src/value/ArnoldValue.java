package value;

import gen.ImpParser;

import java.util.Set;

public class ArnoldValue extends Value{
    private final String arnoldId;
    //Lista dei parametri della funzione
    private final Set<String> arnoldParameters;
    //Comando della funzione
    private final ImpParser.ComContext comArnold;
    //Valore di Ritorno della funzione
    private final ImpParser.ExpContext retArnold;

    public ArnoldValue(String arnoldId,
                    Set<String> arnoldParameters,
                    ImpParser.ComContext comArnold,
                    ImpParser.ExpContext retArnold){
        this.arnoldId = arnoldId;
        this.arnoldParameters = arnoldParameters;
        this.comArnold = comArnold;
        this.retArnold = retArnold;

    }

    public String getFunId(){
        return arnoldId;
    }

    public Integer getParamsLength(){
        return arnoldParameters.size();
    }

    public Set<String> getParams(){
        return arnoldParameters;
    }

    public ImpParser.ComContext getCom() {
        return comArnold;
    }

    public ImpParser.ExpContext getRet() {
        return retArnold;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof ArnoldValue && ((ArnoldValue) obj).arnoldId.equals(this.arnoldId);
    }

    @Override
    public int hashCode() {
        return arnoldId.hashCode();
    }
}

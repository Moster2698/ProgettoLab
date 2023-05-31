package value;

import java.util.Set;
import generation.HaveFunAndArnoldCParser;

public class FunValue extends Value{
    //Nome della funzione
    private final String funId;
    //Lista dei parametri della funzione
    private final Set<String> parameters;
    //Comando della funzione
    private final HaveFunAndArnoldCParser.ComContext com;

    //Valore di Ritorno della funzione
    private final HaveFunAndArnoldCParser.ExpContext ret;

    public FunValue(String funId,
                    Set<String> param,
                    HaveFunAndArnoldCParser.ComContext com,
                    HaveFunAndArnoldCParser.ExpContext ret){
        this.funId = funId;
        this.parameters = param;
        this.com = com;
        this.ret = ret;
    }

    public String getFunId(){
        return funId;
    }

    public Integer getParamsLength(){
        return parameters.size();
    }

    public Set<String> getParams(){
        return parameters;
    }

    public HaveFunAndArnoldCParser.ComContext getCom() {
        return com;
    }

    public HaveFunAndArnoldCParser.ExpContext getRet() {
        return ret;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof FunValue && ((FunValue) obj).funId.equals(this.funId);
    }

    @Override
    public int hashCode() {
        return funId.hashCode();
    }
}

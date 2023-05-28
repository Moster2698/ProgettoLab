package value;

import java.util.Set;
import gen.*;
public class FunValue extends Value{
    //Nome della funzione
    private final String funId;
    //Lista dei parametri della funzione
    private final Set<String> parameters;
    //Comando della funzione
    private final ImpParser.ComContext com;

    //Valore di Ritorno della funzione
    private final ImpParser.ExpContext ret;

    public FunValue(String funId, Set<String> param, ImpParser.ComContext com, ImpParser.ExpContext ret){
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

    public ImpParser.ComContext getCom() {
        return com;
    }

    public ImpParser.ExpContext getRet() {
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

package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi = new ArrayList<>();

    public List<Command> getComenzi() {
        return comenzi;
    }

    public void adaugaComanda(Command command){
        this.comenzi.add(command);
    }

    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}

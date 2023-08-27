import javax.swing.*;
import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AbstractNet {

    Collection nets = NetListImportService.read(aFile);
    NetRepository.addAll(nets);
    Collection busses = InferredBusFactory.groupIntoBuses(nets);
    BusRepository.addAll(buses);
    private Set rules;

    void assignRules(LayoutRule rule) {
        rules.add(rule);
    }

    Set assingnedRules() {
        return rules;
    }

}

 class Net extends AbstractNet{
    private Bus bus;

    Set assignedRules(){
        Set result = new HashSet();
        result.addAll(super.assingnedRules());
        result.addAll(bus.assignedRules());
        return result;
    }

 }


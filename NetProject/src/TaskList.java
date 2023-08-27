public class TaskList {

    public void assignBusRule(String busName, String ruleType, double parameter){
        Bus bus = BusRepository.getByName(busName);
        bus.assignRule(NetRule.create(ruleType,parameter));
    }

    NetRuleExport.write(aFileName, NetRepository.allNets());
}

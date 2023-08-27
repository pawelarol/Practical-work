public class Test {
    public static void main(String[] args) {
        public void testBusRuleAssigment(){
          Net a0 = new Net("a0");
          Net a1 = new Net("a1");
          Bus a = new Bus ("a");
          a.addNet(a0);
          a.addNet(a1);

          NetRule minWidth4 = Net.Rule().create(MIN_WIDTH, 4 );
          a.assignRule(minWidth4);

          assertTrue (a0.assignedRules().contains(minWidth4));
          assertEquals(minWidth4, a0.getRule(MIN_WIDTH));
          assertEquals(minWidth4, a1.getRule(MIN_WIDTH));
        }
    }
}

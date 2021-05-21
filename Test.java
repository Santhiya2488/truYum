package additional;

public class Test {

	public static void main(String[] args) {
		String[] projects=new String[]{"Flight","Check"};
		manager manager=new manager(1,"John","Travel",1000,projects);
		System.out.println(manager.id);
		manager.work();
		String[] tech=new String[]{"F","C"};
		Developer develop=new Developer(2,"Me","Develop",1500,tech);
		System.out.println(develop.id);
		develop.work();
	}

}

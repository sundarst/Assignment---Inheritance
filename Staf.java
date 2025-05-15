public class Staff {
    String dep;

	Staff(String dep)
	{
		this.dep=dep;
	}

    public static void main(String[] args) {
        Staff staffMember = new Staff("Human Resources");
        System.out.println("Department: " + staffMember.dep);
    }
}

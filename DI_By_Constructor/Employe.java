package DI_By_Constructor;

public class Employe {
	private int id;
	private String name;

	public Employe() {
		System.out.println("def cons");
	}

	public Employe(int id) {
		this.id = id;
	}

	public Employe(String name) {
		this.name = name;
	}

	public Employe(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

}

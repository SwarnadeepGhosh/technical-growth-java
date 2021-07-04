package schoolSystem;

class Teacher {
	int tId;
	String tName;
	int tAge;
	String tSubject;

	public Teacher(int tId, String tName, int tAge, String tSubject) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tAge = tAge;
		this.tSubject = tSubject;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}
}

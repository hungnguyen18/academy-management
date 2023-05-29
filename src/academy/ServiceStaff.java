package academy;

public class ServiceStaff extends Staff {
	public ServiceStaff() {
		super();
	}

	public void input() {
		super.input();
	}

	public int payRoll() {
		return super.getLuongCoBan();
	}

	public String output() {
		return super.output();
	}

	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

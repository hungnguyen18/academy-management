package academy;

import java.util.Scanner;

public class ResearchStaff extends Staff {
	private int phuCapDocHai;
	protected Scanner scanner = new Scanner(System.in);

	public ResearchStaff() {
		super();
	}

	public ResearchStaff(int phuCapDocHai) {
		super();
		this.phuCapDocHai = phuCapDocHai;
	}

	public int getPhuCapDocHai() {
		return this.phuCapDocHai;
	}

	public void setPhuCapDocHai(int phuCapDocHai) {
		this.phuCapDocHai = phuCapDocHai;
	}

	public void input() {
		super.input();
		System.out.print("Nhap phu cap doc hai: ");
		phuCapDocHai = scanner.nextInt();
	}

	public int payRoll() {
		return super.getLuongCoBan() + this.phuCapDocHai;
	}

	public String output() {
		return super.output() + ", phu cap doc hai: " + this.phuCapDocHai;
	}

	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

package academy;

import java.util.Scanner;

public class ManagementStaff extends Staff {
	private int phuCapChucVu;
	protected Scanner scanner = new Scanner(System.in);

	public ManagementStaff() {
		super();
	}

	public ManagementStaff(int phuCapChucVu) {
		super();
		this.phuCapChucVu = phuCapChucVu;
	}

	public int getPhuCapChucVu() {
		return this.phuCapChucVu;
	}

	public void setPhuCapChucVu(int phuCapChucVu) {
		this.phuCapChucVu = phuCapChucVu;
	}

	public void input() {
		super.input();
		System.out.print("Nhap phu cap chuc vu: ");
		phuCapChucVu = scanner.nextInt();
	}

	public String output() {
		return super.output() + ", phu cap chuc vu: " + this.phuCapChucVu;
	}

	public double tinhLuong() {
		return super.getLuongCoBan() + this.phuCapChucVu;
	}
}

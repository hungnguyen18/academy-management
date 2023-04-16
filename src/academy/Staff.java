package academy;

import java.util.Scanner;

public abstract class Staff {
	private String maNv, tenNv, trinhDo, chuyenMon;
	private int luongCoBan;
	protected Scanner scanner = new Scanner(System.in);

	public Staff() {
		super();
	}

	public Staff(String maNv, String tenNv, String trinhDo, String chuyenMon, int luongCoBan) {
		super();
		this.maNv = maNv;
		this.tenNv = tenNv;
		this.trinhDo = trinhDo;
		this.chuyenMon = chuyenMon;
		this.luongCoBan = luongCoBan;
	}

	public String getMaNv() {
		return this.maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getTenNv() {
		return this.tenNv;
	}

	public void setTenNv(String tenNv) {
		this.tenNv = tenNv;
	}

	public String getTrinhDo() {
		return this.trinhDo;
	}

	public void setTringDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getChuyenMon() {
		return this.chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public int getLuongCoBan() {
		return this.luongCoBan;
	}

	public void setLuongCoBan(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public void input() {
		System.out.print("Nhap ma nhan vien: ");
		maNv = scanner.nextLine();
		System.out.print("Nhap ten nhan vien: ");
		tenNv = scanner.nextLine();
		System.out.print("Nhap trinh do nhan vien: ");
		trinhDo = scanner.nextLine();
		System.out.print("Nhap chuyen mon nhan vien: ");
		chuyenMon = scanner.nextLine();
		System.out.print("Nhap luong can ban: ");
		luongCoBan = scanner.nextInt();
	}
	
	public abstract int tinhLuong();

	public String output() {
		return "  + Ma nhan vien: " + this.maNv + ", ten nhan vien: " + this.tenNv + ", trinh do: " + this.trinhDo
				+ ", chuyen mon: " + this.chuyenMon + ", luong can ban: " + this.luongCoBan + ", Luong: " + this.tinhLuong();
	}
}

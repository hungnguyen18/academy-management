package academy;

import java.util.Scanner;

public class Academy {
	protected int quantity;
	private int tongLuong;
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.print("Nhap so luong nhan vien: ");
		quantity = scanner.nextInt();
		Staff[] staff = new Staff[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("\nNhap thong tin nhan vien thu " + (i + 1));
			System.out.print("Chon can bo (1-Nhan vien quan ly, 2-Nhan vien nghien cuu, 3-Nhan vien phuc vu): ");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				staff[i] = new ManagementStaff();
				break;
			case 2:
				staff[i] = new ResearchStaff();
				break;
			case 3:
				staff[i] = new ServiceStaff();
				break;
			default:
				break;
			}

			staff[i].input();

		}

		System.out.println("\n----------------------\nThong tin nhan vien: ");
		for (int i = 0; i < quantity; i++) {
			if (staff[i] instanceof ManagementStaff) {
				System.out.println("- Nhan vien quan ly: \n" + staff[i].output());
			} else if (staff[i] instanceof ResearchStaff) {
				System.out.println("- Nhan vien nghien cuu: \n" + staff[i].output());
			} else if (staff[i] instanceof ServiceStaff) {
				System.out.println("- Nhan vien phuc vu: \n" + staff[i].output());
			}

			tongLuong += staff[i].tinhLuong();
		}

		System.out.print("\n----------------------\nTong luong tat ca nhan vien: " + tongLuong);

	}
}
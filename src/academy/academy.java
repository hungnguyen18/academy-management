package academy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Academy {
	protected int quantity;
	private int tongLuong;
	private Staff[] staff;
	Scanner scanner = new Scanner(System.in);

	private String withLargeIntegers(double value) {
		DecimalFormat df = new DecimalFormat("###,###,###");
		return df.format(value);
	}

	@SuppressWarnings("unused")
	private void quickSort(Staff[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, right);
		}
	}

	private static int partition(Staff[] arr, int left, int right) {
		int pivot = arr[right].payRoll();
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j].payRoll() > pivot) {
				i++;
				Staff temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Staff temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;

		return i + 1;
	}

	public void run() {
		System.out.print("Nhap so luong nhan vien: ");
		quantity = scanner.nextInt();
		staff = new Staff[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("\nNhap thong tin nhan vien thu " + (i + 1));
			System.out.print("Chon chuc vu(1-Nhan vien quan ly, 2-Nhan vien nghien cuu, 3-Nhan vien phuc vu): ");
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

			tongLuong += staff[i].payRoll();
		}

		System.out.print("\n----------------------\nTong luong tat ca nhan vien: " + withLargeIntegers(tongLuong));
	}

	public void sort() {
		quickSort(staff, 0, staff.length - 1);
		for (int i = 0; i < quantity; i++) {
			System.out.println(staff[i].output());
		}
	}
}
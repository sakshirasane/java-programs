package doselect;

import java.util.Scanner;

	public class SecondSmallest {
		// 8.Sort array elements in ascending order
		public void getSecondSmallest() {
			int i, size, t, j;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter array size:");
			size = sc.nextInt();
			int a[] = new int[size];

			System.out.println("Enter " + size + " array elements::");
			for (i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			for (i = 0; i < a.length - 1; i++) {
				for (j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
			System.out.print("Second Smallest=");

			System.out.print(a[1]);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SecondSmallest obj = new SecondSmallest();
			obj.getSecondSmallest();
		}
	}


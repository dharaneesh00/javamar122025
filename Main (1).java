import java.util. Scanner;
class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of student: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++)

			arr[i] = sc.nextInt();


		System.out.println("the various marks of batch 12:");
		int value = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == value) {
				count++;

			}
		}

	}
}


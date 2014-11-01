public class Main {

	public static void main(String[] args) {
		int[] a={1,3,5,7,9,0,0,0,0,0};
		int[] b={2,3,6,9,20};
		merge(a,b,5,5);
		for(int i:a){
			System.out.print(i+" ");
		}
		

	}

	public static void merge(int[] a, int[] b, int n, int m) {
		int k = m + n - 1; //k指向a+b的最后一个元素应该出现的位置
		int i = n - 1; // i指向a的最后一个元素的位置
		int j = m - 1; // j指向b的最后一个元素的位置

		/*
		 * 1. 把i或者j指向的大的元素拷贝到k的位置
		 * 2. 把i或者j向前移动一格（谁刚才指向的元素大谁移动）
		 * 3. 直到完全扫描了 a 或者是 b
		 */
		while (i >= 0 && j >= 0) {
			if (a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		}
		/*
		 * 如果a扫描完了，b还没有
		 * 那么就把b剩下的元素依次拷贝到a中
		 */
		while (j >= 0) {
			a[k--] = b[j--];
		}
	}

}

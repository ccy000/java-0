package java测试;

//桶排序的时间复杂度： O(m+n)
import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int[] s = new int[n];
	for(int i=0;i<n;i++) {
		s[i] = cin.nextInt();
	}
	BucketSort(s);
}
public static void BucketSort(int[] s) {
	int[] a = new int [1001];
	for(int i=0;i<=1000;i++) {
		a[i]=0;
	}
	for(int i=0;i<s.length;i++) {
		a[s[i]]++;
	}
	for(int i=0;i<=1000;i++) {
		for(int j=1;j<=a[i];j++) {
			System.out.print(i+" ");
		}
	}
}
}

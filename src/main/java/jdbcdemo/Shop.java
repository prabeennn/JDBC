package jdbcdemo;

import java.util.Arrays;
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		

		
			
						Scanner sc=new Scanner (System.in);
						System.out.println("enter the array size");
						int size=sc.nextInt();
						int a[] = new int[size];

						System.out.println("add shoes number");
						for (int i = 0; i < size; i++) {
							a[i] = sc.nextInt();
						}
						System.out.println(Arrays.toString(a));

						int totalPrice = 0;
						for (int i = 0; i < a.length - 1; i++) {
							if (a[i] == -1)
								continue;
							int count = 1;
							int price = 0;
							for (int j = i + 1; j < a.length; j++) {
								if (a[i] == a[j]) {
									count++;
									a[j] = -1;
									if (count % 2 == 0) {
										price += a[i] * 5;
									}
								}
							}
							if (count != 1)
								System.out.println(a[i] + " number shoe's price = " + price);
							totalPrice += price;
						}
						System.out.println("total price of all the paired shoes = " + totalPrice);
					}

				}

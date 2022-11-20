package patika;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MobilePhoneMenu {
	Scanner Select = new Scanner(System.in);
	LinkedHashMap<Integer, MobilePhone> mobilePhoneList = new LinkedHashMap<>();
	LinkedHashMap<Integer, Filter> filterList = new LinkedHashMap<>();

	public void menu() {
		// sample device
		mobilePhoneList.put(1,
				new MobilePhone(1, "Redmi Note 10", 7000, 12, 25, "Xiaomi", 16, 512, 15.6, 3500, "Aqua"));
		mobilePhoneList.put(2, new MobilePhone(2, "Iphone 11", 8000, 10, 18, "Apple", 16, 256, 13, 3000, "Silver"));
		int select;
		boolean isRun = true;

		while (isRun) {

			System.out.println("Mobile Phone Menu ");

			System.out.println("1 - List Products" + "\n2 - Add Product" + "\n3 - Delete Product" + "\n4 - Brand Filter"
					+ "\n5 - Main Menu");
			select = Select.nextInt();
			while (select < 0 || select > 5) {
				System.out.println("Please Entry 1-5");
				select = Select.nextInt();
			}

			switch (select) {
			case 1:
				notebookList();
				break;

			case 2:
				addProduct();
				break;

			case 3:
				deleteProduct();
				break;
			case 4:
				brandFilter();
				break;
			case 5:
				isRun = false;
				break;

			}

		}
	}

	public void notebookList() {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ID  | Product Name    | Price          | Brand         | Stock      | Discount   | RAM    | Screen Size      | Storage  |     Battery      |  Color   |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (Integer keyset : mobilePhoneList.keySet()) {
			String printFormat = "| %-3s | %-15s | %-14s | %-13s | %-10s | %-10s | %-6s | %-16s | %-8s | %-16s | %-8s |\n";
			System.out.printf(printFormat, "M" + mobilePhoneList.get(keyset).getId(),
					mobilePhoneList.get(keyset).getName(), mobilePhoneList.get(keyset).getPrice() + " TL",
					mobilePhoneList.get(keyset).getBrandName(), mobilePhoneList.get(keyset).getStock(),
					mobilePhoneList.get(keyset).getDiscount() + " %", mobilePhoneList.get(keyset).getRam() + " GB",
					mobilePhoneList.get(keyset).getScreen() + " inch", mobilePhoneList.get(keyset).getStorage() + " GB",
					mobilePhoneList.get(keyset).getBattery() + " mAh", mobilePhoneList.get(keyset).getColor());

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public void addProduct() {

		System.out.println("Enter the Telephone id;");
		int id = Select.nextInt();
		System.out.println("Enter the Telephone name:");
		String name = Select.next();
		System.out.println("Enter the price of the notebook:");
		double price = Select.nextDouble();
		System.out.println("Enter the discount rate:");
		int discountRate = Select.nextInt();
		System.out.println("Enter the number of stocks:");
		int stock = Select.nextInt();
		System.out.println("Enter screen size:");
		double screenSize = Select.nextDouble();
		System.out.println("Enter ram size:");
		int ram = Select.nextInt();
		System.out.println("Enter Telephone storage:");
		int storage = Select.nextInt();

		System.out.println("Please Select Brand");

		System.out.println("----------------------");
		System.out.println("| ID  |  Brand Name  |");
		System.out.println("----------------------");
		String printFormat = "| %-3s | %-12s |";

		for (int sayac = 0; sayac < Brands.sortedCopy.size(); sayac++) {
			System.out.printf(printFormat + "\n", sayac, Brands.sortedCopy.get(sayac));

		}

		int select = Select.nextInt();

		String brandName = Brands.sortedCopy.get(select).toString();
		System.out.println("Enter Telephone Battery:");
		int battery = Select.nextInt();
		System.out.println("Enter Telephone Color:");
		String color = Select.next();

		mobilePhoneList.put(id, new MobilePhone(id, name, price, discountRate, stock, brandName, ram, storage,
				screenSize, battery, color));
		System.out.println("Current Telephone list");
		notebookList();

	}

	public void deleteProduct() {
		System.out.print("Enter the id of the product you want to be deleted : ");
		int id = Select.nextInt();
		mobilePhoneList.remove(id);
		System.out.println("Current notebook list");
		notebookList();

	}
	private void brandFilter() {
		String filter1 = Select.nextLine();
		System.out.print("Enter the name of the brand you want to filter:");
		String filter = Select.nextLine();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ID  | Product Name    | Price          | Brand         | Stock      | Discount   | RAM    | Screen Size      | Storage  |     Battery      |  Color   |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (Integer keyset : mobilePhoneList.keySet()) {
			if (mobilePhoneList.get(keyset).getBrandName().equals(filter)) {

				filterList.put(keyset,
						new Filter(mobilePhoneList.get(keyset).getId(), mobilePhoneList.get(keyset).getName(),
								mobilePhoneList.get(keyset).getPrice(), mobilePhoneList.get(keyset).getDiscount(),
								mobilePhoneList.get(keyset).getStock(), mobilePhoneList.get(keyset).getBrandName(),
								mobilePhoneList.get(keyset).getRam(), mobilePhoneList.get(keyset).getStorage(),
								mobilePhoneList.get(keyset).getScreen(),0,null));
				
				
				for (Integer keyset1 : filterList.keySet()) {
					String printFormat = "| %-3s | %-15s | %-14s | %-13s | %-10s | %-10s | %-6s | %-16s | %-8s | %-16s | %-8s |\n";
					System.out.printf(printFormat, "M" + filterList.get(keyset1).getId(),
							filterList.get(keyset1).getName(), filterList.get(keyset1).getPrice() + " TL",
							filterList.get(keyset1).getBrandName(), filterList.get(keyset1).getStock(),
							filterList.get(keyset1).getDiscount() + " %", filterList.get(keyset1).getRam() + " GB",
							filterList.get(keyset1).getScreen() + " inch",
							filterList.get(keyset1).getStorage() + " GB",mobilePhoneList.get(keyset).getBattery() + " mAh", mobilePhoneList.get(keyset).getColor());

				}
			}

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}

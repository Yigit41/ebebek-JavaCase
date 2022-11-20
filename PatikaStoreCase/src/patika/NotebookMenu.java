package patika;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class NotebookMenu {
	Scanner Select = new Scanner(System.in);
	LinkedHashMap<Integer, Notebook> notebookList = new LinkedHashMap<>();
	LinkedHashMap<Integer, Filter> filterList = new LinkedHashMap<>();

	public void menu() {
		int select, brandSelect;
		boolean isRun = true;

		// sample products

		notebookList.put(1, new Notebook(51, "Matebook", 7000, 12, 25, "Huawei", 16, 512, 15.6));
		notebookList.put(2, new Notebook(2, "Macbook", 8000, 10, 18, "Apple", 16, 256, 13));

		while (isRun) {

			System.out.println("Notebook Menu ");

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
				"---------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ID  | Product Name    | Price          | Brand         | Stock      | Discount   | RAM    | Screen Size      | Storage  |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
		for (Integer keyset : notebookList.keySet()) {
			String printFormat = "| %-3s | %-15s | %-14s | %-13s | %-10s | %-10s | %-6s | %-16s | %-8s | \n";
			System.out.printf(printFormat, "N" + notebookList.get(keyset).getId(), notebookList.get(keyset).getName(),
					notebookList.get(keyset).getPrice() + " TL", notebookList.get(keyset).getBrandName(),
					notebookList.get(keyset).getStock(), notebookList.get(keyset).getDiscount() + " %",
					notebookList.get(keyset).getRam() + " GB", notebookList.get(keyset).getScreen() + " inch",
					notebookList.get(keyset).getStorage() + " GB");

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
	}
	public void addProduct() {

		System.out.println("Enter the notebook id;");
		int id = Select.nextInt();
		System.out.println("Enter the notebook name:");
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
		System.out.println("Enter notebook storage:");
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
		notebookList.put(id, new Notebook(id, name, price, discountRate, stock, brandName, ram, storage, screenSize));
		System.out.println("Current notebook list");
		notebookList();

	}

	public void deleteProduct() {
		System.out.print("Enter the id of the product you want to be deleted : ");
		int id = Select.nextInt();
		notebookList.remove(id);
		System.out.println("Current notebook list");
		notebookList();

	}

	private void brandFilter() {
		String filter1 = Select.nextLine();
		System.out.print("Enter the name of the brand you want to filter:");
		String filter = Select.nextLine();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ID  | Product Name    | Price          | Brand         | Stock      | Discount   | RAM    | Screen Size      | Storage  |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
		for (Integer keyset : notebookList.keySet()) {
			if (notebookList.get(keyset).getBrandName().equals(filter)) {

				filterList.put(keyset,
						new Filter(notebookList.get(keyset).getId(), notebookList.get(keyset).getName(),
								notebookList.get(keyset).getPrice(), notebookList.get(keyset).getDiscount(),
								notebookList.get(keyset).getStock(), notebookList.get(keyset).getBrandName(),
								notebookList.get(keyset).getRam(), notebookList.get(keyset).getStorage(),
								notebookList.get(keyset).getScreen(),0,null));

				for (Integer keyset1 : filterList.keySet()) {
					String printFormat = "| %-3s | %-15s | %-14s | %-13s | %-10s | %-10s | %-6s | %-16s | %-8s | \n";
					System.out.printf(printFormat, "N" + filterList.get(keyset1).getId(),
							filterList.get(keyset1).getName(), filterList.get(keyset1).getPrice() + " TL",
							filterList.get(keyset1).getBrandName(), filterList.get(keyset1).getStock(),
							filterList.get(keyset1).getDiscount() + " %", filterList.get(keyset1).getRam() + " GB",
							filterList.get(keyset1).getScreen() + " inch",
							filterList.get(keyset1).getStorage() + " GB");

				}
			}

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
	}

}

package patika;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Brands {
	
	static List<String> brands = new ArrayList<String>();
	static {
		 
		 brands.add("Samsung");
		 brands.add("Lenova");
		 brands.add("Apple");
		 brands.add("Huawei");
		 brands.add("Casper");
		 brands.add("Asus");
		 brands.add("HP");
		 brands.add("Xiaomi");
		 brands.add("Monster");
		
	}
	
	
	static List<String> sortedCopy = brands.stream().sorted().collect(Collectors.toList());
	
	}


package bigbazaar;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(new Item());
		System.out.println(new Item());
		ItemService itemService = new ItemService();
		
		itemService.addItems("Sugar","which sugar","price",52);
		
		itemService.serchItem("price",52);
		
		//itemService.deleteItem("price",52);
		
		//itemService.updateItem("Sugar","which sugar","price",78);
	}

}

package bigbazaar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ItemsDiscout<T, K, V> {

	String quality;
	Map<K, Map<K, Map<K, V>>> itemsSpec;


	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Map<K, Map<K, Map<K, V>>> getItemsSpec() {
		return itemsSpec;
	}

	public void setItemsSpec(Map<K, Map<K, Map<K, V>>> itemsSpec) {
		this.itemsSpec = itemsSpec;
	}

	void add(Map<K, Map<K, Map<K, V>>> t) {

		Map<K, Map<K, Map<K, V>>> item = new HashMap<>();
		Map<K, Map<K, V>> selectedItem = new HashMap<>();
		Map<K, V> selectedItemDetails = new HashMap<>();
		Set<Entry<K, Map<K, Map<K, V>>>> set = itemsSpec.entrySet();
		for (Entry<K, Map<K, Map<K, V>>> entry : set) {
			Set<Entry<K, Map<K, V>>> set2 = entry.getValue().entrySet();
			for (Entry<K, Map<K, V>> entry2 : set2) {
				Set<Entry<K, V>> set3 = entry2.getValue().entrySet();
				for (Entry<K, V> entry3 : set3) {

					ItemsDiscountSpec itemsDiscountSpec = (ItemsDiscountSpec) t;
					if (itemsDiscountSpec.getItemDiscountSpec().get(entry3.getKey()) != null) {
						selectedItemDetails.put(entry3.getKey(), entry3.getValue());
					}
				}
				if (!selectedItemDetails.isEmpty()) {
					selectedItem.put(entry2.getKey(), selectedItemDetails);
				}

			}
			if (!selectedItem.isEmpty()) {
				item.put(entry.getKey(), selectedItem);
			}

		}
	}

	Map<K, Map<K, Map<K, V>>> serch(T t) {
		Map<K, Map<K, Map<K, V>>> item = new HashMap<>();
		Map<K, Map<K, V>> selectedItem = new HashMap<>();
		Map<K, V> selectedItemDetails = new HashMap<>();
		Set<Entry<K, Map<K, Map<K, V>>>> set = itemsSpec.entrySet();
		for (Entry<K, Map<K, Map<K, V>>> entry : set) {
			Set<Entry<K, Map<K, V>>> set2 = entry.getValue().entrySet();
			for (Entry<K, Map<K, V>> entry2 : set2) {
				Set<Entry<K, V>> set3 = entry2.getValue().entrySet();
				for (Entry<K, V> entry3 : set3) {

					ItemsDiscountSpec itemsDiscountSpec = (ItemsDiscountSpec) t;
					if (itemsDiscountSpec.getItemDiscountSpec().get(entry3.getKey()) != null) {
						selectedItemDetails.put(entry3.getKey(), entry3.getValue());
					}
				}
				if (!selectedItemDetails.isEmpty()) {
					selectedItem.put(entry2.getKey(), selectedItemDetails);
				}

			}
			if (!selectedItem.isEmpty()) {
				item.put(entry.getKey(), selectedItem);
			}

		}
		return item;
	}

}

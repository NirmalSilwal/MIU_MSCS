package com.lab6.librarymanagementsystem;

public class ListItem {
	private String itemName;
	private boolean highlight = false;

	public ListItem(String item, boolean visible) {
		itemName = item;
		highlight = visible;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob.getClass() != ListItem.class)
			return false;
		ListItem item = (ListItem) ob;
		return itemName.equals(item.itemName);
	}

	public String getItemName() {
		return itemName;
	}

	public boolean highlight() {
		return highlight;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
}

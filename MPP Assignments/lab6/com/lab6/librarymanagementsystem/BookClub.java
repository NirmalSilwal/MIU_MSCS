package com.lab6.librarymanagementsystem;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class BookClub extends JFrame implements MessageableWindow {

	String[] links;
	JList<ListItem> linkList;
	JPanel cards;
	public static JTextArea statusBar = new JTextArea("Welcome to the Book Club!");

	LoginPanel lp;
	AllBookTitles abip;
	// boolean startup = true;

	// list items
	ListItem loginListItem = new ListItem("Login", true);
	ListItem addBookItem = new ListItem("Add Book", false);
	ListItem viewTitlesItem = new ListItem("View Titles", false);

	ListItem[] sellerItems = { loginListItem, addBookItem };
	ListItem[] memberItems = { loginListItem, viewTitlesItem };

	public ListItem[] getSellerItems() {
		return sellerItems;
	}

	public ListItem[] getMemberItems() {
		return memberItems;
	}

	public JList<ListItem> getLinkList() {
		return linkList;
	}

	public BookClub() {
		Util.adjustLabelFont(statusBar, Util.DARK_BLUE, true);
		setSize(600, 450);

		createLinkLabels();
		createMainPanels();
		CardLayout cl = (CardLayout) (cards.getLayout());
		linkList.addListSelectionListener(event -> {
			String value = linkList.getSelectedValue().getItemName();
			boolean allowed = linkList.getSelectedValue().highlight();
			System.out.println(value + " " + allowed);

			// System.out.println("selected = " + value);
			// cl = (CardLayout)(cards.getLayout());
			statusBar.setText("");
			if (!allowed) {
				value = loginListItem.getItemName();
				linkList.setSelectedIndex(0);
			}
			if (value.equals("View Titles"))
				abip.updateData();
			cl.show(cards, value);

		});

		// set up split panes

		JSplitPane innerPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, linkList, cards);
		innerPane.setDividerLocation(180);
		JSplitPane outerPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, innerPane, statusBar);
		outerPane.setDividerLocation(350);
		add(outerPane, BorderLayout.CENTER);
		lp.setBookClub(this);

	}

	public JTextArea getStatusBar() {
		return statusBar;
	}

	public void createLinkLabels() {
		DefaultListModel<ListItem> model = new DefaultListModel<>();
		model.addElement(loginListItem);
		model.addElement(viewTitlesItem);
		model.addElement(addBookItem);

		linkList = new JList<ListItem>(model);
		linkList.setCellRenderer(new DefaultListCellRenderer() {

			@SuppressWarnings("rawtypes")
			@Override
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (value instanceof ListItem) {
					ListItem nextItem = (ListItem) value;
					setText(nextItem.getItemName());
					if (nextItem.highlight()) {
						setForeground(Util.LINK_AVAILABLE);
					} else {
						setForeground(Util.LINK_NOT_AVAILABLE);
					}
					if (isSelected) {
						setForeground(Color.BLACK);
						setBackground(new Color(236, 243, 245));
						// setBackground(Color.WHITE);
					}
				}
				return c;
			}

		});
	}

	public void createMainPanels() {
		// login
		lp = new LoginPanel();
		JPanel loginPanel = lp.getMainPanel();

		// add book
		AddBookPanel abp = new AddBookPanel();
		JPanel addBookPanel = abp.getMainPanel();

		// all book IDs
		abip = new AllBookTitles();
		JPanel allTitlesPanel = abip.getMainPanel();

		cards = new JPanel(new CardLayout());
		cards.add(loginPanel, loginListItem.getItemName());
		cards.add(allTitlesPanel, viewTitlesItem.getItemName());
		cards.add(addBookPanel, addBookItem.getItemName());

	}

	@Override
	public void updateData() {
		// nothing to do

	}
}
package package1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cashier {
	public static void main(String[] args) {
		Register register = new Register();
		Inventory x = new Inventory();
		x.addInventory();

		for (int i = 0; i < 3; i++) {
			register.scanItem();
		}
		register.total();
		register.pay();
	}

}

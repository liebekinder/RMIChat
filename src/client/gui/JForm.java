package client.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class JForm extends JDialog {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -9084527380101207444L;

	private static String returnValue;
 
	private JTextField text;
	private JButton validation;
 
	private JForm() { 
		setTitle("Votre choix");
		setModalityType(ModalityType.APPLICATION_MODAL);
		text = new JTextField();
		validation = new JButton("OK");
		validation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ok();
			}
		});
		
		text.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                ok();
            }

			
        });
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(text);
		panel.add(validation);
		setContentPane(panel);
		pack();
	}
	
	private void ok() {
		returnValue = text.getText();
		dispose();
	}
 
	public static String openForm(Component parent) {
		returnValue = null;
		JForm form = new JForm();
		form.setSize(200, 100);
		form.setLocationRelativeTo(parent);
		form.setVisible(true);
		form.setResizable(false);
		return returnValue;
	}
 
}

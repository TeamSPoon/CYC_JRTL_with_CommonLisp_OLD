package com.netbreeze.bbowl.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.logicmoo.bb.BeanWrapper;

public class RenameDialog extends JFrame {
  public JTextField nameField = new JTextField(10);
  public JButton okButton = new JButton("OK");
  public JButton cancelButton = new JButton("Cancel");
  BeanWrapper bean;
  BeanBowlContext context;

  public RenameDialog(BeanBowlContext context, BeanWrapper bean) {
    super("Rename");
    this.context = context;
    setIconImage(Icons.loadImage("mainFrame.gif"));
    this.bean = bean;

    JPanel top = new JPanel(new FlowLayout());
    top.add(new JLabel("Rename "+ bean.getName() + " to: "));
    top.add(nameField);
    nameField.setText(bean.getName());
    nameField.selectAll();

    JPanel bottom = new JPanel(new FlowLayout());
    bottom.add(cancelButton);
    bottom.add(okButton);

    getContentPane().setLayout(new BorderLayout());

    Box box = new Box(BoxLayout.Y_AXIS);
    box.add(top);
    box.add(bottom);
    getContentPane().add("Center", box);
    pack();
    com.netbreeze.util.Utility.centerWindow(this);


    nameField.getDocument().addDocumentListener(
      new DocumentListener() {
        @Override
		public void insertUpdate(DocumentEvent evt) {
          checkControls();
        }
        @Override
		public void changedUpdate(DocumentEvent evt) {
          checkControls();
        }
        @Override
		public void removeUpdate(DocumentEvent evt) {
          checkControls();
        }
      }
    );

    nameField.addActionListener(
      new ActionListener() {
        @Override
		public void actionPerformed(ActionEvent evt) {
          okPressed();
        }
      }
    );

    cancelButton.addActionListener(
      new ActionListener() {
        @Override
		public void actionPerformed(ActionEvent evt) {
          dispose();
        }
      }
    );

    okButton.addActionListener(
      new ActionListener() {
        @Override
		public void actionPerformed(ActionEvent evt) {
          okPressed();
        }
      }
    );

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  private void okPressed() {
    String name = nameField.getText();
    if (isNameValid(name)) {
      try {
        bean.setName(nameField.getText());
        context.getGUI().getBeanBowlPanel().getBeanList().reloadContents();
      } catch (Exception err) {
        context.showError(null, err);
      }
      dispose();
    } else {
      context.showError("Invalid name - there is already another bean named '" + name + "'", null);
    }
  }

  private void checkControls() {
    String newName = nameField.getText();
    okButton.setEnabled(isNameValid(newName));
  }

  private synchronized boolean isNameValid(String n) {
    if (n == null || n.equals("")) {
      return false;
    } else {
      return context.findBean(n) == null;
    }
  }
}


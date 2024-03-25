package View;

import javax.swing.*;


public class Buttons extends JPanel {
    JButton viewContacts;
    JButton addContact;
    JButton deleteContact;
    JButton editContact;
    JButton searchContact;

    public Buttons(){
        viewContacts = new JButton("View All Contacts");
        addContact = new JButton("Add new Contact");
        deleteContact = new JButton("Delete Contact");
        editContact = new JButton("Edit Contact");
        searchContact = new JButton("Search a Contact");

        add(viewContacts);
        add(addContact);
        add(deleteContact);
        add(editContact);
        add(searchContact);
    }

    public JButton getAddContact() {
        return addContact;
    }

    public JButton getDeleteContact() {
        return deleteContact;
    }

    public JButton getEditContact() {
        return editContact;
    }

    public JButton getSearchContact() {
        return searchContact;
    }

    public JButton getViewContacts() {
        return viewContacts;
    }
}

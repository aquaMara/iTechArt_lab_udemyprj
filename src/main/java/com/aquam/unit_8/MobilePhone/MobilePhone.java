package com.aquam.unit_8.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int a = findContact(contact);
        if (findContact(contact) != -1) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        } else
            return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (Contact oneContact : myContacts) {
            if (oneContact.getName().equals(name))
                return myContacts.indexOf(oneContact);
        }
        return -1;
    }

    public Contact queryContact(String name) {
        return myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact oneContact : myContacts) {
            System.out.println(myContacts.indexOf(oneContact) + 1 + ". " + oneContact.getName() + " -> " + oneContact.getPhoneNumber());
        }

    }
}

/*
import java.util.ArrayList;

public class MobilePhone {
    private ArrayList myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList&lt;&gt;();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) &gt;= 0) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) &gt;= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i &lt; myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) &gt;= 0) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i &lt; myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -&gt; " + myContacts.get(i).getPhoneNumber());
        }
    }

}
 */

/*
public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

 */
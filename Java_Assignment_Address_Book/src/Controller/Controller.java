package Controller;

import Model.Model;
import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    View view;
    Model model;

    public Controller(Model m, View v){
        view = v;
        model = m;

        model.getManage().setLinesBeingDisplayed(15);
        view.centerInitialSetup(model.getManage().getLinesBeingDisplayed(), model.getManage().getHeaders().size());
        model.getManage().setFirstLineToDisplay(0);
        view.centerUpdateBook(model.getManage().getLines(model.getManage().getFirstLineToDisplay(), model.getManage().getLinesBeingDisplayed()), model.getManage().getHeaders());

        view.getMf().getIp().getButt().getAddContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAc().setVisible(true);
            }
        });

        view.getAc().getAddDetails().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getAc().getname().getText();
                String phoneNumber = view.getAc().getPhoneNumber().getText();
                String emailID = view.getAc().getEmailId().getText();
                String address = view.getAc().getAddress().getText();

                model.getManage().addNewContact(name,phoneNumber, emailID, address);
            }
        });

        view.getMf().getIp().getButt().getViewContacts().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getVc().setVisible(true);
            }
        });

        view.getMf().getIp().getButt().getDeleteContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDc().setVisible(true);
            }
        });

        view.getDc().getDel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getDc().getDelname().getText();
                model.getManage().delContact(name);
            }
        });

        view.getMf().getIp().getButt().getSearchContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSc().setVisible(true);
            }
        });

        view.getSc().getSearchBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nametosearch=view.getSc().getTxt_con_name().getText();
                String name = "";
                String p = "";
                String ei = "";
                String a = "";
                for(int i=0; i< model.getManage().getTable().size(); i++){
                    if (nametosearch.equals(model.getManage().getTable().get(i).getName())){
                        System.out.println("+1");
                        name = model.getManage().getTable().get(i).getName();
                        p = String.valueOf(model.getManage().getTable().get(i).getPhoneNumber());
                        ei = model.getManage().getTable().get(i).getEmailAddress();
                        a = model.getManage().getTable().get(i).getAddress();
                        break;
                    }
                }

                for (int i=0; i< model.getManage().getTable().size(); i++) {
                    if (view.getEc().getGetname().getText().equals(model.getManage().getTable().get(i).getName())) {

                    }
                }
                view.getSc().getTxt_name().setText(name);
                view.getSc().getTxt_phone().setText(p);
                view.getSc().getTxt_email().setText(ei);
                view.getSc().getTxt_addr().setText(a);
                view.getSc().getUpp().setVisible(true);
                model.getManage().searchContact(view.getSc().getTxt_con_name().getText(), name, p, ei, a);
            }
        });


        view.getMf().getIp().getButt().getEditContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getEc().setVisible(true);
            }
        });

        view.getEc().getGet().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = null;
                String p = null;
                String ei = null;
                String a = null;
                for (int i = 0; i < model.getManage().getTable().size(); i++) {
                    if (view.getEc().getGetname().getText().equals(model.getManage().getTable().get(i).getName())) {
                        name = model.getManage().getTable().get(i).getName();
                        p = String.valueOf(model.getManage().getTable().get(i).getPhoneNumber());
                        ei = model.getManage().getTable().get(i).getEmailAddress();
                        a = model.getManage().getTable().get(i).getAddress();
                        break;
                    }
                }
                view.getEc().getname().setText(name);
                view.getEc().getPhoneNumber().setText(p);
                view.getEc().getEmailId().setText(ei);
                view.getEc().getAddress().setText(a);
                view.getEc().getUpp().setVisible(true);
            }
        });

        view.getEc().getAdd1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getEc().getname().getText();
                String phoneNumber = view.getEc().getPhoneNumber().getText();
                String emailID = view.getEc().getEmailId().getText();
                String address = view.getEc().getAddress().getText();

                model.getManage().editContact(view.getEc().getGetname().getText(), name, phoneNumber, emailID, address);
            }
        });
    }
}

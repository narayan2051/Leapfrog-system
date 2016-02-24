/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import com.leapfrog.academy.entity.Facilitator;
import com.leapfrog.academy.service.FacilitatorService;
import com.leapfrog.academy.service.impl.FacilitatorServiceImpl;

/**
 *
 * @author Narayan
 */
public class FacilitatorView extends AbstractView {

    FacilitatorService facilitatorService = new FacilitatorServiceImpl();

    @Override
    public void controller() {
        while (true) {
            boolean back = false;
            menu();

            switch (input.nextInt()) {

                case 1:
                    add();
                    break;

                case 2:

                    break;

                case 3:
                    delete();
                    break;

                case 4:
                    showAll();
                    break;
                case 5:
                    showById();
                    break;

                case 6:
                    break;

                case 7:
                    back = true;

                    break;
            }

            if (back) {
                break;
            }
        }

    }

    private void menu() {
        System.out.println("=========================");
        System.out.println("===Welcome To FacilitatorView===");
        System.out.println("=========================");
        System.out.println("1.Add");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Show All Information");
        System.out.println("5.Search Facilitator by ID");
        System.out.println("6.Search");
        System.out.println("7.Back");
        System.out.print("Enter your Choice[1-7]");
    }

    private void add() {

        while (true) {
            Facilitator f = new Facilitator();

            System.out.println("Enter Id:");
            f.setId(input.nextInt());
            System.out.println("Enter First Name:");
            f.setFirstName(input.next());
            System.out.println("Enter Last Name:");
            f.setLastName(input.next());
            System.out.println("Enter Email:");
            f.setEmail(input.next());
            System.out.println("Enter Contact Number:");
            f.setContactNo(input.next());
            System.out.println("Enter Status:");
            f.setStatus(input.nextBoolean());

            facilitatorService.insert(f);
            System.out.println("Insert Success");
            System.out.println("Do you want to add more facilitator?[Y/N]");
            if (input.next().equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    private void showAll() {

            checkAvailable();
            facilitatorService.getAll().forEach(c -> {

                System.out.println(c.toString());

            });
      
    }

    private void delete() {
        checkAvailable();
        System.out.println("Enter id to Delete:");
        if (facilitatorService.delete(input.nextInt()) == 1) {
            System.out.println("Delete Success");

        } else {
            System.out.println("ID not Found.");
        }

    }

    private void showById() {
        checkAvailable();

        System.out.println("Enter ID:");

        Facilitator facilitator = facilitatorService.getById(input.nextInt());
        if (facilitator != null) {
            System.out.println(facilitator.toString());
        } else {
            System.out.println("id not found");
        }
    }

    private void checkAvailable() {
        
          if (facilitatorService.getAll().size() == 0) {

              System.out.println("No Imformation are Available");   
                                        
    }

}
}

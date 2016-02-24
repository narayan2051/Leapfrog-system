/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import com.leapfrog.academy.entity.Student;
import com.leapfrog.academy.service.StudentService;
import com.leapfrog.academy.service.impl.StudentServiceImpl;

/**
 *
 * @author Narayan
 */
public class StudentView extends AbstractView {

    StudentService studentService = new StudentServiceImpl();

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
        System.out.println("===Welcome To StudentView===");
        System.out.println("=========================");
        System.out.println("1.Add");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Show All Information");
        System.out.println("5.Search Student by ID");
        System.out.println("6.Search");
        System.out.println("7.Back");

        System.out.print("Enter your Choice[1-6]");
    }

    private void add() {
        while (true) {
            Student s = new Student();
            System.out.println("Enter Id:");
            s.setId(input.nextInt());
            System.out.println("Enter First Name:");
            s.setFirstName(input.next());
            System.out.println("Enter Last Name:");
            s.setLastName(input.next());
            System.out.println("Enter Email:");
            s.setEmail(input.next());
            System.out.println("Enter Contact Number:");
            s.setContactNo(input.next());
            System.out.println("Enter Status:");
            s.setStatus(input.nextBoolean());

            studentService.insert(s);
            System.out.println("Insert Success");
            System.out.println("Do you want to add more Student?[Y/N]");
            if (input.next().equalsIgnoreCase("N")) {
                break;

            }
        }
    }

    private void showAll() {

        if (studentService.getAll().size() != 0) {

            studentService.getAll().forEach(c -> {
                System.out.println(c.toString());
            });
        } else {
            System.out.println("No information are Available.");
        }

    }

    private void delete() {

        System.out.println("Enter ID:");

        if (studentService.delete(input.nextInt()) == 1) {
            System.out.println("Delete Success");
        } else {
            System.out.println("Id not found");
        }

    }

    private void showById() {

        System.out.println("Enter ID:");

        Student student = studentService.getById(input.nextInt());
        if (student != null) {
            System.out.println(student.toString());

        } else {
            System.out.println("Id not found");
        }

    }
}

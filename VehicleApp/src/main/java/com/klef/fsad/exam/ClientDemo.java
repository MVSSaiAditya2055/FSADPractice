package com.klef.fsad.exam;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Insert Vehicle");
            System.out.println("2. Update Vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Transaction tx = session.beginTransaction();
                    Vehicle v = new Vehicle();
                    System.out.print("Enter id: ");
                    v.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    v.setName(sc.nextLine());
                    System.out.print("Enter description: ");
                    v.setDescription(sc.nextLine());
                    System.out.print("Enter date: ");
                    v.setDate(sc.nextLine());
                    System.out.print("Enter status: ");
                    v.setStatus(sc.nextLine());
                    session.persist(v);
                    tx.commit();
                    break;

                case 2:
                    Transaction tx1 = session.beginTransaction();
                    System.out.print("Enter id to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Vehicle vi = session.get(Vehicle.class, id);
                    if (vi != null) {
                        System.out.print("Enter new name: ");
                        vi.setName(sc.nextLine());
                        System.out.print("Enter new status: ");
                        vi.setStatus(sc.nextLine());
                        session.update(vi);
                        tx1.commit();
                    } else {
                        System.out.println("Vehicle not found");
                        tx1.rollback();
                    }
                    break;

                case 3:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 3);

        session.close();
        factory.close();
        sc.close();
    }
}
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Default (Template) Project
 * Created date : 5/19/2024
 * Created time : 8:24 AM
 */
public class Main {
    public static void main(String[] args) {

    // session factory
        SessionFactory sessionFactory=setUp();
    //new session
        Session session=sessionFactory.openSession();

        //start the transaction
        session.beginTransaction();

        //java object
        Car car=new Car();
        car.setBrand("Ford");
        car.setModel("Mustang");
        car.setEngCap(1500);

        //saving the object
        session.persist(car);

        //commit the cache
        session.getTransaction().commit();

        //close the transaction
        session.close();

        ////////////////////////////////////////////////

        //new session
        Session session2=sessionFactory.openSession();

        //start the transaction
        session2.beginTransaction();

        //remove the object using id
        Car carToRemove = session2.find(Car.class, 402);
        if (carToRemove != null) {
            session2.remove(carToRemove);
        } else {
            System.out.println("Car with ID 102 not found for removal.");
        }

        //commit the cache
        session2.getTransaction().commit();

        //close the transaction
        session2.close();


        ///////////////////////////////////////////////////

        //new session
        Session session3=sessionFactory.openSession();

        //start the transaction
        session3.beginTransaction();


        //finding the object
        Car getcar = session3.find(Car.class, 1);
        System.out.println(getcar);

        //commit the cache
        session3.getTransaction().commit();

        //close the transaction
        session3.close();



    }

    protected static SessionFactory setUp() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();
        try {
            SessionFactory sessionFactory =
                    new MetadataSources(registry)
                            .addAnnotatedClass(Car.class)
                            .buildMetadata()
                            .buildSessionFactory();
            return sessionFactory;
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return null;
    }
}
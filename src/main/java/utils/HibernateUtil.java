package utils;

import entities.Coordinates;
import entities.Location;
import entities.Person;
import entities.StudyGroup;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            configuration.setProperties(properties)
                    .addAnnotatedClass(StudyGroup.class)
                    .addAnnotatedClass(Coordinates.class)
                    .addAnnotatedClass(Location.class)
                    .addAnnotatedClass(Person.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}

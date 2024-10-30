package beans;

import entities.StudyGroup;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.io.Serializable;
import java.util.List;

@Data
@Named
@SessionScoped
public class HelloBean implements Serializable {
    private String login;
    private String password;

    public HelloBean() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Query query =  session.createQuery("FROM StudyGroup WHERE name = 'P3308'");
        List<StudyGroup> groupList = query.list();
        System.out.println(groupList.size());
    }

    public String checkLogin(){
        if (login.equalsIgnoreCase("alex") && password.equalsIgnoreCase("qwerty")){
            return "loginsuccess?faces-redirect=true";
        } else {
            return "loginfailed?faces-redirect=true";
        }
    }
}

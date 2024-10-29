package beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean(name = "hello")
@SessionScoped
@Data
@NoArgsConstructor
public class HelloBean implements Serializable {
    private String login;
    private String password;

    public String checkLogin(){
        if (login.equalsIgnoreCase("alex") && password.equalsIgnoreCase("qwerty")){
            return "loginsuccess?faces-redirect=true";
        } else {
            return "loginfailed?faces-redirect=true";
        }
    }
}

package beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Named
@SessionScoped
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

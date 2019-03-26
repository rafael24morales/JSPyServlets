package com.autentication;
import java.util.ArrayList;
import utileria.Usuario;

public class AutenticationService {
    
    ArrayList<Usuario>  arrUsers = new ArrayList();   
    Usuario usr1 = new Usuario("panchito@gmail.com","1234");
    Usuario usr2 = new Usuario("juanito@gmail.com","abcd");
    Usuario usr3 = new Usuario("luperto@gmail.com","4321");
   
    public AutenticationService(){
        arrUsers.add(usr1);
        arrUsers.add(usr2);
        arrUsers.add(usr3);
    }
    
    public Usuario authentication(String email, String password){
        for(Usuario user : arrUsers )
            if(user.getEmail().equals(email) && user.getPassword().equals(password))
                return user;
        
        return null;
    }
    

}

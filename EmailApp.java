/*
 * @Created by Olga Gavrylchenko, 2018
 */
package emailapp;


public class EmailApp{


    public static void main(String[] args) {
       // TODO code application logic here
        
        String from = "emailNameFrom@gmail.com";
        String password = "password";
        String to = "emailNameTo@gmail.com";
        
        EmailObject.send(from, password, to, EmailContent.HEADER_WELCOME, 			EmailContent.BODY_WELCOME);
    
    }
    
}

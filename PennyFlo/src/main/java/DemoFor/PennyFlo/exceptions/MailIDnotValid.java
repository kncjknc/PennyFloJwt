package DemoFor.PennyFlo.exceptions;

public class MailIDnotValid extends RuntimeException{

    public MailIDnotValid(String userName){
        super("The given mail id is not valid please check "+ userName );
    }

}

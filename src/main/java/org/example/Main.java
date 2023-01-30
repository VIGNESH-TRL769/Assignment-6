package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
class CreaditCard implements Cloneable
{
    String name;
    long cardNumber;
    String expirationDate;
    CreaditCard(String name,long cardNumber,String expirationDate)
    {
        this.name=name;
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;

    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    Boolean checkNumber(long newCardNumber)
    {
        return cardNumber==newCardNumber;
    }

}
public class Main
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input=new Scanner(System.in);
        try {
        LOGGER.info("Enetr the HolderName:");
        String name=input.nextLine();
        LOGGER.info("Enetr the CardNumber:");
        long cardNumber=input.nextLong();
        LOGGER.info("Enetr the ExpirationDate:");
        String expirationDate=input.next();
        CreaditCard creaditCard=new CreaditCard(name,cardNumber,expirationDate);
        CreaditCard cloneCreaditCard=(CreaditCard) creaditCard.clone();
        LOGGER.info("Enetr the NewCardNumber:");
        long newCardNumber=input.nextLong();
        String checkNumber=String.valueOf(creaditCard.checkNumber(newCardNumber));
        if(checkNumber.equals("true"))
            LOGGER.info("Cardnumber is equal");
        else {
            LOGGER.info("Cardnumber is not equal");
            cloneCreaditCard.cardNumber = newCardNumber;
        }

        String oldcard="Original Details:Holder Name:"+name+" Card Number:"+cardNumber+" Experied Date:"+expirationDate;
        String newCaed="Cloned Details:Holder Name:"+cloneCreaditCard.name+" Card Number:"+cloneCreaditCard.cardNumber+" Experied Date:"+cloneCreaditCard.expirationDate;
        LOGGER.info(oldcard);
        LOGGER.info(newCaed);
    }catch(Exception e)
        {
            String value = "Please Enter Valid Numbers:" + e;
            LOGGER.info(value);
            input.nextLine();
        }
    }
}

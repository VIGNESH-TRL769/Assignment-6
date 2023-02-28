package org.example;
class CreaditCard
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
    CreaditCard(CreaditCard object)
    {
        name=object.name;
        cardNumber=object.cardNumber;
        expirationDate= object.expirationDate;
    }
    Boolean checkNumber(long newCardNumber)
    {
        return cardNumber==newCardNumber;
    }
}

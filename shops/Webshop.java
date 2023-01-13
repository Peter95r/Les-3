package shops;

import people.Klant;



public class Webshop{

public String products;
public String seller;

private double price;
private boolean open;


int openTime;
int closeTime;

Klant k = new Klant();

public void setOpeningTime(int open, int close){

this.openTime = open;
this.closeTime=close;
}

public void setPrice(double price){

this.price = price;
}


public void isOpen(boolean open){

this.open=open;
}

}
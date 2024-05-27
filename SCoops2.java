package scoops2;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class SCoops2 
{
    public static void main(String[] args) 
    {
        Product p=new Product("A12f","vinegar");
        p.setPrice(55.6f);
        p.setQuantity(500);
        System.out.println("The product is "+p.getName()+" cost is "+ p.getPrice()+","+" Item number and quantity is "+p.getItemno()+","+p.getQtantity()+"ml");
        Customer c=new Customer("B12fe","R.DharmikTej");
        c.setAddress("Simhadri Hospital,Raipur");
        c.setPhno("4278275482");
        System.out.println("The customer is "+c.getName()+" and his/her customer id is "+c.getCustId()+","+" address is "+c.getAddress()+" phone number is "+c.getPhno());
    }   
}

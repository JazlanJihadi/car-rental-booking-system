public class Customer extends Person
{
    public String name,licenseNum;
    public String contactNum,dayStart,dayEnd;
    public int  rent;
    public int  carChoose;   
    public int choose;
    
    public Customer()
    {
       super();
       this.name=null;
       this.licenseNum=null;
       this.carChoose=0;
       this.contactNum=null;
       this.rent=0;
       this.dayStart=null;
       this.dayEnd=null;
       this.choose=0;
    }
    public Customer(int status,String password,String carName,int choice,int choose,double prices,String name,String licenseNum,String contactNum,String dayStart,
                String dayEnd,int rent,int carChoose)
    {
       this.name=name;
       this.licenseNum=licenseNum;
       this.carChoose=carChoose;
       this.contactNum=contactNum;
       this.rent=rent;
       this.dayStart=dayStart;
       this.dayEnd=dayEnd;
       this.choose=choose;
    }
    
    public void setName      (String name)           {this.name=name;}
    public void setLicenseNum(String licenseNum)     {this.licenseNum=licenseNum;}
    public void setCarChoose (int carChoose)         {this.carChoose=carChoose;}
    public void setContactNum(String contactNum)     {this.contactNum=contactNum;}
    public void setRent      (int rent)              {this.rent=rent;}
    public void setDayStart  (String dayStart)       {this.dayStart=dayStart;}
    public void setDayEnd    (String dayEnd)         {this.dayEnd=dayEnd;}
    public void setChoose    (int choose)            {this.choose=choose;}
   
   public String getName      ()    {return this.name;}
   public String getLicenseNum()    {return this.licenseNum;} 
   public int getCarChoose    ()    {return this.carChoose;}
   public String getContactNum()    {return this.contactNum;}
   public int getRent         ()    {return this.rent;}
   public String getDayStart  ()    {return this.dayStart;}
   public String getDayEnd    ()    {return this.dayEnd;}
   public int getChoose       ()    {return this.choose;}
}

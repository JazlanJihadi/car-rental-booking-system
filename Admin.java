public class Admin extends Person
{
    public String password;
    
    public Admin()
   {
       this.password=null;
   }
   
   public Admin(String password)
   {
       this.password=password;
   }
   
   public void setPassword(String password){this.password=password;}
   
   public String getPassword(){return this.password;}
   
}

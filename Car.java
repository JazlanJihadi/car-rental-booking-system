public class Car 
{
   public String name;
   public double prices;
   public int carAmount;
   
   int myvi=15,exora=10,viva=20,kancil=15,kelisa=10;
   
   public Car()
   {
        this.name=null;
        this.prices=0.0;
        this.carAmount=0;
   }
   
   public Car(String name,double prices,int carAmount)
   {
        this.name=name;
        this.prices=prices;
        this.carAmount=carAmount;
   }
   
   public void setname(String name){this.name=name;}
   public void setPrices(double prices){this.prices=prices;}
   public void setCarAmount(int carAmount){this.carAmount=carAmount;}

   public String getName(){return this.name;}
   public double getPrices(){return this.prices;}
   public int getCarAmount(){return this.carAmount;}
   
   public void carChoosing(int getCarChoose)
   {
       switch(getCarChoose)
       {
           case 1:
            prices=100.0;
            name="Viva";
            break;
           case 2:
            prices=120.0;
            name="Myvi";
            break;
           case 3:
            prices=200.0;
            name="Exora";
            break;
           case 4:
            prices=50.0;
            name="Kancil";
            break;
           case 5:
            prices=70.0;
            name="Kelisa";
            break;
           default:
            break;
       }
   }
}

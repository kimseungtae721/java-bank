package quiz;

public class Bank {
   String ano;
   String owner;
   int money;
   int test;
   
   public Bank(String ano,String owner,int money) {
      this.ano = ano;
      this.owner = owner;
      this.money = money;
   }

   public String getAno() {return ano;}

   public void setAno(String ano) {this.ano = ano;}

   public String getOwner() {return owner;}

   public void setOwner(String owner) {this.owner = owner;}

   public int getmoney() {return money;}

   public void setmoney(int money) {this.money = money;}

   public void remove(String ano) {
	   
   }
}
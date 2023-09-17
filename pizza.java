public class pizza {
    private int price;
    private Boolean veg; 
    private int extraCheeseadded=100;
    private int extraToppingadded =120;
    private int backPack=10;

    public pizza (Boolean veg){
        this.veg=veg;
        if(veg){          // true
           this. price=300;  //veg pizza  
           
        }
        else{
          this. price=400;   // false
        }                      // non veg pizza
    }
      
      public void addExtracheese(){
        System.out.println("extra cheese added");
        this.price+=extraCheeseadded;
      }
       public void addExtratoppings(){
         System.out.println("extra  toppings added");
         this.price+=120;
       }
       public void takeAway(){
          System.out.println("take away opted");
         this.price+=10;
       }
     public void getBill(){
            System.out.println(this.price);
     }   
public static void main(String[] args) {
    // pass the value true for veg pizza and false for non veg pizza
    pizza basepizza =new pizza (true);
   basepizza. addExtratoppings();
   basepizza.takeAway();
   basepizza.getBill();
    }
}

public class Pizza{
    private int price;
    private Boolean veg;
    
    private int extraCheesePrice=100;
    private int extraTopinsPrice=150;
    private int backPackPrice=20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraTopinsAdded = false;
    private boolean isOptedforTakeAway = false;
    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }

        basePizzaPrice=this.price;
    }
    
    public void addExtraTopins(){
        isExtraTopinsAdded=true;
        this.price+=extraTopinsPrice;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }
    public void TakeAway(){
        isOptedforTakeAway=true;
        this.price+=backPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added: "+extraCheesePrice+ "\n";

        }
        if(isExtraTopinsAdded){
            bill+="Extra Toppins added: "+extraTopinsPrice+ "\n";

        }
        if(isOptedforTakeAway){
            bill+="TakeAway: "+backPackPrice+"\n";

        }
        bill +="Bill: "+this.price+ "\n";
        System.out.println(bill);

        
    }

}
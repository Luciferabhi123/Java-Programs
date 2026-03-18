public class Store {

        
        int Qty;
        double Bill;
        String Fabric_type, Cloth_type;


    Store(String Fabric_type, String Cloth_type, int Qty){
       
        this.Fabric_type = Fabric_type;
        this.Cloth_type = Cloth_type;
        this.Qty = Qty;
        this.Bill=0;

    }
    public void calculateBill(){
        if(this.Cloth_type.equals("Sharee")){
            if(this.Fabric_type.equals("Cotton"))
               this.Bill=this.Qty*1300;
            else if(this.Fabric_type.equals("Silk"))
               this.Bill=this.Qty*1400;
        }
        else if(this.Cloth_type.equals("Jeans")){
            if(this.Fabric_type.equals("Cotton"))
               this.Bill=this.Qty*800;
            else if(this.Fabric_type.equals("Silk"))
                this.Bill=this.Qty*900;
            
        }
        if(this.Bill>=4000)
           this.Bill=this.Bill*0.95;
    }
    public void showAll(){
        System.out.println("Fabric Type="+this.Fabric_type);
        System.out.println("Cloth Type="+this.Cloth_type);
        System.out.println("Qty="+this.Qty);
        System.out.println("Bill="+this.Bill);
    }
    public static void main(String[] args) {
        Store ob = new Store("Cotton","Jeans",100); //Also Write as [Store ob = new Store(args[0],args[1],100);] 
        // 'ob' is the object of the class Store
        ob.calculateBill();
        ob.showAll();
    }
}

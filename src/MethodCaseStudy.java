public class MethodCaseStudy {
public static void main(String[] args) {
		int productPrice=500000;
        int producttax=getTax(productPrice);//method calling 
        System.out.println("Tax amount:"+producttax);
        int totalAmountincludingtax=getTotal(productPrice);//method calling 
        System.out.println("Total amount including tax:(5%):"+totalAmountincludingtax);
        int discountprice=getDiscount(productPrice);
        System.out.println("Discount Amount:"+discountprice);
        System.out.println("Total amount after discount(2%):"+(totalAmountincludingtax-discountprice));
	}
	//get tax method definition 
	public static int getTax(int cost) {
		int taxpercence=5;
		int taxresult=CalculatePercentanceAmount(cost,taxpercence);
		return taxresult;
	}
	//get total method definition 
	public static int getTotal(int cost) {
		int Totalresult=cost+getTax(cost);//method calling 
		return Totalresult;
	}
	//get discount
	public static int getDiscount(int cost) {
		int discountpercence=2;
		int discountresult=CalculatePercentanceAmount(cost,discountpercence);
		return discountresult;
	}
	//calculate percetance amount 
   public static int CalculatePercentanceAmount(int cost,int percetance) {
	   int percetanceAmt=(cost*percetance)/100;
	   return percetanceAmt; 
   }
}

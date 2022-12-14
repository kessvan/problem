package tamilnadu.chennai2;

public class CommonMainChennai implements TrafficRules,TrafficRulesChennai
{
	public void goByDieselVehicle()
	{
		System.out.println("diesel vechile");
	}
    public void goByBicycle()
    {
    	System.out.println("Bycycle");
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stubC
		CommonMainChennai cmc=new CommonMainChennai();
		cmc.goByDieselVehicle();
		cmc.goByBicycle();
		
		System.out.println(cmc.trafficCommisssioner);

	}

}

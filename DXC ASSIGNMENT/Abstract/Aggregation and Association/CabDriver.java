package DXC;

public class CabDriver {
	private String driverName;
	private float averageRating;
	public CabDriver(String driverName, float averageRating)
	{
		
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public  float getAverageRating() {
		return this.averageRating;
	}
	public void setAverageRating(float averageRating) 
	{
		  this.averageRating = averageRating;
	}
	public String toString()
	{

		return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;

		}
	
}

class CabServiceProvider
{
	static String cabServiceName;
	int totalCabs;
	public CabServiceProvider(String cabServiceName, int toalCabs) 
	{
		
		CabServiceProvider.cabServiceName = cabServiceName;
		this.totalCabs = toalCabs;
	}
	
	public static double calculateRewardPrice(CabDriver driver)
	{
		double bonus=0 ;
		double rating;
		rating=driver.getAverageRating();
		if(cabServiceName=="Halo")
		{	
		   
			if(rating>=4.5 && rating<=5)
			{
				bonus=rating*10;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*5;
			}
			
			
		}
		else if(cabServiceName=="Aber")
		{
			if(rating>=4.5 && rating<=5)
			{
				bonus=rating*8;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*3;
			}
			

		}
		
		return bonus;
		
	
		
	
	}
	
	
	
}



package singletons;

public class AppConfig {

			private AppConfig()
			{
				
			}
			
			private static AppConfig obj = new AppConfig();
			
			public static AppConfig getInstance()
			{
				return obj;
			}
			
			/*for save the memory ,this can be optimized as 
			
			private static AppConfig obj = null;
			public static AppConfig getInstance()
			{
			   	if(obj==null)
			   	{
			   	obj = new AppConfig();
			   	}
				return obj;
			}
			*/
			
}

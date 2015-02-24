package arewegood.sdk;

public class Arewegood {
	private String apiKey;
	private String serviceName;
	private boolean isAuthenticated;
	
	public static Arewegood instanceOf;
	
	public static Arewegood getInstance(String apiKey, String serviceName) {
		if(instanceOf==null) {
			instanceOf = new Arewegood(apiKey, serviceName);
		}
		return instanceOf;
	}
	
	public Arewegood(String apiKey, String serviceName) {
		this.apiKey = apiKey;
		this.serviceName = serviceName;
	}
}

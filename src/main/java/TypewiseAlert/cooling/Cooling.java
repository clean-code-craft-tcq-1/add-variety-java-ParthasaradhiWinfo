package TypewiseAlert.cooling;

import TypewiseAlert.breach.BreachType;

public class Cooling {
	
	private CoolingStrategy coolingStrategy;
	
	public Cooling(CoolingStrategy coolingStrategy) {
		this.coolingStrategy = coolingStrategy;
	}
	
	public BreachType executeCoolingStrategy(double temperatureInC) {
		return this.coolingStrategy.classifyTemperatureBreach(temperatureInC);
	}

}

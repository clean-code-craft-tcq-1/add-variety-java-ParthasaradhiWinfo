package TypewiseAlert.cooling;

import TypewiseAlert.breach.BreachStrategy;
import TypewiseAlert.breach.BreachType;

public class MidActiveCooling implements CoolingStrategy {
	
	private BreachStrategy breachStrategy;

	public MidActiveCooling(BreachStrategy breachStrategy) {
		this.breachStrategy = breachStrategy;
	}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 40;
		
		return breachStrategy.limitType(temperatureInC, lowerLimit, upperLimit);
	}

}

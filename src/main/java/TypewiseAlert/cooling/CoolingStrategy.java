package TypewiseAlert.cooling;

import TypewiseAlert.breach.BreachType;

public interface CoolingStrategy {

	public BreachType classifyTemperatureBreach(double temperatureInC);
}

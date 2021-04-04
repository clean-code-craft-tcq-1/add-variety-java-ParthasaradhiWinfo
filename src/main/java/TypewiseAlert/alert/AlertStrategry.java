package TypewiseAlert.alert;

import TypewiseAlert.breach.BreachType;

public interface AlertStrategry {
	public void sendAlert(BreachType breachType);
}

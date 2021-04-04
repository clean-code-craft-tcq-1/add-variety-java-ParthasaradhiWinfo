package TypewiseAlert.alert;

import TypewiseAlert.breach.BreachType;

public class Alert {

	private AlertStrategry alertStrategry;

	public Alert(AlertStrategry alertStrategry) {
		this.alertStrategry = alertStrategry;
	}

	public void executeAlertStrategry(BreachType breachType) {
		this.alertStrategry.sendAlert(breachType);
	}
}

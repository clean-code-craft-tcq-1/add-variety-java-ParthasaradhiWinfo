package TypewiseAlert.alert;

import java.util.HashMap;
import java.util.Map;

import TypewiseAlert.alert.email.Email;
import TypewiseAlert.alert.email.ToHighEmail;
import TypewiseAlert.alert.email.ToLowEmail;
import TypewiseAlert.breach.BreachType;

public class EmailAlerts implements AlertStrategry {

	private Map<BreachType, Email> emailMap = new HashMap<>();

	public EmailAlerts() {
		this.emailMap.put(BreachType.TOO_HIGH, new Email(new ToHighEmail()));
		this.emailMap.put(BreachType.TOO_LOW, new Email(new ToLowEmail()));
	}

	@Override
	public void sendAlert(BreachType breachType) {

		this.emailMap.get(breachType).executeEmail();

	}

}

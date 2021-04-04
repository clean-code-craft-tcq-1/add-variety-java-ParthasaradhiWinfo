package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TypewiseAlert.breach.BreachStrategy;
import TypewiseAlert.breach.BreachStrategyImpl;
import TypewiseAlert.breach.BreachType;

public class TypewiseAlertTest 
{
	
    @Test
    public void infersBreachAsPerLimits()
    {
    	BreachStrategy breachStrategy = new BreachStrategyImpl();
    	TypewiseAlert typeWiseAlert = new TypewiseAlert(breachStrategy);
      assertTrue(typeWiseAlert.inferBreach(12, 20, 30) ==
    		  BreachType.TOO_LOW);
    }
}

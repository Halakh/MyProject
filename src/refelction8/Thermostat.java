package refelction8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    private Predicate<Double>trigger;
    private Function<Double,String>display;

    public Predicate<Double> getTrigger() {
        return trigger;
    }

    public Function<Double, String> getDisplay() {
        return display;
    }

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    public String sense(Double temperature) {
        if (trigger.test(temperature)){
        return "Warning";
        }
        return display.apply(temperature);

    }

}

    //the Thermostat has a trigger condition and a display function.
    // It receives them via constructor, so they can be customized
    // every time a new one is created.

    // The Thermostat has the sense method that receives the temperature
// in degrees Celsius as a Double and returns a String with a message.
// As long as the condition doesn’t get triggered, the message
// provided by the display function is returned.
// If the condition gets triggered, then the message “Warning!”
// is returned.

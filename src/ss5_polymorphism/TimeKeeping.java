package ss5_polymorphism;

import java.time.LocalTime;

// Java 8
public interface TimeKeeping {
    // public static final
    int MAX_WORKING_HOUR = 8;

    // public abstract LocalDate checkin();
    LocalTime checkin();

    default LocalTime checkout() {
        return LocalTime.of(17, 0, 0);
    }
}

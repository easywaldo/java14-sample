package com.example.java14sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SwitchCaseTest {
    @Test
    public void switch_case_test_by_old_way() {
        assertTrue(isTodayHolidayOld("SUNDAY"));
    }

    public boolean isTodayHolidayOld(String day) {
        boolean isTodayHoliday;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHoliday = false;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }
        return isTodayHoliday;
    }

    @Test
    public void switch_case_test_by_switch_expression_way() {
        String day = "FRIDAY";
        boolean isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
        assertEquals(isTodayHolidayOld("SUNDAY"), true);
        assertEquals(isTodayHolidayOld("MONDAY"), false);
    }


}

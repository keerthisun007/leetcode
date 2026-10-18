import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String keerthi= date.getDayOfWeek().toString();
        return keerthi.substring(0,1) + keerthi.substring(1).toLowerCase();
     }
}

/*
import java.time.LocalDate; — imports the LocalDate class.
LocalDate.of(year, month, day) — creates a date object.
date.getDayOfWeek().toString() — gets the weekday in uppercase.
substring(0,1) — extracts the first letter.
substring(1).toLowerCase() — converts the remaining letters to lowercase.
return ... — returns the weekday in the required format, such as "Sunday".
*/
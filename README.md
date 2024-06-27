# LeapYearChecker

## Rules for Leap Year Calculation

A year is considered a leap year if:
1. It is divisible by 4, AND
2. It is NOT divisible by 100, EXCEPT if it is also divisible by 400.

### Detailed Explanation
- If a year is not divisible by 4, it is not a leap year (e.g., 2041).
- If a year is divisible by 4 but not by 100, it is a leap year (e.g., 2048).
- If a year is divisible by 4 and by 100, it requires an additional check:
  - If the year is also divisible by 400, it is a leap year (e.g., 2000, 2400).
  - If the year is not divisible by 400, it is not a leap year (e.g., 2100, 2200, 2300).


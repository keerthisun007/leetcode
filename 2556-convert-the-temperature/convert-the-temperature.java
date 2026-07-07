class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        
        double[] ans = {kelvin, fahrenheit}; 
        //here we are using array because we cannot return two variables in java..that is return kelvin,fahrenheit(not possible); 
        return ans;
    }
}
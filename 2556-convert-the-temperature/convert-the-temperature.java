class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        
        // Step 1: Pack the tray and give it a name ("ans")
        double[] ans = {kelvin, fahrenheit}; 
        
        // Step 2: Hand over the named tray
        return ans;
    }
}
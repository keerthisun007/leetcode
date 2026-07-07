class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        
        double[] ans = {kelvin, fahrenheit}; 
        //here we are using array because we cannot return two variables in java..that is return kelvin,fahrenheit(not possible); 
        return ans;
    }
}
/*
1.return new double[]{kelvin, fahrenheit};
2.(cel+9/5+32)is the formula
3.double[] ans = new double[2]; //another method
        ans[0] = kelvin; 
        ans[1] = fahrenheit; 
        return ans;
*/
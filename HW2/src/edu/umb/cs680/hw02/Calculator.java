package  edu.umb.cs680.hw02;

public class Calculator {
	
    public static float add(float x, float y)
    {
    	float result = x + y;
        return result;
    }
    public static float sub(float x, float y)
    {
    	float result = x-y;
        return result;
    }
    public static float mul(float x, float y)
    {
    	float result = x*y;
        return result;
    }
    public static float div(float x, float y)
    {	
    	if(y==0)
    	{ 
    		throw new IllegalArgumentException("Number is getting divided by zero here");
    	}
    	float result = x/y;
        return result;
    }

}
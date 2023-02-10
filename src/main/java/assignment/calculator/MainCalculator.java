package assignment.calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainCalculator 
{
    public static void main( String[] args )
    {
    	double num1;
    	double num2;
    	double result;
    	Logger logger = Logger.getLogger("hi");
    	
    	Scanner sc = new Scanner(System.in);

    	logger.info("Enter Number");
    	num1 = sc.nextDouble();
    	Calculator obj;
    	result = num1;
    	while(true)
    	{
        	logger.info("Enter Number");
        	num2 = sc.nextDouble();
        	
        	logger.info("Choose Operation addition(1) substraction(2) multiple(3) division(4) exit(5)");
        	int option = sc.nextInt();
        	switch(option)
        	{
        		case 1:
        		{
        			obj = new Add(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 2:
        		{
        			obj = new Sub(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 3:
        		{
        			obj = new Mul(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 4:
        		{
        			obj = new Div(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 5:
        		{
        			System.exit(0);
				    break;
        		}
        		default:
        		{
        			logger.info("Invalid Option");
        			break;
        		}
        	}
		String res = String.valueOf(result);
        	logger.info(res);
    	}
    }
}



abstract class Calculator
{
	double num1;
	double num2;
	double ans;
	Calculator(double x , double y)
	{
		num1 = x;
		num2 = y;
	}
	public abstract void calculate();
}


class Add extends Calculator
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 + super.num2;
	}
}

class Sub extends Calculator
{
	Sub(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 - super.num2;
		
	}
}

class Mul extends Calculator
{
	Mul(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 * super.num2;
		
	}
}

class Div extends Calculator
{
	Logger logger = Logger.getLogger("hi");
	Div(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
			super.ans = super.num1 / super.num2;
			
	}
}
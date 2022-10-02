import javax.swing.JOptionPane;

public class Mathoutput {
	void createfinaloutput(double power,double voltage,double current,
			double resistance,double solvefor,double optionselection)
	{
		//Math Array
				if(solvefor == 1) //power
				{
					if(optionselection == 1) 
					{
						//Equation: V^2/R
						power = (Math.pow(voltage, 2))/resistance;
						JOptionPane.showMessageDialog(null,"Answer: "+power+" Joules.");
						
					}
					if(optionselection == 2)
					{
						//Equation: (R)(I^2)
						power = (resistance)*(Math.pow(current, 2));
						JOptionPane.showMessageDialog(null,"Answer: "+power+" Joules.");
					}
					if(optionselection == 3)
					{
						//Equation: (V)(I)
						power = voltage * current;
						JOptionPane.showMessageDialog(null,"Answer: "+power+" Joules.");
					}
				}
				if(solvefor == 2) //voltage
				{
					if(optionselection == 1)
					{
						//Equation: (R)(I)
						voltage = resistance * current;
						JOptionPane.showMessageDialog(null,"Answer: "+voltage+" volts.");
					}
					if(optionselection == 2)
					{
						//Equation: P/I
						voltage = power/current;
						JOptionPane.showMessageDialog(null,"Answer: "+voltage+" volts.");
					}
					if(optionselection == 3)
					{
						//Equation: v(p)(r)
						voltage = (Math.sqrt((power*resistance)));
						JOptionPane.showMessageDialog(null,"Answer: "+voltage+" volts.");
					}
				}
				
				if(solvefor == 3) //current
				{
					if(optionselection == 1)
					{
						//Equation: v(p/r)
						current = (Math.sqrt((power/resistance)));
						JOptionPane.showMessageDialog(null,"Answer: "+current+" Amps.");
					}
					if(optionselection == 2)
					{
						//Equation: P/V
						current = power/voltage;
						JOptionPane.showMessageDialog(null,"Answer: "+current+" Amps.");
					}
					if(optionselection == 3)
					{
						//Equation: V/R
						current = voltage/resistance;
						JOptionPane.showMessageDialog(null,"Answer: "+current+" Amps.");
					}
				}
				if(solvefor == 4) //resistance
				{
					if(optionselection == 1)
					{
						//Equation: P/I^2
						resistance = power/(Math.pow(current, 2));
						JOptionPane.showMessageDialog(null,"Answer: "+resistance+" Ohms.");
					}
					if(optionselection == 2)
					{
						//Equation: V^2/P
						resistance = (Math.pow(voltage, 2))/power;
						JOptionPane.showMessageDialog(null,"Answer: "+resistance+" Ohms.");
					}
					if(optionselection == 3)
					{
						//Equation: V/I
						resistance = voltage/current;
						JOptionPane.showMessageDialog(null,"Answer: "+resistance+" Ohms.");
					}
				}		
	}
}

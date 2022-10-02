import javax.swing.JOptionPane;

class response{

	double power = 0;
	double voltage = 0;
	double current = 0;
	double resistance = 0; 
	
	   void does(double solvefor,double optionselection,String input)
	   {
		   
 

			if(solvefor == 1)
			{
				if(optionselection == 1)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);
				}
				if(optionselection == 2)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);			
				}
				if(optionselection == 3)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);			
				}
			}
			if(solvefor == 2)
			{
				if(optionselection == 1)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);			
				}
				if(optionselection == 2)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);			
				}
				if(optionselection == 3)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);		
				}
			}
			
			if(solvefor == 3)
			{
				if(optionselection == 1)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);		
				}
				if(optionselection == 2)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);		
				}
				if(optionselection == 3)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for resistance.");	
					resistance = Double.parseDouble(input);		
				}
			}
			if(solvefor == 4)
			{
				if(optionselection == 1)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);		
				}
				if(optionselection == 2)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for power.");	
					power = Double.parseDouble(input);		
				}
				if(optionselection == 3)
				{
					input = JOptionPane.showInputDialog(null,"Enter value for voltage.");	
					voltage = Double.parseDouble(input);
					input = JOptionPane.showInputDialog(null,"Enter value for current.");	
					current = Double.parseDouble(input);		
				}
			}		


	   }
	}
import javax.swing.JOptionPane;

public class Main extends response 
{
	public static void main(String[] args)
	{
		response obj = new response();
		Mathoutput outputobj = new Mathoutput();

		String input = "";
		int solvefor = 0;
		input = JOptionPane.showInputDialog(null, "What unit are you solving for?\nPower,"
				+ " Voltage, Current, Or Resistance?\nType the in variable you are solving for to select.   ");
		

		if(!(input != null && !input.isEmpty()))
			{
			JOptionPane.showMessageDialog(null,"No Imput found!","Input Error",JOptionPane.WARNING_MESSAGE);
			}
		else
			{	
			if(input.equalsIgnoreCase("Power"))
				{
				solvefor = 1;
				}
			if(input.equalsIgnoreCase("Voltage"))
				{
				solvefor = 2;
				}
			if(input.equalsIgnoreCase("Current"))
				{
				solvefor = 3;
				}
			if(input.equalsIgnoreCase("Resistance"))
				{
				solvefor = 4;
				}

			}
		
		//Generate variable selector
		switch(solvefor)
		{
		case 1:
		input = JOptionPane.showInputDialog(null,"[Solving for Power]\nFrom the entries below, "
				+ "choose the option that contains \nthe variables that you currently have. To Select: "
				+ "Type \nthe numeric value of the option to enter a selection. "
				+ "\n\nOption #1: Voltage & Resistance"
				+ "\nOption #2: Resistance & Current"
				+ "\nOption #3: Voltage & Current");	
		break;
		case 2:
		input = JOptionPane.showInputDialog(null,"[Solving for Voltage]\nFrom the entries below, "
				+ "choose the option that contains \nthe variables that you currently have. To Select: "
				+ "Type \nthe numeric value of the option to enter a selection. "
				+ "\n\nOption #1: Resistance & Current"
				+ "\nOption #2: Power & Current"
				+ "\nOption #3: Power & Resistance");			
		break;
		case 3:
		input = JOptionPane.showInputDialog(null,"[Solving for Current]\nFrom the entries below, "
				+ "choose the option that contains \nthe variables that you currently have. To Select: "
				+ "Type \nthe numeric value of the option to enter a selection. "
				+ "\n\nOption #1: Power & Resistance"
				+ "\nOption #2: Power & Voltage"
				+ "\nOption #3: Voltage & Resistance");		
		break;
		case 4:
		input = JOptionPane.showInputDialog(null,"[Solving for Resistance]\nFrom the entries below, "
				+ "choose the option that contains \nthe variables that you currently have. To Select: "
				+ "Type \nthe numeric value of the option to enter a selection. "
				+ "\n\nOption #1: Power & Current"
				+ "\nOption #2: Voltage & Power"
				+ "\nOption #3: Voltage & Current");
		break;
		}
	
		double optionselection = Double.parseDouble(input);
		
		obj.does(solvefor,optionselection,input);
	
		outputobj.createfinaloutput(obj.power,obj.voltage,obj.current,obj.resistance,solvefor,optionselection);
		
	}
}
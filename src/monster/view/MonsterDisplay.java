package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	//creates popup windows to be used when called.
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionToDisplay)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		
		return answer;
	}
	
	
}

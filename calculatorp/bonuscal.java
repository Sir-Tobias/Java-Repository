/////////////////////////////////////////////////////////////////////////////////////////
//
// /                            TOBIAS MBANUSI C18381781
/////////////////////////////////////////////////////////////////////////////////////////
//
//                            TOBIAS MBANUSI C18381781
//                               DT354 YR/2 OOSD 
//                           
//                               TOBY'S CALCULATOR
//
/////////////////////////////////////////////////////////////////////////////////////////
package calculatorp;

import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import net.miginfocom.swing.MigLayout;

public class bonuscal implements ActionListener {
	//Creating the calculator interface
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	MigLayout layout = new MigLayout(); 

	JTextField textfield = new JTextField();
	//Bonus buttons
	JButton buttonMC= new JButton("MC");
	JButton buttonMR= new JButton("MR");
	JButton buttonMS= new JButton("MS");
	JButton buttonMadd= new JButton("M+");
	JButton buttonMsub= new JButton("M-");
	//Bonus button 2
	JButton buttonAddSub= new JButton("+-");
	JButton buttonROOT= new JButton("¹");
	JButton buttonPer= new JButton("%");
	JButton buttonPow= new JButton("^");
	JButton buttonInv= new JButton("1/x");
	
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	JButton buttonAdd = new JButton("+");
	JButton buttonDel = new JButton("<--");
	JButton buttonSub = new JButton("-");
	JButton buttonDiv = new JButton("/");
	JButton buttonMul = new JButton("*");
	JButton buttonClearD = new JButton("C");
	JButton buttonClearC = new JButton("CE");
	JButton buttonDot = new JButton(".");
	JButton buttonEqual = new JButton("=");

	//Declaring the doubles and ints for the value entered in the calculator
	double num=0, num2=0;
	double result=0;
	String calculations="";
	double display_total, new_value, mem_value;



	//Creating the size of the Calculator frame
	public bonuscal(){
		frame.setSize(355,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Toby's Bonus Calculator");
		frame.add(panel);

		panel.setLayout(new MigLayout());
		MigLayout layout = new MigLayout(
				"", "[]20[]20[]20[]","[][]");


		//Creating the color for the background
		panel.setBackground(Color.BLACK);
		Border border = BorderFactory.createLineBorder(Color.ORANGE,4);
		panel.setBorder(border);

		//Creating the text field to add to the MiG Layout panel
		panel.add(textfield,"wrap , span ,growx");
		textfield.setBackground(Color.DARK_GRAY);
		//setting text field to not editable
		textfield.setEditable(false);
		//coloring the outer border
		Border tborder = BorderFactory.createLineBorder(Color.ORANGE,3);
		textfield.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,20);
		textfield.setFont(font);
		textfield.setForeground(Color.WHITE);


		//Adding the buttons to the MiG Layout
		//BONUS BUTTONS ROW1
		panel.add(buttonMC);
		panel.add(buttonMR);
		panel.add(buttonMS);
		panel.add(buttonMadd);
		panel.add(buttonMsub, "wrap");
		
		//ROW2
		panel.add(buttonDel);
		//Button CE
		panel.add(buttonClearC);
		//Button C
		panel.add(buttonClearD);
		//Button Add
		panel.add(buttonAddSub);
		//Button root
		panel.add(buttonROOT, "wrap");
		
		//ROW 2 Numbers
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDiv);
		panel.add(buttonPer,"wrap");
		//ROW 3 Numbers
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMul);
		panel.add(buttonPow, "wrap");
		//Row 4 Numbers
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonSub);
		panel.add(buttonInv,"wrap");
		//Spanning Button 0
		panel.add(button0, "span 2 3,growx");
		panel.add(buttonDot);
		panel.add(buttonAdd);
		panel.add(buttonEqual);

		//Adding the action listener to each button
		//Numbers
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		//Actions
		buttonAdd.addActionListener(this);
		buttonDel.addActionListener(this);
		buttonClearC.addActionListener(this);
		buttonClearD.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonEqual.addActionListener(this);
		
		//Bonus Question button2 
		buttonMC.addActionListener(this);
		buttonMR.addActionListener(this);
		buttonMS.addActionListener(this);
		buttonMadd.addActionListener(this);
		buttonMsub.addActionListener(this);
		//Bonus Question
	    buttonAddSub.addActionListener(this);
	    buttonROOT.addActionListener(this);
	    buttonPer.addActionListener(this);
	    buttonPow.addActionListener(this);
	    buttonInv.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		/*
		 * the set text and get text allows more than one number to be displayed on the
		 * text field at once without replacing the value
		 */
		if(e.getSource() == button1){
			textfield.setText(textfield.getText()+"1");
		}

		if(e.getSource() == button2){
			textfield.setText(textfield.getText()+"2");
		}
		if(e.getSource() == button3){
			textfield.setText(textfield.getText()+"3");
		}

		if(e.getSource() == button4){
			textfield.setText(textfield.getText()+"4");
		}
		if(e.getSource() == button5){
			textfield.setText(textfield.getText()+"5");
		}

		if(e.getSource() == button6){
			textfield.setText(textfield.getText()+"6");
		}
		if(e.getSource() == button7){
			textfield.setText(textfield.getText()+"7");
		}

		if(e.getSource() == button8){
			textfield.setText(textfield.getText()+"8");
		}
		if(e.getSource() == button9){
			textfield.setText(textfield.getText()+"9");
		}

		if(e.getSource() == button0){
			textfield.setText(textfield.getText()+"0");
		}

		if(e.getSource() == buttonDot){
			textfield.setText(textfield.getText()+".");
		}

		//Creating the Add method
		if(e.getSource() == buttonAdd){
			num = Double.parseDouble(textfield.getText());
			calculations= "+";
			textfield.setText("");			
		}

		if(e.getSource() == buttonSub){
			num = Double.parseDouble(textfield.getText());
			calculations="-";
			textfield.setText("");
		}

		//Creating the Multiplying method
		if(e.getSource() == buttonMul){
			num = Double.parseDouble(textfield.getText());
			calculations="*";
			textfield.setText("");
		}

		if(e.getSource() == buttonDiv){
			num = Double.parseDouble(textfield.getText());
			calculations="/";
			textfield.setText("");
			
		}

		if(e.getSource() == buttonAddSub){
			num = Double.parseDouble(textfield.getText())*-1;
			calculations="+-";
			textfield.setText(String.valueOf(num));
			
		}

		if(e.getSource() == buttonROOT){
			num = Double.parseDouble(textfield.getText());
			if(num>0)
			Math.sqrt(num);
			calculations="¹";
			textfield.setText(String.valueOf(Math.sqrt(num)));
			}
		
		if(e.getSource() == buttonPer){
			num = Double.parseDouble(textfield.getText());
			calculations="%";
			textfield.setText("");
			
		}

		if(e.getSource() == buttonPow){
			num = Double.parseDouble(textfield.getText());
			calculations="^";
			textfield.setText("");
			
		}

		if(e.getSource() == buttonInv){
			num = Double.parseDouble(textfield.getText());
			if(num == 0)
			{
				textfield.setText("Sorry number cannot be 0");
			}
			else {
			double c1= 1/num;
			num = c1;
			calculations="1/x";
			textfield.setText(String.valueOf(num));
			}
		}
		//M FUNCTIONS

		if(e.getSource() == buttonMC) {
			num = 0;
			num2 = 0;
			result = (num+num2);
			textfield.setText(String.valueOf(result));
		}
		//MEMORY SAVE
		if(e.getSource() == buttonMS) {
			num = num2;
			result= num;
			textfield.setText(String.valueOf(result));
		}
		//MEMORY RETRIEVE VALUE
		if(e.getSource() == buttonMR) {
			num2=num;
			result=num2;
			textfield.setText(String.valueOf(result));
		}
		
		//MEMORY ADD VALUE
		if(e.getSource() == buttonMadd) {
			num2= num2+num;
			textfield.setText(String.valueOf(num2));
		}
		
		//MEMORY REMOVE VALUE
				if(e.getSource() == buttonMadd) {
					num2= num2-num;
					textfield.setText(String.valueOf(num2));
				}

		//EQUALS FUNCTIONS CARRIED OUT BY THE CALCULATOR
		if(e.getSource() == buttonEqual){
			//textfield.setText("= ");

			num2 = Double.parseDouble(textfield.getText());

			//	    	case 1://Addition
			if(calculations == "+")
			{
				result = num + num2;
				textfield.setText(Double.toHexString(result));
				System.out.println("inside summation------");
				

			}

			//	        case 2://Subtraction
			else if(calculations == "-")
			{

				result = (num-num2);
				textfield.setText(Double.toHexString(result));
			}

			//	        case 3://Multiplication
			else if(calculations == "*")
			{
				result = num*num2;
				textfield.setText(Double.toHexString(result));
			}

			//	        case 4://Division
			else if(calculations == "/")
			{
				result = num/num2;
				textfield.setText(Double.toHexString(result));
			}
			//        case 5:// Add Sub
			else if(calculations == "+-") 
			{
				//function is carried out in the add sub button when it is clicked
				result = (num+num2);
				textfield.setText(Double.toHexString(result));
			}
			
			//function is carried out in the add sub button when it is clicked
			else if(calculations == "¹")
			{
				Math.sqrt(num);
				textfield.setText(Double.toHexString(result));
			}
			//Function to calculate to the power of something
			else if(calculations == "^")
			{
				double base = num;
				double exponent =num2;
				result = Math.pow(base, exponent);
				textfield.setText(Double.toHexString(result));
			}
			/*This function works by entering your first value pressing % then typing the 
			 * percentage value you are trying to find
			 */
			else if(calculations == "%")
			{
                double v1= num;
                double v2= num2/100;
                double v3 = v1*v2;
				result =(num+ v3);
				textfield.setText(Double.toHexString(result));
			}
			//Function is carried out in the Inverse button
		    // Enter a value and click the inv button to give you your answer
			else if(calculations == "1/x")
			{
				double c1= num/1;
				double c2= num2/1;
				
				result =(num);
				textfield.setText(Double.toHexString(result));
			}

			textfield.setText(""+result);

		}

		int length = textfield.getText().length();
		int number = textfield.getText().length() -1;
		String store;
		//Delete Method
		if (source== buttonDel && number>=0){
			//(source== buttonDel)
			StringBuilder back=new StringBuilder(textfield.getText());
			back.deleteCharAt(number);
			store=back.toString();
			textfield.setText(store);
		}

		if(e.getSource() == buttonClearC){
			textfield.setText("");
		}

		if(e.getSource() == buttonClearD){
			textfield.setText(null);
		}



	}
	private void showStatus(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[])
	{
		new bonuscal();
	}
}
	
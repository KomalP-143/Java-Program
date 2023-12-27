package komal.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Calculator1 extends JFrame implements ActionListener {
	

	
	private static final long serialVersionUID = 6994304296162389317L;
    static JFrame frame;
    static JTextField textfield;
    String first,second, operator;
    
    Calculator1(){
    	first = second = operator = "";
    }
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		frame = new JFrame("cal");
		UIManager.setLookAndFeel(UIManager.getLookAndFeel());
		Calculator1 calculator = new Calculator1();
		textfield = new JTextField(16);
		textfield.setEditable(false);
		
		JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnDiv,btnMul,btnDot,btnClr,btnEq;
		 btn0 = new JButton("0");
		 btn1 = new JButton("1");
		 btn2 = new JButton("2");
		 btn3 = new JButton("3");
		 btn4 = new JButton("4");
		 btn5 = new JButton("5");
		 btn6 = new JButton("6");
		 btn7 = new JButton("7");
		 btn8 = new JButton("8");
		 btn9 = new JButton("9");
		 
		 btnEq = new JButton("=");
		 
		 btnAdd = new JButton("+");
		 btnSub = new JButton("-");
		 btnMul = new JButton("*");
		 btnDiv = new JButton("/");
		 btnClr = new JButton("C");
		 btnDot = new JButton(".");
		 
		 
		 btnMul.addActionListener(calculator);
		 btnAdd.addActionListener(calculator);
		 btnSub.addActionListener(calculator);
		 btnMul.addActionListener(calculator);
		 btnDiv.addActionListener(calculator);
		 btnClr.addActionListener(calculator);
		 btnDot.addActionListener(calculator);
		 btn0.addActionListener(calculator); 
		 btn1.addActionListener(calculator); 
		 btn2.addActionListener(calculator); 
		 btn3.addActionListener(calculator); 
		 btn4.addActionListener(calculator); 
		 btn5.addActionListener(calculator); 
		 btn6.addActionListener(calculator); 
		 btn7.addActionListener(calculator);  
		 btn8.addActionListener(calculator);  
		 btn9.addActionListener(calculator);  
		 btnEq.addActionListener(calculator);
		 
		 JPanel panel = new JPanel();
		 panel.add(textfield);
		 panel.add(btnEq);
		 panel.add(btnClr);
		 panel.add(btnDot);
		 panel.add(btnMul);
		 panel.add(btnDiv);
		 panel.add(btnSub);
		 panel.add(btnAdd);
		 panel.add(btn9);
		 panel.add(btn8);
		 panel.add(btn7);
		 panel.add(btn6);
		 panel.add(btn5);
		 panel.add(btn5);
		 panel.add(btn3);
	     panel.add(btn2);
	     panel.add(btn1);
	     panel.add(btn0);
	     
	     
	     panel.setBackground(Color.BLUE);
	     
	     frame.add(panel);
	     frame.setSize(200, 220);
	     frame.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action= e.getActionCommand();
		// if the value is number
	if((action.charAt(0) >=  '0' && action.charAt(0) <= '9') || action.charAt(0) == '.') {
		if(action.equals(".") && first.contains(" . ")) {
			// no action
		}
		else if(!operator.equals(""))
		  second = second + action;
		else
			first = first + action;
		textfield.setText(first + operator + second);
	}else if(action.charAt(0) == 'C') {
		operator = second = "";
		first = "0";
		textfield.setText(first + operator + second);
	}else if(action.charAt(0) == '=' && !first.equalsIgnoreCase("") && !second.equalsIgnoreCase("")) {
		double result;
		if(operator.equals("+"))
			result = (Double.parseDouble(first)+ Double.parseDouble(second));
		else if(operator.equals("-"))
			result = (Double.parseDouble(first)- Double.parseDouble(second));
		else if(operator.equals("/"))
			result = (Double.parseDouble(first)/ Double.parseDouble(second));
		else 
			result = (Double.parseDouble(first)* Double.parseDouble(second));
		
		textfield.setText(first + operator + second + "=" +result);
		first = Double.toString(result);
		operator = second = "";
	}
	if(first.equals("")) {
		first = operator = second = "";
	}else if(second.equals("") && operator.equals("=")) {
		operator = "";
	}
	textfield.setText(first + operator + second);
	
	}

}

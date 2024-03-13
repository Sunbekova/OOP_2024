/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculator;


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
/**
 *
 * @author suanb
 */
public class Calculator implements ActionListener{
    
    
    //implimenting main things in calculator
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equalButton, delButton, clearButton, negativeNumButton;
    JPanel panel;
    
    //font
    Font myFont = new Font("Arial", Font.BOLD, 30);
    
    
    //declaration our variable that will be take part in the function
    double num1 = 0, num2=0,  result=0;
    char operator;
    
    
    //making..
    Calculator(){
        //making frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        //text field as a main window of workspace
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        
        //can't use keyboard for using calculator
        textField.setEditable(false);
        
        //how will lok buttons in a frame
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        negativeNumButton = new JButton("+/-");
        
        
        functionButtons = new JButton[]
        {addButton, subButton, mulButton, divButton, decButton, equalButton, 
            delButton, clearButton, negativeNumButton};
        
        for(int i=0; i<9; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(true);
        }
        
        for(int i=0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        
        
        negativeNumButton.setBounds(50, 430, 80, 50);
        delButton.setBounds(130, 430, 125, 50);
        clearButton.setBounds(250, 430, 110, 50);
        
        
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
    
        
        
        frame.add(panel);
        frame.add(delButton);
        frame.add(clearButton);
        frame.add(negativeNumButton);
        
       
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(divButton);
        panel.add(equalButton);
       
        
        
        frame.add(textField);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
        //printing numbers in text field
        for(int i=0; i<10; i++){
            if(event.getSource()== numberButtons[i]){
                textField.setText(textField.getText()
                .concat(String.valueOf(i)));
            }
        }
        
        //printing num with dot (ex 3.14)
        if(event.getSource()==decButton){
            textField.setText(textField.getText()
                .concat("."));
        }
        
        //print in a text field num and taking operators
        
        
        if(event.getSource()==addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        
        if(event.getSource()==subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        
        if(event.getSource()==mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(event.getSource()==divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        
        
        //emplimenting the code procedur
        if(event.getSource()==equalButton){
            
            //getting second num
            num2 = Double.parseDouble(textField.getText());
           
            //emplimenting main functions
            switch(operator){
                case'+':
                    result = num1+num2;
                    break;
                    
                case'-':
                    result = num1-num2;
                    break;
                    
                case'*':
                    result = num1*num2;
                    break;
                    
                case'/':
                    result = num1/num2;
                    break;
            }
            
            textField.setText(String.valueOf(result));
            num1=result;
        }
        
        
        //write function of clear
        if(event.getSource()==clearButton){
            textField.setText("");
        }
        
        if(event.getSource()==delButton){
            String string = textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1; i++){
             textField.setText(textField.getText() + string.charAt(i));   
            }
        }
        
        
        if(event.getSource()==negativeNumButton){
            double temp = Double.parseDouble(textField.getText());
            temp*=(-1);
            textField.setText(String.valueOf(temp));
        }
        
    }
    
    
}

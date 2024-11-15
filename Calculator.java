import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
  JFrame jf;
  JLabel displayLabel;
  JButton sevenButton;
  JButton eightButton;
  JButton nineButton;
  JButton fourButton;
  JButton fiveButton;
  JButton sixButton;
  JButton oneButton;
  JButton twoButton;
  JButton threeButton;
  JButton dotButton;
  JButton zeroButton;
  JButton plusButton;
  JButton divideButton;
  JButton multiplyButton;
  JButton substractButton;
  JButton equaltoButton;
  JButton clearButton;
  String oldValue,oldValueMul;
  int clickMul;

  boolean isOperatorClicked=false;



  public Calculator(){

    jf = new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600,600);
    jf.setLocation(200, 150);

    displayLabel = new JLabel("");
    displayLabel.setBounds(20, 50, 480, 50);
    displayLabel.setBackground(Color.black);
    displayLabel.setOpaque(true);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.white);
    displayLabel.setFont(new Font("Bold", Font.PLAIN, 20));
    jf.add(displayLabel);

    sevenButton= new JButton("7");
    sevenButton.setBounds(20, 130, 80, 80);
    jf.add(sevenButton);
    sevenButton.setFont(new Font("Bold", Font.PLAIN, 40));
    sevenButton.addActionListener(this);

    eightButton= new JButton("8");
    eightButton.setBounds(120, 130, 80, 80);
    jf.add(eightButton);
    eightButton.setFont(new Font("Bold", Font.PLAIN, 40));
    eightButton.addActionListener(this);

    nineButton= new JButton("9");
    nineButton.setBounds(220, 130, 80, 80);
    nineButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(nineButton);
    nineButton.addActionListener(this);

    fourButton= new JButton("4");
    fourButton.setBounds(20, 230, 80, 80);
    fourButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(fourButton);
    fourButton.addActionListener(this);

    fiveButton= new JButton("5");
    fiveButton.setBounds(120, 230, 80, 80);
    fiveButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(fiveButton);
    fiveButton.addActionListener(this);

    sixButton= new JButton("6");
    sixButton.setBounds(220, 230, 80, 80);
    sixButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(sixButton);
    sixButton.addActionListener(this);

    oneButton= new JButton("1");
    oneButton.setBounds(20, 330, 80, 80);
    oneButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(oneButton);
    oneButton.addActionListener(this);

    twoButton= new JButton("2");
    twoButton.setBounds(120, 330, 80, 80);
    twoButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(twoButton);
    twoButton.addActionListener(this);

    threeButton= new JButton("3");
    threeButton.setBounds(220, 330, 80, 80);
    threeButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(threeButton);
    threeButton.addActionListener(this);


    dotButton= new JButton(".");
    dotButton.setBounds(20, 430, 80, 80);
    dotButton.setFont(new Font("Bold", Font.PLAIN, 30));
    jf.add(dotButton);
    dotButton.addActionListener(this);
    

    zeroButton= new JButton("0");
    zeroButton.setBounds(120, 430, 80, 80);
    zeroButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(zeroButton);
    zeroButton.addActionListener(this);

    plusButton= new JButton("+");
    plusButton.setBounds(220, 430, 80, 80);
    plusButton.setFont(new Font("Bold", Font.PLAIN, 30));
    jf.add(plusButton);
    plusButton.addActionListener(this);
    

    divideButton= new JButton("/");
    divideButton.setBounds(320, 130, 80, 80);
    divideButton.setFont(new Font("Bold", Font.PLAIN, 30));
    jf.add(divideButton);
    divideButton.addActionListener(this);


    equaltoButton= new JButton("=");
    equaltoButton.setBounds(420, 130, 80, 380);
    equaltoButton.setFont(new Font("Bold", Font.PLAIN, 40));
    jf.add(equaltoButton);
    equaltoButton.setBackground(Color.blue);
    equaltoButton.setForeground(Color.white);
    equaltoButton.addActionListener(this);
    




    


    multiplyButton= new JButton("x");
    multiplyButton.setBounds(320, 230, 80, 80);
    multiplyButton.setFont(new Font("Bold", Font.PLAIN, 30));
    jf.add(multiplyButton);
    multiplyButton.addActionListener(this);

    substractButton= new JButton("-");
    substractButton.setBounds(320, 330, 80, 80);
    substractButton.setFont(new Font("Bold", Font.PLAIN, 30));
    jf.add(substractButton);
    substractButton.addActionListener(this);

    clearButton= new JButton("C");
    clearButton.setBounds(320, 430, 80, 80);
    clearButton.setFont(new Font("Bold", Font.PLAIN, 40));
    clearButton.setBackground(Color.blue);
    clearButton.setForeground(Color.white);
    jf.add(clearButton);
    clearButton.addActionListener(this);










    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
     new Calculator();            //object created for constructor

  }
  @Override
  public void actionPerformed(ActionEvent e) {
   if(e.getSource()==sevenButton){

      if(isOperatorClicked){
         displayLabel.setText( "7");
         isOperatorClicked=false;

      }else{
        displayLabel.setText(displayLabel.getText() + "7");

      }
   }
   else if(e.getSource()==eightButton){
      if(isOperatorClicked){
      displayLabel.setText( "8");
      isOperatorClicked=false;

      }else{
       displayLabel.setText(displayLabel.getText() + "8");
       }
   }
   else if(e.getSource()==nineButton){
       if(isOperatorClicked){
         displayLabel.setText( "9");
         isOperatorClicked=false;

       }else{
         displayLabel.setText(displayLabel.getText() + "9");
      }
   }
   else if(e.getSource()==fourButton){
    if(isOperatorClicked){
      displayLabel.setText( "4");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "4");

   }
}
   else if(e.getSource()==fiveButton){
    if(isOperatorClicked){
      displayLabel.setText( "5");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "5");

   }
}
   else if(e.getSource()==sixButton){
    if(isOperatorClicked){
      displayLabel.setText( "6");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "6");

   }
}
   else if(e.getSource()==oneButton){
    if(isOperatorClicked){
      displayLabel.setText( "1");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "1");

   }
}
   else if(e.getSource()==twoButton){
    if(isOperatorClicked){
      displayLabel.setText( "2");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "2");

   }
}
   else if(e.getSource()==threeButton){
    if(isOperatorClicked){
      displayLabel.setText( "3");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "3");

   }
}
   else if(e.getSource()==zeroButton){
    if(isOperatorClicked){
      displayLabel.setText( "0");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + "0");

   }
}
   else if (e.getSource()==dotButton){
    if(isOperatorClicked){
      displayLabel.setText( ".");
      isOperatorClicked=false;

   }else{
     displayLabel.setText(displayLabel.getText() + ".");

   }
}
   else if(e.getSource()==clearButton){
    displayLabel.setText("");
   }
  
   else if (e.getSource()==plusButton){
    isOperatorClicked=true;
    oldValue=displayLabel.getText();
    clickMul=0;
    


   }

   else if (e.getSource()==multiplyButton){
    isOperatorClicked=true;
    oldValue=displayLabel.getText();
    clickMul=1;
   }

   else if (e.getSource()==substractButton){
    isOperatorClicked=true;
    oldValue=displayLabel.getText();
    clickMul=2;
   }

   else if (e.getSource()==divideButton){
    isOperatorClicked=true;
    oldValue=displayLabel.getText();
    clickMul=3;
   }

   else if (e.getSource()==equaltoButton){
      String newValue=displayLabel.getText();
      float oldValue1=Float.parseFloat(oldValue);
      float newValue1=Float.parseFloat(newValue);


    if(clickMul==0){
      float sumResult=oldValue1+newValue1;
      displayLabel.setText(sumResult+"");
 
    }
    else if(clickMul==1) {
      float sumResult=oldValue1*newValue1;
      displayLabel.setText(sumResult+"");
    }
    else if(clickMul==2){
      float sumResult=oldValue1-newValue1;
      displayLabel.setText(sumResult+"");
    }
    else if(clickMul==3){
      float sumResult=oldValue1/newValue1;
      displayLabel.setText(sumResult+"");
    }

   }
   

}

}

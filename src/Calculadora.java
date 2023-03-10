import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame implements ActionListener {
    JFrame window; //Ventana principal
    //creando variables para la calculadora
    double numero;
    double respuesta;
    int calculo;

    //creando los componentes de la ventana
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");


    Calculadora(){
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI(){
        window = new JFrame();
        window.setTitle("Calculadora");
        window.setSize(300, 490);
        window.getContentPane().setLayout(null);
        window.getContentPane().setBackground(Color.black);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void addComponents(){
        //propiedades de label
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        window.add(label);

        //estableciendo propiedades del campo de texto
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        window.add(textField);

        //estableciendo propiedades de bot??n on
        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        window.add(onRadioButton);

        //estableciendo propiedades para el bot??n off
        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        window.add(offRadioButton);

        //Creating an object of button group and adding both the radio buttons to that button group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        //estableciendo propiedades de los botones
        // bot??n 1
        buttonOne.setBounds(10,350,60,40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonOne);

        //bot??n 2
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonTwo);

        //bot??n 3
        buttonThree.setBounds(150,350,60,40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonThree);

        //bot??n 4
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonFour);

        //bot??n 5
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonFive);

        //bot??n 6
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonSix);

        //bot??n 7
        buttonSeven.setBounds(10,230,60,40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonSeven);

        //bot??n 8
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonEight);

        //bot??n 9
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonNine);

        //bot??n .
        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonDot);

        //bot??n 0
        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonZero);

        //bot??n =
        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239,188,2));
        window.add(buttonEqual);

        //bot??n /
        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        window.add(buttonDiv);

        //bot??n square root
        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonSqrt);

        //bot??n x
        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        window.add(buttonMul);

        //bot??n -
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        window.add(buttonMinus);

        //bot??n +
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        window.add(buttonPlus);

        //bot??n square
        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonSquare);

        //bot??n reciprocal
        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(buttonReciprocal);

        //bot??n delete
        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDelete.setBackground(Color.RED);
        buttonDelete.setForeground(Color.WHITE);
        window.add(buttonDelete);

        //bot??n clear
        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClear.setBackground(Color.RED);
        buttonClear.setForeground(Color.WHITE);
        window.add(buttonClear);


    }

    public void addActionEvent(){
        //Registrando ActionListener a los botones
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
    }
    //Override actionPerformed()
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source == onRadioButton){
            enable(); //llamando a la funci??n enable()
        }
        else if(source == offRadioButton){
            disable(); //llamando a la funci??n disable()
        }
        else if(source == buttonClear){
            //limpiando textos de etiquetas y campos de texto
            label.setText("");
            textField.setText("");
        }
        else if(source == buttonDelete){
            //Estableciendo funcionalidad para el bot??n delete
            int length = textField.getText().length();
            int number = length - 1;

            if(length > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith("")){
                label.setText("");
            }
        }
        else if(source == buttonZero){
            if(textField.getText().equals("0")){
                return;
            }
            else{
                textField.setText(textField.getText() + "0");
            }
        }
        else if(source == buttonOne){
            textField.setText(textField.getText() + "1");
        }
        else if(source == buttonTwo){
            textField.setText(textField.getText() + "2");
        }
        else if(source == buttonThree){
            textField.setText(textField.getText() + "3");
        }
        else if(source == buttonFour){
            textField.setText(textField.getText() + "4");
        }
        else if(source == buttonFive){
            textField.setText(textField.getText() + "5");
        }
        else if(source == buttonSix){
            textField.setText(textField.getText() + "6");
        }
        else if(source == buttonSeven){
            textField.setText(textField.getText() + "7");
        }
        else if(source == buttonEight){
            textField.setText(textField.getText() + "8");
        }
        else if(source == buttonNine){
            textField.setText(textField.getText() + "9");
        }
        else if(source == buttonDot){
            //bot??n de coma o punto
            if(textField.getText().contains(".")){
                return;
            }
            else{
                textField.setText(textField.getText() + ".");
            }
        }
        else if(source == buttonPlus){
            //bot??n de suma
            String str = textField.getText();
            numero = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculo = 1;
        }
        else if(source == buttonMinus){
            //bot??n de resta
            String str = textField.getText();
            numero = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculo = 2;
        }
        else if(source == buttonMul){
            //bot??n de multiplicaci??n
            String str = textField.getText();
            numero = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculo = 3;
        }
        else if(source == buttonDiv){
            //bot??n de division
            String str = textField.getText();
            numero = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculo = 4;
        }
        else if(source == buttonSqrt){
            //bot??n raiz cuadrada
            numero = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(numero);
            textField.setText(Double.toString(sqrt));
        }
        else if(source == buttonSquare){
            //bot??n de potencia cuadrada
            String str = textField.getText();
            numero = Double.parseDouble(textField.getText());
            double square = Math.pow(numero, 2);
            String texto = Double.toString(square);
            if(texto.endsWith(".0")){
                textField.setText(texto.replace(".0", ""));
            }
            else{
                textField.setText(texto);
            }
            label.setText("(sqrt)" + str);
        }
        else if(source == buttonReciprocal){
            //bot??n reciproco
            numero = Double.parseDouble(textField.getText());
            double reciproco = 1 / numero;
            String texto = Double.toString(reciproco);
            if(texto.endsWith(".0")){
                textField.setText(texto.replace(".0", ""));
            }
            else{
                textField.setText(texto);
            }
        }
        else if(source == buttonEqual){
            //Estableciendo funcionalidad para el bot??n igual (=)
            switch(calculo){
                case 1:
                    respuesta = numero + Double.parseDouble(textField.getText());
                    if(Double.toString(respuesta).endsWith(".0")){
                        textField.setText(Double.toString(respuesta).replace(".0", ""));
                    }
                    else{
                        textField.setText(Double.toString(respuesta));
                    }
                    label.setText("");
                    break;
                case 2:
                    respuesta = numero - Double.parseDouble(textField.getText());
                    if(Double.toString(respuesta).endsWith(".0")){
                        textField.setText(Double.toString(respuesta).replace(".0", ""));
                    }
                    else{
                        textField.setText(Double.toString(respuesta));
                    }
                    label.setText("");
                    break;
                case 3:
                    respuesta = numero * Double.parseDouble(textField.getText());
                    if(Double.toString(respuesta).endsWith(".0")){
                        textField.setText(Double.toString(respuesta).replace(".0", ""));
                    }
                    else{
                        textField.setText(Double.toString(respuesta));
                    }
                    label.setText("");
                    break;
                case 4:
                    respuesta = numero / Double.parseDouble(textField.getText());
                    if(Double.toString(respuesta).endsWith(".0")){
                        textField.setText(Double.toString(respuesta).replace(".0", ""));
                    }
                    else{
                        textField.setText(Double.toString(respuesta));
                    }
                    label.setText("");
                    break;
            }

        }

    }

    public void enabled(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
    }

    public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
    }
}

















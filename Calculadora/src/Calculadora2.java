import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora2 extends JFrame{
	 JTextField texto1;
	 JButton botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botao10,botao11,botao12,botao13,botao14,botao15,botao16,botao17,botao18; double num1,num2,res; int operacao;
	   public Calculadora2() {
	       super ("Calculadora");
	        Container tela = getContentPane();
	    setLayout(null);
	   
	    texto1 = new JTextField(10);
	    botao1 = new JButton ("1");
	    botao1.addActionListener(
		new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                String textoatual= new String(texto1.getText());
	                texto1.setText(textoatual+"1");
	            }
	        }
	    );
	           
		
	    botao2 = new JButton ("2");
		botao2.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"2");
			}
		}
		);
	    botao3 = new JButton ("3");
		botao3.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"3");
			}
		}
		);
	    botao4 = new JButton ("+");
		botao4.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		 num1= Double.parseDouble(texto1.getText());
		 operacao = 1;
		texto1.setText("");
			}
	        }
		);
	    botao5 = new JButton ("4");
		botao5.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"4");
			}
		}
		);
	    botao6 = new JButton ("5");
		botao6.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"5");
			}
		}
		);
	    botao7 = new JButton ("6");
		botao7.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"6");
			}
		}
		);
	    botao8 = new JButton ("-");
		botao8.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		 num1= Double.parseDouble(texto1.getText());
		 operacao = 2;
		texto1.setText("");
			}
		}
		);
	    botao9 = new JButton ("7");
		botao9.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"7");
			}
		}
		);
	    botao10 = new JButton ("8");
		botao10.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"8");
			}
		}
		);
	    botao11 = new JButton ("9");
		botao11.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"9");
			}
		}
		);
	    botao12 = new JButton ("*");
		botao12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		 num1= Double.parseDouble(texto1.getText());
		 operacao = 3;
		texto1.setText("");
			}
		}
		);
	    botao13 = new JButton ("0");
		botao13.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+"0");
			}
		}
		);
	    botao14 = new JButton ("=");
			botao14.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		 num2= Double.parseDouble(texto1.getText());
		if(operacao == 1){
			res = num1 + num2;
		}else if (operacao == 2){
			res = num1 - num2;
		}else if (operacao == 3) {
			res = num1 * num2;
		}else {
			res = num1 / num2;
		}
		texto1.setText(""+res);
		
			}
		}
		);
	    botao15 = new JButton (".");
		botao15.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		String textoatual= new String(texto1.getText());
		texto1.setText(textoatual+".");
			}
		}
		);
	    botao16 = new JButton ("/");
		botao16.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		 num1= Double.parseDouble(texto1.getText());
		 operacao = 4;
		texto1.setText("");
			}
		}
		);
	    botao17 = new JButton ("Limpar");
		botao17.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
		texto1.setText("");
			}
		}
		);
	    botao18 = new JButton ("Sair");
	    botao18.addActionListener(
	    		new ActionListener(){
	    			public void actionPerformed(ActionEvent e){
	    		System.exit(0);
	    			}
	    		}
	    		);
	    
	    texto1.setBounds(70,40,200,20);
	    botao1.setBounds(70,70,50,20);
	    botao2.setBounds(120,70,50,20);
	    botao3.setBounds(170,70,50,20);
	    botao4.setBounds(220,70,50,20);
	    botao5.setBounds(70,100,50,20);
	    botao6.setBounds(120,100,50,20);
	    botao7.setBounds(170,100,50,20);
	    botao8.setBounds(220,100,50,20);
	    botao9.setBounds(70,130,50,20);
	    botao10.setBounds(120,130,50,20);
	    botao11.setBounds(170,130,50,20);
	    botao12.setBounds(220,130,50,20);
	    botao13.setBounds(70,160,50,20);
	    botao14.setBounds(120,160,50,20);
	    botao15.setBounds(170,160,50,20);
	    botao16.setBounds(220,160,50,20);
	    botao17.setBounds(70,190,100,20);
	    botao18.setBounds(170,190,100,20);
	   
	    tela.add(texto1);
	    tela.add(botao1);
	    tela.add(botao2);
	     tela.add(botao3);
	    tela.add(botao4);
	     tela.add(botao5);
	    tela.add(botao6);
	     tela.add(botao7);
	    tela.add(botao8);
	     tela.add(botao9);
	    tela.add(botao10);
	     tela.add(botao11);
	    tela.add(botao12);
	     tela.add(botao13);
	    tela.add(botao14);
	     tela.add(botao15);
	    tela.add(botao16);
	     tela.add(botao17);
	    tela.add(botao18);
	     setSize(400, 350);
	      setVisible(true);
	   }

	public static void main(String[] args) {
		  Calculadora2 app = new Calculadora2();
	      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

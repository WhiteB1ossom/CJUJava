import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	
	//계산기 구성요소
	String[] Btn = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="
			};
	
	JButton[] b = new JButton[Btn.length];
	int index = 0; //향상된 for문에서 쓰일 b의 인덱스
	
	JPanel p1, p2; // 계산기 담는 판넬
	JTextField Tf; //계산 값이 보이는 TextField
	
	//화면에 보일 클래스
	Calculator() {
	setTitle("계산기");
	setSize(520,250);
	
	p1 = new JPanel(new BorderLayout()); //텍스트필드가 담길 판넬
	p2 = new JPanel(new GridLayout(5,5,2,2)); //계산기 버튼이 담길 판넬
	
	Tf = new JTextField("0.");
	Tf.setHorizontalAlignment(JTextField.LEFT);
	Tf.setEnabled(false);
	
	p1.add(Tf, BorderLayout.CENTER);
	
	for(String text : Btn) {
		b[index] = new JButton(text);
		b[index].setBackground(Color.yellow);
		p2.add(b[index]);
		
		if(index % 5 <= 2) {
			b[index].setForeground(Color.blue);
		}
		else {
			b[index].setForeground(Color.red);
		}
		index++;
	}
	
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.CENTER);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}

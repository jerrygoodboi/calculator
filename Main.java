import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main{
	public Main(){
		JFrame jf = new JFrame();
		JLabel lab = new JLabel();
		lab.setBounds(0,0,300,100);
		JButton seven = new JButton("7");
		seven.setBounds(0,100,100,100);
		jf.add(seven);
		JButton eight = new JButton("8");
		eight.setBounds(100,100,100,100);
		jf.add(eight);
		JButton nine = new JButton("9");
		nine.setBounds(200,100,100,100);
		jf.add(nine);
		JButton six = new JButton("6");
		six.setBounds(0,200,100,100);
		jf.add(six);
		JButton five = new JButton("5");
		five.setBounds(100,200,100,100);
		jf.add(five);
		JButton four = new JButton("4");
		four.setBounds(200,200,100,100);
		jf.add(four);
		JButton three = new JButton("3");
		three.setBounds(0,300,100,100);
		jf.add(three);
		JButton two = new JButton("2");
		two.setBounds(100,300,100,100);
		jf.add(two);
		JButton one = new JButton("1");
		one.setBounds(200,300,100,100);
		JButton zero = new JButton("0");
		zero.setBounds(100,400,100,100);
		jf.add(zero);
		JButton dot = new JButton(".");
		dot.setBounds(0,400,100,100);
		jf.add(dot);
		seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"7");
			}
		});
		eight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"8");
			}
		});
		nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"9");
			}
		});
		four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"4");
			}
		});
		five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"5");
			}
		});
		six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"6");
			}
		});
		three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"3");
			}
		});
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"2");
			}
		});
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"1");
			}
		});
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+"0");
			}
		});
		dot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText(lab.getText()+".");
			}
		});
		JButton plus = new JButton("+");
		plus.setBounds(300,100,100,100);
		jf.add(plus);
		JButton sub = new JButton("-");
		sub.setBounds(300,200,100,100);
		jf.add(sub);
		JButton mul = new JButton("*");
		mul.setBounds(300,300,100,100);
		jf.add(mul);
		JButton div = new JButton("/");
		div.setBounds(300,400,100,100);
		jf.add(div);
		JButton eq = new JButton("=");
		eq.setBounds(200,400,100,100);
		jf.add(eq);
		JButton clear = new JButton("C");
		clear.setBounds(300,0,100,100);
		jf.add(clear);
		final stuck res = new stuck(0);
		final choi choice = new choi();
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText("");
				res.value = 0;
			}
		});
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				res.value += Integer.valueOf(lab.getText());	
				lab.setText("");
				choice.value = 0;
			};
		});
		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				res.value -= Integer.valueOf(lab.getText());	
				lab.setText("");
				choice.value = 1;
			};
		});
		mul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(res.value == 0)
				       res.value = 1;	
				res.value *= Integer.valueOf(lab.getText());	
				lab.setText("");
				choice.value = 2;
			};
		});
		div.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(res.value == 0)
				       res.value = 1;
				res.value /= Integer.valueOf(lab.getText());	
				lab.setText("");
				choice.value = 3;
			};
		});
		eq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(choice.value == 0)
					res.value += Integer.valueOf(lab.getText());
				else if(choice.value == 1)
					res.value -= Integer.valueOf(lab.getText());
				else if(choice.value == 2)
					res.value *= Integer.valueOf(lab.getText());
				else if(choice.value == 3)
					res.value /= Integer.valueOf(lab.getText());
				choice.value = -1;
				lab.setText(res.value+"");
			};
		});
		jf.add(one);
		jf.add(lab);
		jf.setSize(400,600);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	class stuck{
		float value;
		public stuck(float value){
			this.value = value;
		}
	}
	class choi{
		int value;
	}
	public static void main(String ar[]){
		new Main();
	}
}

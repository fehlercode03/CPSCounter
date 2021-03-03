import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPSCounter {

	private JLabel label;
	
	private int count = 0;
	
	public static void main(String[] args) {
		new CPSCounter();
	}

	public CPSCounter() {
		new Thread(new Counter(this)).start();
		JFrame frame = new JFrame("CPS Counter");
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {
				count++;
			}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			
		});
		
		label = new JLabel();
		label.setBounds(100, 200, 100, 20);
		
		panel.add(label);
		
		frame.add(panel);
		frame.setVisible(true);
	}

	public void update() {
		label.setText("CPS: " + count);
		label.repaint();
		count = 0;
	}
}
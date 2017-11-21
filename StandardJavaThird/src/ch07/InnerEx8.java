package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author sharpen
 * InnerEx7의 코드를 익명 클래스로 변환하는 과정
 */
class InnerEx8 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");				
				}	 
			}		// 익명 클래스의 끝
		);
	}	// main의끝
}	// InnerEx8의 끝

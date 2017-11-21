package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author sharpen
 * 단순히 익명 클래스로 변환하는 부분을 보여주기 위한 예시이다.
 * 실제 익명 클래스 쓰는 부분 다음 소스코드인 InnerEx8에서 이코드를 익명 클래스를 사용하는 부분으로 변환해준다.
 */
class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());				
	}

}

class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");		
	}
	
}

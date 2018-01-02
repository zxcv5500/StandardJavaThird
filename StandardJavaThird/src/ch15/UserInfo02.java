package ch15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperUserInfo {
	String name;
	String password;
	
	SuperUserInfo() {
		this("Unknown", "1111");
	}
	
	SuperUserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
}


/**
 * @author zxcv5500
 * 이 예제는 전에 언급한 직렬화가 되지 않는 조상으로 부터 상송받은 인스턴스 변수에 대한 직렬화를 구현한 것이다.
 */
public class UserInfo02 extends SuperUserInfo implements Serializable {
	int age;
	
	public UserInfo02() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo02(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	
	public String toString() {
		return "(" + name + "," + password + "," + age + ")";
	}
	
	private void writeObject(ObjectOutputStream out)
			throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
		
	}
	
	private void readObject(ObjectInputStream in) 
		throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}

}

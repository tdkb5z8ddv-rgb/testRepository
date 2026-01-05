package practiceToGit;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		bird karasu=new bird("カーカー");
		karasu.bark();
	}

}

class bird{
	String nakigoe;
	bird(String nakigoe){
		this.nakigoe=nakigoe;
	}
	void bark(){
		System.out.println(nakigoe);
	}
}

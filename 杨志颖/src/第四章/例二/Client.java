package 第四章.例二;

public class Client {

	public static void main(String[] args) {
	
		SwitchExample aSwitch= new SwitchExample();
		aSwitch.setGrade(95);
		System.out.println("您的分数为："+aSwitch.getGrade());
		System.out.println("等级为："+aSwitch.getDengji());
		aSwitch.work3();
	}

}

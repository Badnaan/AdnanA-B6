package homework15;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {

		StaticRecapOne.isJavaFun = true;//TODO call [isJavaFun] variable and assign value = true
		
		StaticRecapOne.totalAmount = 1111;//TODO call [totalAmount] variable and assign value = 1111

		System.out.println(StaticRecapOne.isJavaFun);//TODO print value of variable [isJavaFun]

		System.out.println(StaticRecapOne.totalAmount);//TODO print value of variable [totalAmount]

		StaticRecapOne.addNum(0, 0);	//TODO call method [addNum()]

	}

	// non-static method
	public void statusUpdate() {

		StaticRecapOne obj = new StaticRecapOne();
		
		obj.month = "January";//TODO call [month] variable and assign value = "January"

		obj.iLikeJava = "Java is Life!";//TODO call [iLikeJava] variable and assign value = "Java is life"

		System.out.println(obj.month);//TODO print value of variable [month]

		System.out.println(obj.iLikeJava);//TODO print value of variable [iLikeJava]

		obj.getCountry();	//TODO call method [getCountry()]



	}

	public static void main(String[] args) {
		 

		getInfo();//TODO call method [getInfo()]
	}

}

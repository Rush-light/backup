
public class test {

	public static void main(String[] args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phonenumber="000-1234-5678";
		taro.address="北海道";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phonenumber);
		System.out.println(taro.address);

		Person abc=new Person();
		abc.name="木村次郎";
		abc.age=18;
		abc.phonenumber="000-2345-6789";
		abc.address="沖縄";

		System.out.println(abc.name);
		System.out.println(abc.age);
		System.out.println(abc.phonenumber);
		System.out.println(abc.address);


		Person efg=new Person();
		efg.name="鈴木花子";
		efg.age=16;
		efg.phonenumber="111-2345-6789";
		efg.address="新潟";


		System.out.println(efg.name);
		System.out.println(efg.age);
		System.out.println(efg.phonenumber);
		System.out.println(efg.address);


		Person xyz=new Person();
		xyz.name="奥山右京";
		xyz.age=20;
		xyz.phonenumber="111-0000-0000";
		xyz.address="東京";

		System.out.println(xyz.name);
		System.out.println(xyz.age);
		System.out.println(xyz.phonenumber);
		System.out.println(xyz.address);
	}
}

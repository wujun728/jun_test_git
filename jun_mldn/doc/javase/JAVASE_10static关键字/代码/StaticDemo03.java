class Person{
	private String name ;
	private int age;
	private static String city = "A城" ;
	public static void setCity(String c){
		city = c ;
	}
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + city ;
	}
};
public class StaticDemo03{
	public static void main(String args[]){
		Person per1 = new Person("张三",30) ;
		Person per2 = new Person("李四",31) ;
		Person per3 = new Person("王五",30) ;
		System.out.println("============= 信息修改之前 ================") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
		System.out.println("============= 信息修改之后 ================") ;
		Person.setCity("B城") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
	}
};
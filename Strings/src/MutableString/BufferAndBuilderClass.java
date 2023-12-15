package MutableString;

public class BufferAndBuilderClass {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Rama");
		System.out.println(sb1.capacity());
		sb1.append("Sita");
		System.out.println(sb1);
		

		StringBuilder sb2=new StringBuilder("Rvana");
		System.out.println(sb2);
		sb2.append("Asura");
		System.out.println(sb2);
		
	}

}

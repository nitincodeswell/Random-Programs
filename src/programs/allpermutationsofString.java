package top20;



public class allpermutationsofString {

	public static String perstring(String str) {
		char []ch=str.toCharArray();
		String per=" ";
		StringBuilder sb =new StringBuilder();
		int j=1;
		
//		for (int i = 0; i < ch.length; i++) {
//			sb.append(" "+ch[i]);
//			char temp=ch[i];
//			ch[i]=ch[ch.length-1];
//			ch[ch.length-1]=temp;
//			for (int k = i+1; k < ch.length; k++) {
//				sb.append(ch[k]);
//			}
//			
//		}
		System.out.println(sb.toString());
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(perstring("Aks"));

	}

}

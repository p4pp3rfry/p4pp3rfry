import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
				int len = s1.length();
				int whitespace_required = 15 - len;
				
				String number = String.valueOf(x);
				int zero_required = 3 - number.length();
				
				System.out.print(s1);
				printSomething(' ', whitespace_required);
				printSomething('0', zero_required);
				System.out.println(number);
            }
            System.out.println("================================");

    }
	
	static void printSomething(char ch, int n) {
		if(n>1) {
			System.out.print(ch);
			printSomething(ch,n-1);
		}
		else if(n == 1 ) {
			System.out.print(ch);
		}
	}
}




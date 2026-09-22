public class FormatDate{
	public static void printAmerican (String day, String month, int date, int year){
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(", ");
		System.out.println(year);
	}
	
	public static void printEuropean (String day, int date, String month, int year){
		System.out.print(day);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(" ");
		System.out.println(year);
	}
	
	public static void main (String[] args){
		//the day is 2026/09/22
		printAmerican("Tuesday", "September", 22, 2026);
		printEuropean("Tuesday", 22, "September", 2026);		
	}
}

import java.util.*;

public class TryWithResource
{
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		    int num[]={1,2,3,4,5};
		    int number=num[21];
		}
// 		catch(Exception ex){
// 		    ex.printStackTrace();
// 		}
// 		finally{
// 		    System.out.println("Game over");
// 		}
	}
}

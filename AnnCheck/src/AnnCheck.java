import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//creates an annotation

/*ihafluaheflsf;hjil
 * @Retention(RetentionPolicy.SOURCE)
 * @Retention(RetentionPolicy.CLASS) ->Compiler
 */
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnn{
	String att1() default "Test Value ";                                       
	int att2();
}
@MyAnn(att1 = "", att2 = 10)

class Employee{
	
}
public class AnnCheck {

	public static void main(String[] args) {
		
	}

}

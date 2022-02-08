package shuffel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shuffel{

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,2,5,0);
		
	list.forEach(i -> System.out.println(i));
		Collections.shuffle(list);
	System.out.println(list);
	}

}

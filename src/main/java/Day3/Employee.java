package Day3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString 
public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
}

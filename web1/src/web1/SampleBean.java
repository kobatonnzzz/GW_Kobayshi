package web1;

import java.io.Serializable;

	public class SampleBean implements Serializable {
//カプセル化
	private int salary = 0;

	public int getSalary() {
		System.out.println(salary);
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;

	}
	}

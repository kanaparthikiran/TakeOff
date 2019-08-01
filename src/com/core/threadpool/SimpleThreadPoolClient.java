/**
 * 
 */
package com.core.threadpool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author kkanaparthi
 *
 */
public class SimpleThreadPoolClient  extends RecursiveAction  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8847954115024781097L;
	
	private static int threadPoolSize = 5;
	private static int totalJobs = 10;

	/**
	 * 
	 */
	public SimpleThreadPoolClient() {
	}

	
	public void testStream() {
		
		Employee e1 = new Employee(1,555,new Department("IT"));
		Employee e2 = new Employee(2,333,new Department("CSE"));
		Employee e3 = new Employee(3,222,new Department("CSE"));
		Map<String,String> hm = new HashMap<>();
		hm.put("a", null);
		List<Employee> employees = new ArrayList<Employee>();
		java.util.Arrays.parallelSort(new int[]{1,2,3,4,5});
		employees.add(e1);employees.add(e2);employees.add(e3);
		
		Map<Department, List<Employee>> byDept = 
				employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		//employees.sort();
		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		long coountOfAllElem = employees.stream().count();
		
		//long coountOfAllElemA = employees.stream().min();

		System.out.println("THe by Dept Group as is  "+byDept+"  coountOfAllElem "+coountOfAllElem
				);
		
		
		System.exit(1);
	}
	
	public static void main(String a[]) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
//		Map<Person.Sex, List<Person>> byGender =
//			    roster
//			        .stream()
//			        .collect(
//			            Collectors.groupingBy(Person::getGender));
		
//		ConcurrentMap<Person.Sex, List<Person>> byGender =
//			    roster
//			        .parallelStream()
//			        .collect(
//			            Collectors.groupingByConcurrent(Person::getGender));
//		
//		listOfIntegers
//	    .stream()
//	    .forEach(e -> System.out.print(e + " "));
		
//		listOfIntegers
//	    .parallelStream()
//	    .forEachOrdered(e -> System.out.print(e + " "));

		
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();
//
	        System.out.println(gender.orElse("<N/A>")); //MALE
//	        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>
//
//	        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
//	        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>

		ExecutorService service = new ThreadPoolExecutor
				(5, 5, 10L, TimeUnit.MILLISECONDS
						, new LinkedBlockingQueue<Runnable>());
		
		ExecutorService executorsA =  new ThreadPoolExecutor(0, threadPoolSize,
				60L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
		
		ExecutorService executors =  new ThreadPoolExecutor(0, threadPoolSize,
				60L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
			
		//new SimpleThreadPoolClient().testStream();
		
		
//		 new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                 60L, TimeUnit.SECONDS,
//                 new SynchronousQueue<Runnable>());
//		 
				//Executors.newFixedThreadPool(threadPoolSize);
		
		System.out.println("STARTED PROCESS");
		
		for(int i=0;i<totalJobs;i++) {
			Runnable runnable = new WorkerThread("Hello "+i);
			
			executors.execute(runnable);
			
		}
		
		executors.shutdown();
		while(!executors.isTerminated()) {
//			System.out.println("Some of the Threads are Still Executing ");
		}
		
		ArrayList al = new ArrayList();
		al.get(0);
		
		System.out.println("All The Threads Have SHUTDOWN Successfully ");
		
		System.out.println("COMPLETED PROCESS");

		
		

	}


	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}
	

	
//    // Group employees by department
//    Map<Department, List<Employee>> byDept
//        = employees.stream()
//                   .collect(Collectors.groupingBy(Employee::getDepartment));
//
//    // Compute sum of salaries by department
//    Map<Department, Integer> totalByDept
//        = employees.stream()
//                   .collect(Collectors.groupingBy(Employee::getDepartment,
//                                                  Collectors.summingInt(Employee::getSalary)));
//
//    // Partition students into passing and failing
//    Map<Boolean, List<Student>> passingFailing =
//        students.stream()
//                .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
//    
    
	
	
}

class Employee {
	
	
	private int id;
	private int name;
	private Department department;
	
	/**
	 * @param pId
	 * @param pName
	 * @param pDepartment
	 */
	public Employee(int pId, int pName, Department pDepartment) {
		super();
		id = pId;
		name = pName;
		department = pDepartment;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param pId the id to set
	 */
	public void setId(int pId) {
		id = pId;
	}
	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}
	/**
	 * @param pName the name to set
	 */
	public void setName(int pName) {
		name = pName;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param pDepartment the department to set
	 */
	public void setDepartment(Department pDepartment) {
		department = pDepartment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}

class Department {
	
	/**
	 * @param pDepartmentName
	 */
	public Department(String pDepartmentName) {
		super();
		departmentName = pDepartmentName;
	}

	private String departmentName;

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param pDepartmentName the departmentName to set
	 */
	public void setDepartmentName(String pDepartmentName) {
		departmentName = pDepartmentName;
	}
	
}
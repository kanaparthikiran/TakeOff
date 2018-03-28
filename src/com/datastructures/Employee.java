/**
 * 
 */
package com.datastructures;

/**
 * @author kkanaparthi
 *
 */
public class Employee {
	
	  private String name;
	    private String jobTitle;
	    private int age;
	    private int salary;
	 
	    public Employee(String name, String jobTitle, int age, int salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.age = age;
	        this.salary = salary;
	    }
	 
	    // getters and setters
	 
	    /**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the jobTitle
		 */
		public String getJobTitle() {
			return jobTitle;
		}

		/**
		 * @param jobTitle the jobTitle to set
		 */
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the salary
		 */
		public int getSalary() {
			return salary;
		}

		/**
		 * @param salary the salary to set
		 */
		public void setSalary(int salary) {
			this.salary = salary;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + salary;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (age != other.age)
				return false;
			if (jobTitle == null) {
				if (other.jobTitle != null)
					return false;
			} else if (!jobTitle.equals(other.jobTitle))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (salary != other.salary)
				return false;
			return true;
		}

		public String toString() {
	        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
	    }

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}


import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	class Employee
	{
		Integer empid;
		String name;
		String address;
		Integer departmentId;
		Integer salary;
		Employee(int empid,String name,String address,int departmentId,int salary)
		{
			
			this.empid=empid;
			this.name=name;
			this.address=address;
			this.departmentId=departmentId;
			this.salary=salary;
		}
	
		public Integer setEmpid(Integer empid)
		{
			 return this.empid=empid;
		}
		public Integer getEmpid()
		{
			return empid;
		}
		
		public String setName(String name)
		{
			return this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public String setAddress(String address)
		{
			return this.address=address;
		}
		public String getAddress()
		{
			return address;
		}
		public Integer setSalary(Integer salary)
		{
			return this.salary=salary;
		}
		public int getSalary()
		{
			return salary;
		}
		public Integer setDepartmentId(Integer departmentId)
		{
			return this.departmentId=departmentId;
		}
		public Integer getDeparmentId()
		{
			return departmentId;
		}
		
	
		@Override
		public String toString()
		{
			return "Employee [id=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address +",departmentId="+departmentId+"]";
		}

					
}


class MySort implements Comparator<Employee>
{
			 @Override
    public int compare(Employee o1, Employee o2)
	{
        return o2.getEmpid() - o1.getEmpid();
    }
}

public class TestDemo2
{

	public static void main(String[]args)
	{
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(1,"Divakar","Delhi",124,50000));
		list.add(new Employee(2,"Rohit","Gurgoan",124,55000));
		list.add(new Employee(3,"Kavya","Rohini",126,58000));
		list.add(new Employee(4,"Mohit","Gurudaspur",127,40000));
		list.add(new Employee(5,"Shalini","Vilaspur",127,30000));
		list.add(new Employee(6,"Pooja","noida",129,43000));
		list.add(new Employee(7,"Mohan","punjab",129,52000));
		list.add(new Employee(8,"Sohan","himanchal",124,51000));
		list.add(new Employee(9,"Vikas","Gorakhpur",130,58000));
		list.add(new Employee(10,"Rohan","Banglore",130,58000));
		list.add(new Employee(11,"Anmol","Noida",131,58000));
		list.add(new Employee(12,"Digvijay","Hyderabad",130,58000));
		//Iterator<Employee>itr=list.iterator();
		System.out.println("--------------------------------------");
		System.out.println("sorting by departmentId:");
		System.out.println("--------------------------------------");
		Comparator<Employee>e=(e1,e2)->(e1.departmentId<e2.departmentId)?-1:(e1.departmentId>e2.departmentId)?1:0;
		Collections.sort(list,e);
		for(Employee i:list)
		{
			System.out.println(i.departmentId+"\t"+i.name+"\t"+i.address+"\t"+i.empid+"\t"+i.salary);
		}
		System.out.println("--------------------------------------");
		System.out.println("Ascending order => of employee name");
		System.out.println("--------------------------------------");
		Collections.sort(list, (o1, o2) -> (o1.getName().compareTo(o2.getName()))); 
		for(Employee k:list)
		{
			System.out.println(k.name+"\t"+k.departmentId+"\t"+k.address+"\t"+k.empid+"\t"+k.salary);
		}
        
		
		
        Comparator<Employee>f=(e1,e2)->
		{
			return e1.salary<e2.salary?1:e1.salary>e2.salary?-1:0;	
		};
		Collections.sort(list,f);		
		System.out.println("--------------------------------------");
		System.out.println("Sorted top five max salary employee");
		System.out.println("--------------------------------------");
		int count=0;
		for(Employee e4:list)
		{
			System.out.println(e4.salary+"\t"+e4.name+"\t"+e4.address+"\t"+e4.empid+"\t"+e4.departmentId);
			count++;
			if(count==5)
				break;
		}
		Optional<Employee>emp=list.stream().collect(Collectors.maxBy(Comparator.comparingInt(kl->{return kl.getSalary();})));
		System.out.println(emp.get());		
		//---------------------------
		List<Integer>al=list.stream().map(l->l.getDeparmentId()).distinct().sorted().collect(Collectors.toList());
		System.out.println("unique department:"+al);
		
		
		
		
	}
}

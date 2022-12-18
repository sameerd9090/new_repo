package com.practice;

public class Chars {
	public static void main(String[] args) {
//		Set<String> names = new TreeSet <>();
//		names.add("sameer");
//		names.add("amir");
//		names.add("didi");
//		names.add("mai");
//		System.out.println(names);
		
//	    Integer[] a = {1,2,803,4,5,2,5};
//	    int aa = Arrays.asList(a).stream().max(Integer::compare).get();
//	    System.out.println(aa);
//	    int aa = Arrays.asList(a).stream().sorted(Comparator.reverseOrder()).findFirst().get();
//	    System.out.println(aa);
	    
//	    Set<Integer> num = new HashSet<>();
//	    Set<Integer> nums = Arrays.stream(a).filter(x->!num.add(x)).collect(Collectors.toSet());
//	    System.out.println(nums);
	    
//	    String s = "hello sameer hello sameer hello sameer mai";
//	    List<String> name = Arrays.asList(s.split(" "));
//	    Map<String, Long> names = name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	    System.out.println(names);
		
//		Integer [] a = {1,2,3,4,5,6,5,6,1};
//		Set<Integer> num = new HashSet<Integer>();
//		int count=0;
//		for(Integer aa : a)
//		{
//			if (num.add(aa) == true) 
//			{
//				count++;
//			}
//		}
//		System.out.println(num);
//		System.out.println(count);
		

//		 String [] str = {"Sameer", "Sameer", "akshay", "anku", "Narayan", "Bhujanga"};
//	     HashMap<String,Integer> name = new HashMap<>();
//		 
//		 for(String s : str)
//		 {
//		    Integer count = name.get(s);
//			if(count == null)
//			{
//				name.put(s,1);
//			}
//			else
//			{
//				name.put(s,++count);
//			}
//		 }
		 
//		 Set<Entry<String,Integer>> e = name.entrySet();
//		 for(Entry<String,Integer> d : e)
//		 {
//			 if(d.getValue()>1)
//			 {
//				 System.out.println("Repeated Names : " +d.getKey() +" "+ d.getValue());
//			 }
//		 }
		
//		String[] names = {"one","two","three","three","four","one"};
//		Map<String, Integer> name = new TreeMap<>();
//		for(String s : names)
//		{
//			Integer count = name.get(s);
//			if(count == null)
//			{
//				name.put(s, 1);
//			}
//			else
//			{
//				name.put(s, ++count);
//			}
//		}
//		
//		Set<Entry<String, Integer>> na = name.entrySet();
//		for(Entry<String, Integer> nn : na)
//		{
//			System.out.println(nn.getKey() + " repeated " + nn.getValue() + " times");
//		}
		
//		Employee emp = new Employee(1, "aakash", "google",10000);
//		Employee emp0 = new Employee(2, "samarth", "IBM",20000);
//		Employee emp1 = new Employee(3, "rakesh", "Microsoft", 30000);
//		Employee emp2 = new Employee(4, "chagan", "Twitter", 40000);
//		
//		List<Employee> empList = new ArrayList<>();
//		empList.add(emp2);
//		empList.add(emp1);
//		empList.add(emp0);
//		empList.add(emp);
//		
//         List<Employee> list =  empList.stream()
//										         .sorted(Comparator.comparing(Employee::getEmpSalary)
//										       	 .reversed())
//										   		 .collect(Collectors.toList());
//         for(Employee e : list)
//	 		{
//	 			System.out.println(e.getEmpName() +" "+ e.getEmpSalary());
//	 		}
		
//		method which receives an array and we have to put values in it into reverse order.
		
		String[] a = {"one","two","three","four","five"};
		reversedArray(a);
		}
	
	  public static void reversedArray(String [] a)
	  {
		  for(int i = a.length-1; i>=0; i--)
		  {
			  System.out.println(a[i]);
		  }
	  }
}

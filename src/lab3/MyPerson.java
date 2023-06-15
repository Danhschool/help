package lab3;

import java.util.*;


public class MyPerson implements Iperson {

    @Override
    public double f1_c1(List<Person> t) {
        
       double a = 0,count = 0;
       for (Person p : t) {
    	   if(p.getDob()<2000) {
    		   a+=p.getSalary();
    		   count++;
    	   }
	}
        return (double)a/count ;
    }
    
    @Override
    public void f2_c1(List<Person> t) {
        double min=99999,max=0;
        for (Person p : t) {
			if(p.getSalary()<min) min=p.getSalary();
		}
        for (Person p : t) {
			if(p.getSalary()>max) max=p.getSalary();
		}
        for (Person p : t) {
			if(p.getSalary()==min) p.setSalary(min);
		}
        for (Person p : t) {
			if(p.getSalary()==max) p.setSalary(max);
		}
    }

    @Override
    public void f3_c1(List<Person> t) {
        Collections.sort(null);
       
    }

	@Override
	public double f1_c3(List<Person> t) {
		// TODO Auto-generated method stub
		 Calendar instance = Calendar.getInstance();
	     int year = instance.get(Calendar.YEAR);
	     int dob=0, c=0;
	     for (Person p : t) {
	    	 if((year-p.getDob()) <20) {
	    		 dob+=(year-p.getDob());
	    		 c++;
	    	 }
		}
		return (double)dob/c;
	}

	@Override
	public void f2_c3(List<Person> t) {
		// TODO Auto-generated method stub
		int l=9999;
		for (Person p : t) {
			if(p.getName().length()<l) l =p.getName().length();
		}
		for (Person p : t) {
			if(p.getName().length()==l) {
				System.out.println(p.getName());
			}
		}
	}

	@Override
	public void f3_c3(List<Person> t) {
		// TODO Auto-generated method stub
		
	}
    
}

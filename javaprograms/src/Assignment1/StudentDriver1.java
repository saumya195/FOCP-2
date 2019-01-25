import java.util.*;
class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
Qualification(String qual, String univ, String instt, float cgp)
{ 
this.qualName = qual;
this.university = univ;
this.institute = instt;
this.cgpa= cgp;
}
public String display_qualification()
{
System.out.println("Qualification Name: " + qualName + "\nUniversity Name: " + university + "\nInstitute Name: " + institute + "\nCGPA: " + cgpa);
return "";}
}
class Project
{

	String name;
	Date startDate;
	Date endDate;
	int startday, startmonth, startyear, endday, endmonth, endyear, r;
	String role;
	String[] responsibilities;

	Project(String name, int startday, int startmonth, int startyear, int endday, int endmonth, int endyear, String role, int k)
	{
		this.name = name;
		this.startDate = new Date(startday, startmonth, startyear);
		this.endDate = new Date(endday, endmonth, endyear);
		this.role = role;
		this.responsibilities = new String[k];
		this.r = k;
	}
	Project()
	{
		this.name = "";
		this.startDate = new Date(03,03,2000);
		this.endDate = new Date(03,03,2019);
		this.role = "";
		this.responsibilities = new String[100];
	}

	public void setStart(int startday, int startmonth, int startyear)
	{
		this.startday = startday;
		this.startmonth = startmonth;
		this.startyear = startyear;
	}
	
	public void setEnd(int endday, int endmonth, int endyear)
	{
		this.endday = endday;
		this.endmonth = endmonth;
		this.endyear = endyear;	
	}

	public void setRespn(String[] resp)
	{
		for (int i= 0; i< r; i++) 
		{
			this.responsibilities[i] = resp[i];
		}
	}

	public String[] getRespn()
	{

			return responsibilities;

	}


	public String displayProjects()
	{
		int i; 
		System.out.println("project name: "+ name);
		System.out.println("Start date: ");
		System.out.println(startDate.displayDate());
		System.out.println("End date: ");
		System.out.println(endDate.displayDate());
		System.out.println("Role: "+ role);		
		System.out.println("Responsibilities: ");


		for (i= 0; i< r; i++)
		{
			System.out.println(responsibilities[i]);
		}
			return "";
	}	

}
class Student
{
	String firstName;
	String lastName;
	String line1, line2, city, state;
	Address addrs;
	int pinCode;
	int daydob, monthdob, yeardob;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;
	int j;
	Student(String fname, String lname, String l1, String l2, String p, String st, int pinCd, int month, int day, int year,String em, String con, int a, int b, int c)
	{
	this.firstName = fname;
	this.lastName = lname;
	this.addrs = new Address(l1, l2, p, st, pinCd);
	this.dob = new Date(day, month, year);
	this.skills = new String[a];
	this.qual = new Qualification[c];
	this.projects = new Project[b];
	this.eMail = em;
	this.contactNo = con;
	}
	public void setDate1(int day, int month, int year)
	{
		this.daydob = day;
		this.monthdob = month;
		this.yeardob = year;
	}

	public String getDate1()
	{
		dob.setDate(daydob, monthdob, yeardob);
		return dob.displayDate();
	}


	public void setAddress(String l1, String l2, String c, String st, int pinCd )
	{
		this.line1 = l1;
		this.line2 = l2;
		this.city = c;
		this.state = st;
		this.pinCode = pinCd;
	}

	public Address getAddr()
	{
		System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
		return addrs;
	}

	public void setSkills(String[] skl)
	{
		this.skills = skl;
	}

	public void getSkills(int a)
	{
		
		System.out.println(skills);
		
	}

	public void setQual(Qualification[] q)
	{
		qual = q;
	}
	
	public Qualification[] getQual()
	{

			return qual;			

	}

	public void setProject(Project[] prj)
	{
		projects = prj;
	}


	public Project[] getProject()
	{

			return projects;

	}



	public void displayDetails(int b, int c, int a)
	{
		int i;

		System.out.println("\nStudent Name: " + firstName + " " + lastName);
		System.out.println("Date of birth: " + dob.displayDate());
		System.out.println("Email: " + eMail);
		System.out.println("Contact Number: " + contactNo);		
		System.out.println("Address ");
		System.out.println(addrs.displayAddress());
		System.out.println("Skills: ");
		for(i= 0; i< a; i++)
		{
		System.out.println(skills[i]);
		}
		System.out.println("\nQualifications ");
		for(i= 0; i< c; i++)
		{
		System.out.println(qual[i].display_qualification());
		}
		System.out.println("Project Details: ");
		for(i= 0; i< b; i++)
		{
		System.out.println(projects[i].displayProjects());
		}
	}
}
class Date 
{
 
    int month;
    int day;
    int year;
     
    Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate (int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
     


    public String displayDate () 
    {
        return (day + "/" + month + "/" + year);
    }
 }
class Address
{

  String line1;
  String line2;
  String city;
  String state;
  int pinCode;

  	Address(String line1, String line2, String city, String state, int pinCode)
    { 
        this.line1= line1;
        this.line2= line2;
        this.city= city;
  		this.state= state;
        this.pinCode= pinCode;
    }

    public void setAddr(String line1, String line2, String city, String state, int pinCode)
    {
      this.line1 = line1; 
      this.line2 = line2;
      this.city= city;
      this.state= state; 
      this.pinCode = pinCode;
    }
    public String displayAddress()
    {
      System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
      return "";
    }

}

public class StudentDriver1
{
	public static void main(String args[])
	{
		String firstName, lastName, eMail, contactNo, line1, line2, city, state;
		String qualName, institute, university, name, role;
		float cgpa;
		int i, j, k, l, m, n, b, c, a, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		
		Scanner S= new Scanner(System.in);

		System.out.println("Enter the number of students");
		n = S.nextInt();
		Student[] student = new Student[n];
		for (i= 0; i< n; i++)
		{

		System.out.println("Enter First Name");
		firstName = S.next();
		
		System.out.println("Enter Last Name");
		lastName = S.next();

		System.out.println("Enter Address");
		
		System.out.println("Enter line1");
		line1 = S.next();

		System.out.println("Enter line2");
		line2 = S.next();

		System.out.println("Enter city");
		city = S.next();

		System.out.println("Enter state");
		state = S.next();

		System.out.println("Enter pincode");
		pinCode = S.nextInt();		

		System.out.println("Enter Date of Birth");
		daydob = S.nextInt();
		monthdob = S.nextInt();
		yeardob = S.nextInt();		

		System.out.println("Enter number of Skills");
		a= S.nextInt();
		String[] sk = new String[a];
		for (m= 0; m< a; m++) 
		{
			System.out.println("Enter Skills");
			sk[m] = S.next();
		}

		System.out.println("Enter number of Qualifications");
		c= S.nextInt();
		Qualification[] ql = new Qualification[c];
		
		for (m= 0; m< c; m++) 
		{
			
			System.out.println("Enter details of Qualification" + (m+1));

			System.out.println("Enter qualification name");
			qualName = S.next();

			System.out.println("Enter university");
			university = S.next();

			System.out.println("Enter institute");
			institute = S.next();

			System.out.println("Enter cgpa");
			cgpa = S.nextFloat();
			
			ql[m]= new Qualification(qualName, university, institute, cgpa);

		}

		
			System.out.println("Enter number of projects");
			b = S.nextInt();

			Project[] pr = new Project[b];
			for(m= 0; m< b; m++)
			{
			
			System.out.println("Enter project name");
			name = S.next();

			System.out.println("Enter start date");
			startday = S.nextInt();
			startmonth = S.nextInt();
			startyear = S.nextInt();
			System.out.println("Enter end date");
			endday = S.nextInt();
			endmonth = S.nextInt();
			endyear = S.nextInt();
			System.out.println("Enter role");
			role = S.next();
			System.out.println("Enter number of responsibilities");
			l = S.nextInt();
			String[] resp = new String[l];
			System.out.println("Enter responsibilities");
for (j= 0; j< l; j++) 
				{
					resp[j] = S.next();
				}
				pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);
				pr[m].setStart(startday, startmonth, startyear);
				pr[m].setEnd(endday, endmonth, endyear);
			}
System.out.println("Enter Email");
		eMail = S.next();

		System.out.println("Enter Contact Number");
		contactNo = S.next();

		student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, a, c, b);
		student[i].setProject(pr);
		student[i].setSkills(sk);
		student[i].setQual(ql);
		student[i].setDate1(daydob, monthdob, yeardob);
		student[i].setAddress(line1, line2, city, state, pinCode);
		student[i].displayDetails(b, c, a);

		}
	}
}	
package shallowAndDeepCloaning;


/*
 * he default version of clone() method creates the shallow copy of an object. 
 * The shallow copy of an object will have exact copy of all the fields of original object. 
 * If original object has any references to other objects as fields, then only references of those 
 * objects are copied into clone object, copy of those objects are not created.
 *  **That means any changes made to those objects through clone object will be reflected in original object or vice-versa.
 *  Shallow copy is not 100% disjoint from original object. Shallow copy is not 100% independent of original object.*/
class Course
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Course(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }

	@Override
	public String toString() {
		return "Course [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}
    
}
 
class Student implements Cloneable
{
    int id;
 
    String name;
 
    Course course;
 
    public Student(int id, String name, Course course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
    
 
 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Shallow {
	public static void main(String[] args) {
		
		Course course=new Course("Maths", "physics", "Java");
		Student stud1=new Student(101, "Shashi", course);
		System.out.println("Student 1 "+stud1);
		System.out.println("Student 1 hashcode ="+stud1.hashCode());
		System.out.println("Student 1 subject1 "+stud1.course.subject1);
		Student stud2=null;
		try {
			 stud2=(Student)stud1.clone();
			
			System.out.println("Student 2 "+stud2);
			System.out.println("Student 2 hashcode="
					+ ""+stud2.hashCode());
			System.out.println("Student 2 subject1 "+stud2.course.subject1);
		} catch (CloneNotSupportedException e) {
		
			e.printStackTrace();
		}
		
		//if we made changes in object it will reflect in both object as 
		
		stud1.course.subject1="Python";
		stud1.id=103;
		System.out.println("Student 1 "+stud1);
		System.out.println("Student 2  "+stud2);
		System.out.println(stud1.course.subject1);
		System.out.println(stud2.course.subject1);
		
	}

}

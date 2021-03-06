package shallowAndDeepCloaning;

/*
 * Deep copy of an object will have exact copy of all the fields of original object just like shallow copy.
 *  But in additional, if original object has any references to other objects as fields, then copy of those objects
 *   are also created by calling clone() method on them. That means clone object and original object will be 100% disjoint.
 *    They will be 100% independent of each other. Any changes made to clone object will not be reflected in original object or vice-versa.
 * */
class Coursed implements Cloneable {
	String subject1;

	String subject2;

	String subject3;

	public Coursed(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Coursed [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}

}

class Studentd implements Cloneable {
	int id;

	String name;

	Coursed course;

	public Studentd(int id, String name, Coursed course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		Studentd student = (Studentd) super.clone();

		student.course = (Coursed) course.clone();

		return student;
	}

	@Override
	public String toString() {
		return "Studentd [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}

public class DeepCloaning {
	public static void main(String[] args) {
		Coursed science = new Coursed("Physics", "Chemistry", "Biology");

		Studentd student1 = new Studentd(111, "John", science);

		Studentd student2 = null;

		try {
			student2 = (Studentd) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'

		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'

		student2.course.subject3 = "Maths";

		// This change will not be reflected in original student 'student1'

		System.out.println(student1.course.subject3); // Output : Biology

		System.out.println("student1 " + student1);
		System.out.println("student2 " + student2);

	}
}
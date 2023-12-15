class ParentClass {
    int parentNumber;

    public ParentClass(int parentNumber) {
        this.parentNumber = parentNumber;
    }

    public void displayParentNumber() {
        System.out.println("Parent Number: " + this.parentNumber);
    }
}

class ChildClass extends ParentClass {
    int childNumber;

    public ChildClass(int parentNumber, int childNumber) {
        super(parentNumber); // Call the parent class constructor using "super"
        this.childNumber = childNumber;
    }

    public void displayChildNumber() {
        System.out.println("Child Number: " + this.childNumber);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass(10, 20);

        // Display parent and child numbers using methods
        childObj.displayParentNumber(); // Calls the parent class method
        childObj.displayChildNumber();
    }
}

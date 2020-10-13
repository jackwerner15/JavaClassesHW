public class pet {

    private String name;

    private int age;

    private String location;

    private String type;

    private String currentName = "Winston";

    private int currentAge = 13;

    private String currentLocation = "New England";

    // empty constructor

    public pet() {

    }

    // overlaod constructor

    public pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

    }

    // Get and set methods

    public void getName() {
        System.out.println("\nCurrent name is "+ currentName);
    
    }

    public void changeName(String nameSelection) {
        System.out.println("\nThe pet is now named: "+ nameSelection);
        this.currentName = nameSelection;
    }


    public void getAge() {
        System.out.println("\nCurrent age is "+ currentAge);
    }
    public void changeAge(int ageSelection) {
        System.out.println("\nThe pet is now "+ ageSelection+" years old");
        this.currentAge = ageSelection;
    }


    public String getType() {
        return this.type;
    }


    public void setLocation(String location) {
        this.location = location;
    }

}

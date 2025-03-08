class Employee {
    private String FirstName;
    private String LastName;
    private int BirthYear;
    private String ID;
    private double Salary;

    public Employee(String FirstName, String LastName, int BirthYear, double Salary){
        this.BirthYear = BirthYear;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;
        this.ID = getID();

    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
    public int getBirthYear() {
        return BirthYear;
    }

    public String getID(){
        String id = "";
        id += LastName.substring(0, Math.min(5, LastName.length())); // First 5 characters of last name
        id += FirstName.charAt(0); // First letter of first name
        id += Integer.toString(BirthYear).substring(2); // Last two digits of birth year
        return id;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }

    public double getSalary(){
        return Salary;
    }

    public void bonus(){
        Salary = Salary * 1.10;
    }

    public boolean equals(Object abr ){
        if (this == abr) {
            return true;
        }

        if (abr == null || getClass() != abr.getClass()) {
            return false;
        }

        Employee e = (Employee) abr;

        return ID.equals(e.ID);
    }

    public String toString(){
        return FirstName + ", " +
                LastName + ", " +
                BirthYear + ", " +
                Salary + ", " +
                ID ;
    }


}

public class Student {
    private String firstName;
    private String surName;
    private long studentNumber;
    private String address;
    private double quizAverage;
    private double id;

    /**
     *
     * @param firstName
     * @param surName
     * @param studentNumber
     */
    public Student(String firstName, String surName, long studentNumber){
        this.firstName = firstName;
        this.surName = surName;
        this.studentNumber = studentNumber;
    }

    /**
     * Set student's name and surname
     * @param firstName : String the first name of the student
     * @param surName : String the surname of the student
     */
    public void setName(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }

    /**
     * return name and surname of the student
     */
    public String getName(){
        return "( " + firstName + ", " + surName + " )";
    }

    /**
     * get the student of number
     * @return : long the student number
     */
    public long getStudentNumber(){
        return studentNumber;
    }
    public String getLoginId(){
        return id;
    }
    public String getInfo(){

    }
    public void setAddress(String number, String street, String city, String province, String postalCode){
        address = number + " " + street + " " + city
                 + " " + province + " " + postalCode;
    }
    public String getAddress(){
        return address;
    }
    public void addQuiz(double quiz){
        quizAverage = quiz;
    }
    public double getQuizAverage(){
        return quizAverage;
    }
    @Override
    public String toString(){
        return "";
    }


}

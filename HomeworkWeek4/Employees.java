package HomeworkWeek4;


import java.util.UUID;

class Employees {

    private UUID id;
    private String name;
    private Integer age;
    private String gender;
    private String department;
    private String jobTitle;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String Gender) {
        this.gender = Gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.jobTitle = JobTitle;
    }

    //constructor
   public void addEmployees(UUID id, String name, Integer age, String gender, String department, String jobTitle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString(){
        return "id: " + id + ";" + "Name:" + name + ";" + "Age:" + age + ";" + "Gender:" + gender + ";" + "Department:" + department + ";" + "JobTitle:" + jobTitle + ";";
    }

}





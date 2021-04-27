package informationpackage;


public class Information {
    private String name;
    private String email;
    private String dof;
    private String gender;
    private String address;
    private String phone;
    private String nationality;
    private String hobbies;
    private String skills;
    private String work;
    private String education;
    private String professtionalsum;
    private String language;

    public Information() {
    }

    public Information(String name, String email, String dof, String gender, String address, String phone, String nationality, String hobbies, String skills, String work, String education, String professtionalsum, String language) {
        this.name = name;
        this.email = email;
        this.dof = dof;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.nationality = nationality;
        this.hobbies = hobbies;
        this.skills = skills;
        this.work = work;
        this.education = education;
        this.professtionalsum = professtionalsum;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDof() {
        return dof;
    }

    public void setDof(String dof) {
        this.dof = dof;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfesstionalsum() {
        return professtionalsum;
    }

    public void setProfesstionalsum(String professtionalsum) {
        this.professtionalsum = professtionalsum;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class User {

    private String name;
    private String gender;
    private String phone;
    private Long pincode;

    public User(String name, String gender, String phone, Long pincode) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

}

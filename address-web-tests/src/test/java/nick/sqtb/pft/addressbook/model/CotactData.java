package nick.sqtb.pft.addressbook.model;

public class CotactData {
    private int id;
    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String address;
    private final String mobile;
    private final String email;
//    private String group;


    public CotactData(String firstname, String lastname, String nickname, String address, String mobile, String email) {
        this.id = Integer.MAX_VALUE;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
//        this.group = group;
    }

    public CotactData(int id, String firstname, String lastname, String nickname, String address, String mobile, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
//        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() { return email; }

//    public String getGroup() {
//        return group;
//    }

    @Override
    public String toString() {
        return "CotactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CotactData that = (CotactData) o;

        return firstname != null ? firstname.equals(that.firstname) : that.firstname == null;
    }

    @Override
    public int hashCode() {
        return firstname != null ? firstname.hashCode() : 0;
    }
}

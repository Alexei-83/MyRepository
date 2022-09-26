public class Resident {
    private String name;
    private String firstName;
    private String patronymic;
    private int mSalary;

    public Resident() {

    }

    public String getName(int i) {
        return name;
    }

    public String getfirstName(int i) {
        return firstName;
    }

    public String getPatronymic(int i) {
        return patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName(int i) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = String.valueOf(patronymic);
    }

    public void setName(int nextInt) {
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }

    public Resident(String name, String firstName, String patronymic) {
        this.name = name;
        this.firstName = firstName;
        this.patronymic = patronymic;

    }

    @Override
    public String toString() {
        return "Resident(" +
                "" + name + '\'' +
                " " + firstName + '\'' +
                " " + patronymic + '\'' +
                " mSalary " + mSalary +
                ')';
    }


}

class DOB {
    int day;
    int month;
    int year;

    void setDOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void show() {
        System.out.println(day + "/" + month + "/" + year);
    }

    DOB findAge(DOB current) {
        DOB age = new DOB();
        if (current.day < this.day) {
            current.month -= 1;
            current.day += 30;
        }
        age.day = current.day - this.day;

        if (current.month < this.month) {
            current.year -= 1;
            current.month += 12;
        }
        age.month = current.month - this.month;

        age.year = current.year - this.year;

        return age;
    }

    public static void main(String[] args) {
        DOB dob = new DOB();
        DOB current = new DOB();
        dob.setDOB(10, 5, 1990);
        current.setDOB(27, 7, 2024);

        dob.show();
        current.show();

        DOB age = dob.findAge(current);
        System.out.print("Age: ");
        age.show();
    }
}

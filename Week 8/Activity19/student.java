package inheritance;


    // File: Student.java


    public class student extends universityMember {
        private int id;

        public student(String name, int age, String department, int id) {
            super(name, age, department);
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", " + super.toString() + "]";
        }
    }



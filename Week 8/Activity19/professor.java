package inheritance;
    public class professor extends universityMember {
        private String researchArea;

        public professor(String name, int age, String department, String researchArea) {
            super(name, age, department);
            this.researchArea = researchArea;
        }

        public String getResearchArea() {
            return researchArea;
        }

        public void setResearchArea(String researchArea) {
            this.researchArea = researchArea;
        }

        @Override
        public String toString() {
            return "Professor [researchArea=" + researchArea + ", " + super.toString() + "]";
        }
    }



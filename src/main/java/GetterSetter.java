public class GetterSetter {

    public class Main{
        public static void main(String[] args) {
            Student student01 = new Student();
            student01.setName("Felix Muster");
            student01.setAge(21);
            student01.setCourse("Java");


            Student student02 = new Student();
            student02.setName("Frank Mustermann");
            student02.setAge(22);
            student02.setCourse("Java");
        }
    }




    static class Student {
        private String name;
        private int age;
        private String course;


        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }



}

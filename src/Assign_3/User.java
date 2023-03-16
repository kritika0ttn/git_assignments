package Assign_3;
public class User {
        String FirstName;
        String LastName;
        String age;
        String Number;
        public User( ) {
            this.FirstName = " ";
            this.LastName = " ";
            this.age = " ";
            this. Number = " ";
        }
        @Override
        public String toString() {
            return "User{" +
                    "FirstName='" + FirstName + '\'' +
                    ", LastName='" + LastName + '\'' +
                    ", age='" + age + '\'' +
                    ", PhoneNo='" + Number + '\'' +
                    '}';
        }
    }


package collection.set;

import java.util.Objects;

public class Member {
      public String name;
      public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //name과 age가 같다면 true 리턴
        if(o instanceof Member target){
            return target.name.equals(name) && (target.age == age);

        } else return false;
    }

    @Override
    public int hashCode() {
        //name 과 age 값이 같으면 동일한 hashCode가 리턴하겠다.
       return name.hashCode() + age;
    }

}

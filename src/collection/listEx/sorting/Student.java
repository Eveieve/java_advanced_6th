package collection.listEx.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student>{

       private int sno;   //학번
       private String name;

    @Override
    public int compareTo(Student o) {
        if (this.sno > o.sno) return 1;
        else if (this.sno == o.sno) return 0;
        else return -1;
        //return o.sno - this.sno;
    }
}

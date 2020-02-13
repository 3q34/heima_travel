import cn.itcast.travel.domain.TestStudent;
import org.junit.Test;

/**
 * Created by cdx on 2020/1/10.
 * desc:
 */
public class TestLombok {
    @Test
    public void testLombok() {
        TestStudent student = new TestStudent();
        student.setId(1);
        student.setName("张三");
        student.setAge(20);
        //System.out.println(student);
//        TestStudent(id=1, name=张三, age=20)

        int i=Integer.parseInt("0");
        System.out.println(i);
    }

}

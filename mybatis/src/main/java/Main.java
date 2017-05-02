import com.cenxui.mybatis.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by cenxui on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            Student student = new Student();
            student.setName("Mohammad");
            student.setId(984803322);
            student.setPercentage(80);
            student.setBranch("It");
            student.setEmail("Mohammad@gmail.com");


            //Insert student data
            session.insert("Student.insert", student);
            System.out.println("record inserted successfully");
            session.commit();


            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

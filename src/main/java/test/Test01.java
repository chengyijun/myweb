package test;
import club.kwzw.dao.UserMapper;
import club.kwzw.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;


public class Test01 {
    @Test
    public void testQueryUserList() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService service = (UserService) ac.getBean("userService"); // 因为给service起了别名，所以通过id的方式获取class
        service.findAll();

    }

    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mysqlConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resourceAsStream);
        SqlSession session = factory.openSession(true);

        UserMapper mapper = session.getMapper(UserMapper.class);

    }


}

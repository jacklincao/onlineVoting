package test;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lincao.ssm.entity.user.User;
import com.lincao.ssm.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-cfg.xml")
public class TestUser2 {
 
	@Resource(name="userServiceBean")
    private UserService userService;
 
    @Test
    public void testAdd() throws SecurityException, ClassNotFoundException {
        User user = new User();
        user.setRemark("第一条数据");
        user.setAttachmentCode("aa");
        user.setCreateDate(new Date());
        user.setInputCode("cll");
        user.setName("林3");
        user.setPassword("123456");
        user.setType("管理员");
        user.setTel("17725197693");
        user.setEmail("1287075856@qq.com");
        userService.insertUser(user);
    }
    
    @Test
    public void testFindUserById() throws SecurityException, ClassNotFoundException {
    	Long id = 9l;
    	User user = userService.findUserById(id);
    	System.out.println(user.toString());
    }
    
    @Test
    public void testFindUsers() {
    	List<User> users = userService.findUsers();
    	
    	System.out.println(users.size());
    }
    
    @Test
    public void testDelete() {
    	Long id = 11L;
    	int i = userService.deleteUser(id);
    	System.out.println(i);
    }
    
    @Test
    public void testUpdate() {
    	User user = new User();
    	user.setId(11L);
    	user.setName("ces");
    	int i = userService.updateUser(user);
    	System.out.println(i);
    }
 
}
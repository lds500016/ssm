import org.com.entities.admin;
import org.com.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AdminTest {

    @Resource
    private AdminService adService;

    public void setAdService(AdminService adService) {
        this.adService = adService;
    }

    @Test
    public void LoginTest(){
        admin a =new admin();
        a.setAdmin_UserName("admin");
        a.setAdmin_Pwd("123");
        a=this.adService.Login(a);
        if(a==null){
            System.out.println("用户名或密码错误");
        }else{
            System.out.println("成功 ");
        }

    }
}

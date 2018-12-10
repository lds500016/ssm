package manager.login;

import org.com.entities.admin;
import org.com.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class loginController {

    @Resource
    private AdminService as;

    public void setAs(AdminService as) {
        this.as = as;
    }

    @RequestMapping("/index.html")
    public String LoginIndex(){
        return "login";
    }

    @RequestMapping("/execLogin")
    @ResponseBody
    public String execLogin(admin a, HttpSession session){
        a= (a);
        if(a==null){
            return "false";
        }else{
            session.setAttribute("admin",a);
            return "true";
        }
    }
}

package llx.example.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//接收前台发送过来的请求
@RestController

//作为http的相应保报文返回
//@ResponseBody
public class hello {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello haha";
    }
}

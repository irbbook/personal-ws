package spring.api.personnal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.api.personnal.models.UserModel;
import spring.api.share.consts.ApiConsts;
import spring.api.share.response.ShareResponse;

@RestController
@RequestMapping("api/test")
@CrossOrigin(origins = "*")
public class ApiController {
    @GetMapping("/")
    public ShareResponse getResponse(){
        ShareResponse  response = new ShareResponse();
        return response.Success();
    }

    @GetMapping("/data")
    public ShareResponse getResponseWithData(){
        ShareResponse  response = new ShareResponse();
        UserModel user1 = new UserModel();
        user1.setName("Book");
        user1.setAge(20);
        return response.SuccessWithData(user1);
    }
}

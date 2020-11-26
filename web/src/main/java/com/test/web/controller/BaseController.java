package com.test.web.controller;

import com.test.base.Base;
import com.test.network.BaseRequest;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Voctex.Chen
 * @version V1.0.0
 * @program: demo
 * @Package com.test.web.controller
 * @Description: TODO
 * @date 2020/11/26 10:15
 */
@RestController
public class BaseController implements BaseRequest {

    @Override
    public Base getBase() {
        Base base=new Base();
        base.setId(123);
        base.setName("voctex.chen");
        base.setText("This is a Demo.");
        return base;
    }
}

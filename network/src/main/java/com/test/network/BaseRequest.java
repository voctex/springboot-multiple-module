package com.test.network;

import com.test.base.Base;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Voctex.Chen
 * @version V1.0.0
 * @program: demo
 * @Package com.test.network
 * @Description: TODO
 * @date 2020/11/26 10:10
 */
@RequestMapping(value = "/test")
public interface BaseRequest {

    @RequestMapping(value = "/base", method = RequestMethod.GET)
    Base getBase();

}

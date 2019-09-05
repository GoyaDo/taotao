package com.goya.service.impl;

import com.goya.mapper.TestMapper;
import com.goya.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cj
 * @create 2019-09-2019/09/03 16:39
 */
@Service
public class TestServiceImpl implements TestService {

    //1,注入mapper
    @Autowired
    private TestMapper mapper;

    @Override
    public String queryNow() {
        //2,调用mapper的方法返回
        return mapper.queryNow();
    }
}

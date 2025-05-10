package com.ydl.quartz.task;

import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.common.core.domain.entity.SysUser;
import com.ydl.system.mapper.StaffDictMapper;
import com.ydl.system.mapper.SysUserMapper;
import com.ydl.system.service.StaffDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.ydl.common.utils.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@RestController
@Component("ryTask")
public class RyTask
{


    @Qualifier("springSecurityFilterChain")
    @Autowired
    private Filter springSecurityFilterChain;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }


    public void ryNoParams()
    {
        System.out.println("执行无参方法");
    }

}

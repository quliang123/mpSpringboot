package com.imooc.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.entity.User;
import com.imooc.model.MyPage;
import com.imooc.model.ParamSome;
import org.apache.ibatis.annotations.Param;

/**
 * @author miemie
 * @since 2018-08-10
 */
@DS("master")
public interface UserMapper extends BaseMapper<User> {

    /**
     * 3.x 的 page 可以进行取值,多个入参记得加上注解
     * 自定义 page 类必须放在入参第一位
     * 返回值可以用 IPage<T> 接收 也可以使用入参的 MyPage<T> 接收
     * todo 目前使用注解会报错,写在 xml 里就没事
     *
     * @param page 自定义  user
     * @return 分页数据
     */
    @DS("slave")
    MyPage<User> mySelectPage(@Param("pg") Page<User> page, @Param("user") User user);
}

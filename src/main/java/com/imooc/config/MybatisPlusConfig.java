package com.imooc.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author
 * @Create
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.imooc.mapper*")
public class MybatisPlusConfig {
    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     *
     * @return
     */
    @Profile({"dev", "test"})
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 分页插件，自动识别数据库类型 多租户，请参考官网【插件扩展】
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        System.out.println("======");
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        List<ISqlParser> sqlParserList = new ArrayList<>();

        //攻击SQL阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser());
        paginationInterceptor.setSqlParserList(sqlParserList);

        return paginationInterceptor;
    }
}

package com.jie.dao;

import com.jie.entity.ZuulRouteEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hexiaogou
 * @classname PropertiesDao
 * @description properties dao
 * @date 2022/6/16 18:20
 */
@Component
public class PropertiesDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    private final static String SQL = "select * from zuul_route where enabled = TRUE";
//    private final static String LQS = "SELECT * FROM zuul_route WHERE enabled = TRUE";

    public Map<String, ZuulRoute> getProperties() {
        Map<String, ZuulRoute> routes = new LinkedHashMap<>();
        List<ZuulRouteEntity> list = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(ZuulRouteEntity.class));
        list.forEach((entity) -> {
            if (StringUtils.isEmpty(entity.getPath())) {
                return;
            }
            ZuulRoute route = new ZuulRoute();
            BeanUtils.copyProperties(entity, route);
            routes.put(route.getPath(), route);
        });
        return routes;
    }
}

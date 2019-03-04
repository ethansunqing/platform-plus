/*
 * 项目名称:platform-plus
 * 类名称:SysDictGroupDao.java
 * 包名称:com.platform.modules.sys.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-01-22 10:32:28        李鹏军     初版做成
 *
 * Copyright (c) 2018-2019 微同软件
 */
package com.platform.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.platform.modules.sys.entity.SysDictGroupEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 数据字典分组Dao
 *
 * @author 李鹏军
 * @date 2019-01-22 10:32:28
 */
@Mapper
public interface SysDictGroupDao extends BaseMapper<SysDictGroupEntity> {

    /**
     * 自定义分页查询
     *
     * @param page
     * @param params
     * @return
     */
    List<SysDictGroupEntity> selectSysDictGroupPage(Pagination page, Map<String, Object> params);

    /**
     * 查询所有数据字典
     *
     * @param params
     * @return
     */
    List<SysDictGroupEntity> queryAll(Map<String, Object> params);
}
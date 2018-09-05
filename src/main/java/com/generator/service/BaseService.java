package com.generator.service;

import java.util.List;

public interface BaseService<T> {

        public int deleteByPrimaryKey(Object o);

        public int delete(T t);

        public int insert(T t);

        public int insertSelective(T t);

        public boolean existsWithPrimaryKey(Object o);

        public List<T> selectAll();

        public T selectByPrimaryKey(Object o);

        public int selectCount(T t);

        public List<T> select(T t);

        public T selectOne(T t);

        public int updateByPrimaryKey(T t);

        public int updateByPrimaryKeySelective(T t);

        public int deleteByExample(Object o);

        public List<T> selectByExample(Object o);

        public int selectCountByExample(Object o);

        public T selectOneByExample(Object o);

        public int updateByExample(T t, Object o);
        public int updateByExampleSelective(T t, Object o);

        public int insertList(List<? extends T> list);
        public int insertUseGeneratedKeys(T t);

}

package com.generator.service.impl;

import com.generator.util.XrxsMapper.XrxsMapper;

import java.util.List;
import org.apache.ibatis.session.RowBounds;

public abstract class BaseServiceImpl<T> implements XrxsMapper<T> {

        public abstract XrxsMapper<T> dao();

        public int deleteByPrimaryKey(Object o) {
                return this.dao().deleteByPrimaryKey(o);
        }

        public int delete(T t) {
               return this.dao().deleteByPrimaryKey(t);
        }

        public int insert(T t) {
                return this.dao().insert(t);
        }

        public int insertSelective(T t) {
                return this.dao().insertSelective(t);
        }

        public boolean existsWithPrimaryKey(Object o) {
                return this.dao().existsWithPrimaryKey(o);
        }

        public List<T> selectAll() {return this.dao().selectAll(); }

        public T selectByPrimaryKey(Object o) {
                return this.dao().selectByPrimaryKey(o);
        }

        public int selectCount(T t) {
                return this.dao().selectCount(t);
        }

        public List<T> select(T t) {
                return this.dao().select(t);
        }

        public T selectOne(T t) {
                return this.dao().selectOne(t);
        }

        public int updateByPrimaryKey(T t) {
                return this.updateByPrimaryKey(t);
        }

        public int updateByPrimaryKeySelective(T t) {
                return this.dao().updateByPrimaryKeySelective(t);
        }

        public int deleteByExample(Object o) {
                return this.dao().deleteByExample(o);
        }

        public List<T> selectByExample(Object o) {
                return this.dao().selectByExample(o);
        }

        public int selectCountByExample(Object o) {
                return this.dao().selectCountByExample(o);
        }

        public T selectOneByExample(Object o) {
                return this.dao().selectOneByExample(o);
        }

        public int updateByExample(T t, Object o) {
                return this.dao().updateByExample(t,o);
        }

        public int updateByExampleSelective(T t, Object o) {
                return this.dao().updateByExampleSelective(t,o);
        }

        public int insertList(List<? extends T> list) {
                return this.dao().insertList(list);
        }

        public int insertUseGeneratedKeys(T t) {
                return this.dao().insertUseGeneratedKeys(t);
        }

        public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {return this.dao().selectByExampleAndRowBounds(example,rowBounds); }

        public List<T> selectByRowBounds(T t, RowBounds rowBounds) {
                return this.dao().selectByRowBounds(t,rowBounds);
        }

}

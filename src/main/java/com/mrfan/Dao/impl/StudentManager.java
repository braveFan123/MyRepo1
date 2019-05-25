package com.mrfan.Dao.impl;

import com.mrfan.Dao.inf.StudentDaoInf;
import com.mrfan.Entity.Stduent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
@Repository("studentManager")
public class StudentManager implements StudentDaoInf {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean addStud(Stduent stduent) {
        jdbcTemplate.update("insert into student values (null,?,?)",
                new Object[]{stduent.getName(), stduent.getCid()},
                new int[]{Types.CHAR, Types.INTEGER});
        return true;
    }

    @Override
    public boolean deleteStud(Integer id) {
        return false;
    }

    @Override
    public boolean updateStud(Integer id, String name) {
        return false;
    }

    @Override
    public Stduent selectStud(Integer id) {
        return null;
    }
}

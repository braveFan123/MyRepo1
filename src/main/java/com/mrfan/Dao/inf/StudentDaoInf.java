package com.mrfan.Dao.inf;

import com.mrfan.Entity.Stduent;

public interface StudentDaoInf {
    boolean addStud(Stduent stduent);
    boolean deleteStud(Integer id);
    boolean updateStud(Integer id,String name);
    Stduent selectStud(Integer id);
}

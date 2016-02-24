/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao.impl;

import com.leapfrog.academy.dao.FacilitatorDAO;
import com.leapfrog.academy.entity.Facilitator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class FacilitatorDAOImpl implements FacilitatorDAO {

    private List<Facilitator> facilitatorList;

    public FacilitatorDAOImpl() {
        
        facilitatorList=new ArrayList<>();
    }

    public FacilitatorDAOImpl(List<Facilitator> facilitatorList) {
        this.facilitatorList = facilitatorList;
    }

    @Override
    public int insert(Facilitator t) {
        facilitatorList.add(t);
        return 1;

    }

    @Override
    public int update(Facilitator t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {

        Facilitator f = getById(id);
        if (f != null) {
            facilitatorList.remove(f);
            return 1;
        }
        return 0;
    }

    @Override
    public Facilitator getById(int id) {
        for (Facilitator f : facilitatorList) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Facilitator> getAll() {
        return facilitatorList;
    }

    @Override
    public List<Facilitator> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

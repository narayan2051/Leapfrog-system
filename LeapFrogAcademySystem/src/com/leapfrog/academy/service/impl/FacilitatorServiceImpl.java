/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service.impl;

import com.leapfrog.academy.dao.FacilitatorDAO;
import com.leapfrog.academy.dao.impl.FacilitatorDAOImpl;
import com.leapfrog.academy.entity.Facilitator;
import com.leapfrog.academy.service.FacilitatorService;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class FacilitatorServiceImpl implements FacilitatorService{
    
    private FacilitatorDAO facilitatorDAO;

    public FacilitatorServiceImpl() {
        
        facilitatorDAO=new FacilitatorDAOImpl();
    }
    

    @Override
    public int insert(Facilitator t) {
        
        return facilitatorDAO.insert(t);
        
    }

    @Override
    public int update(Facilitator t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        return facilitatorDAO.delete(id);
    }

    @Override
    public Facilitator getById(int id) {
        return facilitatorDAO.getById(id);
        
    }

    @Override
    public List<Facilitator> getAll() {
        return facilitatorDAO.getAll();
    }

    @Override
    public List<Facilitator> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

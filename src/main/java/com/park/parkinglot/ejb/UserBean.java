/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.ejb;

import com.park.parkinglot.common.UserDetails;
import com.park.parkinglot.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Albu Catalina
 */
@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    
    @PersistenceContext
    private EntityManager em;
    
    public List<UserDetails> getAllUsers(){
        LOG.info("getAllUsers");
        try{
            List<User> users = (List<User>) em.createQuery("SELECT u FROM User u").getResultList();
            return copyUsersToDetails(users);
        }catch(Exception ex){
            throw new EJBException(ex);
        }
    }

    private List<UserDetails> copyUsersToDetails(List<User> users) {
        List<UserDetails> detailsList = new ArrayList<>();
        for(User user : users){
            UserDetails userDetails = new UserDetails(user.getId(),
                    user.getUsername(),
                    user.getEmail(),
                    user.getPosition());
            detailsList.add(userDetails);
        }
        return detailsList;
    }
        
}

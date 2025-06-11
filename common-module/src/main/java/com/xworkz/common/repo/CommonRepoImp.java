package com.xworkz.common.repo;

import com.xworkz.common.entity.CommonEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
@Repository
public class CommonRepoImp implements CmmonRepo{
    @Override
    public boolean saveRegisterDetails(CommonEntity entity) {
        System.out.println("Invoking saveRegisterDetails ");
        boolean isSaved=false;
        if(entity!=null) {
            EntityManager em = Persistence.createEntityManagerFactory("myname").
                    createEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            System.out.print("data saved" + entity.getUserName());
            isSaved = true;
        }
        return isSaved;
    }
}


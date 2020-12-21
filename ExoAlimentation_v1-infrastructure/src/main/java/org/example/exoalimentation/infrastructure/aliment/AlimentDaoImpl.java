package org.example.exoalimentation.infrastructure.aliment;

import org.example.exoalimentation.domain.entity.Aliment;
import org.example.exoalimentation.domain.entity.Composition;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class AlimentDaoImpl implements AlimentDao{
    public void createFood(Aliment a) {

        SessionFactory mySessionFactory = HibernateUtils.getSessionFactory();

        Session mySession = mySessionFactory.openSession();
        mySession.beginTransaction();
        mySession.saveOrUpdate(a);
        mySession.getTransaction().commit();
        mySession.close();

    }

    public Aliment showFoodDetailsDao(Integer code) {

        SessionFactory mySessionFactory = HibernateUtils.getSessionFactory();

        Session mySession = mySessionFactory.openSession();
        mySession.beginTransaction();
        Query q = mySession.createQuery("from Aliment a where a.Id = ?1");
        q.setParameter(1,code);
        Aliment result = (Aliment) q.getSingleResult();
        Hibernate.initialize(result.getComposition());
        Hibernate.initialize(result.getGroupe());
        Hibernate.initialize(result.getSousgroupe());
        Hibernate.initialize(result.getSoussousgroupe());
        return result;
    }
}

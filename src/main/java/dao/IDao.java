package dao;

import config.HibernateConfig;
import jakarta.persistence.EntityManagerFactory;

public interface IDao <T, I>{
    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

}

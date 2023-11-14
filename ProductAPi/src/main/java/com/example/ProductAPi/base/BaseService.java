package com.example.ProductAPi.base;

import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.exception.RecoredNotFoundExecption;
import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@MappedSuperclass
public class BaseService<T extends BaseEntity<ID>,ID extends Number>{
     @Autowired
       private BaseRepo<T, ID> baseRepo;
      public List<T> findAll()
      {
              return baseRepo.findAll();
      }
       public T findById(ID id)
       {
           Optional<T> entity = baseRepo.findById(id);
              if(entity.isPresent())
              {
                  return entity.get();
              }else {
                        throw new RecoredNotFoundExecption("this id "+id+" not found");
              }

       }
        public T create(T entity)
        {
                return baseRepo.save(entity);
        }
        public T update(T entity)
        {
                return baseRepo.save(entity);
        }

       public void delete(ID id)
       {
               baseRepo.deleteById(id);
       }


}

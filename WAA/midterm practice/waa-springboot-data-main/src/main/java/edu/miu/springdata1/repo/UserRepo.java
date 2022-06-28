package edu.miu.springdata1.repo;

import edu.miu.springdata1.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends PagingAndSortingRepository<User,Integer> {

}

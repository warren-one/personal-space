package com.warren.space.repository;

import com.warren.space.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CrudRepository<User,Integer> 指定ID查询。   第一个是实体类，第二个是主键的类型
 * JpaSpecificationExecutor<User> 提供复杂查询
 * @Description:  jpa  dao层
 * @ClassName UserRepository
 * @Author hzh
 * @Date 2018/7/27
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>,JpaSpecificationExecutor<User>{

    /**
     * 我们这里只需要写接口，不需要写实现，spring boot会帮忙自动实现
     */

}

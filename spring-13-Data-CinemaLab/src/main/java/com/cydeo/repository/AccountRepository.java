package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.enums.UserRole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
List<Account> findAllByCountryOrState(String Country, String State );

    //Write a derived query to list all accounts with age lower than or equal to a specific value
List<Account>  findAllByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findByRole(UserRole role);

    //Write a derived query to list all accounts between a range of ages
    List<Account> findAllByAgeBetween(Integer ageStart, Integer ageEnd);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartingWith(String keyword);

    //Write a derived query to sort the list of accounts with age
    List<Account> findAllByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT a FROM Account a")
    List<Account> fetchAllBYUsingJPQL();

    //Write a JPQL query to list all admin accounts
    @Query("select  a from Account  a where a.role='ADMIN'")
    List<Account> fetchAllAdmin();

    //Write a JPQL query to sort all accounts with age
    @Query("select  a from Account  a order by a.age DESC ")
    List<Account> fetchAllOrderBasedOn();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
   @Query(value="select  * from account_detailes where age<?1",nativeQuery = true)
    List<Account> retrieveAllByAgeLowerThan(Integer age);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    List<Account> retrieveBySearchCriteria(Integer age);
    //Write a native query to read all accounts with an age higher than a specific value
    @Query(value="select  * from account_detailes where age > :age",nativeQuery = true)
    List<Account> retrieveAllByAgeHigherThan(@Param("age") Integer age);

}

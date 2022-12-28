package de.mydomain.freemarker.repository;

import de.mydomain.freemarker.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM customers WHERE lastname LIKE ?1 OR firstname LIKE ?1")
    List<Customer> findByName(String name);

}

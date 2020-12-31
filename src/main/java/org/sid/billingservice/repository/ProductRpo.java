package org.sid.billingservice.repository;

import org.sid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ProductRpo extends JpaRepository<ProductItem,Long> {
    public Collection<ProductItem> findByBillId(Long billID);
}

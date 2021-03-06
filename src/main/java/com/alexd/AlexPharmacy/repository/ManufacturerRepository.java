package com.alexd.AlexPharmacy.repository;

import com.alexd.AlexPharmacy.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200", "http://localhost:8081"})
@RepositoryRestResource
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

    /**
     * Знайти торгові марки постачальників, що постачають препарат drugName.
     *
     * @param drugName Name of drug, which supplied by manufacturer
     * @return List of manufacturers,trade who supply drug with drugName
     */
    @Query(value = "SELECT * FROM manufacturers, drugs "
            + "WHERE manufacturers.id = drugs.manufacturer_id and drugs.name = ?1",
            nativeQuery = true)
    List<Manufacturer> findManufacturersBySupplyDrug(String drugName);

}

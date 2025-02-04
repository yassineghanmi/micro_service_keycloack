package tn.yassine.demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.yassine.demo_api.entity.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars,Long> {
}

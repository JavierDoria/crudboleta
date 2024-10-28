package com.boleta.boleta.repository;

import com.boleta.boleta.models.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioBoleta  extends JpaRepository<Boleta, Long> {
}

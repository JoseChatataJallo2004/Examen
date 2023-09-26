package org.examen.repository;

import org.examen.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRespository extends JpaRepository  <Laptop,String> {

}

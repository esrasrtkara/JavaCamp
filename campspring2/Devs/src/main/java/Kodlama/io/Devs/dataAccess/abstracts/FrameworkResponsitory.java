package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.entities.concretes.Framework;

public interface FrameworkResponsitory extends JpaRepository<Framework, Integer>{

}

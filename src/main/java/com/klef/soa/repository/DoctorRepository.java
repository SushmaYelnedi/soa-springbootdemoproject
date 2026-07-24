package com.klef.soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.soa.entity.Doctor;
import java.util.List;


@Repository
//witout this annotation project will not run
public interface DoctorRepository extends JpaRepository<Doctor, Long>
{
//	from Doctor(class) d where d.gender(property)=?1(position param)
	List<Doctor> findByGender(String gender);
}

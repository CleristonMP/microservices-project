package com.cleristonpereira.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleristonpereira.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

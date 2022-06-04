package com.example.demo.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskItemDB extends JpaRepository<TaskItem, Long> {
}

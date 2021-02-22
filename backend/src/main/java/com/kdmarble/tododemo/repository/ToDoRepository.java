package com.kdmarble.tododemo.repository;

import com.kdmarble.tododemo.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}
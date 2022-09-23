package com.servico.ativo.repository;

import com.servico.ativo.model.EmailModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmailRepository extends MongoRepository<EmailModel, String> {


}


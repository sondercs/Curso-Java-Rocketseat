package br.com.jphalexandrino.todolist.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

    /*
     * 
     * ID
     * Usuário (ID_USUARIO)
     * Descrição
     * Título
     * Data de Inicío
     * Data de término
     * Prioridade
     * 
     */

@Data
@Entity(name = "tb_task")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
     private UUID id;
     private String description;

     @Column(length =  50)
     private String title;
     private LocalDateTime startAt;
     private LocalDate endAt;
     private String priority;

     private UUID idUser;

    @CreationTimestamp
     private LocalDateTime createdAT;

  


    
}
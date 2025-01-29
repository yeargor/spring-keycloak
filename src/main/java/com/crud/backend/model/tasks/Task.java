//package com.crud.backend.model.tasks;
//
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//import java.util.List;
//
//@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
//@Table(name="tasks")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Task {
//
//    @Id
//    private Long id;
//    private String header;
//    private TaskStatus status;
//    private TaskPriority priority;
//    @OneToMany//чекнуть по деталям
//    private List<TaskComment> comment;
//    @OneToOne
//    private Person author;
//    @ManyToOne
//    private Person performer;
//}

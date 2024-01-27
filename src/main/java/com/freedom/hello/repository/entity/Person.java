package com.freedom.hello.repository.entity;

import com.freedom.hello.converter.InstantAttributeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private int age;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    @Convert(converter = InstantAttributeConverter.class)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    @Convert(converter = InstantAttributeConverter.class)
    private Instant updatedAt;
}

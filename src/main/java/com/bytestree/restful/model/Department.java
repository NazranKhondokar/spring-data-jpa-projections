package com.bytestree.restful.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "department")
public class Department implements Serializable {

    private static final long serialVersionUID = 796133818701506050L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

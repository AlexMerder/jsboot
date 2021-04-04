package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor

public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String rolename;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private Set<User> users;


    public Role(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String getAuthority() {
        return getRolename();
    }

    @Override
    public String toString(){
        return rolename.substring(5);
    }

}
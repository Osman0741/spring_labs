package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Customer extends BaseEntity {

    private String email;
    private String fistName;
    private String lastName;
    private String userName;
    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Address> addressList;

}

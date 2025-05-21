package com.speedkillsx.carrentalapiddd.domain.model;

import com.speedkillsx.carrentalapiddd.domain.enums.CLIENT_STATUS;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private float debts;
    @Enumerated(EnumType.STRING)
    private CLIENT_STATUS stateClient;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Location> location;

}

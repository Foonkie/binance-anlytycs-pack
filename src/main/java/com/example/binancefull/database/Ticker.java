package com.example.binancefull.database;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "tickers", uniqueConstraints = {
        @UniqueConstraint(name = "code_unique", columnNames = "code")
})
public class Ticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "code")
    private String code;

    @OneToMany(mappedBy = "ticker")
    private List<Price> prices;
}

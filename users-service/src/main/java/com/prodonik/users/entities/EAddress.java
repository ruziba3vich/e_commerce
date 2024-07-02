package com.prodonik.users.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")
public class EAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private UUID id;

    @NotBlank(message = "Street address is mandatory")
    @Size(max = 255)
    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @NotBlank(message = "City is mandatory")
    @Size(max = 100)
    @Column(nullable = false)
    private String city;

    @Size(max = 100)
    @Column(name = "postal_code")
    private String postalCode;

    @NotBlank(message = "Country is mandatory")
    @Size(max = 100)
    @Column(nullable = false)
    private String country;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "user_id", nullable = false)
    // private EUser user;
}

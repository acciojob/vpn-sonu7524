// Note: Do not write @Enumerated annotation above CountryName in this model.
package com.driver.driver.model;

import com.driver.model.CountryName;
import com.driver.model.ServiceProvider;
import com.driver.model.User;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private com.driver.model.CountryName countryName;

    private String code;


    @ManyToOne
    @JoinColumn
    private com.driver.model.ServiceProvider serviceProvider;


    @OneToOne
    private com.driver.model.User user;

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.driver.model.CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public com.driver.model.ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public com.driver.model.User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
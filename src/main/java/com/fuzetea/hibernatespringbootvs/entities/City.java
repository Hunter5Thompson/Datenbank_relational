package com.fuzetea.hibernatespringbootvs.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

 

    @Column(name = "city_name")
    private String cityName;


    @Column(name = "city_code", columnDefinition = "character varying(3) not null default 'NA'")
    private String cityCode;

    @Transient
    private String beanid;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


    
    public String getBeanid() {
        return beanid;
    }

    public void setBeanid(String beanid) {
        this.beanid = beanid;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    
}


//add here
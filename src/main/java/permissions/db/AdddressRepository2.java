package permissions.db;

import permissions.domain.Address;


import java.util.List;

/**
 * Created by LouL on 2015-11-13.
 */
public interface  AdddressRepository2 extends Repository<Address> {

    public List<Address> withcountry(String country, PagingInfo page);
    public List<Address> withcity(String city, PagingInfo page);
    public List<Address> withstrreet(String strreet, PagingInfo page);
    public List<Address> withpostalCode(String postalCode, PagingInfo page);
    public List<Address> withhouseNumber(String houseNumber, PagingInfo page);
    public List<Address> withlocalNumber(String localNumber, PagingInfo page);



}




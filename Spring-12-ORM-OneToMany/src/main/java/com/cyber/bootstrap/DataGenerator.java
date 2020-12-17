package com.cyber.bootstrap;

import com.cyber.entity.Address;
import com.cyber.entity.Person;
import com.cyber.repository.AddressRepository;
import com.cyber.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator  implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1= new Person("Mike", "Smith");
        Person p2= new Person("John", "Tedd");
        Person p3= new Person("Tom", "Jerry");

        Address a1=new Address("King st","32343");
        Address a2=new Address("Elm st","12345");
        Address a3=new Address("Java st","01010");

//        p1.setAddresses(Arrays.asList(a1,a2));
        personRepository.save(p1);
        personRepository.save(p2);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p2);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);



    }
}

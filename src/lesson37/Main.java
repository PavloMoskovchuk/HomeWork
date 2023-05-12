package lesson37;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("My_SQL task.txt");
        try {
            Files.readAllLines(path).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


//    CREATE SCHEMA HomeWork37;
//        USE HomeWork37;
//
//        CREATE TABLE country(
//        Country_ID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
//        Country VARCHAR(50),
//        Country_Code VARCHAR(3)
//        );
//
//        insert into country (Country, Country_Code) values ('Great Britain', 'GBR');
//        insert into country (Country, Country_Code) values ('Ukraine', 'UKR');
//        insert into country (Country, Country_Code) values ('Georgia', 'GEO');
//
//
//        CREATE TABLE city(
//        City_ID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
//        City VARCHAR(50),
//        Country_Code VARCHAR(3)
//        );
//
//        insert into city (City, Country_Code) values ('Tbilisi', 'GEO');
//        insert into city (City, Country_Code) values ('Batumi', 'GEO');
//        insert into city (City, Country_Code) values ('Kiyv', 'UKR');
//        insert into city (City, Country_Code) values ('Lugansk', 'UKR');
//        insert into city (City, Country_Code) values ('Lviv', 'UKR');
//        insert into city (City, Country_Code) values ('London', 'GBR');
//        insert into city (City, Country_Code) values ('Birmingham', 'GBR');
//        insert into city (City, Country_Code) values ('Blacpool', 'GBR');
//
////        select * from country left join city on country.Country_Code = city.Country_Code
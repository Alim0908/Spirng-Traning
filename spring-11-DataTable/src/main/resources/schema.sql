drop table if exists employees;
drop table if exists departments;
create table EMPLOYEES(

                          id bigint not null,
                          name varchar(255),
                          primary key (id)

);
create table DEPARTMENTS(

                          id bigint not null,
                          division_name varchar(100),
                          department_name varchar(100),
                          primary key (id)

);

create table DEPARTMENTS(

                            id bigint not null,
                            division varchar(100),
                            department varchar(100),
                            primary key (id)

);
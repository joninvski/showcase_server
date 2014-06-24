# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ringtone (
  id                        varchar(255) not null,
  name                      varchar(255),
  path                      varchar(255),
  constraint pk_ringtone primary key (id))
;

create sequence ringtone_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists ringtone;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists ringtone_seq;


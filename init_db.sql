
# --- !Downs
SET FOREIGN_KEY_CHECKS=0;

drop table event;

drop table thing;

SET FOREIGN_KEY_CHECKS=1;

# --- !Ups
create table event (
  ID                        bigint auto_increment not null,
  duration                  integer,
  answered                  tinyint(1) default 0,
  volume                    integer,
  date                      bigint,
  constraint pk_event primary key (ID))
;

create table thing (
  ID                        bigint auto_increment not null,
  name                      varchar(255),
  uri                       varchar(255),
  price                     integer,
  constraint pk_ringtone primary key (ID))
;




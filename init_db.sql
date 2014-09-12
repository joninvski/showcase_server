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
  image_url                 varchar(255),
  category                  varchar(255),
  text                      varchar(255),
  homepage                  varchar(255),
  constraint pk_thing primary key (ID))
;
